package Listener_Demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener_Test {

	

		public class Listner_Demo implements  ITestListener
		{

			public void onFinish(ITestContext arg0) {
				
				
			}

			public void onStart(ITestContext arg0) {
				
				
			}

			public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
				
				
			}

			public void onTestFailure(ITestResult result) {
				
			    System.out.println("The name of the testcase failed is :"+result.getName());					

				
			}

			public void onTestSkipped(ITestResult arg0) {
				
				
			}

			public void onTestStart(ITestResult result) {
				
				  System.out.println("The name of the testcase passed is :"+result.getName());	
				
				
			}

			public void onTestSuccess(ITestResult arg0) {
				
				
			}
			
			
			
			
		}
	}


