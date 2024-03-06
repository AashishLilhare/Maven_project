package testng;

import listeners.IRetryAnalyserDemo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestCases {
    @Test
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("verifyLogin");
    }
    @Test
    public void verifyHomepage(){
        System.out.println("verifyHomepage");
    }
    @Test
    public void verifyFundTransfer(){

        System.out.println("verifyFundTransfer");
    }
    @Test
    public void testCase1(){
        System.out.println("hello");
    }
    @Test
    public void testCase2(){
        System.out.println("world");
    }
}
