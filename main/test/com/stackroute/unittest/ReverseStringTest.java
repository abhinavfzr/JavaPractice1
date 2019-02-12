package com.stackroute.unittest;

import org.junit.*;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString app;

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
        app = new ReverseString();
    }

    @After
    public void tearDown() {
        System.out.println("Inside teardown");
        app = null;
    }

    @Test
    public void test() throws Exception {
        //Arrange
        String expectedValue = "abhi";

        //Act
        String actualValue = app.reverseStr("ihba");
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void test1() throws Exception {
        //Arrange
        String expectedValue = "punjab";

        //Act
        String actualValue = app.reverseStr("bajnup");
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

}