package assignments;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartNewAssignmentRobot {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("Samsung F12");
		Thread.sleep(4000);
		driver.findElement(By.className("L0Z3Pu")).click();
		driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F12 (Sea Green, 64 GB)']")).click();
		
		Robot robot=new Robot();
		robot.keyPress((KeyEvent.VK_CONTROL));
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyRelease((KeyEvent.VK_CONTROL));
		
		driver.findElement(By.xpath("//a[.='128 GB']")).click();//not working no such element exception 
		driver.findElement(By.xpath("//li[@id='swatch-0-color']/a")).click();
		driver.findElement(By.id("pincodeInputId")).clear();
		driver.findElement(By.id("pincodeInputId")).sendKeys("411033");
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
		
	}
}
