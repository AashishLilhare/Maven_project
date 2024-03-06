package parameterizations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NeedOfParameterizations {
    String courseName="Java";
    String cityName="pune";
    @Test
    public void testCase1(String courseName,String cityName) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\Compressed\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com/");
        driver.manage().window().maximize();
        WebElement search =driver.findElement(By.name("q"));
        search.sendKeys(courseName+cityName);
        search.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.close();

    }
}
