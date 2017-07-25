package com.pages;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import ExcelLib.ExcelDataProvider;

import com.pageFactory.flightFinderPage;

public class FlightFinder extends TestBase {

	// TODO Auto-generated method stub

	@Test(dataProvider = "FlightFinder", dataProviderClass = ExcelDataProvider.class)
	public void findFlight(String totalPassenger, String DepartPortname,
			String Departmonthname, String Departdatevalue,
			String ArrivalPortname, String Arrivalmonthname,
			String Arrivaldatevalue, String AirlinesValue)
			throws InterruptedException, Exception {

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		flightFinderPage.mercuryFlightFinder(totalPassenger, DepartPortname,
				Departmonthname, Departdatevalue, ArrivalPortname,
				Arrivalmonthname, Arrivaldatevalue, AirlinesValue);
		System.out.println("Flight Found");

	}

}
