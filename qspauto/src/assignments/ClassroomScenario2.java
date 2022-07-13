package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassroomScenario2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("ldk171111@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		driver.findElement(By.name("password")).sendKeys("Qwerty@uiop");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		driver.findElement(By.xpath("//span[.='Confirm']/span")).click();
		driver.findElement(By.xpath("//span[.='Not now']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();

	}

}
