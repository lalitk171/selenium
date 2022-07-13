package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ScrollUpDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev");
		Thread.sleep(4000);
		
		//explicit type casting
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//scrolldown
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(4000);
		//scrollUp
		jse.executeScript("window.scrollBy(0,-500)");
		
	}

}
