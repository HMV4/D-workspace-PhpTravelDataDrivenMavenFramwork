package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ExcelLib.*;

import com.SnapShot.SnapshotUtilty;
import com.pageFactory.homePages;

//import com.sun.jna.platform.FileUtils;

public class HomePage_Register extends TestBase {

	// WebDriver driver= new FirefoxDriver();
	Random rand = new Random(System.currentTimeMillis());
	int MAXVALUE = 007;
	int randNum = rand.nextInt(MAXVALUE);

	// int MAXVALUE =007;
	// int randNum = (int) (Math.random() * MAXVALUE);
	// Reg Method

	@Test(dataProvider = "Register", dataProviderClass = ExcelDataProvider.class)
	// public void Register(String usrname,String psswd,String cpsswrd) throws
	// IOException
	public void Register(String usrname, String psswd, String cpsswrd)
			throws IOException

	{

		System.out.println("1" );
		homePages.mercuryUserRegistration(usrname, psswd, cpsswrd);

	}

}
