package seleniumnewsession;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;

public class Exceldata {

	
	
	public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();

        String excelFilePath = "C:\\Users\\hp\\eclipse-workspace\\AdvanceSelenium\\Demo.xlsx";
        String sheetName = "Sheet1";

        FileInputStream fis = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);
        
		Thread.sleep(5000);

        driver.get("https://demo.dev.netrum-tech.com");
        
        driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kkhawale@etek.com");
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Komal@123");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		
		Thread.sleep(15000);
		
		
//		driver.findElement(By.xpath("//a[normalize-space()='Admin']")).click();

		Thread.sleep(30000);
//		driver.findElement(By.xpath("//a[@href='/EntityOnBoarding']//div[@class='sc-hHLeRK eIQJVB']")).click();
//
//		Thread.sleep(10000);
//			
//	
//		driver.findElement(By.xpath("(//div[contains(text(),'Functions & Processes')])[1]")).click();
		
	

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String elementLocator = row.getCell(0).getStringCellValue();
            String action = row.getCell(1).getStringCellValue();

            // Locate the element on the web page
            WebElement element = driver.findElement(By.cssSelector(elementLocator));
            
    		Thread.sleep(5000);

            // Perform actions based on the "Function" column
            if (action.equalsIgnoreCase("click")) {
        		Thread.sleep(5000);
                element.click();
            } else {
                System.out.println("Unsupported action: " + action);
            }
        }

        fis.close();
        driver.quit();
    }
}
	
	
	
	
	
	
	
