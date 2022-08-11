package configurationAnnotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_Search_003 extends Base_Test{
	
	@Test
	public void searchOrg() {
		
		driver.findElement(By.linkText("Companies")).click();
	}

}
