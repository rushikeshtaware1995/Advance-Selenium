package seleniumnewsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class ElementIsDisplayed {
	
static WebDriver driver;


public static void main(String[] args) throws InterruptedException {

	SoftAssert assertion = new SoftAssert();

	driver = new ChromeDriver();

	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		boolean logo= driver.findElement(By.xpath("//img[@class='img-responsive']")).isDisplayed();
//		
//		
//		if(logo) {	
//		System.out.println("logo is present");		
//		}
//		else {
//			System.out.println("logo is not present");		
//	
//	   }

//	   By logoimg = By.xpath("//img[@class='Img-responsive']");
//	
//	   By search = By.name("search");

//	   By searchicon = By.name(" button");

	try {
		driver.findElement(By.xpath("//img[@class='Img-responsive']")).isDisplayed();

		System.out.println("present");
	}

	catch (org.openqa.selenium.NoSuchElementException e) {
		System.out.println(" not present");
	}

//	   Thread.sleep(5000);
//	   if(doElementisDisplayed(logoimg)==true) {
//		
//	   System.out.println("logo is present");	
//	   }else {
//	   System.out.println("logo is not present");
//		
//	   }
//	   if(doElementisDisplayed(search)) {
//		   
//		   System.out.println("search is present");	
//   
//		   doClick(searchicon);  
//	   }

//     }
//		
//	  public static WebElement getElement(By locator) {
//    	
//	  return driver.findElement(locator);			
//	 }
//	
//	  public static boolean doElementisDisplayed(By locator) {
//   
//	  return getElement(locator).isDisplayed();	
//	
//	  }
//	
//	 public static boolean search(By locator) {
//		 
//	 return getElement(locator).isDisplayed(); 
//		 
//	 }
//	
//	public static void doClick(By locator) {
//		
//	getElement(locator).click();	
//		
//	}

}

}
