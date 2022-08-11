package dataProviderConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_DW_Login_001 {

	@DataProvider(name="testDataForCredentials")
	public String[][] credentials() {
		String[][] sarr = {
							{"msg4thanu@gmail.com","thanushree@18","iuasgfuaisg"},
							{"shivanandsubhanappagol@gmail.com","Shivu_ns1209"},
							{"rajuraj@somemail.com","rajuraj"}
						  }; 
		return sarr;
	}
	
	@Test(dataProvider="testDataForCredentials")
	public void loginWithMultipleCredentials(String[] arr) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demowebshop.tricentis.com/login");
		System.out.println();
		driver.findElement(By.id("Email")).sendKeys(arr[0]);
		driver.findElement(By.id("Password")).sendKeys(arr[1]);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();		
	}
}
