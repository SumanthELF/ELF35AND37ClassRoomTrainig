package advancedConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basics.ExcelUtility;

public class ReadDataFromExcelAndPassToTestCase {

	@DataProvider(name="Credentials",parallel=true)
	public String[][] testData(){		
		String[][] dataFromExcel = ExcelUtility.readMultipleDataFromExcel("./testData/testData.xlsx", "TestData");
		return dataFromExcel;
	}
	
	@Test(dataProvider="testData")
	public void readDataFromDataProvider(String[] arr) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.findElement(By.id("name")).sendKeys(arr[0]);
		driver.findElement(By.id("email")).sendKeys(arr[1]);
		driver.findElement(By.id("password")).sendKeys(arr[2]);
		driver.findElement(By.id("mobile")).sendKeys(arr[3]);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Register Now']")).click();
		driver.quit();
	}
}
