package annotations;

import org.testng.annotations.*;

public class BeforeClassExample {
    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("BeforeMethod");
    }
    @Test
    public void Testcase1(){
        System.out.println("case1");
    }
    @Test
    public void Testcase2(){
        System.out.println("case2");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass");
    }
}
