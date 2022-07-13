package assignments;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassroomScenario14 {
		public static void main(String[] args) throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get("https://www.bluestone.com/");
			driver.findElement(By.id("denyBtn")).click();
			WebElement target = driver.findElement(By.xpath("//a[@title='Jewellery']"));
			Actions act = new Actions(driver);
			act.moveToElement(target).perform();	
			driver.findElement(By.xpath("//a[@title='Gold Coins']")).click();
			driver.findElement(By.xpath("//div[@class='filter 1gms']")).click();
			Thread.sleep(5000);
			driver.close();
			
		}
	}

