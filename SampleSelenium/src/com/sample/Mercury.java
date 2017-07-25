package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Mercury {

	WebDriver driver =new FirefoxDriver();
	
	public void Launch() {
		// TODO Auto-generated method stub
		
		driver.get("http://localhost/servlets/com.mercurytours.servlet.WelcomeServlet");
		System.out.println("CNGRTSS");
		
		//driver.close();

	}
	

	public void Register() 
	{
		// Register link //tbody/tr/td[2]/a  html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a
		
		driver.findElement(By.xpath("//html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		
		//First Name
		driver.findElement(By.xpath("//tr[2]/td[2]/input")).sendKeys("HMV1");
		
		//Last Name
		driver.findElement(By.xpath("//tr[3]/td[2]/input")).sendKeys("Velukar1");
		
		//phone
		driver.findElement(By.xpath("//tr[4]/td[2]/input")).sendKeys("9045679495");
		
		//phone
		driver.findElement(By.xpath("//tr[5]/td[2]/input")).sendKeys("hitesh.velukar5@gmail.com");
		
		//Address
		driver.findElement(By.xpath("//tr[7]/td[2]/input")).sendKeys("SYMPune1");
		
		//City
		driver.findElement(By.xpath("//tr[9]/td[2]/input")).sendKeys("Pune");
		
		//State
		driver.findElement(By.xpath("//tr[10]/td[2]/input")).sendKeys("Pune");
		
		//Postal Code
		driver.findElement(By.xpath("//tr[11]/td[2]/input")).sendKeys("Pune");
		
		//Country
		
		WebElement country = driver.findElement(By.name("country"));
		
		Select CountryDropdown= new Select(country);
		CountryDropdown.selectByIndex(2);
		
		
		
		//User Info First Name
		driver.findElement(By.xpath("//tr[14]/td[2]/input")).sendKeys("HITUJ1");
		
		//Password 
		driver.findElement(By.xpath("//tr[15]/td[2]/input")).sendKeys("HITUJ1");
		
		//Confirm Password 
		driver.findElement(By.xpath("//tr[16]/td[2]/input")).sendKeys("HITUJ1");
		
		//Submit register 
		driver.findElement(By.xpath("//table/tbody/tr[18]/td")).click();
			
	}
	
	
	
	
	
	
	public void SignUp() throws InterruptedException
	{
		
		//Sign ON 
		driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
		
		//Username
		driver.findElement(By.xpath("//tr[1]/td[2]/input")).sendKeys("HITUJ");
		
		//Password
		driver.findElement(By.xpath("//tr[2]/td[2]/input")).sendKeys("HITUJ");
		
		//submit button and Put single quote in xpath with attribute
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		System.out.println("CONGRTS SIGN UP SUCESSFULLY");
		
		
		
		
		//driver.wait(10000);
		
		
		
		
		
	}
	
	
	

	
	
	

}
