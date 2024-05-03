package listeners;

import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.Base;
import utlilites.ExtentReport;

public class Listeners extends Base implements ITestListener {
	
	WebDriver driver=null;
	ExtentReports extentReport = ExtentReport.getExtentReport();
	ExtentTest extentTest;
	ThreadLocal<ExtentTest> extentTestThread=new ThreadLocal<ExtentTest>();

    @Override
    public void onTestStart(ITestResult result) {
       
      extentTest = extentReport.createTest(result.getName()+" execution started");
      extentTestThread.set(extentTest);
		
	}

    

    @Override
    public void onTestSuccess(ITestResult result) {
    	String testName=result.getName();
         // extentTest.log(Status.PASS,testName+"got Passed");
    	extentTestThread.get().log(Status.PASS,testName+"got Passed");
	
    }

    @Override
    public void onTestFailure(ITestResult result) {
    	//extentTest.fail(result.getThrowable());
    	extentTestThread.get().fail(result.getThrowable());
        String testName = result.getName();
       driver = null;

        try {
            driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("d").get(result.getInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (driver != null) {
            try {
                String path=takeScreenShot(testName, driver);
                extentTestThread.get().addScreenCaptureFromPath(path, testName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO: Implement your logic for test skipped event
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO: Implement your logic for test failed but within success percentage event
    }

    @Override
    public void onStart(ITestContext context) {
        // TODO: Implement your logic for test suite start event
    }

    @Override
    public void onFinish(ITestContext context) {
    	extentReport.flush();
        // TODO: Implement your logic for test suite finish event
    }

}
