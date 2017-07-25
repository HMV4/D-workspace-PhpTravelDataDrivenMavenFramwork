package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectFlight {

	 WebDriver driver =new FirefoxDriver();
	 String triptype =driver.findElement(By.cssSelector("input[value='roundtrip']")).getAttribute("value");
	//System.out.println(triptype);

	public  void FlightPicker() {
		// TODO Auto-generated method stub
		
		// PAGE TITLE
		System.out.println(triptype);
		String title=driver.getTitle();
		System.out.println(title);

		// Flight Select  Conitnue Booking

		if(triptype.equalsIgnoreCase("roundtrip"))
		{
			driver.findElement(By.xpath("//*[contains(@value,'201')]")).click();
			driver.findElement(By.xpath("//*[contains(@value,'21')]")).click();
		}
		else
		{
			driver.findElement(By.xpath("//*[contains(@value,'201')]")).click();
		}

		//CONTINUE BUTTON 2
		driver.findElement(By.cssSelector("form>p>input")).click();
		System.out.println("Conitnued 2");
		System.out.println("FLIGHT SELECTED");
		//driver.wait(1000);	
      
	}

}
