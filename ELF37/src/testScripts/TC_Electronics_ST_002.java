package testScripts;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibrary.Base_Test;

@Listeners(genericLibrary.ListenerImplementation.class)
public class TC_Electronics_ST_002 extends Base_Test{

	@Test
	public void addMobileCoverToCartListener() {
		
		Reporter.log("Hi", true);
		int i=1/0;
	}
}
