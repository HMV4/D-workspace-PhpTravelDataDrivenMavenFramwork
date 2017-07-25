import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class Register {

	public static WebDriver driver = new FirefoxDriver();

	// TODO Auto-generated method stub

	//Login()
	
	public static void Login()
	{
		driver.get("http://localhost/servlets/com.mercurytours.servlet.SignonServlet");
		driver.findElement(By.cssSelector((".mouseOut>a[href='com.mercurytours.servlet.SignonServlet']"))).click();
		System.out.println("SIGN ON CLICKED");
		driver.findElement(By.cssSelector("tr>td>input[name='userName']")).sendKeys("HITUJ24");
		driver.findElement(By.cssSelector("tr>td>input[name='password']")).sendKeys("HITUJ24");
		driver.findElement(By.cssSelector("tr>td>input[name='login']")).click();
	}
	
	
	// REGISTER FUNCTION
	public void BookFlight(String TotalPassenger, String PassPath,
			String DaArRetAirPath, String DepartPortname, String Departmonth,
			String Departdate, String ArrivalPortname, String Airlines,
			String TravelClass, String Bookflight, String FirstName,
			String LastName, String SrceMeal, String CreditNum)
			throws InterruptedException {

		
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// TRIP TYPE
		// driver.findElement(By.cssSelector("input[value='oneway']")).click();
		// PAGE TITLE
		System.out.println(driver.getTitle());
		// common variable 1
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

		WebElement BClass = driver.findElement(By.cssSelector(TravelClass));

		BClass.click();
		System.out.println("Class Selected" + BClass.getText());

		// AirlineName

		WebElement AirlineName = driver.findElement(By
				.cssSelector(DaArRetAirPath + "[name='airline']"));
		Select AirlineNamePort = new Select(AirlineName);
		List<WebElement> AirlinesOptions = AirlineNamePort.getOptions();
		for (WebElement option : AirlinesOptions) {
			if (option.getText().equalsIgnoreCase(Airlines)) {
				System.out.println(option.getText());
				option.click();

				// CONTINUE BUTTON 1
				driver.findElement(By.cssSelector("tr>td>input")).click();
				System.out.println("AIRLINE SELECTED");
				System.out.println(" Flight Find and Conitnued 1");

				/*
				 * // PAGE TITLE String title=driver.getTitle();
				 * System.out.println(title);
				 * 
				 * // Flight Select Conitnue Booking
				 * 
				 * if(triptype.equalsIgnoreCase("roundtrip")) {
				 * driver.findElement
				 * (By.xpath("//*[contains(@value,'201')]")).click();
				 * driver.findElement
				 * (By.xpath("//*[contains(@value,'21')]")).click(); } else {
				 * driver
				 * .findElement(By.xpath("//*[contains(@value,'201')]")).click
				 * (); }
				 * 
				 * //CONTINUE BUTTON 2
				 * driver.findElement(By.cssSelector("form>p>input")).click();
				 * System.out.println("Conitnued 2");
				 * System.out.println("FLIGHT SELECTED"); //driver.wait(1000);
				 */
				break;

			}

		}
	}

	public static void Main(String args[]) throws Exception
{
		
		 
		   Login();
		   System.out.println("SIGN on called");
		   
		
	Register R = new Register();
	//BookFlight(String TotalPassenger,String PassPath,String DaArRetAirPath,String DepartPortname,String Departmonth,String Departdate,String ArrivalPortname,String Airlines,String TravelClass,String Bookflight,String FirstName,String LastName,String SrceMeal,String CreditNum);
	R.BookFlight("2","table>tbody>tr>td>b>select","table>tbody>tr>td>select","Frankfurt","Apr","2","London","Blue Skies Airlines","font>font>input[value='Business']","tr>td>input","HMV","VMV","Hindu","777777777777777");
	
}
}
