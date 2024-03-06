package annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodDemo {
    @Test
    public void verifyLLogin(){
        Assert.assertTrue(false);
        System.out.println("verifyLogin");
    }
    @Test(dependsOnMethods = {"verifyLLogin"})
    public void verifyHomepage(){

        System.out.println("verifyHomepage");
    }
    @Test
    public void verifyFundTransfer(){

        System.out.println("verifyFundTransfer");
    }
}
