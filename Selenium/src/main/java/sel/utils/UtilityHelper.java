package sel.utils;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class UtilityHelper {
	
	 ExtentSparkReporter extentSparkReporter;
	 ExtentReports reports;
	 public static ExtentTest test;
	 
	public void startReporter(boolean bool) {

		extentSparkReporter = new ExtentSparkReporter (System.getProperty("user.dir") + "/test-output/extentReport.html");
		reports = new ExtentReports();
		reports.attachReporter(extentSparkReporter);
		reports.createTest("Extent Report");
	 
	 extentSparkReporter.config().setDocumentTitle("Simple Automation Report");
     extentSparkReporter.config().setReportName("Test Report");
     extentSparkReporter.config().setTheme(Theme.STANDARD);
     extentSparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
     reports.flush();
     
     if (bool == true)
     {
    	 test.log(Status.PASS, "Pass TC");
     }
	}
	
}
