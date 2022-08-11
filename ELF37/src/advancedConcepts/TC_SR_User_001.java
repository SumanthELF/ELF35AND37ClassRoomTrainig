package advancedConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC_SR_User_001 {  
	
	@Test(groups="Smoke")
	public void createUser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		Elements refVar = new Elements(driver);
		
		refVar.getSearchTextBox().clear();
		
		driver.navigate().refresh();
		
		refVar.getSearchTextBox().sendKeys("Sumanth");
	}
}
