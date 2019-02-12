package com.stackroute.unittest;

import org.junit.*;

import static org.junit.Assert.*;

public class CapitalLetterTest {
    CapitalLetter app;

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
        app = new CapitalLetter();
    }

    @After
    public void tearDown() {
        System.out.println("Inside teardown");
        app = null;
    }

    @Test
    public void test() throws Exception {
        //Arrange
        String expectedValue = "Capital letter";

        //Act
        String actualValue = app.capitalL('H');
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void test1() throws Exception {
        //Arrange
        String expectedValue = "Lower case letter";

        //Act
        String actualValue = app.capitalL('a');
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void test2() throws Exception {
        //Arrange
        String expectedValue = "Digit";

        //Act
        String actualValue = app.capitalL('4');
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void test3() throws Exception {
        //Arrange
        String expectedValue = "Special Character";

        //Act
        String actualValue = app.capitalL('>');
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

}