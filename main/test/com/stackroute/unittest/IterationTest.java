package com.stackroute.unittest;
import org.junit.*;
import static org.junit.Assert.*;

public class IterationTest

{
    Iteration app;
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
        app=new Iteration();
    }
    @After
    public void tearDown(){
        System.out.println("Inside teardown");
        app=null;
    }

    @Test
    public void test() throws Exception {
        //Arrange
        int[] expectedValue = {1,2,2,3,3,3};

        //Act
        int flag=0;
        int f=1;
        int[] actualValue=app.iteration(3);
        for(int i=0; i<5; i++)
        {

            if(expectedValue[i]!=actualValue[i])
            {
                flag=1;
            }
        }
        if(flag==0)
        {
            f=0;

        }

        //Assert
        assertEquals(flag, f);
        assertNotNull(actualValue);
    }
}