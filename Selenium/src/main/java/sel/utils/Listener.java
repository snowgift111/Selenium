package sel.utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class Listener extends UtilityHelper implements ITestListener  {

		 public void onTestStart(ITestResult result) {
		  test = reports.createTest(result.getName());
		 }
		 public void onTestSuccess(ITestResult result) {
		  if (result.getStatus() == ITestResult.SUCCESS) {
		   test.log(Status.PASS, "Pass Test case is: " + result.getName());
		  }
		 }
	
}
