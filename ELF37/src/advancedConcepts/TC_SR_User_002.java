package advancedConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

/***
 * 
 * @author Sumanth Keshav
 *
 */
public class TC_SR_User_002 {   // test case id

	@Test(groups="Smoke")
	public void modifyUser() {  // test case name
		Reporter.log("User details is modified successfully",true);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.swiggy.com/");
		driver.quit();
	}
}
