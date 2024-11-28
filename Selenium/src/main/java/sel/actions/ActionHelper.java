package sel.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import sel.baseclass.Base;

public class ActionHelper extends Base{

	public void getUrl() {
		driver.get("https://www.amazon.in/signin");
	}
	
	public void sendKeys(WebElement ele, String str) {
		ele.sendKeys(str);
	}
	public void click(WebElement ele) {
		ele.click();
	}
}
