package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {

	public CommonPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText="Electronics") 
	private WebElement electronicsModule;

	public WebElement getElectronicsModule() {
		return electronicsModule;
	}
	
	
}
