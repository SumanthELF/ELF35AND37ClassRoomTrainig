package dataDriven;

import org.testng.annotations.Test;

public class ReadDataFromDiffPackageDataprovider {

	@Test(dataProviderClass=dataProviderConcept.TC_DW_Login_001.class,
			dataProvider="testDataForCredentials")
	public void demo(String [] testData) {
		System.out.println(testData[0]);
		System.out.println(testData[1]);
	}
}
