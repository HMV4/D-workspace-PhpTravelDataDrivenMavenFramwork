package Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelData {

    public static Integer totalRow = 0;

    public readExcel() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Hituj Velukar\\Desktop\\Data\\Book4.xls");
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet sh = wb.getSheet("Sheet1");
        totalRow = sh.getLastRowNum();
        System.out.println("Total Row Count: "+totalRow);
        ArrayList<String> list = new ArrayList();
        for (int i = 0; i <= totalRow; i++) {
            for (int j = 0; j <= 11; j++) {
                list.add(sh.getRow(i).getCell(j).getStringCellValue());
            }
        }

        System.out.println("LIST:::::::" + list);
        return list;

    }
}
