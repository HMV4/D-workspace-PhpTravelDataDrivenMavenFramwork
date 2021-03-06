package com.pageFactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.pages.TestBase;

public class flightFinderPage extends TestBase {

	public static void selectTripType() {

		// TRIP TYPE
		// PAGE TITLE
		System.out.println(driver.getTitle());
		// common variable 1
		String triptype = getCSSpath("Rtrip").getAttribute("value");

		System.out.println(triptype);

		getCSSpath("Rtrip").click();

	}

	public static void selectPassenger(String totalPassenger) {
		// passenger
		WebElement passenger = getCSSpath("PassPath");
		Select NumOfPassenger = new Select(passenger);
		List<WebElement> options = NumOfPassenger.getOptions();
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase(totalPassenger)) {
				System.out.println(option.getText());
				option.click();
				System.out.println("Passenger Slected");
				break;
			}
		}

	}

	public static void selectDeparture(String DepartPortname) {

		// ###DEPARTURE DETAILS#######

		// DepartFrom tr>td>select[name='fromPort'] table>tbody>tr>td>select

		WebElement Departure = getCSSpath("DepartFrom");
		Select DeparturePort = new Select(Departure);
		List<WebElement> Departureoptions = DeparturePort.getOptions();
		for (WebElement option : Departureoptions) {
			if (option.getText().equalsIgnoreCase(DepartPortname)) {
				System.out.println(option.getText());
				option.click();
				System.out.println("Departure PortName Selected");
				break;
			}
		}

	}

	public static void selectDpartMonth(String Departmonthname) {
		// DepartMOnth DepartMonth
		WebElement Departmonths = getCSSpath("DepartMonth");
		Select DepartmonthPort = new Select(Departmonths);
		List<WebElement> Departmonthoptions = DepartmonthPort.getOptions();
		for (WebElement option : Departmonthoptions) {
			if (option.getText().equalsIgnoreCase(Departmonthname)) {
				System.out.println(option.getText());
				option.click();
				System.out.println("Depart MOnth Selected");
				break;
			}
		}

	}

	public static void selectDepartDate(String Departdatevalue) {

		// Departdate Departdate

		WebElement Departdates = getCSSpath("Departdate");
		Select Departdatesoptions = new Select(Departdates);
		List<WebElement> Departdatelist = Departdatesoptions.getOptions();
		for (WebElement option : Departdatelist) {
			if (option.getText().equalsIgnoreCase(Departdatevalue)) {
				System.out.println(option.getText());
				option.click();
				System.out.println("Depart date Selected");
				break;
			}
		}

	}

	public static void selectArrivalPortName(String ArrivalPortname)

	{

		// ######ARRIVAL /RETURN IN DEATILS##############
		// Arrival tr>td>select[name='fromPort'] table>tbody>tr>td>select
		// ArrivalIn

		WebElement Arrival = getCSSpath("ArrivalIn");
		Select ArrivalPort = new Select(Arrival);
		List<WebElement> Arrivaloptions = ArrivalPort.getOptions();
		for (WebElement option : Arrivaloptions) {
			if (option.getText().equalsIgnoreCase(ArrivalPortname)) {
				System.out.println(option.getText());
				option.click();
				System.out.println("Arrival PortName Selected");
				break;
			}
		}
	}

	public static void selectArrivalMonth(String Arrivalmonthname) {

		// ArrivalMonth
		WebElement ArrivalMonths = getCSSpath("ArrivalMonth");
		Select ArrivalMonthsPort = new Select(ArrivalMonths);
		List<WebElement> ArrivalMonthsPortoptions = ArrivalMonthsPort
				.getOptions();
		for (WebElement option : ArrivalMonthsPortoptions) {
			if (option.getText().equalsIgnoreCase(Arrivalmonthname)) {
				System.out.println(option.getText());
				option.click();
				System.out.println("Depart MOnth Selected");
				break;
			}
		}

	}

	public static void selectArrivalDate(String Arrivaldatevalue) {

		// Arrivaldate

		WebElement Arrivaldates = getCSSpath("Arrivaldate");
		Select ArrivalDateoptions = new Select(Arrivaldates);
		List<WebElement> Arrivaldatelist = ArrivalDateoptions.getOptions();
		for (WebElement option : Arrivaldatelist) {
			if (option.getText().equalsIgnoreCase(Arrivaldatevalue)) {
				System.out.println(option.getText());
				option.click();
				System.out.println("Depart date Selected");
				break;
			}
		}

	}

	public static void selectServiceClass() {

		// ###########Preferences#############

		//
		// Class font>font>input[value='Business']

		// WebElement BClass= driver.findElement(By.cssSelector(TravelClass));

		// BClass.click();

		// Service Class
		System.out.println("Class Selected"
				+ getCSSpath("ServiceClass").getText());
		getCSSpath("ServiceClass").click();

	}

	public static void selectAirlinesPreference(String AirlinesValue) {

		// AirlineName Airlines
		WebElement AirlineName = getCSSpath("Airlines");
		Select AirlineNamePort = new Select(AirlineName);
		List<WebElement> AirlinesOptions = AirlineNamePort.getOptions();
		for (WebElement option : AirlinesOptions) {
			if (option.getText().equalsIgnoreCase(AirlinesValue)) {
				System.out.println(option.getText());
				option.click();

				// CONTINUE BUTTON 1 Continue1
				getCSSpath("Continue1").click();
				System.out.println("AIRLINE SELECTED");
				System.out.println(" Flight Find and Conitnued 1");

				// PAGE TITLE
				String title = driver.getTitle();
				System.out.println(title);

			}
		}

	}

	public static void mercuryFlightFinder(String totalPassenger,
			String DepartPortname, String Departmonthname,
			String Departdatevalue, String ArrivalPortname,
			String Arrivalmonthname, String Arrivaldatevalue,
			String AirlinesValue) {

		flightFinderPage.selectTripType();
		flightFinderPage.selectPassenger(totalPassenger);
		flightFinderPage.selectDeparture(DepartPortname);
		flightFinderPage.selectDpartMonth(Departmonthname);
		flightFinderPage.selectDepartDate(Departdatevalue);
		flightFinderPage.selectArrivalPortName(ArrivalPortname);
		flightFinderPage.selectArrivalMonth(Arrivalmonthname);
		flightFinderPage.selectArrivalDate(Arrivaldatevalue);
		flightFinderPage.selectServiceClass();
		flightFinderPage.selectAirlinesPreference(AirlinesValue);

	}

}//
