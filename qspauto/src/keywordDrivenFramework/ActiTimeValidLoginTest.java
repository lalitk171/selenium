package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLoginTest extends BaseTest{
	public static void main(String[] args) throws IOException, InterruptedException {
		//object creation
		BaseTest bt = new BaseTest();
		Flib flib = new Flib();
		
		//read the data from the property file use the generic reusable method
		String username = flib.readPropertyFile("./data/config.properties","username");
		String password = flib.readPropertyFile("./data/config.properties","password");
		//open the browser
		bt.openBrowser();
		Thread.sleep(3000);
		//perform login
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		
		//close the browser
		bt.closeBrowser();
		
		
		
	}
}
