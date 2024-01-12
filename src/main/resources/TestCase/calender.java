package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {


	
public static void main (String[]args) throws InterruptedException {
	

	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Desktop\\chromedriver_win32 (4)\\chromedriver.exe");
	
	 WebDriver driver = new ChromeDriver();
	 
	  driver.get("https://demo.dev.netrum-tech.com");
	  
	  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("komalkhawale3@gmail.com");
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Komal@123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();

		
	    Thread.sleep(20000);
	                                                               //  calender
	    WebElement a= driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[1]/span/div[1]/div[1]/div[1]/span/button/img"));
	    // error will occur becouse we have to switch to frame
	    driver.switchTo().frame(a);
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		List<WebElement> CalenderDates = driver.findElements(By.xpath("//td[@data-month='7']"));
		
		Thread.sleep(5000);
		
		for(WebElement k:CalenderDates) {
	 	   
	  	if(k.getText().equalsIgnoreCase("25")) {
	  		  
	  	k.click();
	  		
	  	break;  
	 
		 
   
  		
  		
	
	
	
	
	
	
	
	
	
	
	
  
  	}	
  	}
	}
}

