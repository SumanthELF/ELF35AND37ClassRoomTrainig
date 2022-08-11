package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Sumanth Keshav
 *
 */
public class Doodles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.google.com/doodles");
		WebDriverWait explicitWait = new WebDriverWait(driver, 5);

//		FluentWait fluentWait = new FluentWait(driver).withTimeout(5, SECONDS).pollingEvery(100, TimeUnit.MILLISECONDS);

		explicitWait.until(ExpectedConditions.elementToBeClickable(By.linkText("Tanzania Independence Day 2021")));
//		
		
		Doodles d = new Doodles();
		d.customWait(driver.findElement(By.id("")));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//	
//		for(;;) {
//			try {
//				driver.findElement(By.linkText("Tanzania Independence Day 2021")).click();
//				break;
//			}catch(NoSuchElementException e) {
//				Thread.sleep(500);
//				js.executeScript("window.scrollBy(0,500);");
//			}
//		}
	}

	/***
	 * This method works exactly like your explicit wait 
	 * @param ele pass the element on which you have to wait
	 * @throws InterruptedException
	 */
	public void customWait(WebElement ele) throws InterruptedException {
		for (;;) {
			try {
				boolean flag = ele.isDisplayed();
				if(flag==true) {
					break;
				}
			} catch (NoSuchElementException e) {
				Thread.sleep(100);
			}
		}
	}
}
