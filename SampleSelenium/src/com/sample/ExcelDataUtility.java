package com.sample;

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
	HSSFWorkbook wb;
	HSSFSheet sheet1;
	public ExcelDataUtility() throws IOException
	{
		
		File src = new File("C:\\Users\\Hituj Velukar\\Desktop\\DataDriven.xlsx");
		FileInputStream fis=new FileInputStream(src);
		wb = new HSSFWorkbook(fis);
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
	
	

}
