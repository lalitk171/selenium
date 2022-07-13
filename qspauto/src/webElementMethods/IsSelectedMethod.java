package webElementMethods;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do");
		WebElement loginCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		boolean status = loginCheckBox.isSelected();
		System.out.println(status);
		Thread.sleep(4000);
		loginCheckBox.click();
		boolean status2=loginCheckBox.isSelected();
		System.out.println(status2);
		
	}
}