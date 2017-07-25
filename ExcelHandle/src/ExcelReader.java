import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFBorderFormatting;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class ExcelReader {
	public static void main(String[] args) throws IOException {

		String filePath="C:\\Users\\Rohit\\Desktop\\Selenium-11Batch\\MarkSheet.xls";
		File f=new File(filePath);
		FileInputStream fis=new FileInputStream(f);
		HSSFWorkbook book=new HSSFWorkbook(fis);
		HSSFSheet sheet=book.getSheet("Marks");
		System.out.println("Total rows="+sheet.getLastRowNum());
		for (int i = 3; i <= sheet.getLastRowNum(); i++) {
			HSSFRow row=sheet.getRow(i);
			HSSFCell cell=row.getCell(1);
			System.out.print(cell.getStringCellValue());
			cell=row.getCell(2);
			cell.setCellType(1);
			System.out.println(cell.getStringCellValue());
		}	
	}

}
