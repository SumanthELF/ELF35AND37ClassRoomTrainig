package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cal {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		
//		int sum = Calc.add(10,20);
//		System.out.println(sum);
//		System.out.println(sum);
//		System.out.println(sum);
//		System.out.println(sum);
//		System.out.println(sum);
//		System.out.println(sum);
//		System.out.println(sum);
//		System.out.println(sum);
//		System.out.println(sum);
//		System.out.println(sum);
//		System.out.println(sum);		
//		
//		int a = Calc.add(10,20,30,40);
//		System.out.println(a);
		
		WebDriverWait explicitWait = new  WebDriverWait(driver, 10);
		
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("")));
	}

}
