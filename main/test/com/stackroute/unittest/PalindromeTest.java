package com.stackroute.unittest;


import org.junit.*;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome app;
    @BeforeClass
    public static void setUpOnce(){
        System.out.println("Inside setup once");

    }

    @AfterClass
    public static void teardownOnce(){
        System.out.println("Inside teardown once");

    }
    @Before
    public void setUp(){
        System.out.println("Inside setup");
        app=new Palindrome();
    }

    @After
    public void tearDown(){
        System.out.println("Inside teardown");
        app=null;
    }

    @Test
    public void test() throws Exception {
        //Arrange
        int expectedValue=121;

        //Act
        int actualValue=app.PalindromeCheck(121);
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }
    @Test
    public void test1() throws Exception {
        //Arrange
        int expectedValue=111;

        //Act
        int actualValue=app.PalindromeCheck(111);
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }
}