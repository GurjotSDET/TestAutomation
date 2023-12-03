package Chapter6;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.get("https://letcode.in/buttons");
		 driver.manage().window().maximize();
		 
		 //location
		 WebElement positionbutton = driver.findElement(By.id("position"));
		 Point location = positionbutton.getLocation();
		 System.out.println(location);
		 
		 //color
		 WebElement colorbtn = driver.findElement(By.id("color"));
		 String cssValue = colorbtn.getCssValue("background-color");
		 System.out.println(cssValue);
		 
		 driver.quit();		 
		 
		 
	}

}
