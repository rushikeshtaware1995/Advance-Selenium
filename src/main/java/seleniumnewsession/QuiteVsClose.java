package seleniumnewsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuiteVsClose {
	
	
	public static void main(String[]args) {
		
		
	WebDriver driver = new ChromeDriver();//sid - 123
	
	
	driver.get("https://www.amazon.com");//sid 123
		
	String title= driver.getTitle();	
		
	System.out.println(title);	
		
	driver.quit();//sid 123
//Session ID is null
	
	driver.close();
//	NoSuchSessionException: invalid session id
	
	System.out.println(driver.getTitle());		
	
//	Exception in thread "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?	
	
//we are passing request to server , server will process and check seesion id we are looking for and session id is null. and server will give exception	
	
// for every request session id will maintain same till driver.quite but after that session id is "null"	
	
// who create session id - server 	
	
// in both cases quite and close session id will be new 
	
// whenever we write 	WebDriver driver = new ChromeDriver(); always create new session id 
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
