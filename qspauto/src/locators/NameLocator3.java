package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//working but security prompt after clicking on login button
public class NameLocator3 {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.paypal.com/uk/signin");
		
		//login operation
		driver.findElement(By.id("email")).sendKeys("Admin");//type username
		driver.findElement(By.id("btnNext")).click();
		driver.findElement(By.id("password")).sendKeys("admin1123");//type password
		driver.findElement(By.id("btnLogin")).click();


	}

}
