package parameterizations;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NormalDataProvider {
    @DataProvider(name = "test_Data")
    public Object[][] testData() {
        return new Object[][]{{"selenium", "pune"}, {"java", "mumbai"}, {"python", "delhi"}
        };
    }


    @Test(dataProvider ="test_Data")
    public void testCase1(String courseName,String cityName)  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\Compressed\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com/");
        driver.manage().window().maximize();

        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys(courseName + cityName);
        search.sendKeys(Keys.ENTER);

        driver.close();
    }
}

