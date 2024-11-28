package sel.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base{
	
 public static WebDriver driver;

public void setupDriver() {
	System.setProperty("webdriver.chrome.driver", "D:\\interview\\Selenium\\src\\test\\resources\\Drivers\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().fullscreen();
}
public void tearDown() {
	driver.quit();
}

}
