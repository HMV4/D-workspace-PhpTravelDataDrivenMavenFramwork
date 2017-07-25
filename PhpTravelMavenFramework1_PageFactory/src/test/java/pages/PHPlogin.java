package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PHPlogin {
	 static WebDriver driver ;
	
	 static By username =By.name("email");
	 static By password =By.name("password");
	 static By loginButton=By.xpath("//div[2]/form[1]/button");
	
	public PHPlogin(WebDriver driver)
	{
		
		this.driver=driver;
	}

	
	public static void username()
	{
		
	driver.findElement(username).sendKeys("admin@phptravels.com");
		
	}
	
	
	public static  void password()
	{
		
		driver.findElement(password).sendKeys("demoadmin");
		
	}
	
	
	public static void loginButtonClick()
	{
		driver.findElement(loginButton).click();
		
	}

	
	// Generic login Function
	@Test
	public static void loginPhp()
	{
		
	
		//Site URL
		driver.get("http://www.phptravels.net/admin");
		
		// login credentials
		PHPlogin.username();
		PHPlogin.password();
		PHPlogin.loginButtonClick();
		
	/*	loginDriver.username();
		loginDriver.password();
		loginDriver.loginButtonClick();*/
		
		
	}
}
