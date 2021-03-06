package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Quickbook_pages {

	static WebDriver driver;

	static By quickBookButton = By
			.xpath(".//*[@id='content']/div[1]/div[1]/button");

	// ----------------Apply Tax------------------
	static By applyTax = By.name("applytax");

	// ------------Service-------------------------
	static By service = By.name("service");

	// -------------Next Button--------------------
	static By nextButton = By.xpath(".//*[@id='quickbook']//div//button[2]");

	// ---------------Customer Type-----------------

	static By customerType = By.id("selusertype");

	// --------------- CustomerName-------------------
	static By customerName = By.xpath(".//*[@id='regcust']/div/select");

	//------------------Date TextBox Click-----------------
	
	static By dateTextBoxClick =By.xpath("//div[3]/div[2]/div[1]/div/input");
	
	// -----------------Booking Date--------------------
	static By bookingDate = By.xpath("//div[3]/div[1]/table/tbody/tr/td");

	// ------------------Car name--------------------------------
	
	static By carName = By.xpath(".//*[@id='bookingform']/div[3]//div/select");
	
	//-------------------Extras----------------------------------
	static By extraItem = By.className("extras");
	
	//--------------------Payment Type---------------------------
	
	static By paymentMethod =By.name("paymethod");
	static By paymentoptions= By.tagName("option");
	
	
	// ---------------------------Next Button Click-----------------------
	
	static By quickBookSubmit =By.xpath(".//*[@id='bookingform']/div[6]/div/input[2]");
	
	// constructor
	public Quickbook_pages(WebDriver driver) {

		this.driver = driver;
	}

	public static void quickBookButtonClick() {
		// Anonymous class
		new WebDriverWait(driver, 20).until(ExpectedConditions
				.elementToBeClickable(quickBookButton));

		driver.findElement(quickBookButton).click();

	}

	public static void applyTax() {
		Select taxoption = new Select(driver.findElement(applyTax));
		System.out.println(taxoption.isMultiple());
		taxoption.selectByVisibleText("Yes");

	}

	public static void service() {
		new WebDriverWait(driver, 10).until(ExpectedConditions
				.visibilityOf(driver.findElement(service)));
		Select serviceOpt = new Select(driver.findElement(service));
		serviceOpt.selectByIndex(1);

	}

	public static void nextButtonClick() {
		driver.findElement(nextButton).click();

	}

	public static void customerType() {
		new WebDriverWait(driver, 20).until(ExpectedConditions
				.visibilityOf(driver.findElement(customerType)));
		Select customer = new Select(driver.findElement(customerType));
		customer.selectByVisibleText("Registered");
		// customer.selectByValue("John Smith - user@phptravels.com");
		System.out.println("CustomerType selectd");
	}

	public static void customerName() {

		driver.findElement(customerName);
		Select CustName = new Select(driver.findElement(customerName));
		CustName.selectByValue("14");
	}

	public static  void bookingDate() {

	
		
	    driver.findElement(dateTextBoxClick).click();
	    new WebDriverWait(driver, 20).until(ExpectedConditions
				.visibilityOf(driver.findElement(bookingDate)));
		
		List<WebElement> dates = driver.findElements(bookingDate);
		System.out.println(dates.size());
		for (WebElement selectdate : dates) {
			System.out.println(selectdate.getText());
			if (selectdate.getText().equals("20")) {
				System.out.println(selectdate.getText());
				selectdate.click();
				break;
			}

		}
	}

	public static void carName()
	{
		 Select Cars = new Select(driver.findElement(carName));
         Cars.selectByValue("9");
		
		
	}
	
	public static void extras()
	{
		
		new WebDriverWait(driver ,10).until((ExpectedConditions.elementToBeClickable(extraItem)));
         List<WebElement> extras = driver.findElements(extraItem);
         System.out.println(extras.size());
         for (WebElement Extraopt : extras) {

             System.out.println(Extraopt.getText());
             Extraopt.click();
         }
	}
	
	
	
	public static void paymentType()
	{
		
		WebElement payMethod = driver.findElement(paymentMethod);
        List<WebElement> PayOptions = payMethod.findElements(paymentoptions);
        System.out.println(PayOptions.size());
        for (WebElement paytype : PayOptions) {
            System.out.println("Pay Method" + paytype.getText());
            if (paytype.getText().equals("Skrill")) {
                paytype.click();
                break;
            }
        }
		
		
	}
	
	
	public static void quickBookSubmit()
	{
		driver.findElement(quickBookSubmit).click();
       /* System.out.println("Booking Done");
        WebElement Dashboard = driver.findElement(By.xpath("//nav/div[1]/a/span"));
       
        if (Dashboard.equals("Dashboard")) {
            System.out.println("Booking Confirmed");
        }*/
		
		
	}
	
	
	
	// Quick Booking aggregate function
	@Test
	public static void quickBook_Aggregate() {

		Quickbook_pages.quickBookButtonClick();
		Quickbook_pages.applyTax();
		Quickbook_pages.service();
		Quickbook_pages.nextButtonClick();
		Quickbook_pages.customerType();
		Quickbook_pages.customerName();
		Quickbook_pages.bookingDate();
		Quickbook_pages.carName();
		Quickbook_pages.extras();
		Quickbook_pages.paymentType();
		Quickbook_pages.quickBookSubmit();
	}

}
