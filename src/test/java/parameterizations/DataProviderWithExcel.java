package parameterizations;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderWithExcel {
    @DataProvider(name="test-data")
    public Object[][] dataProviderFun() throws IOException {
        Object[][] arrayObj= getExcelData("C:\\Users\\hp\\Documents\\SDET\\Book1.xlsx","Sheet1");
    return arrayObj;
    }
    public String[][] getExcelData(String fileName ,String sheetName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);
        XSSFSheet sh = wb.getSheet(sheetName);
        XSSFRow Row = sh.getRow(0);
        int noRow = sh.getPhysicalNumberOfRows();
        int noCol = Row.getLastCellNum();
        Cell cell;
        String[][] data = new String[noRow - 1][noCol];
        for (int i = 1; i < noRow-1; i++) {
            for (int j = 0; j < noCol; j++) {
                Row = sh.getRow(i);
                cell = Row.getCell(j);
                data[i - 1][j] = cell.getStringCellValue();
            }
        }
        return data;
    }
    @Test(dataProvider = "test-data")
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
