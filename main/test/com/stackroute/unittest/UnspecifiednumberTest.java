package com.stackroute.unittest;

import org.junit.*;

import static org.junit.Assert.*;

public class UnspecifiednumberTest {
    Unspecifiednumber app;

    @BeforeClass
    public static void setUpOnce() {
        System.out.println("Inside setup once");

    }

    @AfterClass
    public static void teardownOnce() {
        System.out.println("Inside teardown once");

    }

    @Before
    public void setUp() {
        System.out.println("Inside setup");
        app = new Unspecifiednumber();
    }

    @After
    public void tearDown() {
        System.out.println("Inside teardown");
        app = null;
    }

    @Test
    public void test() throws Exception {
        //Arrange
        int expectedValue = 41;

        //Act
        int actualValue = app.unspecified("12 23 2 4");
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }
}