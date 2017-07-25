package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ULdemo {

	static WebDriver driver =new FirefoxDriver();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

driver.get("file:///D:/Selenium%20Softwares/Tables/SpiceJet/SpiceJet/www.spicejet.com/index.html");
		
		//driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		ULdemo.Source("Ahmedabad (AMD)","//div[3]/div[1]/div",".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']");
		
		System.out.println(" Source Selected ");
		
		ULdemo.Source("Bagdogra (IXB)","//div[3]/div[1]/div",".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']");
		
		System.out.println(" Destination Selected ");
		//ULdemo.Destination("//*[@id='dropdownGroup1']/div", "Ahmedabad (AMD)"); //div[3]/div[1]/div/ul
		//*[@id='dropdownGroup1']/div/ul[1]/li[2]/a


	}


	

public static void Source(String city,String xpath,String SDpath )

{

	driver.findElement(By.xpath(SDpath)).click();
	
	
	List<WebElement> UL = driver.findElements(By.xpath(xpath+"/ul"));
	System.out.println(UL);
	for(int i=1;i<=UL.size();i++)
	{
		
		List<WebElement> LI = driver.findElements(By.xpath(xpath+"/ul["+i+"]/li"));

		for(int j=1;j<=LI.size();j++)
		{
           
			WebElement cell =driver.findElement(By.xpath(xpath+"/ul["+i+"]/li["+j+"]/a"));
			//WebElement ele=driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[1]/li[6]/a"));
			
			if(cell.getText().equalsIgnoreCase(city))
			{
				
				
				System.out.println(cell.getText());
				cell.click();
				break;
			}

		}
	}



}


/*
  //Destination 
 
public static void Dest(String city,String xpath )
{
 driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
 
 System.out.println("Dest clicked");
		List<WebElement> ULD = driver.findElements(By.xpath("xpath"));
		System.out.println(ULD);
		for(int i=1;i<=ULD.size();i++)
		{

			List<WebElement> LI = driver.findElements(By.xpath("xpath/ul["+i+"]/li"));

			for(int j=1;j<=LI.size();j++)
			{

				WebElement cell =driver.findElement(By.xpath("xpath/ul["+i+"]/li["+j+"]/a"));

				if(cell.getText().equalsIgnoreCase(city))
				{
					cell.click();
					break;
				}

			}
		}



	
	
	
}

*/
}