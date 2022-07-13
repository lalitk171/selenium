package synchronization;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchActiTime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);		
		driver.get("http://127.0.0.1/login.do;jsessionid=346rate7bwj0q");		
		String actualLoginPageTitle = driver.getTitle();
		
		if(actualLoginPageTitle.equals("actiTIME - Login"))
		{
			System.out.println("Test case passed ! Login page title is matched ");
		}		
		else
		{
			System.out.println("Test-case failed ! Login page title is not matched ");
		}		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		String actualHomePageTitle = driver.getTitle();		
		
		if(actualHomePageTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Test case passed ! Home page title is matched ");
		}		
		else
		{
			System.out.println("Test case failed ! Home page title is not matched ");
		}		
	}
}