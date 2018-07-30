package Util;

import org.apache.poi.util.SystemOutLogger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest  implements ITestListener		


{

	public void onFinish(ITestContext finish) {
		
		
		
		System.out.println("Execution Completed ");
		
		
	}

	public void onStart(ITestContext start) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult fail) {
		
	
		
		
		 System.out.println("The name of the testcase failed is :"+fail.getName());	
		
	}

	public void onTestSkipped(ITestResult arg0) {
	
		
	}

	public void onTestStart(ITestResult arg0) {

		
		System.out.println("Execution has started");
		
	}

	public void onTestSuccess(ITestResult Success) {
		
		
	}

	
	
	
	
}
