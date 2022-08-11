package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhoneCoverPage {

	public PhoneCoverPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//option[contains(text(),'Apple')]/..") 
	private WebElement maufacturerDropDown;
	
	@FindBy(xpath="//option[contains(text(),'Black')]/..") 
	private WebElement colourDropDown;
	
	@FindBy(id="addtocart_80_EnteredQuantity")
	private WebElement quantityTextField;
	
	@FindBy(id="add-to-cart-button-80")
	private WebElement addToCartButton;

	public WebElement getMaufacturerDropDown() {
		return maufacturerDropDown;
	}

	public WebElement getColourDropDown() {
		return colourDropDown;
	}

	public WebElement getQuantityTextField() {
		return quantityTextField;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
	
	
}
