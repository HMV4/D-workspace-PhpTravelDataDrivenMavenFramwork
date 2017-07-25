import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightBookingE2E {

	static Properties prop = new Properties();

	static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("./config.properties");

		FileInputStream fis = new FileInputStream(f);

		prop.load(fis);

		// open Home Page

		driver.get(prop.getProperty("URL"));

		// System.out.println("Total rows="+sheet.getLastRowNum());

		// System.out.print(cell.getStringCellValue());

		// To maximize Window

		driver.manage().window().maximize();

		// Click on Register Link

		driver.findElement(By.linkText("REGISTER")).click();

		register_user();
		
		signin();
		
		reservation();

	}

	public static void register_user() throws IOException {
		// TODO Auto-generated method stub

		File fexcel = new File(prop.getProperty("ExcelPath"));

		FileInputStream fisexcel = new FileInputStream(fexcel);

		HSSFWorkbook book = new HSSFWorkbook(fisexcel);

		HSSFSheet sheet = book.getSheet("RegisterData");

		HSSFRow row0 = sheet.getRow(0);
		HSSFRow row1 = sheet.getRow(1);

		DataFormatter Formatter = new DataFormatter();

		for (int i = 1; i <=12 ; i++) {

			HSSFCell cell1 = row0.getCell(i);
			HSSFCell cell2 = row1.getCell(i);


			driver.findElement(By.name(Formatter.formatCellValue(cell1))).sendKeys(Formatter.formatCellValue(cell2));
		}
		
		driver.findElement(By.xpath("//table/tbody/tr[18]/td/input")).click();
	}
	
	public static void signin() throws IOException{
		
		File signin = new File(prop.getProperty("ExcelPath"));

		FileInputStream signinsexcel = new FileInputStream(signin);

		HSSFWorkbook book = new HSSFWorkbook(signinsexcel);

		HSSFSheet sheet = book.getSheet("SignInData");

		HSSFRow row0 = sheet.getRow(0);
		HSSFRow row1 = sheet.getRow(1);

		DataFormatter Formatter1 = new DataFormatter();
		driver.findElement(By.linkText("sign-in")).click();

		for (int i = 0; i <=1 ; i++) {

			HSSFCell cell1 = row0.getCell(i);
			HSSFCell cell2 = row1.getCell(i);


			driver.findElement(By.name(Formatter1.formatCellValue(cell1))).sendKeys(Formatter1.formatCellValue(cell2));
		}
			
		
		driver.findElement(By.name("login")).click();
		}
		
	
	public static void reservation(){
		
		
		driver.findElement(By.xpath("//input[@value= 'oneway']")).click();
		
		WebElement e = driver.findElement(By.name("passCount"));
		Select pssenger =new Select(e); 
		
		pssenger.selectByIndex(0);
		
		WebElement D = driver.findElement(By.name("fromPort"));
		Select Depart =new Select(D); 
		
		Depart.selectByIndex(2);
		
		
		driver.findElement(By.name("findFlights")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("reserveFlights")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.name("passFirst0")).sendKeys("ANKUSH");
		driver.findElement(By.name("passLast0")).sendKeys("GORE");
		driver.findElement(By.name("creditnumber")).sendKeys("9078679494");
		driver.findElement(By.name("buyFlights")).click();
		
		//Logout
		driver.findElement(By.xpath("//table/tbody/tr/td[3]/a/img")).click();
		
		System.out.println("LOGOUT SUCCESSFULLY");
		
		
		
		
	}
		
		
		
	}
