package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectLastOptionOfTheGivenDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/signup");
		WebElement dayListbox = driver.findElement(By.id("day"));
		WebElement monthListbox = driver.findElement(By.id("month"));
		WebElement yearListbox = driver.findElement(By.id("year"));
		
		selectLast(dayListbox);
		selectLast(monthListbox);
		selectLast(yearListbox);
	}
	
	public static void selectLast(WebElement listbox) {
		Select select = new Select(listbox);
		List<WebElement> allOptions = select.getOptions();
		select.selectByIndex(allOptions.size()-1);
	}
}
