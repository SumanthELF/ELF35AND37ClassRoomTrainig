package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/***
 * 
 * @author Yogita
 *
 */
public class Generic_Screenshots {

	/**
	 * This method is used to take the screenshot
	 * @param driver
	 */
	public static void getPhoto(String testCaseName) {		
		LocalDateTime systemDate = LocalDateTime.now();
		String ScreenShotDate = systemDate.toString().replaceAll(":", "-");
		TakesScreenshot takeScreenShot = (TakesScreenshot) Base_Test.driver;
		File tempFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./"+testCaseName+ ScreenShotDate + ".png");
		try {
			FileUtils.copyFile(tempFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
