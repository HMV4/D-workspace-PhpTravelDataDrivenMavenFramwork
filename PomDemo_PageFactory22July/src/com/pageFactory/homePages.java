package com.pageFactory;

import org.testng.annotations.Test;

import ExcelLib.ExcelDataProvider;

import com.pages.*;

public class homePages extends TestBase {

	public static void userRegistrationName(String usrname) {

		driver.get(config.getProperty("HomePage_URL"));
		getXpath("RegisterLink").click();
		getXpath("UserName").sendKeys(usrname);
		System.out.println("3" );
	}

	public static void userRegistrationPassword(String registerPassword) {

		getXpath("Password").sendKeys(registerPassword);
		System.out.println("5" );

	}

	public static void regis_ConfirmPassword(String regis_ConfirPassword) {

		getXpath("ConfirmPassword").sendKeys(regis_ConfirPassword);
		System.out.println("7" );
	}

	public static void mercuryUserRegistration(String usrname, String psswd,String cpsswrd) {

		System.out.println("2" );
		homePages.userRegistrationName(usrname);
		System.out.println("4" );
		homePages.userRegistrationPassword(psswd);
		System.out.println("6" );
		homePages.regis_ConfirmPassword(cpsswrd);
		System.out.println("8" );
	}
}
