package seleniumnewsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {
	
	
	public static void main (String[]args) {
	
		
	WebDriver driver = new ChromeDriver();	
		
	driver.get("https://www.amazon.com");
	
	// if will launch url without https it will give error msg -
		
	driver.manage().window().maximize();	
		
		
	//driver.manage().window().fullscreen();	invalid argument exception 
		
	driver.manage().deleteAllCookies();

	String url=  driver.getCurrentUrl();
	
	System.out.println(url );
	
	if(url.contains("amazon.com")) {
		
		System.out.println("Expected output is amazon.com and Actual Output is" + url);	
	}
	else {
		
		System.out.println("Actual output is not as per expected");	
		
	}
	String PageSource =  driver.getPageSource();
	
	//System.out.println(PageSource );
	
	if(PageSource.contains("var ue_pty = \"Gateway\";")) {
		
		System.out.println("PASS");	
	}
	
   else {
		
		System.out.println("FAIL");	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	}
	
}
