package org.example;

import org.testng.annotations.*;

public class TestExample {
    @Test
    public void testCase(){
        System.out.println("This is normal test case");
    }
    @BeforeMethod
    public void beforeMethod (){
        System.out.println("This will execute before all method");

    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");

    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("execute before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Execute after class");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Will execute before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("Will execute after test");
    }
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("Will execute before suit");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("Will execute after suit");
    }
}
