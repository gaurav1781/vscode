package steps;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutil
 {
    private static XSSFWorkbook workbook;
    private static XSSFSheet worksheet;
    private static XSSFCell workcell;
    public static void setexcelFile(String Path,String Sheet)  throws IOException
    {
        FileInputStream File=new FileInputStream(Path);
            workbook = new XSSFWorkbook(File);
            worksheet=workbook.getSheet(Sheet);
    }
    
    public static String getexceldata(int rowno,int colno)
    {
        workcell=worksheet.getRow(rowno).getCell(colno);
        String celldata=workcell.getStringCellValue();
        return celldata;
    }
}

