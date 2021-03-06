package com.pageFactory;
import org.testng.annotations.Test;

import ExcelLib.ExcelDataProvider;

import com.pages.*;
public class homePages extends TestBase {
	
	
	public static void userRegistrationName(String registerName)
	{
		
		driver.get(config.getProperty("HomePage_URL"));
		getXpath("RegisterLink").click();
		getXpath("FirstName").sendKeys(registerName);
	}

	public static void userRegistrationPassword(String registerPassword)
	{
		
		getXpath("Password").sendKeys(registerPassword);
		
	}
	
	public static void regis_ConfirmPassword(String regis_ConfirPassword)
	{
		
		getXpath("ConfirmPassword").sendKeys(regis_ConfirPassword);
	}
	
	@Test(dataProvider="Register" ,dataProviderClass = ExcelDataProvider.class)
	public static void mercuryUserRegistration(String usrname,String psswd,String cpsswrd )
	{
		
		homePages.userRegistrationName(usrname);
		homePages.userRegistrationPassword(psswd);
		homePages.regis_ConfirmPassword(cpsswrd);
	}
}
