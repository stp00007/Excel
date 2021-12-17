import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class excelsheet
{
    public static void main(String[] args) throws IOException {
        String path = "/Users/shubham/Desktop/abc/Book1.xlsx";
        FileInputStream file = new FileInputStream(path);
          /*Workbook book = WorkbookFactory.create(file);
          Sheet sheet = book.getSheet("Sheet1");
        Row row = sheet.getRow(1); 
        Cell cell = row.getCell(0);
        String str = cell.getStringCellValue();
        System.out.println(str);
        Row row = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0);
        short lastcell = row.getLastCellNum();
        System.out.println(lastcell);
        Sheet steet = WorkbookFactory.create(file).getSheet("Sheet1");
        int row = steet.getLastRowNum();
        System.out.println(row); */
        Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
        int lastrow = sheet.getLastRowNum();
        for (int i = 0; i <=lastrow; i++)
        {
            Row row = sheet.getRow(i);
            short lastcell = row.getLastCellNum();
            for(int j=0;j<lastcell;j++)
            {
                Cell cell = row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println(" ");
        }
    }
}
