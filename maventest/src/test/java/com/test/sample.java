package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.listener.CustomeRetryListener;

public class sample {
	WebDriver driver=null;
	
	
	@BeforeSuite
	public void init()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\DriverExe\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
	

	
	@Test(retryAnalyzer=CustomeRetryListener.class)
	public void demotest()
	{
		try {
			/*driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			driver.get("https://www.googless.co.in");
			String Expected=driver.getCurrentUrl();*/
			//Assert.assertEquals(driver.getCurrentUrl(), Expected);
			Assert.assertEquals("ANJJJJ", "ANJJJJ");
			//System.out.println("HELOOOOOOO");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid URL");
			e.getMessage();
		}
		
	}
	
	@AfterTest
	public void tearDown()
	{
		System.out.println(" OPNEEN");
	}

}
