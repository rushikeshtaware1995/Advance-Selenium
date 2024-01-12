package seleniumnewsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
    static WebDriver driver;
	
	public static void main (String[]args) {
		
//create webelement + perform action (click, sendkeys, gettext, isDisplayed)
		
//create webelement need a locator
		
//after inspecting we get page called as Dom- document object model	
		
		
		 driver = new ChromeDriver();
			
	
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		
		// 1. id - disadvantage - if 10 elements we hv to write 10 times
		driver.findElement(By.id("input-emai")).sendKeys("rushikesh@gmail.com");
		
		driver.findElement(By.id("input-password")).sendKeys("rushikesh");
		
		
		
		

		//2. 
		
		WebElement emailid = driver.findElement(By.id("input-emai"));
		
		WebElement password = driver.findElement(By.id("input-password"));

		emailid.sendKeys("");
		
		password.sendKeys("");
		
		
		
		
       // 3
		
	By emailid1 = By.id("input-emai");	
		
	By password1 = By.id("input-password");	
	
	WebElement eid = driver.findElement(emailid1);

	WebElement pwd = driver.findElement(password1);
	
	
	eid.sendKeys("rushikesh@gmail.com");
	pwd.sendKeys("1234");
	
// writing unnecessary code 	
	
// in 1st 2nd and 3rd we are hitting server again and againg, how many time we write driver we are hitting server 	
	
	
	
	
	
	
	//4 - by locators + generic method
	
//in above methods which using commen --> driver.find element 	
// every time we are creating driver.find--- 
// in future we will have 100 of element 
	 
	
	By emailid2 = By.id("input-email");	

	By password2 = By.id("input-password");	

	getElement(emailid2).sendKeys("rushikesh@gmail.com");// caalling gerelement method from line 82. do we need to create object?--> no, bcoz method is static
	
	getElement(password2).sendKeys("1234");
	
// performed 2 action, and how many times write driver.findelement?only 1	

// advantage reusiablity of code
// what is advantage of By locators - we are not hitting server unnecessary
	
	
	
	
	
	// 5th -> by locators +  generic methods for  webelement and actions 	
	
	// we are giving locators and 	giving value in string
			
	
	By emailid3 = By.id("input-email");	
	
	By password3 = By.id("input-password");	
	
	
	doSendkeys(emailid3, "rushikesh@gmail.com");
	
	doSendkeys(password3, "1234");

	
	//6th-> what if some other want to use doSendkeys(emailid3, "rushikesh@gmail.com"); method
	
	// here in 6th approch - By locators  + generic methods  for webelement and actions in ELEMENT  UTILS CLASS 
	
    By emailid4 = By.id("input-email");	
	
	By password4 = By.id("input-password");
	
	ElementUtil eutil = new ElementUtil(driver);
	
	eutil.doSendkeys(emailid4,"rushikesh@gmail.com" );
	
	eutil.doSendkeys(password4,"1234");
	
// this approch will work in every apllication
// just maintane locators and call the methods 
	
	
	}
	       
	// this method is for 4th approch
	
	// getElement- method name
  public static  WebElement getElement(By locator) { // its static so we can call directly 
	
// 	getElement(By locator) here giving by locator to getElement  
	return driver.findElement(locator);
// why not void? -  findelement will give you webelement - pointer on findelement 
		

//what driver.findelement return ? -> webelement 
	
// in line number 69, 70, are we hitting server?	
	
	
	
	

	

	
	
	}
//this method is for 5th approch
  
 public static void doSendkeys (By locators , String value) {
	 
 getElement(locators).sendKeys(value);
	 
 }
	
	
	
	
	
	
	
	
	
	
	
	

		
		
		
	
	

}