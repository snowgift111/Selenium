package sel.runner;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import sel.baseclass.Base;


	@CucumberOptions(features = "src/test/resources/Features/LoginPage.feature", glue = "sel.definitions")
	 
	public class TestRunner extends AbstractTestNGCucumberTests {
		
		Base base = new Base();
		
		@BeforeSuite
		public void setup() {
		base.setupDriver();
		}
		@AfterSuite
		public void tear() {
			
			base.tearDown();
		}
		
	}

