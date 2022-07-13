package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassroomScenario10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='chat-widget']"));
		driver.switchTo().frame(frameElement);
		
		WebElement chatWithOurExperts = driver.findElement(By.xpath("//button[@aria-label='Open LiveChat chat widget']"));
		chatWithOurExperts.click();
		driver.findElement(By.name("name")).sendKeys("admin");
		driver.findElement(By.name("email")).sendKeys("manager");
		driver.findElement(By.id("5xvvvt60fym_146917605549304831")).sendKeys("9876");
		driver.findElement(By.xpath("//span[.='Start the chat']")).click();
		driver.findElement(By.xpath("//textarea[@aria-label='Write a message…']")).sendKeys("hello,how are you");
		driver.findElement(By.xpath("//button[@aria-label='Send a message']")).click();
	}
}
