package seleniumnewsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPageTest {

	
public static void main(String[]args) {
	
	
	String browserName = "edge";

	BrowserUtil brUtil = new BrowserUtil();

	WebDriver driver = brUtil.initializeDriver(browserName);

// initializeDriver means passing chrome from BrowserUtil class

	brUtil.launchurl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

	String title = brUtil.getPageTitle();

	System.out.println(title);

	// by locators or "object repository"--> centralized storage of locators

	By firstname = By.id("input-firstname");
	By lastname = By.id("input-lastname");
	By email = By.id("input-email");
	By telephone = By.id("input-telephone");
	By password = By.id("input-password");
	By confirm = By.id("input-confirm");

	ElementUtil eleUtil = new ElementUtil(driver);

	eleUtil.doSendkeys(firstname, "rishi");
	eleUtil.doSendkeys(lastname, "taware");
	eleUtil.doSendkeys(email, "rushikesh@gmail.com");
	eleUtil.doSendkeys(telephone, "123456");
	eleUtil.doSendkeys(password, "123");
	eleUtil.doSendkeys(confirm, "123");
	
	
}
	
}
