package ExcelLib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelconfig {

    XSSFWorkbook wb;
	XSSFSheet sh;

	public String Excelconfigpath(String excelPath) {

		File src = new File(excelPath);
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return excelPath;
	}

	public String getData(int Sheetnum, int row, int col) {
		
		sh = wb.getSheetAt(Sheetnum);
		return sh.getRow(row).getCell(col).getStringCellValue();

	}

	public int getRowCount(int SheetIndex) {
		int row = wb.getSheetAt(SheetIndex).getLastRowNum();
		row = row + 1;
		return row;

	}

}