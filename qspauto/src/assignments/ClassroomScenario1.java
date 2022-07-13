package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassroomScenario1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("ldk171111@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		driver.findElement(By.name("password")).sendKeys("Qwerty@uiop");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9552674381");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		
	}
}
