package Test;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelReader {

	public static Object[][] readExcelData(String filePath, String sheetName) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(sheetName);
            
            int rowCount = sheet.getLastRowNum();
            int colCount = sheet.getRow(0).getLastCellNum();
            
            Object[][] data = new Object[rowCount][colCount];
            Thread.sleep(2000);

            for (int i = 1; i <= rowCount; i++) {
                Row row = sheet.getRow(i);
                for (int j = 0; j < colCount; j++) {
                    Cell cell = row.getCell(j);
                    DataFormatter formatter = new DataFormatter();
                    String cellValue = formatter.formatCellValue(cell);
                    data[i - 1][j] = cellValue;
                }
            }
            
            fis.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

