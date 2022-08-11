package advancedConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_SR_User_003 {
	
	
	@Test(groups="User",dataProviderClass=TC_SR_User_007.class,dataProvider="data")
	public void deleteUser(String [] arr) throws InterruptedException {
		Reporter.log("User details is deleted successfully",true);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(arr[0]);
		driver.findElement(By.name("pwd")).sendKeys(arr[1],Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();
	}
}
