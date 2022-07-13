package windowbasedpopups;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopup {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=b21p99imlgp6k");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.linkText("Settings")).click();
		driver.findElement(By.partialLinkText("Logo")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("uploadNewLogoOption")).click();
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		act.doubleClick(target).perform();
		
		File abs = new File("./autoitscripts/FileUp.exe");
		String abspath = abs.getAbsolutePath();		
		Runtime.getRuntime().exec(abspath);
		Thread.sleep(4000);
		Runtime.getRuntime().exec(abspath);
		
	}
}
