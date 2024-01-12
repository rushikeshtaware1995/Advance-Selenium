package Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumnewsession.BrowserUtil;

public class urltesing {

public static void main (String[]args) throws InterruptedException {
		
	
		
//		BrowserUtil brUtil = new BrowserUtil();
//		
//		String BrowserName=  "chrome";		
//		brUtil.initializeDriver(BrowserName);	
//		
		//brUtil.launchurl("demo.dev.netrum-tech.com");	

           WebDriver driver =new ChromeDriver();
//           driver.get("https://demo.dev.netrum-tech.com");
//           driver.manage().window().maximize();
//           driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kkhawale@etek.com");
//       	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Komal@123");
//       	   driver.findElement(By.xpath("//button[@type='submit']")).click();
//       	   Thread.sleep(20000);
//
//     
//           List<WebElement> links= driver.findElements(By.tagName("a"));
//       	   Thread.sleep(2000);
//
//           System.out.print("No of links :-"+links.size());
//           
//           List<String> urlList= new ArrayList<String>();
//           
//          for (WebElement e:links) {
//        	  String url=e.getAttribute("href");
//        	  
//        	//  urlList.add(url);
//        	  checkbrokenlinks(url);
//          }
//          
//          driver.quit();
//}
//	
//
//	
//
//public static void checkbrokenlinks (String linkurl) {
//	
//	
//	 try {
//		 
//			URL url = new URL(linkurl);
//			HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
//			httpUrlConnection.setConnectTimeout(5000);
//			httpUrlConnection.connect();
//			
//			if(httpUrlConnection.getResponseCode() >400) {
//				
//			System.out.println(linkurl+"--->"+httpUrlConnection.getResponseMessage()+"is broken link");	
//				}
//			
//			else {
//				
//				System.out.println(linkurl+"--->"+httpUrlConnection.getResponseMessage());	
//		
//			}	
//				
//				
//			}
//			
//		catch(Exception e)	{
//			
//			
//			
//		}
	
	
}
	 
}	
	 
	 

	 
	 

  
