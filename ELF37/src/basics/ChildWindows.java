package basics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

		driver.get("file:///C:/Users/User/Desktop/MultipleWindow.html");
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(3000);
		Set<String> allWindowId = driver.getWindowHandles();
		String expectedTitleOfChild = "#1 buffet grill barbeque restaurant near you. Exciting Offers on lunch dinner with our trademark. | Barbeque Nation";

		for (String windowId : allWindowId) {
			driver.switchTo().window(windowId);
			if (expectedTitleOfChild.equals(driver.getTitle())) {
				driver.close();
				break;
			}
		}
	}

}
