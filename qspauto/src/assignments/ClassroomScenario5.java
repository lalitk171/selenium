	package assignments;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class ClassroomScenario5 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			driver.get("https://www.bluestone.com");
			Thread.sleep(4000);
			driver.findElement(By.id("denyBtn")).click();
			driver.findElement(By.xpath("//li[@class='menuparent repb']/a[@title='Rings']")).click();
			WebElement target=driver.findElement(By.xpath("//span[.=' Popular ']"));
			Actions act = new Actions(driver);
			act.moveToElement(target).perform();		
			driver.findElement(By.xpath("//div[@class='content']/descendant::a[text()='Price Low to High ']")).click();
			WebElement text = driver.findElement(By.xpath("//span[@class='new-price']"));
			String valueOfText = text.getText();
			System.out.println(valueOfText);
			driver.quit();
	 }
}
