package parameterizations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class withParameterization {
    public WebDriver driver;
    @Parameters({"browserName"})
    @BeforeMethod
    public void BeforeMethod(String browserName){
        if (browserName.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\Compressed\\chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("ebdriver.edge.driver","C:\\Users\\hp\\Downloads\\Compressed\\msedgedriver.exe");
            driver = new EdgeDriver();
        }else{
            throw new RuntimeException("Enter valid Browser");
        }

    }

    @Parameters({"courseName","cityName"})
    @Test
    public void testCase1(String courseName,String cityName) throws InterruptedException {
        driver.navigate().to("http://google.com/");
        driver.manage().window().maximize();
        WebElement search =driver.findElement(By.name("q"));
        search.sendKeys(courseName+cityName);
        search.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.close();

    }
}

