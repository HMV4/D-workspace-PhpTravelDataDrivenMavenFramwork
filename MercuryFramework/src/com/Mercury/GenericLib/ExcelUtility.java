package com.Mercury.GenericLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.Mercury.Mainscript.DriverScript;

public class ExcelUtility extends DriverScript {

	public  HSSFWorkbook book;
	public  HSSFSheet sheet1;
	public  HSSFSheet sheet2;
	public  HSSFRow row;

	public  void setWorkBook() throws IOException {
		
		File fexcel = new File(prop.getProperty("ExcelPath"));
		FileInputStream fisexcel = new FileInputStream(fexcel);

		book = new HSSFWorkbook(fisexcel);

		sheet1 = book.getSheet("RegisterData");
		sheet2 = book.getSheet("SignInData");
		

	}


}
