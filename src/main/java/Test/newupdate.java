package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class newupdate {

public static void main (String[]args) throws InterruptedException {
		
	
		


       WebDriver driver =new ChromeDriver();
	   driver.get("https://demo.dev.netrum-tech.com");
	   Thread.sleep(5000);
       driver.manage().window().maximize();
	   Thread.sleep(5000);

       driver.findElement(By.xpath("//input[@type='email']")).sendKeys("komalkhawale3@gmail.com");
	   Thread.sleep(1000);

     
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Komal@123");
	  
	   
	   
	   
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   Thread.sleep(35000);
	//   driver.navigate().refresh();
	   Thread.sleep(5000);



	   
//	   WebElement Sourcelocator = driver.findElement(By.xpath("(//div[@id='Alert By Confidence'])[2]"));
//	   
//	   WebElement Destinationlocator = driver.findElement(By.xpath("(//div[@id='OEI'])[2]"));
//	   Thread.sleep(2000);
//	   Actions action = new Actions(driver);
//	   action.dragAndDrop(Sourcelocator, Destinationlocator).build().perform();   
//	   
//	   
//	   WebElement risk = driver.findElement(By.xpath("(//div[@id='Risk'])[2]"));
//	   WebElement map = driver.findElement(By.xpath("(//div[@id='Entity Risk Map'])[2]"));
//	   Thread.sleep(2000);
//	   action.dragAndDrop(risk, map).build().perform();   
//
//	 
	   
	   
	      driver.findElement(By.xpath("(//button[@id='dropdown-basic'])[2]")).click();

	   
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("(//button[@id='dropdown-basic'])[1]")).click();
		   Thread.sleep(200);
		   driver.findElement(By.xpath("//input[@id='custom-switch-0']")).click();
		   Thread.sleep(200);
		   driver.findElement(By.xpath("//input[@id='custom-switch-1']")).click();
		   Thread.sleep(200);
		   driver.findElement(By.xpath("//input[@id='custom-switch-2']")).click();
		   Thread.sleep(200);
		   driver.findElement(By.xpath("//input[@id='custom-switch-3']")).click();
		   Thread.sleep(200);
		   driver.findElement(By.xpath("//input[@id='custom-switch-4']")).click();
		   Thread.sleep(200);
		   driver.findElement(By.xpath("//input[@id='custom-switch-5']")).click();
		   Thread.sleep(2000);
		   driver.navigate().refresh();
		   Thread.sleep(8000);
		   driver.findElement(By.xpath("(//button[@id='dropdown-basic'])[1]")).click();
		   Thread.sleep(200);
		   driver.findElement(By.xpath("//input[@id='custom-switch-0']")).click();
		   Thread.sleep(200);
		   driver.findElement(By.xpath("//input[@id='custom-switch-1']")).click();
		   Thread.sleep(200);
		   driver.findElement(By.xpath("//input[@id='custom-switch-2']")).click();
		   Thread.sleep(200);
		   driver.findElement(By.xpath("//input[@id='custom-switch-3']")).click();
		   Thread.sleep(200);
		   driver.findElement(By.xpath("//input[@id='custom-switch-4']")).click();
		   Thread.sleep(200);
		   driver.findElement(By.xpath("//input[@id='custom-switch-5']")).click(); 
		   Thread.sleep(2000);
		  
		   
		   WebElement a= driver.findElement(By.xpath("//input[@id='custom-switch-6']"));
		   Thread.sleep(2000);
		  
		   
//		   try {
//			  
//
//			   a.click();
//			   
//			   System.out.println("Selected");
//
//		   }
//			catch (org.openqa.selenium.UnhandledAlertException e) {
//				 System.out.println("not selected"+a.isSelected());
//				
//			}
//		   
		  
		   
		   
		   
//		   Thread.sleep(2000);
//		   boolean isEnabled = a.isSelected();
//		   Thread.sleep(2000);
//           System.out.println(isEnabled);

		   
//		   if (isEnabled) {
//	            System.out.println("The input element is selected");
//	        } else {
//	            System.out.println("The input element is not selected");
//	        }
		   
		   
		   
		
		}
	  

//	   Thread.sleep(5000);
//	   driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
//	   Thread.sleep(500);
//	   driver.findElement(By.xpath("//input[@id='custom-switch-0']")).click();
//	   Thread.sleep(500);
//	   driver.findElement(By.xpath("//input[@id='custom-switch-1']")).click();
//	   Thread.sleep(500);
//	   driver.findElement(By.xpath("//input[@id='custom-switch-2']")).click();
//	   Thread.sleep(500);
//	   driver.findElement(By.xpath("//input[@id='custom-switch-3']")).click();
//	   Thread.sleep(500);
//	   driver.findElement(By.xpath("//input[@id='custom-switch-4']")).click();
//	   Thread.sleep(500);
//	   driver.findElement(By.xpath("//input[@id='custom-switch-5']")).click(); 
	   
	   
	   
	   
	   
	   
	   
//	   
//	   Thread.sleep(5000);
//	   driver.findElement(By.xpath("//a[normalize-space()='Insights']")).click();
//	   Thread.sleep(5000);
//	   WebElement chart1 = driver.findElement(By.xpath("(//div[@class='drag_handler'])[1]"));
//	   WebElement chart2 = driver.findElement(By.xpath("(//div[@class='drag_handler'])[2]"));
//	   Thread.sleep(2000);
//	   action.dragAndDrop(chart1,chart2).build().perform();   

//	   Thread.sleep(5000);
//	   driver.findElement(By.xpath("//a[normalize-space()='OEI']")).click();
//	   Thread.sleep(5000);
//	   WebElement chart3 = driver.findElement(By.xpath("(//div[@class='drag_inner_handler'])[3]"));
//	   WebElement chart4 = driver.findElement(By.xpath("(//div[@class='drag_inner_handler'])[4]"));
//	   Thread.sleep(2000);
//	   action.dragAndDrop(chart3,chart4).build().perform(); 
//	   
//	   
//	   WebElement chart5 = driver.findElement(By.xpath("(//div[@class='drag_handler'])[1]"));
//	   WebElement chart6 = driver.findElement(By.xpath("(//div[@class='drag_handler'])[2]"));
//	   Thread.sleep(2000);
//	   action.dragAndDrop(chart5,chart6).build().perform(); 
//	   
	   
	   
	   
	   
	// insights
//	   
//	   (//div[@class='drag_handler'])[3]
//	   (//div[@class='drag_handler'])[4]
//	  (//div[@class='drag_handler'])[5]
//
//	//oei
//			  (//div[@class='drag_inner_handler'])[3]
//			 (//div[@class='drag_inner_handler'])[4]
//			(//div[@class='drag_inner_handler'])[5]
//	   
	   
	   
	   
	   
	   
}	

