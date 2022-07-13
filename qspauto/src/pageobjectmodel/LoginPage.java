package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginBtn;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keepMeLoggedInCheckBox;	
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(id="licenseLink") private WebElement licenseLink;
	
	
	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}	
	
	//utilization
	public WebElement getUsn() {
		return usn;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}


	public WebElement getKeepMeLoggedInCheckBox() {
		return keepMeLoggedInCheckBox;
	}


	public WebElement getLogo() {
		return logo;
	}


	public WebElement getLicenseLink() {
		return licenseLink;
	}
	
	//generic reusable method 
	public void actiTimeValidLogin(String validusername,String validPassword)
	{
		usn.sendKeys(validusername);
		pass.sendKeys(validPassword);
		loginBtn.click();
	}
	public void actiTimeInvalidLogin(String invalidusername,String invalidPassword)
	{
		usn.sendKeys(invalidusername);
		usn.sendKeys(invalidPassword);
		loginBtn.click();
		usn.clear();
	}
	
	//operational methods
	
}
