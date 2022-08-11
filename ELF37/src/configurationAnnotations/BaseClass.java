package configurationAnnotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	public WebDriverWait explicitWait;
	
	@BeforeClass
	public void launchingBrowser() {  //browser setup
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		Reporter.log("Successfully launched the browser");
		driver.manage().window().maximize();
		Reporter.log("Browser window is maximized successfully");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		explicitWait = new WebDriverWait(driver, 5);
	}

	@BeforeMethod
	public void loginToApp() { 
		//Step 1: navigate to application
		String testUrl = "https://demo.actitime.com/login.do";
		driver.get(testUrl);
		String expectedLoginPageTitle = "actiTIME - Login";
		String actualLoginPageTitle = driver.getTitle();
		if(expectedLoginPageTitle.equalsIgnoreCase(actualLoginPageTitle)) {
			Reporter.log("Login Page is displayed successfully",true);
		}else {
			Reporter.log("Login Page is not displayed successfully",true);
		}

		//Step 2: Enter the valid username and valid password
		String usernameData = "admin";
		String passwordData = "manager";
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.sendKeys(usernameData);
		String actualUsernameEntered = usernameTextField.getAttribute("value");
		if(usernameData.equals(actualUsernameEntered)) {
			Reporter.log("username is entered successfully",true);
		}else {
			Reporter.log("username is not entered successfully",true);
		}

		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.sendKeys(passwordData);
		String actualPasswordEntered = passwordTextField.getAttribute("value");
		if(passwordData.equals(actualPasswordEntered)) {
			Reporter.log("password is entered successfully",true);
		}else {
			Reporter.log("password is not entered successfully",true);
		}

		//Step 3: Click on Login button
		driver.findElement(By.id("loginButton")).click();
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		String expectedHomePageTitle = "actiTIME - Enter Time-Track";
		String actualHomePageTitle = driver.getTitle();
		if(expectedHomePageTitle.equalsIgnoreCase(actualHomePageTitle)) {
			Reporter.log("Home Page is displayed successfully",true);
		}else {
			Reporter.log("Home Page is not displayed successfully",true);
		}
		
	
	}
	
	@AfterMethod
	public void logout() {  //browserTearDown
		driver.findElement(By.id("logoutLink")).click();
		String expectedLoginPageTitle = "actiTIME - Login";
		String actualLoginPageTitle = driver.getTitle();
		if(expectedLoginPageTitle.equalsIgnoreCase(actualLoginPageTitle)) {
			Reporter.log("Login Page is displayed successfully",true);
		}else {
			Reporter.log("Login Page is not displayed successfully",true);
		}
	}
	
	@AfterClass
	public void closingTheSession() {
		driver.quit();
	}
}
