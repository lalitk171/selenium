package pageobjectmodel;

import java.io.IOException;

public class TestActiTimeInvalidLogin extends BaseTest{
	public static void main(String[] args) throws IOException {
		BaseTest bt=new BaseTest();
		bt.setup();//open the browser and launch the app
		Flib flib = new Flib();
		LoginPage lp=new LoginPage(driver);
		//get the rowcount to iterate the for loop
		int rc = flib.getRowCount(EXCEL_PATH,"invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
			String invalidusername = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String invalidpassword = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);
			//perform invalid login
			lp.actiTimeInvalidLogin(invalidusername, invalidpassword);
		}
		//close the browser
		
		bt.tearDown();
	}
}
