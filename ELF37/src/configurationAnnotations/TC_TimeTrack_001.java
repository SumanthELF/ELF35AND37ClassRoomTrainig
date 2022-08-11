package configurationAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_TimeTrack_001 {

	@Test public void createATimeTrack() { Reporter.log("From the test case 1",true); }
	
	@BeforeSuite public void beforeSuite() { Reporter.log("From the before suite",true); }
	
	@BeforeTest public void beforeTest() { Reporter.log("From the before test",true); }
	
	@BeforeClass public void beforeClass() { Reporter.log("From the before class",true); }
	
	@BeforeMethod public void  beforeMethod() { Reporter.log("From the before method",true); }
	
	@AfterSuite public void afterSuite() { Reporter.log("From the after suite",true); }
	
	@AfterTest public void afterTest() { Reporter.log("From the after test",true); }
	
	@AfterClass public void afterClass() { Reporter.log("From the after class",true); }
	
	@AfterMethod public void afterMethod() { Reporter.log("From the after method",true); }
	
	@Test public void modifyTimeTrack() { Reporter.log("From the test case 2",true); }
}
