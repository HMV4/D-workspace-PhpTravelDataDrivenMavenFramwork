package com.pages;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import ExcelLib.ExcelDataProvider;

import com.SnapShot.SnapshotUtilty;
import com.pageFactory.signOnPage;

public class SignON extends TestBase {

	// String Reg_Usr = null;
	// String Reg_Prsswd = null;
	// String Reg_CnfrmPrsswd = null;
	// WebDriver driver =new FirefoxDriver();

	
	@Test(dataProvider = "SignON", dataProviderClass = ExcelDataProvider.class)
	public static void Login(String userName, String password)
			throws InterruptedException {
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		try {

			signOnPage.mercurySignOn(userName,password);
			System.out.println("SIGN IN /SIGN ON SUCCESSFULLY..............!");
			SnapshotUtilty.snapShots(driver, "SIGN IN");
		
		} catch (Exception e) {
			System.out.println(e);

		}
		
		
		
	}
}
