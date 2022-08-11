package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveByOffsetMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.skillrary.com/user/login");
		WebElement passwordTextField = driver.findElement(By.name("password"));
		
		Actions actions = new Actions(driver);
		passwordTextField.sendKeys("Testing@123");
		actions.moveToElement(passwordTextField, 465, -40).click().perform();
	}
}
