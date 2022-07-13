package eliminateDuplicates;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicatesUsingLinkedHash {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Lalit/Selenium/HTML/MultiSelectDropdown.html");
		WebElement dropdownElement = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdownElement);	
		//get the list of webelements
		List<WebElement> options = sel.getOptions();
		//declare a set to eliminate the duplicate data
		LinkedHashSet<String> s = new LinkedHashSet<String>();
		//read the list and get the text
		for(int i=0;i<options.size();i++)
		{
			WebElement ops = options.get(i);
			String text = ops.getText();
			//add the text to set so that duplicates wont be accepted
			//order of insertion wont be maintained
			s.add(text);
		}
		//read the set
		for(String se:s)
		{
			System.out.println(se);
		}
	}
}