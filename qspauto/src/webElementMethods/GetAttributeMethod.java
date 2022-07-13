package webElementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement unTextBox = driver.findElement(By.name("txtUsername"));
		WebElement pwdTextBox = driver.findElement(By.name("txtPassword"));
		String value1 = unTextBox.getAttribute("id");
		String value2 = pwdTextBox.getAttribute("type");
		System.out.println(value1);
		System.out.println(value2);
	}
}