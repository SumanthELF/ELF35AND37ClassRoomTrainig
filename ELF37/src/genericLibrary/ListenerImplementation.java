package genericLibrary;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation implements ITestListener {
	
	@Override		
    public void onFinish(ITestContext arg0) {		//after class			
   
    }		

    @Override		
    public void onStart(ITestContext arg0) {	// Before class			

    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
    	
    }		

    @Override		
    public void onTestFailure(ITestResult arg0) {					
        	Reporter.log("katam tata bye bye , better luck nect time",true);
        	Generic_Screenshots.getPhoto(arg0.getMethod().getMethodName());
    }		

    @Override		
    public void onTestSkipped(ITestResult arg0) {					
        		
    }		

    @Override		
    public void onTestStart(ITestResult arg0) {		// before method			

    }		

    @Override		
    public void onTestSuccess(ITestResult arg0) {		// after method			

    }	
	
}
