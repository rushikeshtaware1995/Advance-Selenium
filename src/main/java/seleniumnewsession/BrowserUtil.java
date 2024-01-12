package seleniumnewsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserUtil {
	
	private WebDriver driver;// encapsulation

/*
 * this method is used to initialized the driver on the basis of given browser name
 * 
 * @para BrowserName
 * 
 * @ this return the specific browser driver
 * 
 */

public WebDriver initializeDriver(String browserName) {
	
	System.out.println("Browser Name is:"+browserName);
	switch(browserName.toLowerCase().trim()) {

	case "chrome":

		driver = new ChromeDriver();
	    break;
	case "edge":

		driver = new EdgeDriver();
	    break;    
	case "safari":
		driver = new ChromeDriver();
	    break;	
	default:
		System.out.println("Please pass the valid browser" +browserName);
		break;
	}
// we can create common methods here 	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	return driver;	
}
	

public void launchurl(String url) {
	 
	 
	if(url==null) {
		System.out.println("Url can not be null");	
	} 
	if(url.indexOf("https")==0){
		driver.get(url);	
	}
 } 
	
	public String getPageTitle() {
	String pagetitle =driver.getTitle();
	System.out.println("Page title is : "+pagetitle);
	return pagetitle;
}
	
	public String getPageurl() {
	String url =driver.getCurrentUrl();
	System.out.println("Page current url : "+url);
	return url;
	}	
	public void closeBrowser() {
		
		if(driver!=null) {	
		driver.close();				
		}
		
	}
	
	public void quitebrowser() {	
	if (driver!=null) {	
		driver.quit();		
	}	
	}
	
	}
	
	
	
	
	 
 













