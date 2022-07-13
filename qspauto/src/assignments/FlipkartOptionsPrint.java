package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartOptionsPrint {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement target = driver.findElement(By.xpath("//div[text()='Fashion']"));
		WebElement target1 = driver.findElement(By.xpath("//div[text()='Electronics']"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		act.moveToElement(target1).perform();
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='_2IjXr8']"));
		for(WebElement sugg:suggestions)
		{
			String textOfWebElement = sugg.getText();
			System.out.println(textOfWebElement);
		}

	}

}
