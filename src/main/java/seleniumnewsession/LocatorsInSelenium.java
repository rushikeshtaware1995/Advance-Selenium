package seleniumnewsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {
	
	    static WebDriver driver;
		
		public static void main (String[]args) throws InterruptedException {
		driver = new ChromeDriver();
				
	    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
		driver.manage().window().maximize();	
	
	   
	// 1. id -> unique 
		
		
	//	driver.findElement(By.id("input-email")).sendKeys("r@gamil.com");
		
	// 2. name can be duplicate 	
		
		
	//	driver.findElement(By.name("email")).sendKeys("r@gamil.com");

		
	// 3. class name :can be duplicate most of the time->  not recommended if its duplicated 
		
		//driver.findElement(By.className("form-control")).sendKeys("r@gamil.com");
		
		// reason - selenium read from top 
		
	//4. xpath--> its not an attribute its the address of the element in HTML DOM
	
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("r@gamil.com");
//
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("r@gamil.com");
//
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).sendKeys("r@gamil.com");

		
//		By emaiId = By.xpath("//*[@id=\"input-email\"]");
//		By password = By.xpath("//*[@id=\"input-password\"]");
//		By login = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//		
//		doSendkeys(emaiId,"r@gamil.com");
//		doSendkeys(password,"bunny");
//		doClick(login);
//		
		
		
		// 5. css selectors -> its not an attribute
	
	//	driver.findElement(By.cssSelector("#input-email")).sendKeys("r@gamil.com");
		
		//6. link test-->only for links--> html tags -->a
		
	//	driver.findElement(By.linkText("Login")).sendKeys("r@gamil.com");

		// 7. partiallinktext
		
		
	//	driver.findElement(By.partialLinkText("Forgotten")).sendKeys("r@gamil.com");

		//8. tagname
		
		
		Thread.sleep(500);
		
	    String tag= driver.findElement(By.tagName("h2")).getText();
		
		System.out.println(tag);
		
		}	
		
		
		
	//	public static WebElement getElement (By locator) {
			
	//	return driver.findElement(locator);
			
			
	//	}
		
     //  public static void doClick (By locator) {
			
     //  getElement(locator).click();
	 
			
     //  }
		
    //   public static void doSendkeys (By locator,String value) {
			
    //   getElement(locator).sendKeys("r@gamil.com");
		
     //  }	
		
		
       
		
	
      
		
		
		
}

/*
 * at the time of interview if they ask to fill the login page -> ask them 1] plain script or generic method
 * 
 * 
 * for generic -> 6th approch 
 * 
 * 
 * 
 * 
 */
