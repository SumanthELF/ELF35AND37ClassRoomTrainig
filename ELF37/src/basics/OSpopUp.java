package basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OSpopUp {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		driver.get("https://www.freshersworld.com/");
		driver.findElement(By.linkText("Register Free")).click();
		Actions actions = new Actions(driver);
		actions.click(driver.findElement(By.id("file-upload"))).perform();
		
		Thread.sleep(2000);
		Runtime.getRuntime().exec("./autoItProgram/upload.exe");
		
		
//		Robot robot = new Robot();
	
//		robot.keyPress(KeyEvent.VK_C);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_O);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_U);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_R);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_S);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_E);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_PERIOD);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_P);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_D);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_F);
//		Thread.sleep(1000);
//		
//		robot.keyRelease(KeyEvent.VK_C);
//		robot.keyRelease(KeyEvent.VK_O);
//		robot.keyRelease(KeyEvent.VK_U);
//		robot.keyRelease(KeyEvent.VK_R);
//		robot.keyRelease(KeyEvent.VK_S);
//		robot.keyRelease(KeyEvent.VK_E);
//		robot.keyRelease(KeyEvent.VK_PERIOD);
//		robot.keyRelease(KeyEvent.VK_P);
//		robot.keyRelease(KeyEvent.VK_D);
//		robot.keyRelease(KeyEvent.VK_F);
//		
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		
//		robot.keyRelease(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		
	}

}
