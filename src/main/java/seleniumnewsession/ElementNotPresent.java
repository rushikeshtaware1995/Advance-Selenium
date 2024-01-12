package seleniumnewsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotPresent {
	
static WebDriver driver;

public static void main (String[]args) {
		
		
	driver = new ChromeDriver();

	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

	By logoimg = By.xpath("//img[@title='naveenopencart']");
	By search = By.name("search");

	boolean logo = driver.findElement(logoimg).isDisplayed();
	System.out.println(logo);

//here exception is due to which method? 
//ans-due to --> findElement--> no such element
        
        
		
}
}