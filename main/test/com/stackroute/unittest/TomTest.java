package com.stackroute.unittest;

import org.junit.*;

import static org.junit.Assert.*;

public class TomTest {

    Tom app;

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
        app = new Tom();
    }

    @After
    public void tearDown() {
        System.out.println("Inside teardown");
        app = null;
    }

    @Test
    public void test() throws Exception {
        //Arrange
        String expectedValue = "tom";

        //Act
        String actualValue = app.tomCheck(21);
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void test1() throws Exception {
        //Arrange
        String expectedValue = "jerry";

        //Act
        String actualValue = app.tomCheck(24);
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void test2() throws Exception {
        //Arrange
        String expectedValue = "error";

        //Act
        String actualValue = app.tomCheck(50);
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

}