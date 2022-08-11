package basics;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		LocalDateTime ldt = LocalDateTime.now().plusYears(1);
		System.out.println(ldt);
		String month = ldt.getMonth().toString();
		String monthValue = month.substring(0, 1).toUpperCase()+month.substring(1, month.length()).toLowerCase();
		int year = ldt.getYear();
		int day = ldt.getDayOfMonth();	
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,80);");
		selectDate(driver, monthValue, year, day);
	}

	/**
	 * This method is used to select any date in a calendar popup
	 * @param driver pass the driver reference variable
	 * @param monthValue pass the month name in the format "July" to select date in that month
	 * @param year pass the year 
	 * @param day 
	 */
	public static void selectDate(WebDriver driver,String monthValue,int year, int day) {
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='"+monthValue+" "+year+"']/../..//p[text()='"+day+"']")).click();
				break;
			}catch(NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	}
}
