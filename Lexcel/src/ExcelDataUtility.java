

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataUtility {
	//"C:\\Users\\Hituj Velukar\\Desktop\\DataDriven.xlsx"
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public void ExcelDataUtility1() throws IOException
	{
		
		File src = new File("C:\\Users\\Hituj Velukar\\Desktop\\DataDriven.xls");
		FileInputStream fis=new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
	}
	
	
	// to get data from sheet
	public String getData(int SheetNum , int row,int col)
	{
		sheet1=wb.getSheetAt(SheetNum);
		String Data=sheet1.getRow(row).getCell(col).getStringCellValue();
		return Data;
	}
	
	// to get row count from sheet
	public int getRowCount(int SheetIndex)
	{
		int row =wb.getSheetAt(SheetIndex).getLastRowNum();
		row= row +1; // as row stores index values 0 to 9
		return row;
	}
	
	
	
	public static void main(String args[]) throws IOException {
		// TODO Auto-generated method stu
		ExcelDataUtility c= new ExcelDataUtility();
		c.ExcelDataUtility1();
		c.getRowCount(0);
		
		
		

	}
	

}
