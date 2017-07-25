package com.sample;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SIGNON {

	WebDriver driver = new FirefoxDriver();

/*	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		SIGNON S = new SIGNON();
		S.Login();
		S.BookFlight("2", "table>tbody>tr>td>b>select",
				"table>tbody>tr>td>select", "Frankfurt", "Apr", "2", "London",
				"Blue Skies Airlines", "font>font>input[value='Business']",
				"tr>td>input", "HMV", "VMV", "Hindu", "777777777777777");

	}
*/
	// LOGIN
	@BeforeTest
	public void Login() throws InterruptedException {
		driver.get("http://localhost/servlets/com.mercurytours.servlet.SignonServlet");
		driver.findElement(By.cssSelector("tr>td>input[name='userName']"))
				.sendKeys("HITUJ44");
		driver.findElement(By.cssSelector("tr>td>input[name='password']"))
				.sendKeys("Hituj44");
		driver.findElement(By.cssSelector("tr>td>input[name='login']")).click();
		Thread.sleep(10000);
		System.out.println("SIGN IN SUCCESSFULLY");

	}

	// BOOK FLIGHT
	@Test(dataProvider="TestData")
	public void BookFlight(String TotalPassenger, String PassPath,
			String DaArRetAirPath, String DepartPortname, String Departmonth,
			String Departdate, String ArrivalPortname, String Airlines,
			String TravelClass, String Bookflight, String FirstName,
			String LastName, String SrceMeal, String CreditNum)
			throws InterruptedException {

		// TRIP TYPE
		// driver.findElement(By.cssSelector("input[value='oneway']")).click();
		// PAGE TITLE
		System.out.println(driver.getTitle());
		String triptype = driver.findElement(
				By.cssSelector("input[value='roundtrip']")).getAttribute(
				"value");
		System.out.println(triptype);
		driver.findElement(By.cssSelector("input[value='roundtrip']")).click();

		// passenger
		WebElement passenger = driver.findElement(By.cssSelector(PassPath));
		Select NumOfPassenger = new Select(passenger);
		List<WebElement> options = NumOfPassenger.getOptions();
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase(TotalPassenger)) {
				System.out.println(option.getText());
				option.click();
				System.out.println("Passenger Slected");
				break;
			}
		}

		// Departure tr>td>select[name='fromPort'] table>tbody>tr>td>select

		WebElement Departure = driver.findElement(By.cssSelector(DaArRetAirPath
				+ "[name='fromPort']"));
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

		// DepartMOnth
		WebElement Departmonths = driver.findElement(By
				.cssSelector(DaArRetAirPath + "[name='fromMonth']"));
		Select DepartmonthPort = new Select(Departmonths);
		List<WebElement> Departmonthoptions = DepartmonthPort.getOptions();
		for (WebElement option : Departmonthoptions) {
			if (option.getText().equalsIgnoreCase(Departmonth)) {
				System.out.println(option.getText());
				option.click();
				System.out.println("Depart MOnth Selected");
				break;
			}
		}

		// Departdate

		WebElement Departdates = driver.findElement(By
				.cssSelector(DaArRetAirPath + "[name='fromDay']"));
		Select Departdatesoptions = new Select(Departdates);
		List<WebElement> Departdatelist = Departdatesoptions.getOptions();
		for (WebElement option : Departdatelist) {
			if (option.getText().equalsIgnoreCase(Departdate)) {
				System.out.println(option.getText());
				option.click();
				System.out.println("Depart date Selected");
				break;
			}
		}

		// Arrival tr>td>select[name='fromPort'] table>tbody>tr>td>select

		WebElement Arrival = driver.findElement(By.cssSelector(DaArRetAirPath
				+ "[name='toPort']"));
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

		// Class font>font>input[value='Business']

		WebElement Class = driver.findElement(By.cssSelector(TravelClass));

		Class.click();
		System.out.println("Class Selected" + Class.getText());

		// AirlineName

		/*
		 * WebElement AirlineName = driver.findElement(By
		 * .cssSelector(DaArRetAirPath + "[name='airline']")); Select
		 * AirlineNamePort = new Select(AirlineName); List<WebElement>
		 * AirlinesOptions = AirlineNamePort.getOptions();
		 * System.out.println(AirlinesOptions.get(1));
		 */

		WebElement AirlineName = driver.findElement(By
				.cssSelector(DaArRetAirPath + "[name='airline']"));
		Select AirlineNamePort = new Select(AirlineName);
		List<WebElement> AirlinesOptions = AirlineNamePort.getOptions();

		for (WebElement optionss : AirlinesOptions) {
			System.out.println(optionss.getText());
			if (optionss.getText().equalsIgnoreCase(Airlines)) {
				System.out.println(optionss.getText());
				optionss.click();
				break;
			}
		}

		// CONTINUE BUTTON 1

		// PAGE TITLE
		
		driver.findElement(By.cssSelector("table>tbody>tr>td>input")).click();
		
		String title = driver.getTitle();
		System.out.println("Flight BooKing Continued 1 " + title);
		// Flight Select Conitnue Booking

		if (triptype.equalsIgnoreCase("roundtrip")) {
			driver.findElement(By.xpath("//*[contains(@value,'201')]")).click();
			driver.findElement(By.xpath("//*[contains(@value,'21')]")).click();
		} else {
			driver.findElement(By.xpath("//*[contains(@value,'201')]")).click();

		}
		// CONTINUE BUTTON 2
		/*
		 * driver.findElement(By.cssSelector("form>p>input")).click();
		 * System.out.println("Conitnued 2");
		 * System.out.println("FLIGHT SELECTED");
		 */
		// driver.wait(1000);

		// break;

		// BOOK A FLIGHT
		// FIRST NAME
		// driver.findElement(By.xpath("//tbody/tr[4]/td/table/tbody/tr[2]/td[1]/input")).sendKeys(FirstName);

		// driver.findElement(By.name("passFirst0")).sendKeys("Rohit");
		/*
		 * //LAST NAME
		 * driver.findElement(By.cssSelector("tr>td>input[name='passLast0']"
		 * )).sendKeys(LastName);
		 * 
		 * //MEAL WebElement Meal
		 * =driver.findElement(By.cssSelector("tr>td>select[name='pass.1.meal']"
		 * )); Select Mealoptions =new Select(Meal); List<WebElement> MealList =
		 * Mealoptions.getOptions(); for(WebElement PickMeal:MealList) {
		 * if(PickMeal.getText().equalsIgnoreCase(SrceMeal)) {
		 * System.out.println("MEAL SELECTED"+PickMeal.getText());
		 * PickMeal.click(); } break;
		 * 
		 * }
		 * 
		 * 
		 * //creditnumber"
		 * driver.findElement(By.cssSelector("tr>td>input[name='creditnumber']"
		 * )).sendKeys(CreditNum);
		 * 
		 * //Secure Purchase
		 * driver.findElement(By.cssSelector(Bookflight+"[name='buyFlights']"
		 * )).click(); driver.wait(1000);
		 * System.out.println("Purchase Successful"); //booking Confirmation
		 * System .out.println(driver.findElement(By.cssSelector("p>font>b>font"
		 * )).getText());
		 */

	}
	
	
	
	@DataProvider(name="TestData")
	public Object[][] passData() throws IOException
	{
		ExcelDataUtility config= new ExcelDataUtility("C:\\Users\\Hituj Velukar\\Desktop\\DataDriven.xlsx");
		int rows =config.getRowCount(0); // get total no of rows from sheet index=0 i.e sheet1 
		Object[][] sheetdata = new Object[rows][2];
		
		for(int i=0;i<rows;i++)
		{
			sheetdata[i][0]=config.getData(0,i,0);
			sheetdata[i][0]=config.getData(0,i,1);
			sheetdata[i][0]=config.getData(0,i,2);
			sheetdata[i][0]=config.getData(0,i,3);
			sheetdata[i][0]=config.getData(0,i,4);
			sheetdata[i][0]=config.getData(0,i,5);
			sheetdata[i][0]=config.getData(0,i,6);
			sheetdata[i][0]=config.getData(0,i,7);
			sheetdata[i][0]=config.getData(0,i,8);
		}
	
		return passData();
	}
	

}


