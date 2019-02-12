package com.stackroute.unittest;

import org.junit.*;

import static org.junit.Assert.*;

public class SortNumTest {
    SortNum app;

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
        app = new SortNum();
    }

    @After
    public void tearDown() {
        System.out.println("Inside teardown");
        app = null;
    }

    @Test
    public void test() throws Exception {
        //Arrange
        String expectedValue = "false";
        int a[] = {2, 3, 4, 5, 3, 4};

        //Act
        String actualValue = app.dsort(a, 6);
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }
}