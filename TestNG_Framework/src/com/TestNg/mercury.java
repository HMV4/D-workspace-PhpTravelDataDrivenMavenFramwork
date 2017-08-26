package com.TestNg;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.IsElementPresent;
//import static java.lang.System.out;

public class mercury {
	
	
	
	@Test(priority = 1)
	public  void  p134()
	{
		System.out.println("1");
	}
	
	@Test(priority = 2
			)
	public  void  p2()
	{System.out.println("3");
	

	}
	
	@Test(priority = 2)
	public  void  p33()
	{System.out.println("2");}
	
	
	
	
	@Test(priority = 4)
	public  void  p11()
	
	
	{System.out.println("4");}
	@Test
	public  void  p88()
	{System.out.println("13");}


/*	@Test
	public void mainss() throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("file:///D:/Selenium%20Softwares/31July2016/WebPages/WindowHandlerIndex.html");
		
		//Thread.sleep(1000);
		String windowHandlw =driver.getWindowHandle();
		System.out.println(windowHandlw);
		driver.findElement(By.linkText("Open New Seprate Window1")).click();
		driver.findElement(By.linkText("Open New Seprate Window2")).click();
		driver.findElement(By.linkText("Open New Seprate Window3")).click();

		
		//driver.findElement(By.id("#button1")).click();
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
		for(String eachHandle :handles)
		{
			
			driver.switchTo().window(eachHandle);
			System.out.println(eachHandle);
			
			  
			
		}
		 driver.switchTo().window(windowHandlw);
		   driver.findElement(By.cssSelector("windowHandlw")).sendKeys("WOW");
		
		
		
		
		
		//Soft Assertion Allows to continue  further execution
		SoftAssert ass= new SoftAssert();
		String expected= "Goodgle";
		
		//Hards Assertion does allow to continue execution as soon as failure occurs and stops at failure point
		//Assert.assertEquals(driver.getTitle(), expected);
		
		// OR CSS= "a.gb_P[data-pid="23"]"
		driver.findElement(By.cssSelector("a.gb_P[href='https://mail.google.com/mail/?tab=wm']")).click();
		
		ass.assertEquals(driver.getTitle(), expected);
		
		System.out.println(expected);
		//ass.assertEquals(true, false);
		
		
		
	}
	
*/
	
}
