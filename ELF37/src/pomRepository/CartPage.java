package pomRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	public WebDriver driver;
	
	public CartPage(WebDriver driver) {
		driver=this.driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getQuantityOfTheProduct(String productName) {
		return driver.findElement(By.xpath("//a[@class='product-name' and text()='"+productName+"']/../..//input[contains(@name,'itemquantity')]"));
	}
	
	public WebElement getCheckBoxOfTheProduct(String productName) {
		return driver.findElement(By.xpath("//a[@class='product-name' and text()='"+productName+"']/../..//input[@name='removefromcart']"));
	}
}
