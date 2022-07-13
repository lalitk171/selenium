package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassroomScenario8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(4000);
		driver.findElement(By.id("denyBtn")).click();
		WebElement target = driver.findElement(By.xpath("//li[@class='menuparent']/a[@title='Jewellery']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();		
		driver.findElement(By.xpath("//span[.='Kadas']")).click();
		driver.findElement(By.id("pid_8967")).click();
		 
		driver.findElement(By.xpath("//*[@id=\"attributes\"]/span/div/span/span[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"buy-now\"]")).click();

	}
}
