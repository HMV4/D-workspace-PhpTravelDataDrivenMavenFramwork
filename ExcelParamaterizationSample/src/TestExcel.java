import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class TestExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//String filepath=(System.getProperty("user.dir")+"\\src\\Book2.xls");
		String filepath ="C:\\Users\\Hituj Velukar\\Desktop\\DataDriven.xls";
		File f=new File(filepath);
		FileInputStream fis= new FileInputStream(f);
		HSSFWorkbook wBook=new HSSFWorkbook(fis);
		HSSFSheet wSheet=wBook.getSheet("Sheet1");
		System.out.println("Total Rows"+wSheet.getLastRowNum());
		for(int i=1;i<=wSheet.getLastRowNum();i++)
		{
			HSSFRow row =wSheet.getRow(i);
			//HSSFCell cell =row.getCell(i);
			//System.out.println("CELL DATA::" +  cell.getStringCellValue());
			HSSFCell cell=row.getCell(2);
			//cell=row.getCell(0);
			//cell.setCellType(1);
			System.out.println(cell.getStringCellValue());
			
		}
		

	}

}
