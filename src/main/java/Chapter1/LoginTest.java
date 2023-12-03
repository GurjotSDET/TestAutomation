package Chapter1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver", "./drivers");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String email = "sgurjot555@gmail.com";
		String pass = "Ios@111";

		driver.get("https://letcode.in/");
		WebElement signin = driver.findElement(By.linkText("Log in"));
		signin.click();

		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("(//button[@class='button is-primary'])[1]")).click();

		
		
		driver.quit();
	}

}
