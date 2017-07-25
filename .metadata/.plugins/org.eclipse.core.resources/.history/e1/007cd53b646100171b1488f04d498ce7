

package Tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.log4testng.Logger;



public class TestBase {
	
	public static Properties config=null;
	public static Properties objrep=null;
	public static WebDriver driver =null;
	public static EventFiringWebDriver webdvr =null;
	//public static Logger APPLICATION_LOGS=Logger.getLogger("devpinoylOGGER");
	
@BeforeSuite
public void initialize() throws IOException
{
	
	//Config file
	config = new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\Config\\config.properties");
	config.load(fis);
	
	//OR file
	objrep= new Properties();
	FileInputStream f_OR = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\Config\\OR.properties");
	objrep.load(f_OR);
	
	//Browser Loading
	if(config.getProperty("BrowserType").equals("Firefox"))
	{
		driver = new FirefoxDriver();
		
	}
	else if
	(config.getProperty("BrowserType").equals("IE"))
	{
		driver = new InternetExplorerDriver();
		
	}
	
	//Event Webdriver
	webdvr=new EventFiringWebDriver(driver);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	//Open Home Page 
	driver.get(config.getProperty("HomePage_URL"));
	
	
	
}


//Get xpaths functions


	public static WebElement getXpath(String xpathkey)
	{
	try
	{
		return driver.findElement(By.xpath(objrep.getProperty(xpathkey)));

				
	}
	catch(Throwable t )
	{
		return null;
		
	}
	
	
	
	
	
	
	
}
	
	
	//Get CSSpaths functions

		public static WebElement getCSSpath(String Csspathkey)
		{
		try
		{
			return driver.findElement(By.cssSelector((objrep.getProperty(Csspathkey))));

					
		}
		catch(Throwable t )
		{
			return null;
			
		}
		
	}
	
	
	@DataProvider
	public Object [] [] getData(){
		Object data [][] = new Object[1][3];
		
		//Row1
		data [0][0]=objrep.getProperty("userNamevalue");
		data [0][1]=objrep.getProperty("passwordvalue");;
		data [0][2]=objrep.getProperty("Cpasswordvalue");;
		
		//Row2
			data [0][0]=objrep.getProperty("userNamevalue1");
			data [0][1]=objrep.getProperty("passwordvalue1");;
			data [0][2]=objrep.getProperty("Cpasswordvalue1");;
			return data;
	}
//data provider
	

}
