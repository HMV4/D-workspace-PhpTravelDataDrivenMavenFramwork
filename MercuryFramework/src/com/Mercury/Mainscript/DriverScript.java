package com.Mercury.Mainscript;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Mercury.ApplicationLib.FlightBooking;
import com.Mercury.ApplicationLib.Register_User;
import com.Mercury.ApplicationLib.SignIn;

public class DriverScript {

	public static WebDriver driver;

	public static Properties prop = new Properties();

	public static void main(String[] args) throws IOException {

		driver = new FirefoxDriver();

		File f = new File("src/com/Mercury/Environment/config.properties");

		FileInputStream fis = new FileInputStream(f);

		prop.load(fis);
		driver.get(prop.getProperty("URL"));
		
		driver.manage().window().maximize();

		// Click on Register Link

		driver.findElement(By.linkText("REGISTER")).click();
		//
		
		
		Register_User r = new Register_User();

		r.register_user(driver);
		
		System.out.println("Register");

		SignIn s = new SignIn();

		s.signin(driver);

		FlightBooking fb = new FlightBooking();

		fb.reservation(driver);

	}

}
