package com.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.SnapShot.SnapshotUtilty;

public class FlightFinder extends TestBase {

	
		// TODO Auto-generated method stub
		
	    @Test
		public void BookFlight() throws InterruptedException, Exception
		{
			
			//Implicit wait
			driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS );
			driver.manage().window().maximize();

			// TRIP TYPE
			//driver.findElement(By.cssSelector("input[value='oneway']")).click();
			//PAGE TITLE
			System.out.println(driver.getTitle());
			//common variable 1
			String triptype =getCSSpath("Rtrip").getAttribute("value");
			
			
			System.out.println(triptype);
			//driver.findElement(By.cssSelector("input[value='roundtrip']")).click();
			//Round Trip
			getCSSpath("Rtrip").click();
			
			//ONe Way Trip
			//getCSSpath("Otrip").click();

			//passenger 
			WebElement passenger = getCSSpath("PassPath");
			Select NumOfPassenger= new Select(passenger);
			List<WebElement> options =NumOfPassenger.getOptions();
			for (WebElement option : options) {
				if (option.getText().equalsIgnoreCase(objrep.getProperty("TotalPassenger")))
				{
					System.out.println(option.getText());
					option.click();
					System.out.println("Passenger Slected");
					break;
				}
			}

			
			// ###DEPARTURE DETAILS#######

			//DepartFrom tr>td>select[name='fromPort'] table>tbody>tr>td>select

			WebElement Departure = getCSSpath("DepartFrom");
			Select DeparturePort= new Select(Departure);
			List<WebElement> Departureoptions =DeparturePort.getOptions();
			for (WebElement option :Departureoptions) {
				if (option.getText().equalsIgnoreCase(objrep.getProperty("DepartPortname")))
				{
					System.out.println(option.getText());
					option.click();
					System.out.println("Departure PortName Selected");
					break;
				}
			}

			//  DepartMOnth DepartMonth
			WebElement Departmonths = getCSSpath("DepartMonth");
			Select DepartmonthPort= new Select(Departmonths);
			List<WebElement> Departmonthoptions =DepartmonthPort.getOptions();
			for (WebElement option :Departmonthoptions) {
				if (option.getText().equalsIgnoreCase(objrep.getProperty("Departmonthname")))
				{
					System.out.println(option.getText());
					option.click();
					System.out.println("Depart MOnth Selected");
					break;
				}
			}

			//Departdate Departdate

			WebElement Departdates =getCSSpath("Departdate");
			Select Departdatesoptions= new Select(Departdates);
			List<WebElement>Departdatelist =Departdatesoptions.getOptions();
			for (WebElement option :Departdatelist) 
			{
				if (option.getText().equalsIgnoreCase(objrep.getProperty("Departdatevalue")))
				{
					System.out.println(option.getText());
					option.click();
					System.out.println("Depart date Selected");
					break;
				}
			}

			
			//######ARRIVAL /RETURN IN DEATILS##############
			//Arrival  tr>td>select[name='fromPort'] table>tbody>tr>td>select ArrivalIn

			WebElement Arrival = getCSSpath("ArrivalIn");
			Select ArrivalPort= new Select(Arrival);
			List<WebElement> Arrivaloptions =ArrivalPort.getOptions();
			for (WebElement option :Arrivaloptions) {
				if (option.getText().equalsIgnoreCase(objrep.getProperty("ArrivalPortname")))
				{
					System.out.println(option.getText());
					option.click();
					System.out.println("Arrival PortName Selected");
					break;
				}
			}


			
		//  ArrivalMonth
					WebElement ArrivalMonths = getCSSpath("ArrivalMonth");
					Select ArrivalMonthsPort= new Select(ArrivalMonths);
					List<WebElement> ArrivalMonthsPortoptions =ArrivalMonthsPort.getOptions();
					for (WebElement option :ArrivalMonthsPortoptions) {
						if (option.getText().equalsIgnoreCase(objrep.getProperty("Arrivalmonthname")))
						{
							System.out.println(option.getText());
							option.click();
							System.out.println("Depart MOnth Selected");
							break;
						}
					}

			
			
					
					//Arrivaldate

					WebElement Arrivaldates = getCSSpath("Arrivaldate");
					Select ArrivalDateoptions= new Select(Arrivaldates);
					List<WebElement>Arrivaldatelist =ArrivalDateoptions.getOptions();
					for (WebElement option :Arrivaldatelist) 
					{
						if (option.getText().equalsIgnoreCase(objrep.getProperty("Arrivaldatevalue")))
						{
							System.out.println(option.getText());
							option.click();
							System.out.println("Depart date Selected");
							break;
						}
					}

					
					
					
					
					
					
			//###########Preferences#############
					
					
		    //
			// Class font>font>input[value='Business']

			//WebElement BClass= driver.findElement(By.cssSelector(TravelClass));

			//BClass.click();
					
		    //Service Class
			System.out.println("Class Selected" +getCSSpath("ServiceClass").getText());		
			getCSSpath("ServiceClass").click();
			
			
			
			// AirlineName Airlines
			WebElement AirlineName =getCSSpath("Airlines");
			Select AirlineNamePort= new Select(AirlineName);
			List<WebElement> AirlinesOptions =AirlineNamePort.getOptions();
			for (WebElement option :AirlinesOptions) {
				if (option.getText().equalsIgnoreCase(objrep.getProperty("AirlinesValue")))
				{
					System.out.println(option.getText());
					option.click();	

					//CONTINUE BUTTON 1 Continue1
					getCSSpath("Continue1").click();
					System.out.println("AIRLINE SELECTED");
					System.out.println(" Flight Find and Conitnued 1");

					
					
					// PAGE TITLE
					String title=driver.getTitle();
					System.out.println(title);

					// Flight Select  Conitnue Booking

					if(triptype.equalsIgnoreCase("roundtrip"))
					{
						driver.findElement(By.xpath("//*[contains(@value,'271')]")).click();
						driver.findElement(By.xpath("//*[contains(@value,'721')]")).click();
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
					SnapshotUtilty.snapShots(driver,"Flight");
					break;

				}


			}
			
		}
}
 

