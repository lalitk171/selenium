package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		new ChromeDriver(); //open the chrome browser1
		
	}	
}