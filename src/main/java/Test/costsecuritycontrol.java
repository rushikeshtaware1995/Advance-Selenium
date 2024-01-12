package Test;

import java.sql.Driver;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class costsecuritycontrol {
	
	@Test
	
	 public static void Insights() throws InterruptedException {
		 
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(3000);

			driver.manage().window().maximize();
			
			driver.get("https://demo.dev.netrum-tech.com");

			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kkhawale@etek.com");
			Thread.sleep(3000);

			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Komal@123");
			Thread.sleep(3000);

			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(35000);

			driver.findElement(By.linkText("Admin")).click();
			Thread.sleep(8000);

			driver.findElement(By.xpath("//p[normalize-space()='Cost Of Security Controls']")).click();
			Thread.sleep(3000);

//  for xpath -> //select[@id='user_dropdown']		 
		 
//	        WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='user_dropdown']"));
//
//	        Select select = new Select(dropdownElement);
//		 
//	        List<WebElement> options = select.getOptions();
//
//	        Random random = new Random();
//
//	        boolean validSelectionMade = false;
//
//			Thread.sleep(5000);
//
//	        while (!validSelectionMade) {
//	            int randomIndex = random.nextInt(options.size());
//				Thread.sleep(5000);
//
//	            try {
//	                // Attempt to select the random option
//	                select.selectByIndex(randomIndex);
//
//	                // Check if the selected option is enabled
//	                if (options.get(randomIndex).isEnabled()) {
//	                    validSelectionMade = true; // Valid selection made, exit the loop
//	                } else {
//	                    // Handle the case where an enabled element was not selected (e.g., log a message)
//	                    System.out.println("Selected option is disabled. Trying another option.");
//	                }
//	            } catch (java.lang.UnsupportedOperationException e) {
//	                // Handle the exception (e.g., log a message)
//	                System.out.println("Caught ElementNotInteractableException. Trying another option.");
//	            }
//	        }
//		 
			Thread.sleep(5000);
			WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='user_dropdown']"));

	        // Create a Select object for the dropdown
	        Select select = new Select(dropdownElement);

	        // Create a Random object
	        Random random = new Random();

	        int attempts = 0;
	        int maxAttempts = 5; // Number of attempts to make
	        Thread.sleep(5000);
	        while (attempts < maxAttempts) {
	            int randomIndex = random.nextInt(select.getOptions().size());

	            try {
	                // Attempt to select the random option
	                select.selectByIndex(randomIndex);

	                // Check if the selected option is enabled
	                if (select.getFirstSelectedOption().isEnabled()) {
	                    System.out.println("Successfully selected an enabled option.");
	                    break; // Exit the loop if a valid selection is made
	                }
	            } catch (java.lang.UnsupportedOperationException  e) {
	                // Handle the exception (e.g., log a message)
	                System.out.println("Caught ElementNotInteractableException. Trying another option.");
	            }

	            attempts++;
		 
	        }		 
}
}