package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//working
public class NameLocator5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sellercentral.amazon.com/");
		
		//login operation
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys("Admin12");//type username
		driver.findElement(By.name("password")).sendKeys("admin123");//type password
		Thread.sleep(5000);
		driver.findElement(By.className("a-button-input")).click();

	}

}
