package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//working
public class NameLocator1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
		//login operation
		driver.findElement(By.id("username")).sendKeys("Admin");//type username
		driver.findElement(By.id("password")).sendKeys("admin123");//type password
		Thread.sleep(5000);
		driver.findElement(By.id("Login")).click();


	}

}
