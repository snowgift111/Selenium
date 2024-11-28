package sel.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageLocators {
	
 WebDriver driver;

	public LoginPageLocators (WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(id= "ap_email")
		public static WebElement usr;
		
		@FindBy(id= "ap_password")
		public static WebElement pwd;
		
		@FindBy(id= "signInSubmit")
		public static WebElement signin;

	
}
