package seleniumnewsession;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;





public class insights {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		SoftAssert assertion = new SoftAssert();

		driver.get("https://exotel.uat.netrum-tech.com/");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("kkhawale@etek.com");

		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("Komal@123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(30000);

		driver.findElement(By.linkText("Insights")).click();
		Thread.sleep(20000);
		// WebElement a=
		// driver.findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and
		// @class='highcharts-series-group']//*[name()='path'])[7]"));
//  WebElement a=	driver.findElement(By.xpath("//tbody/tr[8]"));
		Thread.sleep(5000);
	
	
	
	
	
	
	
	
	
	
	}
	
	
	}	
	
	

