package basics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchEmptyBrowser {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Pizza");
		String valueEntered = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println(valueEntered);
		
		Rectangle rec = driver.findElement(By.id("")).getRect();
	}
}
