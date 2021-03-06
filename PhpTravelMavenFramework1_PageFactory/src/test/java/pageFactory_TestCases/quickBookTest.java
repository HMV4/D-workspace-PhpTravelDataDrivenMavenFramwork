package pageFactory_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pages.*;

public class quickBookTest {

	static WebDriver driver;

	@Test
	public static void quickBooking() {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();

		// firefox driver initialize in PHPlogin class to call loginphp () to login into PHP travels
		new PHPlogin(driver);
		PHPlogin.loginPhp();
		System.out.println("login success");

		// firefox driver initialize in Quickbook page class to perform quickbook into PHP travels
		new Quickbook_pages(driver);
		Quickbook_pages.quickBook_Aggregate();
		System.out.println("Quick Booking Done");
		
		
		

	}

}
