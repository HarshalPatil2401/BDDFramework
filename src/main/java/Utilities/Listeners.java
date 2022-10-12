package Utilities;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners  extends SeleniumUtilities implements ITestListener {
	ThreadLocal<ExtentTest> extentTestThread = new ThreadLocal<ExtentTest>();
	ExtentReports extentReport = ExtendReport.getExtentReport();
	ExtentTest extentTest;
	static Logger log = Logger.getLogger(Listeners.class);
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("test execution started!!!");
		extentTest = extentReport.createTest(result.getMethod().getQualifiedName()+" execution started");
		extentTestThread.set(extentTest);
	}

	public void onTestSuccess(ITestResult result) {
		log.info("test has been passed!!!!!!");
		extentTestThread.get().log(Status.PASS,"Test Passed");
	}

	public void onTestFailure(ITestResult result) {
		extentTestThread.get().fail(result.getThrowable());
		
		
		
		takesScreenShot(result.getClass().getName());
		
		
		
	}

	public void onTestSkipped(ITestResult result) {
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			try {
				failedTest();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	public void onStart(ITestContext context) {
		log.info("started!!!!!");
	}

	public void onFinish(ITestContext context) {
		log.info("finished!!!!!");
		extentReport.flush();
	}

}
