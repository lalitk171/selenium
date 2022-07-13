package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("laptops");
		Thread.sleep(4000);
		driver.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Processor']"));
		driver.findElement(By.xpath("//div[text()='Core i5']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
		Thread.sleep(4000);
		String textValue = driver.findElement(By.xpath("//div[text()='HP Pavilion Gaming Core i5 11th Gen - (8 GB/1 TB HDD/256 GB SSD/Windows 10 Home/4 GB Graphics/NVIDIA G...']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println(textValue);
		
		
	}

}
