package TestCase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.markuputils.ExtentColor;

import PageObjectModel.Insights;
import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class VerifyInsights extends BaseClass{
	
	@Test
    public void Insights() throws InterruptedException {
    	
    	

        LoginPageObject lpo= new LoginPageObject(driver);
		
        lpo.EnterUsername().sendKeys(TestCaseData.username);
		
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		lpo.ClickSubmit().click();
		
		Thread.sleep(30000);
		
		
		
		
		
		
		
//		Insights ins = new Insights(driver);
//		Thread.sleep(2000);
//		ins.clickoninsights().click();
//		Thread.sleep(2000);
//			
//		Actions actions = new Actions(driver); 
//        
////alert_type
//        Thread.sleep(3000);
//        try {
//        	ins.alert_type1().isDisplayed();        	
//        	WebElement a = ins.alert_type1();
//    		actions.moveToElement(a).click().build().perform();
//            Thread.sleep(2000);
//        	ins.reset_filters().click();
//        	   
//        catch(org.openqa.selenium.NoSuchElementException e)	  {
//        }
//        	   
//        Thread.sleep(3000);
//        try {
//        	ins.alert_type2().isDisplayed();        	
//        	WebElement b = ins.alert_type2();
//    		actions.moveToElement(b).click().build().perform();
//        	 Thread.sleep(2000);
//        	 ins.reset_filters().click();
//        	   
//        catch(org.openqa.selenium.NoSuchElementException e)	  {
//        }
//        
        
//        try {
//        	ins.alert_type3().isDisplayed();        	
//        	ins.alert_type3().click();
//            Thread.sleep(2000);
//        	ins.reset_filters().click();
// 			ExtentManager.test.createNode("Alert Type is present");	        }
//        	   
//        catch(org.openqa.selenium.NoSuchElementException e)	  {
//			ExtentManager.test.createNode("Alert Type is present is not present");		 
//        }
        
//        Thread.sleep(3000);
//        try {
//        	ins.alert_type4().isDisplayed();
//        	 Thread.sleep(10000);
//        	 WebElement c = ins.alert_type3();
//     		actions.moveToElement(c).click().build().perform();
//            Thread.sleep(2000);
//        	ins.reset_filters().click();
//        	   
//        catch(org.openqa.selenium.NoSuchElementException e)	  {
//        }
//        Thread.sleep(3000);
//        try {
//        	ins.alert_type5().isDisplayed();
//        	 Thread.sleep(10000);
//        	ins.alert_type5().click();
//            Thread.sleep(2000);
//        	ins.reset_filters().click();
// 			ExtentManager.test.createNode("Alert Type is present");	        }
//        	   
//        catch(org.openqa.selenium.NoSuchElementException e)	  {
//			ExtentManager.test.createNode("Alert Type is present is not present");		 
//        }
//        Thread.sleep(10000);
//        try {
//        	ins.alert_type6().isDisplayed();
//        	Thread.sleep(10000);
//        	ins.alert_type6().click();
//            Thread.sleep(2000);
//        	ins.reset_filters().click();
// 			ExtentManager.test.createNode("Alert Type is present");	        }
//        	   
//        catch(org.openqa.selenium.NoSuchElementException e)	  {
//			ExtentManager.test.createNode("Alert Type is present is not present");		 
//        }
//        Thread.sleep(10000);
//        try {
//        	ins.alert_type7().isDisplayed(); 
//        	Thread.sleep(10000);
//        	ins.alert_type7().click();
//            Thread.sleep(2000);
//        	ins.reset_filters().click();
// 			ExtentManager.test.createNode("Alert Type is present");	        }
//        	   
//        catch(org.openqa.selenium.NoSuchElementException e)	  {
//			ExtentManager.test.createNode("Alert Type is present is not present");		 
//        }
        
       
 //   	request_type
//        try {
//        	ins.request_type1().isDisplayed();        	
//        	Thread.sleep(2000);
//			ins.request_type1().click();
//			Thread.sleep(500);
//			ins.reset_filters().click();
//			ExtentManager.test.createNode("Insights : Request Type is present");		   }
//        	   
//        catch(org.openqa.selenium.NoSuchElementException e)	  {
//			   ExtentManager.test.createNode("Insights : Request Type is not present");		 
//        }
//        
//        try {
//        	ins.request_type2().isDisplayed();        	
//        	Thread.sleep(2000);
//			ins.request_type2().click();
//			Thread.sleep(500);
//			ins.reset_filters().click();
//			ExtentManager.test.createNode("Insights : Request Type is present");		   }
//        	   
//        catch(org.openqa.selenium.NoSuchElementException e)	  {
//			   ExtentManager.test.createNode("Insights : Request Type is not present");		 
//        }
//        try {
//        	ins.request_type3().isDisplayed();        	
//        	Thread.sleep(2000);
//			ins.request_type3().click();
//			Thread.sleep(500);
//			ins.reset_filters().click();
//			ExtentManager.test.createNode("Insights : Request Type is present");}		 
//        	   
//        catch(org.openqa.selenium.NoSuchElementException e)	  {
//			   ExtentManager.test.createNode("Insights : Request Type is not present");		 
//        }
//       
//        try {
//        	ins.request_status1().isDisplayed();        	
//			ins.request_status1().click();
//			ins.reset_filters().click();
//			ExtentManager.test.createNode("Insights : Request Status is present");}		 
//        	   
//        catch(org.openqa.selenium.NoSuchElementException e)	  {
//			   ExtentManager.test.createNode("Insights : Request Status is not present");		 
//        }
//        try {
//        	ins.request_status2().isDisplayed();        	
//        	Thread.sleep(2000);
//			ins.request_status2().click();
//			Thread.sleep(500);
//			ins.reset_filters().click();
//			ExtentManager.test.createNode("Insights : Request Status is present");}		 
//        	   
//        catch(org.openqa.selenium.NoSuchElementException e)	  {
//			   ExtentManager.test.createNode("Insights : Request Status is not present");		 
//        }
//        try {
//        	ins.request_status3().isDisplayed();        	
//        	Thread.sleep(2000);
//			ins.request_status3().click();
//			Thread.sleep(500);
//			ins.reset_filters().click();
//			ExtentManager.test.createNode("Insights : Request Status is present");}		 
//        	   
//        catch(org.openqa.selenium.NoSuchElementException e)	  {
//			   ExtentManager.test.createNode("Insights : Request Status is not present");		 
//        }
//        
//    
//	//top10assets
//        try {
//        	ins.top10assets_a_c_1().isDisplayed();        	
//        	Thread.sleep(1000);
//			 ins.top10assets_a_c_1().click();	
//			 Thread.sleep(100);
//			 ins.reset_filters().click();	
//			 ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is present");}	 
//        	   
//        catch(org.openqa.selenium.NoSuchElementException e)	  {
//			   ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is not present");		 
//        }
//        try {
//        	ins.top10assets_a_c_2().isDisplayed();        	
//        	Thread.sleep(1000);
//			 ins.top10assets_a_c_2().click();	
//			 Thread.sleep(100);
//			 ins.reset_filters().click();	
//			 ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is present");}	 
//        	   
//        catch(org.openqa.selenium.NoSuchElementException e)	  {
//			   ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is not present");		 
//        }
//        try {
//        	ins.top10assets_a_c_3().isDisplayed();        	
//        	Thread.sleep(1000);
//			 ins.top10assets_a_c_3().click();	
//			 Thread.sleep(100);
//			 ins.reset_filters().click();	
//			 ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is present");}	 
//        	   
//        catch(org.openqa.selenium.NoSuchElementException e)	  {
//			   ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is not present");		 
//        }
//        try {
//        	ins.top10assets_a_c_4().isDisplayed();        	
//        	Thread.sleep(1000);
//			 ins.top10assets_a_c_4().click();	
//			 Thread.sleep(100);
//			 ins.reset_filters().click();	
//			 ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is present");}	 
//        	   
//        catch(org.openqa.selenium.NoSuchElementException e)	  {
//			   ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is not present");		 
//        }
//        try {
//        	ins.top10assets_a_c_5().isDisplayed();        	
//        	Thread.sleep(1000);
//			 ins.top10assets_a_c_5().click();	
//			 Thread.sleep(100);
//			 ins.reset_filters().click();	
//			 ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is present");}	 
//        	   
//        catch(org.openqa.selenium.NoSuchElementException e)	  {
//			   ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is not present");		 
//        }
//        try {
//        	ins.top10assets_a_c_6().isDisplayed();        	
//        	Thread.sleep(1000);
//			 ins.top10assets_a_c_6().click();	
//			 Thread.sleep(100);
//			 ins.reset_filters().click();	
//			 ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is present");}	 
//        	   
//        catch(org.openqa.selenium.NoSuchElementException e)	  {
//			   ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is not present");		 
//        }       
//        try {
//        	ins.top10assets_a_c_7().isDisplayed();        	
//        	Thread.sleep(1000);
//			 ins.top10assets_a_c_7().click();	
//			 Thread.sleep(100);
//			 ins.reset_filters().click();	
//			 ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is present");}	 
//        	   
//        catch(org.openqa.selenium.NoSuchElementException e)	  {
//			   ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is not present");		 
//        }
//        try {
//        	ins.top10assets_a_c_8().isDisplayed();        	
//        	Thread.sleep(1000);
//			 ins.top10assets_a_c_8().click();	
//			 Thread.sleep(100);
//			 ins.reset_filters().click();	
//			 ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is present");}	 
//        	   
//        catch(org.openqa.selenium.NoSuchElementException e)	  {
//			   ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is not present");		 
//        }  
//        try {
//        	ins.top10assets_a_c_9().isDisplayed();        	
//        	Thread.sleep(1000);
//			 ins.top10assets_a_c_9().click();	
//			 Thread.sleep(100);
//			 ins.reset_filters().click();	
//			 ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is present");}	 
//        	   
//        catch(org.openqa.selenium.NoSuchElementException e)	  {
//			   ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is not present");		 
//        }   
//        
//        try {
//        	ins.top10assets_a_c_10().isDisplayed();        	
//        	Thread.sleep(1000);
//			 ins.top10assets_a_c_10().click();	
//			 Thread.sleep(100);
//			 ins.reset_filters().click();	
//			 ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is present");}	 
//        	   
//        catch(org.openqa.selenium.NoSuchElementException e)	  {
//			   ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is not present");		 
//        }  
//        
//     
//        
//    	
//	    Thread.sleep(5000);
//	    
//	    JavascriptExecutor js = (JavascriptExecutor) driver;
//	    
//	    js.executeScript("window.scrollBy(0,800)", "");
//	   
//	    Thread.sleep(10000);
//		
//        ins.details().click();
//        Thread.sleep(5000);
//        ins.Searchupdate().sendKeys(TestCaseData.ins_search);
//        Thread.sleep(5000);
//        ins.typehere().sendKeys(TestCaseData.ins_type_here);
//        Thread.sleep(5000);
//        
//	    ins.update_ins().click();
//	    Thread.sleep(3000);
//    	ins.back_ins().click();
//     	
//    	Thread.sleep(5000);
//	    js.executeScript("window.scrollBy(0,800)", "");
//
//    	Thread.sleep(5000);
//    	ins.share_ins().click();
//    	
//    	Thread.sleep(2000);
//    	ins.assign_ins().click();
//    	Thread.sleep(2000);
//    	ins.assign_to_ins().sendKeys(TestCaseData.assign_to);
//    	Thread.sleep(8000);
//    	ins.submit_ins().click();
//    	Thread.sleep(5000);
//    	ins.comment_ins().click();
//    	Thread.sleep(2000); 
//    	ins.add_comment().sendKeys(TestCaseData.add_comment);
//    	Thread.sleep(2000);
//    	ins.submit_ins().click();
//		Thread.sleep(5000);
//    			 
//		 
//		 
//		 
//		 js.executeScript("window.scrollBy(0,-800)", "");
//		 Thread.sleep(5000);
//
//		WebElement a= driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[1]"));
//		Thread.sleep(2000);
//		
//        a.click();
//		
//		Actions analysis = new Actions(driver);
//		
//        double randomvalue_analysis=  (Math.random() * (5 - 0 + 1) + 0);
//        
//	    for(int i=0; i<=randomvalue_analysis; i++) {
//    		
//       
//	    analysis.pause(Duration.ofSeconds(1));
//	    
//	   	analysis.sendKeys(Keys.ARROW_DOWN).moveToElement(a).perform();
//	    	}
//	
//       analysis.sendKeys(Keys.ENTER).build().perform();
//    
//    	
//    Thread.sleep(2000);   
//   	WebElement b= driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[2]"));
//	Thread.sleep(2000);
//	
//    b.click();
//	
//	Actions analysis1 = new Actions(driver);
//	
//    double randomvalue_analysis1=  (Math.random() * (5 - 0 + 1) + 0);
//    
//    for(int i=0; i<=randomvalue_analysis1; i++) {
//		
//   
//    analysis1.pause(Duration.ofSeconds(1));
//    
//   	analysis1.sendKeys(Keys.ARROW_DOWN).moveToElement(b).perform();
//    	}
//
//    analysis1.sendKeys(Keys.ENTER).build().perform();
//
//	
//    	
//    Thread.sleep(2000);   
//   	WebElement c= driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[3]"));
//	Thread.sleep(2000);
//	
//    c.click();
//	
//	Actions analysis2 = new Actions(driver);
//	
//    double randomvalue_analysis2=  (Math.random() * (5 - 0 + 1) + 0);
//    
//    for(int i=0; i<=randomvalue_analysis2; i++) {
//		
//   
//    analysis2.pause(Duration.ofSeconds(1));
//    
//   	analysis2.sendKeys(Keys.ARROW_DOWN).moveToElement(c).perform();
//    	}
//
//    analysis2.sendKeys(Keys.ENTER).build().perform();	
//       
//    	
//    Thread.sleep(2000);   
//   	WebElement d= driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[4]"));
//	Thread.sleep(2000);
//	
//    d.click();
//	
//	Actions analysis3 = new Actions(driver);
//	
//    double randomvalue_analysis3=  (Math.random() * (5 - 0 + 1) + 0);
//    
//    for(int i=0; i<=randomvalue_analysis3; i++) {
//		
//   
//    analysis3.pause(Duration.ofSeconds(1));
//    
//   	analysis3.sendKeys(Keys.ARROW_DOWN).moveToElement(d).perform();
//    	}
//
//    analysis3.sendKeys(Keys.ENTER).build().perform();	
//
//      Thread.sleep(2000);
//	  ExtentManager.test.createNode("Insights Test Case Pass");
  	
    	
	
	}
	

}
