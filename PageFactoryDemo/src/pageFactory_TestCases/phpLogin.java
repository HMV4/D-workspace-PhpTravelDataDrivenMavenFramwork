package pageFactory_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pages.PHPlogin;

public class phpLogin {

	@Test
	public void verifyValidLogin()
	{
		//System.setProperty("webdriver.firefox.driver","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		/*ChromeOptions options= new ChromeOptions();
		options.addArguments();
		WebDriver driver = new ChromeDriver(options);*/
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.phptravels.net/admin");
		PHPlogin login = new PHPlogin(driver);
		login.username();
		login.password();
		login.loginButtonClick();
		
		
	}
}
