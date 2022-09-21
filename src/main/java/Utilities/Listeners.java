package Utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners  extends SeleniumUtilities implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test start");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("The Test Has been Passed pass");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("The Test has Been Failed :" + result.getTestName());
		
		
		
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("The test has been Skipped :" + result.getTestName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("the Method Has been Passed but not valid :" + result.getTestName());
		
			try {
				failedTest();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	public void onStart(ITestContext context) {
		System.out.println("The Executio Has Been Started:-->");
	}

	public void onFinish(ITestContext context) {
		System.out.println("The execution is Ended.");
	}

}
