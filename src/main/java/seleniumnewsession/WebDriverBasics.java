package seleniumnewsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
	
		
	// 1.open browser 
		
	WebDriver driver = 	new EdgeDriver();// top casting
   //class       reference                 object
	
	
	//2. open url
    driver.get("https://www.amazon.in/");
    //what rhis methode returning = void 
    // can we open without https ?
    //if we remove www will it work?
    
    //3.get title = title means tab name
    String acttitle = driver.getTitle();
    
    System.out.println("Page Title :" + acttitle);
    
    // validation or checkpoint 
    
    
    if(acttitle.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
    	
    	 System.out.println("Pass");
    	
    }
		
    else {
    	
    	System.out.println("Fail");
    }
   
    // first 3 steps are automations steps + validation/ assertions= automation testing 
    
    
//driver.quit();
    
    
    // cross browser
    String browser = "chrome";
    
    WebDriver driver1 =null;
    
    if (browser.equals("opera")) {
    	
    	driver= new ChromeDriver();	
    }
    else if(browser.equals("firefox")){
    	
    	driver= new FirefoxDriver();	
    	
    }
    
    else if(browser.equals("edge")){
    	
    	driver= new EdgeDriver();	
    	
    }
    else if(browser.equals("safari")){
    	
    	driver= new SafariDriver();	
    	
    }
    else {
    	
    	System.out.println("please select valid browaer" +" "+ browser);
    	
    }
    
    
    // cross browser with switch case
    
    
    
    
    
    
    
    
    
	}
	
	

}
