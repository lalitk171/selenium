package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCase6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String getTextValue = driver.findElement(By.xpath("//span[.='HP Pavilion 14,11th Gen Intel Core i5 16GB RAM/512GB SSD 14 inch(35.6 cm),FHD IPS Anti-Glare Display/Intel Iris Xe Graphics/Backlit KB/B&O Audio/FPR/Win 11/Thin & Light/1.41kg, 14-dv1001TU']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[@class='a-price-whole']")).getText();
		System.out.println(getTextValue);
	}

}
