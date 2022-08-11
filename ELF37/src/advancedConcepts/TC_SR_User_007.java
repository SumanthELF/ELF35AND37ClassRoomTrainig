package advancedConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_SR_User_007 {

	@DataProvider
	public String[][] data() {
		 String [][] sarr = {
				 				{"admin","manager"},
				 				{"trainee","trainee"}
		 					};		 
		 return sarr;		
	}

	@Test(groups = "User")
	public void createUser(String url) {
		Reporter.log("User is created successfully", true);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(url);
		driver.quit();
	}

	@Test(groups = "User", invocationCount = -1)
	public void createUser2() {
		Reporter.log("User is created successfully", true);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://licindia.in/");
		driver.quit();
	}
}
