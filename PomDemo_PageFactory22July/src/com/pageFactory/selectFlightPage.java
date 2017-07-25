package com.pageFactory;

import java.io.IOException;

import com.SnapShot.SnapshotUtilty;
import com.pages.TestBase;

public class selectFlightPage extends TestBase {

	public static void selectDepartureAndReturn() throws Throwable {

		String triptype = getCSSpath("TRIPTYPE").getAttribute("value");
		// System.out.println(triptype);
		// Flight Select Conitnue Booking
		System.out.println(triptype);
		if (triptype.equalsIgnoreCase("roundtrip")) {
			getXpath("DEPART").click();
			getXpath("ARRIVAL").click();
		} else {
			getXpath("DEPART").click();
		}
	}

	public static void continueBooking_Click() {
		// CONTINUE BUTTON 2
		getCSSpath("CONTINUEBOOK").click();
		System.out.println("Conitnued 2");
		System.out.println("FLIGHT SELECTED");
		try {
			SnapshotUtilty.snapShots(driver, "FLIGHTSELECTED");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// driver.wait(1000);

	}

}
