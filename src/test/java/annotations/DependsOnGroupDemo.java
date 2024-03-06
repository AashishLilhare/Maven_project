package annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupDemo {
    @Test(groups = {"smoke"})
    public void verifyLogin(){
        Assert.assertTrue(false);
    System.out.println("verifyLogin");
}
    @Test(groups =  {"smoke"},alwaysRun = true)
    public void verifyHomepage(){
        System.out.println("verifyHomepage");
    }
    @Test(enabled = false)
    public void verifyFundTransfer(){

        System.out.println("verifyFundTransfer");
    }
}
