package seleniumnewsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverTest {
	
	
	public static void main (String[]args) {
		
		
   ChromeOptions options = new ChromeOptions();
	     
	WebDriver driver = new ChromeDriver();	
	 options.setAcceptInsecureCerts(true);
		
		//pass the options parameter in the Chrome driver declaration
	//	WebDriver driver= new ChromeDriver(options);// if will not pass options then it will run as normal and not run as incognito
		 
		//Navigate to toolsQA site url
		driver.get("https://expired.badssl.com/");	
		
		System.out.println(driver.getTitle());
		

		
//Exception in thread "main" java.lang.IllegalStateException: The path to the driver executable The path to the driver executable must be set by the webdriver.chrome.driver system property; for more information, see https://chromedriver.chromium.org/. The latest version can be downloaded from https://chromedriver.chromium.org/downloads
//from version 4.6.0 yoou dont need to set any property 
//why - bcoz of compatibility issue , now selenium automatically check and adjust that
// But this also not stable may be in future we need to used system.set prop file
		
		
		
		
		
		
		
		
		
	}
	
			

}
