package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class PHPlogin {
	WebDriver driver ;
	
	By username =By.name("email");
	By password =By.name("password");
	By loginButton=By.xpath("//div[2]/form[1]/button");
	
	public PHPlogin(WebDriver driver)
	{
		
		this.driver=driver;
	}

	
	public void username()
	{
		
		driver.findElement(username).sendKeys("admin@phptravels.com");
		
	}
	
	public void password()
	{
		
		driver.findElement(password).sendKeys("demoadmin");
		
	}
	
	
	public void loginButtonClick()
	{
		driver.findElement(loginButton).click();
		
	}
}
