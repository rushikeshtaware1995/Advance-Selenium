package seleniumnewsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	
private WebDriver driver; // initially this is null, we are give scope from 14 line driver  
		
// why private? -> if we set public , anyone can access this driver  and will get null exception		
		
public ElementUtil(WebDriver driver) {//
	this.driver = driver;

}

public WebElement getElement(By locator) {

	return driver.findElement(locator);

}

public void doSendkeys(By locators, String value) {

	getElement(locators).sendKeys(value);

	 }
}
	 
/*
 * 1.  here driver showing error 
 * 2. for that which java concept ? 
 * ans-> constructor 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
	 