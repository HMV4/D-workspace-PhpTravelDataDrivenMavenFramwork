package com.Retry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class retryTest {
	
	WebDriver driver= new FirefoxDriver();
	String Expected=driver.getTitle();
	@Test(retryAnalyzer=retryAnalyzer.class)
	public void failTestcase()
	{
		driver.get("www.google.com");
		Assert.assertEquals(driver.getTitle(), Expected);
		
	}

}
