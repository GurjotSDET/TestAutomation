package Chapter5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputs {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver = new ChromeDriver();
		 driver.get("https://letcode.in/edit");
		 driver.manage().window().maximize();
		 //TC 01   , used sendkeys
		 driver.findElement(By.id("fullName")).sendKeys("Gurjot");
		 		 
		//TC 02   used keyboard keys
		 driver.findElement(By.id("join")).sendKeys(" Team player", Keys.TAB);
		 
		 //TC 03  used active element, getAttribute
		 String attribute = driver.switchTo().activeElement().getAttribute("value");
		 System.out.println(attribute);
		 
		 //TC 04 used clear()
		 driver.findElement(By.id("clearMe")).clear();
		 
		 //TC 05   used isEnabled()
		 boolean enabled = driver.findElement(By.id("noEdit")).isEnabled();
		 System.out.println("Checking if element is enabled :" +enabled);
		 
		 //TC 06  checked if readable using getAttribute readonly
		 String isreadonly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		 System.out.println("Checking if element is readonly :" +isreadonly);
		 
		 driver.quit();    //to terminate the driver instance and halt the process
		 
	}

}
