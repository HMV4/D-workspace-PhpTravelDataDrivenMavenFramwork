package pageFactory_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pages.PHPlogin;

public class phpLogin {

	
	
	@Test
	public static void verifyValidLogin()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		/*ChromeOptions options= new ChromeOptions();
		options.addArguments();
		WebDriver driver = new ChromeDriver(options);*/
		 WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.phptravels.net/admin");
		PHPlogin login = new PHPlogin(driver);
		PHPlogin.username();
		PHPlogin.password();
		PHPlogin.loginButtonClick();
		
		System.out.println("login passed.....");
		//driver.close();
		
		
	}
}
