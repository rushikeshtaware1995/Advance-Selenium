package seleniumnewsession;

public class AmazonTest {

	
	public static void main (String[]args) {
		
		
		BrowserUtil brUtil = new BrowserUtil();
		
		
		
// we have created WebDriver private in BrowserUtil	, if we create it public we can access that here but it will show one error- that is this driver is nulll
		
// why we doing private - boz we cannot access that driver here 
		
		String BrowserName=  "chrome";
		
//in future this BrowserName will be from xml or configuration file 		
		
		brUtil.initializeDriver(BrowserName);
		
// flow of code= when we run code -> go to 	initializeDriver-->what is browser name -> chrome -> check in BrowserUtil class
// found chrome -> lowercase -> break statement--> come out of switch case -> return driver-> 
		
		
		brUtil.launchurl("https://www.amazzon.com");
		
		

	String actTitle = 	brUtil.getPageTitle(); // storing in string 
	
	if(actTitle.contains("Amazon")) {
		
		System.out.println("for Title : Actual result and Expected result is same");
	}
		
	else {
		
		System.out.println("for Title : Actual result and Expected result is not same");
	}
		
	
	String actUrl=  brUtil.getPageurl();
	
	if(actUrl.contains("Amazon")) {
		
	  System.out.println("for url : Actual result and Expected result is same");
	  
	}
	
	else {
		
		System.out.println("for Title url : Actual result and Expected result is not same");
	}
	
	brUtil.quitebrowser();
	}	
}
