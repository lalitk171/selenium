package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.AllArguments;

public class MaximizeChildWindow {
	//How to maximize child window
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.linkText("Open a popup window")).click();
		
		String parentTitle=driver.getTitle();
		String parentHandle = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String wh:allHandles)
		{
			String currentTitle = driver.switchTo().window(wh).getTitle();
			if(!parentTitle.equals(currentTitle))
			{
				driver.switchTo().window(wh).manage().window().maximize();
			}
			else
			{
				driver.switchTo().window(wh).close();
			}
		}
		
	}
}