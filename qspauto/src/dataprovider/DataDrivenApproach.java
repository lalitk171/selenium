package dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenApproach {
	WebDriver driver;

	@BeforeTest
	public void setProp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	}

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://desktop-bl7lkeh/login.do");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@DataProvider(name = "TestData")
	public Object[][] testData() 
	{
		Object[][] data = new Object[5][2];
		data[0][0] = "admin123";
		data[0][1] = "manager123";

		data[1][0] = "admin123";
		data[1][1] = "24dhxb";

		data[2][0] = "jhgug3";
		data[2][1] = "manager";

		data[3][0] = "DYFHKJI";
		data[3][1] = "NJVUYFY";

		data[4][0] = "a";
		data[4][1] = "manager";
		return data;

	}
	
	@Test(dataProvider = "TestData")
	public void testInvalidActitime(String username,  String password) throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
	}
}
