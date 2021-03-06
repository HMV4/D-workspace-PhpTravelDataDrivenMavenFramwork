package com.pages;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import ExcelLib.ExcelDataProvider;

import com.SnapShot.SnapshotUtilty;

public class SignON extends TestBase {

	// String Reg_Usr = null;
	// String Reg_Prsswd = null;
	// String Reg_CnfrmPrsswd = null;
	// WebDriver driver =new FirefoxDriver();

	@Test(dataProvider = "SignON", dataProviderClass = ExcelDataProvider.class)
	public static void Login(String username, String password)
			throws InterruptedException {
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		try {

			//System.out.println(driver.getTitle());
			// super.Register(Reg_Usr,Reg_Prsswd);http://localhost/servlets/com.mercurytours.servlet.SignonServlet
			// driver.get("http://localhost/servlets/com.mercurytours.servlet.WelcomeServlet");
			// driver.findElement(By.xpath("//td/table/tbody/tr/td[1]/a")).click();
			// SIGN IN link after registration
			driver.get(config.getProperty("HomePage_URL"));
			
			getXpath("SIGNON").click();
			System.out.println("SIGN IN CLICKED");

			// driver.findElement(By.cssSelector("tr>td>input[name='userName']")).sendKeys("HITUJ24");
			// USername from CONFIG file
			getXpath("userName").sendKeys(objrep.getProperty("userNamevalue"));

			// Usernam from Excel file
			getXpath("userName").sendKeys(username);
			// driver.findElement(By.cssSelector("tr>td>input[name='password']")).sendKeys("HITUJ24");
			// Password
			getXpath("password").sendKeys(objrep.getProperty("passwordvalue"));
			getXpath("password").sendKeys(password);

			// driver.findElement(By.cssSelector("tr>td>input[name='login']")).click();
			// Submit
			getXpath("Submit").click();

			// Thread.sleep(10000);
			// driver.close();
			System.out.println("SIGN IN /SIGN ON SUCCESSFULLY..............!");
			SnapshotUtilty.snapShots(driver, "SIGN IN");
		} catch (Exception e) {
			System.out.println(e);

		}
	}
}
