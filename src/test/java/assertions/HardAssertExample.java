package assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {
    @Test
    public void testCase1(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\Compressed\\chromedriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        Assert.assertEquals(title,"rediffmail","Title should be match");
        System.out.println("Hello");

        driver.close();
    }

}
