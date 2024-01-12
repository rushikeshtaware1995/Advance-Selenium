package seleniumnewsession;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {
	
	
	public static void main(String[]args) {
		
	
	// 1. browser specific: can't used for cross browser 
		
	ChromeDriver driver= new ChromeDriver();	
	FirefoxDriver driver1 = new FirefoxDriver();	
		
   // 2. WD = new CD- valid top casting - recomended - local execution
	
	WebDriver driver2 = new ChromeDriver();	
	
	//3. SC= new CD- valid top casting - not recomended 
	SearchContext driver3 = new ChromeDriver();	
	// is it valid top casting? yes it is. but its provide limited methods
    //driver3. check it 
    // we can access only those methods which is provided by SearchContext  
	
	//4. RWD = new CD(); valid top casting - recomended 
	
	RemoteWebDriver driver4= new ChromeDriver();
	
	//driver4. check methods 
	
	// why able to achive all methods bcoz remote webdriver hv implementation of all the methods
	

	//5. WD = new RWD();valid top casting - recomended --> used for remote execution
//	WebDriver driver5= new RemoteWebDriver(remoteAddress,capabilities );// why its not giving suggestions of constructor
	
	// remote execution -if you want to run your test cases on cloud , server or on some other machine , on AWS
	// for that we have to give IP address of that particular machine in remoteAddress thr url of that particular machine
	//capabilities means which browser 
	
	
	//6. SC =new  RWD();valid top casting - not recomended 
	
	//SearchContext driver5 =  new RemoteWebDriver(remoteAddress,capabilities );
	
	
   // can we create object of interface ?
	
	//WebDriver driver6 = new WebDriver();
	
	
		
		
		
	}
	

}
