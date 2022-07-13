package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//working
public class NameLocator4 {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.etsy.com/signin");
		
		//login operation
		driver.findElement(By.name("email")).sendKeys("Admin1");//type username
		driver.findElement(By.name("password")).sendKeys("admin1123");//type password
		driver.findElement(By.name("submit_attempt")).click();

	}

}
