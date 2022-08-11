package advancedConcepts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("https://www.myvi.in/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./airtel.png");
		
		FileUtils.copyFile(tempFile, destFile);
		
		File tempWebEleFile = driver.findElement(By.xpath("//img[@alt='Buy VIP Mobile Number']")).getScreenshotAs(OutputType.FILE);
		File destWebEleFile = new File("./webele.jpeg");
		FileUtils.copyFile(tempWebEleFile, destWebEleFile);
//		Thread.sleep(40000);
		
	}

}
