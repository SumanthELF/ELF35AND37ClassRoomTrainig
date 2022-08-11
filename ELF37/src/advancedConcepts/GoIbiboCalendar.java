package advancedConcepts;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoIbiboCalendar {

	public static void main(String[] args) throws InterruptedException {
		
		LocalDateTime ldt = LocalDateTime.now().plusYears(1);
		int year = ldt.getYear();
		String month = ldt.getMonth().toString();
		String monthName = month.substring(0,1).toUpperCase()+month.substring(1, month.length()).toLowerCase();
		int day = ldt.getDayOfMonth();
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/flights/");
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='"+monthName+" "+year+"']/../..//p[text()='"+day+"']")).click();
				break;
			}catch(NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		
		
	}
}
