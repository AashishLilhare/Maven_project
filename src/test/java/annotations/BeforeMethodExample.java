package annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodExample {
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
}
