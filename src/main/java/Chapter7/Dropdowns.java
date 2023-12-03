package Chapter7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.get("https://letcode.in/dropdowns");
		 driver.manage().window().maximize();
		 
		 //Select the apple using visible text
		 WebElement fruitdrop = driver.findElement(By.id("fruits"));
	     Select fruits = new Select(fruitdrop);
	     fruits.selectByVisibleText("Banana");
	
	     WebElement multipledrop = driver.findElement(By.id("superheros"));
	     Select mselect = new Select(multipledrop);
         boolean multiple = mselect.isMultiple();
         System.out.println(multiple);
         mselect.selectByIndex(2);
         mselect.selectByValue("am");
         mselect.selectByVisibleText("Batman");
         
         
        // driver.quit();
	
	
	}

}
