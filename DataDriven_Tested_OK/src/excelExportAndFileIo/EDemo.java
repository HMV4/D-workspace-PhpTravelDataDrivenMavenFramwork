package excelExportAndFileIo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		
		//EDemo getdata =new EDemo();
		ArrayList<String> username=readexcel(0);
		ArrayList<String> Password=readexcel(1);
		ArrayList<String> CPassword=readexcel(2);
		
		/*//submit
		driver.findElement(By.name("register")).click();*/
		
		
		for(int i=0;i<username.size();i++)
		{
			driver.findElement(By.id("email")).sendKeys(username.get(i));
			driver.findElement(By.name("password")).sendKeys(Password.get(i++));
			//System.out.println(Password.get(i));
			driver.findElement(By.name("confirmPassword")).sendKeys(CPassword.get(i+2));
			
		}	
		
		
		driver.findElement(By.name("register")).click();

	}
	
	public static ArrayList<String> readexcel(int colnum) throws IOException
	{
		FileInputStream fis =new FileInputStream("C:\\Users\\Hituj Velukar\\Desktop\\DataDriven.xls");
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet sh=wb.getSheet("Sheet1");
		Iterator<Row> rowiterator=sh.iterator();
		ArrayList<String> list =new ArrayList();
		while(rowiterator.hasNext())
		{
			
			list.add(rowiterator.next().getCell(colnum).getStringCellValue());
			
		}
		
		System.out.println("LIST:::::::"+ list);
		return list;
		
	}

}
