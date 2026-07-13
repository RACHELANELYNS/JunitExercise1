package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {

        // Step 1: Create a mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub the method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Create the service
        MyService service = new MyService(mockApi);

        // Step 4: Call the method
        String result = service.fetchData();

        // Step 5: Verify the result
        assertEquals("Mock Data", result);
    }
    @Test
    public void testVerifyInteraction() {

        // Create a mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Create the service
        MyService service = new MyService(mockApi);

        // Call the method
        service.fetchData();

        // Verify that getData() was called
        verify(mockApi).getData();
    }
}
