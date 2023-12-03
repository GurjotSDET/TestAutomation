package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBase {

	// framework first step
	// base class that have reusable function

	ChromeDriver driver;

	public void log(String messgae) {
		System.out.println(messgae);
	}

	// sendkeys
	public void type(WebElement ele, String text) {
		ele.sendKeys(text);
		log("The value " + text + " is typed"); // calling log function that pass the message large
	}

	// clear and sendkeys
	public void clearAndType(WebElement ele, String text) {
		ele.clear();
		ele.sendKeys(text);
		log("The value is cleared and " + text + " is typed"); // calling log function that pass the message large
	}

	// check if element is displayed or not
	public boolean isDisplayed(WebElement ele) {
		return ele.isDisplayed();
	}

	// check if element is readonly
	public boolean isReadonly(WebElement ele) {
		String attribute = ele.getAttribute("readonly");
		if(attribute.equals("true"))
		{
			return true;
		} else return false;
	}


}
