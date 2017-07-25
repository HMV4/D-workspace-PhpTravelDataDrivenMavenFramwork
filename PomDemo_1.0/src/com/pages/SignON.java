package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SignON extends TestBase {

	 //String Reg_Usr = null;
	 //String Reg_Prsswd = null;
	 //String Reg_CnfrmPrsswd = null;
	//WebDriver driver =new FirefoxDriver();
	
	@Test
	public  void Login() throws InterruptedException
	{
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS );
		try{
			
		System.out.println(driver.getTitle());
		//super.Register(Reg_Usr,Reg_Prsswd);
		//driver.get("http://localhost/servlets/com.mercurytours.servlet.WelcomeServlet");
		//driver.findElement(By.xpath("//td/table/tbody/tr/td[1]/a")).click();
		//SIGN IN link after registration
		getXpath("signin").click();
		//System.out.println("SIGN IN CLICKED");
		
		//driver.findElement(By.cssSelector("tr>td>input[name='userName']")).sendKeys("HITUJ24");
		//USername
		getXpath("userName").sendKeys("HMV");
		//driver.findElement(By.cssSelector("tr>td>input[name='password']")).sendKeys("HITUJ24");
		//Password
		getXpath("password").sendKeys("HMV");
		
		//driver.findElement(By.cssSelector("tr>td>input[name='login']")).click();
		//Submit
		getXpath("Submit").click();
		
		Thread.sleep(10000);
		//driver.close();
		System.out.println("SIGN IN /SIGN ON SUCCESSFULLY..............!");
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
}
