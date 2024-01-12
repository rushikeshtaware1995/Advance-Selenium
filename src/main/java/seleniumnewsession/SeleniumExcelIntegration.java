package seleniumnewsession;

import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.ss.usermodel.*;









import Test.ExcelReader;

public class SeleniumExcelIntegration {

		    public static void main(String[] args) throws InterruptedException, IOException {
	        WebDriver driver = new ChromeDriver();
	        

            FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\Naveen_Automation_Prj.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(fs);
    		XSSFSheet sheet = workbook.getSheetAt(0);
    		Row row = sheet.getRow(1);
    		
    		Cell cell = row.getCell(1);
    		String Firstname = cell.toString();
	        
    		Thread.sleep(2000);
            driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
    		Thread.sleep(2000);

	        driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(Firstname);
	        
	         
	        
	        
	        
	        
//	        String excelFilePath = "C:\\Users\\hp\\eclipse-workspace\\AdvanceSelenium\\Naveen_Automation_Prj.xlsx";
//	        String sheetName = "Sheet1";
//	        
//	        Object[][] data = readExcelData(excelFilePath, sheetName);
//	        
//	        if (data != null) {
//	            for (Object[] row : data) {
//	                String elementLocator = row[0].toString();
//	                String elementText = row[1].toString();
//	                
//	                driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//	                
//	                try {
//	                    WebElement element = driver.findElement(By.cssSelector(elementLocator));
//	                    if (element.isDisplayed() && element.getText().equals(elementText)) {
//	                        element.click();
//	                        // Element found and clicked successfully.
//	                    } else {
//	                        // Element not found or doesn't match the expected criteria.
//	                    }
//	                } catch (org.openqa.selenium.NoSuchElementException e) {
//	                    // Element not found.
//	                }
//	                
//	                // Additional test steps...
//	            }
//	        }
//	        
//	        driver.quit();
//	    }
//	    
//	    public static Object[][] readExcelData(String filePath, String sheetName) {
//	        try {
//	            InputStream fis = new FileInputStream(filePath);
//	            Workbook workbook = new XSSFWorkbook(fis);
//	            Sheet sheet = workbook.getSheet(sheetName);
//	            
//	            int rowCount = sheet.getLastRowNum();
//	            int colCount = sheet.getRow(0).getLastCellNum();
//	            
//	            Object[][] data = new Object[rowCount][colCount];
//	            
//	            for (int i = 1; i <= rowCount; i++) {
//	                Row row = sheet.getRow(i);
//	                for (int j = 0; j < colCount; j++) {
//	                    Cell cell = row.getCell(j);
//	                    DataFormatter formatter = new DataFormatter();
//	                    String cellValue = formatter.formatCellValue(cell);
//	                    data[i - 1][j] = cellValue;
//	                }
//	            }
//	            
//	            fis.close();
//	            return data;
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	            return null;
//	        }
//	    }
//	





  
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
		//	FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\Naveen_Automation_Prj.xlsx");

//	        String excelFilePath = "C:\\Users\\hp\\eclipse-workspace\\AdvanceSelenium\\Naveen_Automation_Prj.xlsx";
//	        String sheetName = "Sheet1";
//	        
//	        Object[][] data = ExcelReader.readExcelData(excelFilePath, sheetName);
//	        
//	        if (data != null) {
//	            for (Object[] row : data) {
//	                String username = row[0].toString();
//	                String password = row[1].toString();
//	                
//	                // Your Selenium test steps here
//	                driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//	                Thread.sleep(2000);
//	                WebElement usernameField = driver.findElement(By.id("input-firstname"));
//	                Thread.sleep(2000);
//	                WebElement passwordField = driver.findElement(By.id("input-lastname"));
//	                Thread.sleep(2000);
//
////	                WebElement loginButton = driver.findElement(By.id("loginButton"));
//	                Thread.sleep(2000);
//
//	                usernameField.sendKeys(username);
//	                Thread.sleep(2000);
//
//	                passwordField.sendKeys(password);
////	                loginButton.click();
//	                
//	                // Additional test steps...
//	            }
//	        }
//	        
    }
	
	
}
	
	
	


