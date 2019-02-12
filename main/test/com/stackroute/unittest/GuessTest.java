package com.stackroute.unittest;

import org.junit.*;

import static org.junit.Assert.*;

public class GuessTest {
    Guess app;

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
        app = new Guess();
    }

    @After
    public void tearDown() {
        System.out.println("Inside teardown");
        app = null;
    }

    @Test
    public void test() throws Exception {
        //Arrange
        String expectedValue = "Number guessed matches the original number";

        //Act
        String actualValue = app.guess(10, 20, 15);
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }
}