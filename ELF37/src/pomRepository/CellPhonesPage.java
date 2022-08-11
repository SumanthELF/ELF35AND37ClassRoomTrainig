package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesPage {

	public CellPhonesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Phone Cover") 
	private WebElement itemPhoneCover;

	public WebElement getItemPhoneCover() {
		return itemPhoneCover;
	}
	
	
}
