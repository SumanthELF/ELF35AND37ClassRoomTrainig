package basics;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
//		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
//		FirefoxOptions options = new FirefoxOptions();
//		options.addArguments("dom.webnotifications.enabled=false");
//		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions settings = new ChromeOptions();
		settings.addArguments("--incognito","--disable-notifications");
		WebDriver driver = new ChromeDriver(settings);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		driver.get("https://www.yatra.com/");
		Thread.sleep(3000);
//		Runtime.getRuntime().exec("./autoItProgram/not.exe");
	}
}
