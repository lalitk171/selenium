package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//working
public class NameLocator2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sso.godaddy.com/?realm=idp&path=%2Fprofile&app=account&auth_reason=1");
		
		//login operation
		driver.findElement(By.className("ff-input")).sendKeys("Admin");//type username
		driver.findElement(By.id("password")).sendKeys("admin123");//type password
		Thread.sleep(5000);
		driver.findElement(By.id("submitBtn")).click();


	}

}
