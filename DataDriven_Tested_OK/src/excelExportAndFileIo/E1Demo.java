package excelExportAndFileIo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E1Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver =new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		ArrayList<String> user =readexcel(0);
		ArrayList<String> password =readexcel(1);
		ArrayList<String> Cpassword =readexcel(2);
		
		for(int i=0;i<=user.size();i++)
		{
			    
				driver.get("http://localhost/servlets/com.mercurytours.servlet.SignonServlet");
				driver.findElement(By.linkText("REGISTER")).click();
				
				   wait.until(ExpectedConditions.elementToBeClickable(By.name("userName")));
					driver.findElement(By.name("userName")).sendKeys(user.get(i));
					wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
					driver.findElement(By.name("password")).sendKeys(password.get(i));
					wait.until(ExpectedConditions.elementToBeClickable(By.name("confirmPassword")));
					driver.findElement(By.name("confirmPassword")).sendKeys(Cpassword.get(i));
			        
				
			
		}
		System.out.println(user);
		System.out.println(password);
		System.out.println(Cpassword);
		
	}
		
		public static ArrayList<String> readexcel(int colnum) throws IOException
		{
			FileInputStream fis =new FileInputStream("C:\\Users\\Hituj Velukar\\Desktop\\DataDriven.xls");
			HSSFWorkbook wb=new HSSFWorkbook(fis);
			HSSFSheet sh=wb.getSheet("Sheet1");
			int totalrow=sh.getLastRowNum();
			
			ArrayList<String> list =new ArrayList();
			for(int i=0;i<=totalrow;i++)
			{
				
		      list.add(sh.getRow(i).getCell(colnum).getStringCellValue());
				
			}
			
			System.out.println("LIST:::::::"+ list);
			return list;
			
		}
	}


