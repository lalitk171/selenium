package operationalMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Lalit/Selenium/HTML/MultiSelectDropdown.html");
		WebElement dropdownElement = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdownElement);
		boolean status = sel.isMultiple();
		System.out.println(status);

			
	}
}