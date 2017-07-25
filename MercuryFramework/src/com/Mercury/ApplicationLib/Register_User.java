package com.Mercury.ApplicationLib;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Mercury.GenericLib.ExcelUtility;

public class Register_User extends ExcelUtility {
	public DataFormatter Formatter = new DataFormatter();

	public void register_user(WebDriver driver) throws IOException {
		// TODO Auto-generated method stub

		HSSFRow row0 = sheet1.getRow(0);
		HSSFRow row1 = sheet1.getRow(1);

		for (int i = 1; i <= 12; i++) {

			HSSFCell cell1 = row0.getCell(i);
			HSSFCell cell2 = row1.getCell(i);

			driver.findElement(By.name(Formatter.formatCellValue(cell1))).sendKeys(Formatter.formatCellValue(cell2));
		}

		driver.findElement(By.xpath("//table/tbody/tr[18]/td/input")).click();
	}

}
