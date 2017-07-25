package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.pageFactory.selectFlightPage;

public class SelectFlight {

	WebDriver driver = new FirefoxDriver();

	
	@Test
	public void FlightPicker() throws IOException {
		// TODO Auto-generated method stub

		// PAGE TITLE
		try {
			selectFlightPage.selectDepartureAndReturn();
			selectFlightPage.continueBooking_Click();
			String title = driver.getTitle();
			System.out.println(title);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
