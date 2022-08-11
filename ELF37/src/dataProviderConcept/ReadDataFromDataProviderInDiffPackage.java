package dataProviderConcept;

import org.testng.annotations.Test;

public class ReadDataFromDataProviderInDiffPackage {

	@Test(dataProviderClass=advancedConcepts.ReadDataFromExcelAndPassToTestCase.class,dataProvider="Credentials")
	public void read(String [] arr) {
		for(String data : arr) {
			System.out.print(data +", ");
		}
	}
}
