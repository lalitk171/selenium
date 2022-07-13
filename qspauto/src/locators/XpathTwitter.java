package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTwitter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/");
		
		driver.findElement(By.xpath("//span[text()='Sign up with phone or email']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='phone_number']")).sendKeys("admin123");
		
	}

}
