package dataProviderConcept;

import org.testng.annotations.Test;

public class TC_DW_Login_002 {

	@Test(dataProviderClass=TC_DW_Login_001.class,dataProvider="testDataForCredentials")
	public static void display(String [] testData) {
		System.out.println(testData[0]);
		System.out.println(testData[1]);
	}
}
