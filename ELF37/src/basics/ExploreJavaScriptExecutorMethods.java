package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExploreJavaScriptExecutorMethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/");
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement elementToBeScrolled = driver.findElement(By.linkText("Burningwave Core"));
		elementToBeScrolled.click();
//		js.executeScript("arguments[0].scrollIntoView(false);",elementToBeScrolled);
	}

}
