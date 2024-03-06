package annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class AnnotationExample {
    public WebDriver driver;

    @BeforeMethod
    public void BeforeMethod(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\Compressed\\chromedriver\\chromedriver.exe");
         driver= new ChromeDriver();
    }
    @Test
    public void testCase1(){
        driver.navigate().to("https://www.facebook.com/");
    }
    @Test
    public void testCase2(){
        driver.navigate().to("https://www.facebook.com/");
    }
    @AfterMethod
    public void AfterMethod(){
        driver.manage().window().maximize();
        driver.close();
    }
}
