package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/User/Desktop/dropDown.html");
		Thread.sleep(4000);
		WebElement multiSelectListbox = driver.findElement(By.id("m1"));
		
		Select select = new Select(multiSelectListbox);
		select.selectByVisibleText("Grapes");
		Thread.sleep(1000);
		select.selectByIndex(0);
		Thread.sleep(1000);
		select.selectByValue("4");
		Thread.sleep(1000);
		
		System.out.println(select.getFirstSelectedOption().getText());
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		
		System.out.println("Selected Options");
		for(WebElement ele : selectedOptions) {
			System.out.println(ele.getText());
		}
		
		select.deselectAll();
		
		
		
	}
}
