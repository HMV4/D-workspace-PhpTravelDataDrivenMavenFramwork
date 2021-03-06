import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
public class ExcelUtility {
	static HSSFWorkbook book;
	static HSSFSheet sheet;
	static HSSFRow row;
	public static void setWorkBook()
	{
		try
		{
			String filePath=GenericUtility.getEnvionmentValue("ExcelFilePath");
			File f=new File(filePath);
			FileInputStream fis=new FileInputStream(f);
			book=new HSSFWorkbook(fis);
		}
		catch(Exception e){		}
	}
	public static void setWorkSheet(String SheetName)
	{
		sheet=book.getSheet(SheetName);
	}
	public static void setRow(int rowIndex)
	{
		row=sheet.getRow(rowIndex);
	}
	public static String getCellData(int ColumnIndex)
	{
		HSSFCell cell=row.getCell(ColumnIndex);
		cell.setCellType(1);
		return cell.getStringCellValue();
	}
	public static String getCellData(String ColumnName)
	{
		int ColumnIndex=getColumnIndex(ColumnName);
		String CellValue= getCellData(ColumnIndex);
		return CellValue;
	}
	public static int getColumnIndex(String ColumnName)
	{
		int columnIndex=-1;
		HSSFRow headerRow=sheet.getRow(0);
		for (int i = 0; i <=headerRow.getLastCellNum(); i++) {
			HSSFCell Column=headerRow.getCell(i);
			Column.setCellType(1);
			if(ColumnName.equalsIgnoreCase(Column.getStringCellValue()))
			{
				columnIndex=i;
				break;
			}
		}
		return columnIndex;
	}
}