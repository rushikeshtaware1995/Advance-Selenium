package seleniumnewsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class calender {
	
	
	
public static void main (String[]args) throws InterruptedException {

	 WebDriver driver = new ChromeDriver();	

	  driver.get("https://suraperu.dev.netrum-tech.com");
	  
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("komalkhawale3@gmail.com");
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Komal@123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();

		
	    Thread.sleep(30000);
	   
	    driver.findElement(By.xpath("//button[@class='btn btn-outline']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[@class='rdrMonthPicker']")).click();
	    Thread.sleep(3000);
	 //   driver.findElement(By.xpath("(//select/option[4])[1]")).click();

	    
		  Actions obj = new Actions (driver);
		    Thread.sleep(3000);
		  WebElement a= driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div[1]/div[1]/div/span/div/div/div[2]/div[2]/span/span[1]/select/option[9]"));
		    Thread.sleep(3000);
		    
		    obj.sendKeys(Keys.ARROW_DOWN).moveToElement(a).perform();
		    
		  //obj.moveToElement(a).click().build().perform();
	    
	 
	  
//	    List<WebElement> CalenderDates = driver.findElements(By.xpath("//span[@class='rdrStaticRangeLabel']"));
//		
//		Thread.sleep(5000);
//		
//		for(WebElement k:CalenderDates) {
//	 	   
//	  	if(k.getText().equalsIgnoreCase("Last Month")) {  
//	  	k.click();
//	  	k.click();
//	  	break; 
//	  	}
//		}	
//	  	}
//		
//	  	}	

}}


