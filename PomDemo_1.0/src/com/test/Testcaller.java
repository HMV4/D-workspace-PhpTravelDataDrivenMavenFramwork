package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pages.*;

public class Testcaller {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		//
		HomePage_Register RegObj =new HomePage_Register();
		
		//Home page launch 
		 // RegObj.Launch();
		
	    // User Registration
		  RegObj.Register("HITUJ24","HITUJ24","HITUJ24");
		  System.out.println("Registered Page called");
		  
		  
	//SIGN ON
		   SignON SignObj=new SignON();
		   SignObj.Login();
		   System.out.println("SIGN on called");
		   
     //FLIGHT FINDER
		   
		   FlightFinder FFinderObj =new FlightFinder();
		   //FFinderObj.BookFlight(TotalPassenger, PassPath, DaArRetAirPath, DepartPortname, Departmonth, Departdate, ArrivalPortname, Airlines, TravelClass, Bookflight, FirstName, LastName, SrceMeal, CreditNum);
		   FFinderObj.BookFlight("2","table>tbody>tr>td>b>select","table>tbody>tr>td>select","Frankfurt","Apr","2","London","Blue Skies Airlines","font>font>input[value='Business']","tr>td>input","HMV","VMV","Hindu","777777777777777");
		   System.out.println("FLIGHT FINDER  CALLED");
		   
		   
		
	}

}
