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

import com.SnapShot.SnapshotUtilty;

//import com.sun.jna.platform.FileUtils;

public class HomePage_Register extends TestBase {
	
	//WebDriver driver= new FirefoxDriver();
	Random rand = new Random(System.currentTimeMillis());
	int MAXVALUE =007;
	int randNum = rand.nextInt(MAXVALUE);
	
	//int MAXVALUE =007;
	//int randNum = (int) (Math.random() * MAXVALUE);
	// Reg Method 
	
	@Test(dataProvider="getData")
	public void Register(String usrname,String psswd,String cpsswrd) throws IOException 

	{
		// Register link //tbody/tr/td[2]/a  html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a 
		//driver.findElement(By.linkText("link=REGISTER")).click();
		
		getXpath("RegisterLink").click();
		
		//First Name
				//driver.findElement(By.xpath("//tr[2]/td[2]/input")).sendKeys("HMV17");
				getXpath("FirstName").sendKeys("HMV17");
				
				
				//LastName
				//driver.findElement(By.xpath("//tr[3]/td[2]/input")).sendKeys("Velukar17");
				getXpath("LastName").sendKeys("Velukar17");
				
				//phone
				//driver.findElement(By.xpath("//tr[4]/td[2]/input")).sendKeys("9044678998");
				getXpath("phone").sendKeys("9044678998");
				
				//Email
				//driver.findElement(By.xpath("//tr[5]/td[2]/input")).sendKeys("hitesh.velukarg20@gmail.com");
				getXpath("Email").sendKeys("hitesh.velukarg20@gmail.com");
				
				//Address Address1
				//driver.findElement(By.xpath("//tr[7]/td[2]/input")).sendKeys("SYMPune2");
				getXpath("Address1").sendKeys("SYMPune2");
				
				//Address Address2
				//driver.findElement(By.xpath("//tr[8]/td[2]/input")).sendKeys("SYMPune2");
				getXpath("Address2").sendKeys("SYMPune2");
				
				
				//City
				//driver.findElement(By.xpath("//tr[9]/td[2]/input")).sendKeys("Pune");
				
				getXpath("City").sendKeys("Pune");
				
				//State
				//driver.findElement(By.xpath("//tr[10]/td[2]/input")).sendKeys("Pune");
				getXpath("State").sendKeys("Maharashtra");
				
				//PostalCode
				//driver.findElement(By.xpath("//tr[11]/td[2]/input")).sendKeys("Pune");
				getXpath("PostalCode").sendKeys("445001");
				
				//Country
				
				WebElement country = getXpath("CountryList");
				
				Select CountryDropdown= new Select(country);
				CountryDropdown.selectByIndex(3);
				
				//User Info First Name
				
				if(psswd.equals(cpsswrd))
				{
				//driver.findElement(By.xpath("//tr[14]/td[2]/input")).sendKeys(Reg_Usr);
				//UserName	
					getXpath("UserName").sendKeys(usrname);
				
				//Password 
				//driver.findElement(By.xpath("//tr[15]/td[2]/input")).sendKeys(Reg_Prsswd);
				getXpath("Password").sendKeys(psswd);
			
				
				//ConfirmPassword 
				//driver.findElement(By.xpath("//tr[16]/td[2]/input")).sendKeys(Cnfrm_Reg_Prsswd);
				getXpath("ConfirmPassword").sendKeys(cpsswrd);
				
				//Submitregister 
				//driver.findElement(By.xpath("//table/tbody/tr[18]/td")).click();
				
				getXpath("Submitregister").click();
				
				SnapshotUtilty.snapShots(driver, "Successfully");
				System.out.println("Registered Successfully");
				}
				
				
				else
				{
					System.out.println("Password Mismatch Registration Failed");
				
					//Print Screen 
					/*File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			           //The below method will save the screen shot in d drive with name "screenshot.png"
				    File fs=new File("D:\\SelscreenShots\\"+"Error1"+randNum+".png");
					System.out.println(randNum);
					FileUtils.copyFile(scrFile,fs);
					
					//FileUtils.copyFile(scrFile.getAbsolutePath(),fs);
			          
					//Send Email 
					 * 
				
					
					
					*/
					
					SnapshotUtilty.snapShots(driver, "Registration Failed");
					//close				
					driver.close();
					
		
					
				}
				
			
				
				System.out.println("CLOSED REGISTRATION");
				
				}
					
				
		
		
		
			


}//Class
 

