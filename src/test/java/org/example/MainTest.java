package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testAdd() {
        assertEquals(30, Main.add(10, 20));
    }
}