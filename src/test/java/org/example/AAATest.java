package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AAATest {

    private Main main;

    @Before
    public void setUp() {
        System.out.println("Setting up test...");
        main = new Main();
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up after test...");
        main = null;
    }

    @Test
    public void testAddUsingAAA() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = main.add(a, b);

        // Assert
        assertEquals(30, result);
    }
}