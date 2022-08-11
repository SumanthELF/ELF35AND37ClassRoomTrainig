package advancedConcepts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {

	public Elements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Enter skills / designations / companies']") 	
	private WebElement searchTextBox;
	
	@FindBy(id="") 
	private WebElement ustf;

	public WebElement getSearchTextBox() {
		return searchTextBox;
	}

	public WebElement getUstf() {
		return ustf;
	}
	
	
	
}
