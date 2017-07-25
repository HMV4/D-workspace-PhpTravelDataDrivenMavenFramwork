package com.Mercury.ApplicationLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightBooking {

	public void reservation(WebDriver driver) {

		driver.findElement(By.xpath("//input[@value= 'oneway']")).click();

		WebElement e = driver.findElement(By.name("passCount"));
		Select pssenger = new Select(e);

		pssenger.selectByIndex(0);

		WebElement D = driver.findElement(By.name("fromPort"));
		Select Depart = new Select(D);

		Depart.selectByIndex(2);

		driver.findElement(By.name("findFlights")).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("reserveFlights")).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.name("passFirst0")).sendKeys("ANKUSH");
		driver.findElement(By.name("passLast0")).sendKeys("GORE");
		driver.findElement(By.name("creditnumber")).sendKeys("9078679494");
		driver.findElement(By.name("buyFlights")).click();

		// Logout
		driver.findElement(By.xpath("//table/tbody/tr/td[3]/a/img")).click();

		System.out.println("LOGOUT SUCCESSFULLY");

	}
}