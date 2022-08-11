package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAnApplicationBasedOnYourBooleanData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//Launching the browser 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Reading the Test Data from Excel
		FileInputStream fis = new FileInputStream("./testData/ApplicationInformation.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet1 = workbook.getSheet("Sheet1");
		boolean flag = sheet1.getRow(2).getCell(1).getBooleanCellValue();

		if(flag) {
			String url = sheet1.getRow(3).getCell(2).getStringCellValue();
			String firstName = sheet1.getRow(4).getCell(2).getStringCellValue();
			int mobileNo = (int)sheet1.getRow(5).getCell(2).getNumericCellValue();
			driver.get(url);
			driver.findElement(By.name("first_name")).sendKeys(firstName);
			driver.findElement(By.id("phone")).sendKeys(mobileNo+"");
			
		}else {
			String url = sheet1.getRow(3).getCell(3).getStringCellValue();
			String firstName = sheet1.getRow(4).getCell(3).getStringCellValue();
			int mobileNo = (int)sheet1.getRow(5).getCell(3).getNumericCellValue();
			driver.get(url);
			driver.findElement(By.linkText("Sign up")).click();
			driver.findElement(By.id("mobile")).sendKeys(mobileNo+"");
			driver.findElement(By.name("name")).sendKeys(firstName);
		}
	}

}
