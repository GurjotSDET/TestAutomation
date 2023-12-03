package Chapter8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.get("https://letcode.in/alert");
		 driver.manage().window().maximize();
		 
		 //accept
		 driver.findElement(By.id("accept")).click();
		 driver.switchTo().alert().accept();
		 
		 //dismiss
		 driver.findElement(By.id("confirm")).click();
		 
		 Alert alert = driver.switchTo().alert();
		 String text = alert.getText();
		 System.out.println(text);
		 Thread.sleep(3000);
		 driver.switchTo().alert().dismiss();
		 
		//dismiss
		 driver.findElement(By.id("prompt")).click();
		 alert.sendKeys("gurjot");
		 alert.accept();
		 
	}

}
