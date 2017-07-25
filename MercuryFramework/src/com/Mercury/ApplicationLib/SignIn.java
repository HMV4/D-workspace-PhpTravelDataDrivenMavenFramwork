package com.Mercury.ApplicationLib;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Mercury.GenericLib.ExcelUtility;

public class SignIn extends ExcelUtility {
	public void signin(WebDriver driver) throws IOException {

		HSSFRow row0 = sheet2.getRow(0);
		HSSFRow row1 = sheet2.getRow(1);

		DataFormatter Formatter1 = new DataFormatter();
		driver.findElement(By.linkText("sign-in")).click();

		for (int i = 0; i <= 1; i++) {

			HSSFCell cell1 = row0.getCell(i);
			HSSFCell cell2 = row1.getCell(i);

			driver.findElement(By.name(Formatter1.formatCellValue(cell1))).sendKeys(Formatter1.formatCellValue(cell2));
		}

		driver.findElement(By.name("login")).click();
	}

}
