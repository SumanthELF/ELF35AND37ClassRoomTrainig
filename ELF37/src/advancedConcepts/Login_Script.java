package advancedConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

/***
 * 
 * @author Sumanth Keshav
 *
 */
public class Login_Script {

	public static void main(String[] args) throws InterruptedException {
		
		//Pre condition
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Successfully launched the browser");
		driver.manage().window().maximize();
		System.out.println("Browser window is maximized successfully");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 5);
		SoftAssert softAssert = new SoftAssert();
		
		//Step 1: Open the browser and enter the test URL
		String testUrl = "https://demo.actitime.com/login.do";
		driver.get(testUrl);
		String expectedLoginPageTitle = "actiTIME - Login ";
		String actualLoginPageTitle = driver.getTitle();
		softAssert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle, "Login Page is not displayed successfully");
		
		//Step 2: Enter the valid username and valid password
		String usernameData = args[0];
		String passwordData = args[1];
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.sendKeys(usernameData);
		Thread.sleep(2000);
		String actualUsernameEntered = usernameTextField.getAttribute("value");
		softAssert.assertEquals(actualUsernameEntered, usernameData,"username is not entered successfully");
			
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.sendKeys(passwordData);
		Thread.sleep(2000);
		String actualPasswordEntered = passwordTextField.getAttribute("value");
		softAssert.assertEquals(actualPasswordEntered, passwordData,"password is not entered successfully");
		
		//Step 3: Click on Login button
		driver.findElement(By.id("loginButton")).click();
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		String expectedHomePageTitle = "actiTIME - Enter Time-Track";
		String actualHomePageTitle = driver.getTitle();
		softAssert.assertEquals(actualHomePageTitle, expectedHomePageTitle,"Home Page is not displayed successfully");
		
		//Post condition
		driver.quit();
		softAssert.assertAll();
	}
}
