package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		//Step 1 : Create object of Input Stream
		File absPath = new File("./testData/testData.properties");
		FileInputStream fis = new FileInputStream(absPath);
		
		//Step 2 : Create object of File type
		Properties properties = new Properties();
		properties.load(fis);
		
		//Step 3 : read method
		String key = properties.getProperty("key");
		String value = properties.getProperty("value");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
				
	}

}
