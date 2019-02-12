package com.stackroute.unittest;

import org.junit.*;

import static org.junit.Assert.*;

public class StringcheckTest {
    Stringcheck app;

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
        app = new Stringcheck();
    }

    @After
    public void tearDown() {
        System.out.println("Inside teardown");
        app = null;
    }

    @Test
    public void test() throws Exception {
        //Arrange
        String expectedValue = "Vowel";

        //Act
        String actualValue = app.sCheck("a");
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void test1() throws Exception {
        //Arrange
        String expectedValue = "Consonant";

        //Act
        String actualValue = app.sCheck("b");
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void test2() throws Exception {
        //Arrange
        String expectedValue = "Vowel Consonant";

        //Act
        String actualValue = app.sCheck("ap");
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void test3() throws Exception {
        //Arrange
        String expectedValue = "error";

        //Act
        String actualValue = app.sCheck("123");
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }
}