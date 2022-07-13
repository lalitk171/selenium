package pageobjectmodel;

import java.io.IOException;

public class TestActiTimeLogout extends BaseTest {
	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.setup();//open the browser and launch the app
		Flib flib = new Flib();
		//read the data from excel file by using generic reusable methods
		String validUsername = flib.readPropertyFile(PROP_PATH, "username");
		String validPassword = flib.readPropertyFile(PROP_PATH, "password");
		LoginPage lp = new LoginPage(driver);
		//perform login
		lp.actiTimeInvalidLogin(validUsername, validPassword);
		HomePage hp = new HomePage(driver);
		hp.clickLogout();
		
	}
}
