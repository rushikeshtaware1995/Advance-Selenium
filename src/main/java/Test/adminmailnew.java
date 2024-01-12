package Test;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class adminmailnew {


   

	public static void main (String[]args) throws InterruptedException {
		 int length = 8; // Desired length of the local part of the email
	        String characters = "abcdefgh";
	        StringBuilder localPart = new StringBuilder();

	        Random random = new Random();

	        for (int i = 0; i < length; i++) {
	            int index = random.nextInt(characters.length());
	            char randomChar = characters.charAt(index);
	            localPart.append(randomChar);
	        }

	        String domain = "gmail"; // Domain name
	        String tld = "com"; // Top-level domain

	        String randomEmail = localPart.toString() + "@" + domain + "." + tld;
	        System.out.println("Random Email: " + randomEmail);
		   
		   

	       WebDriver driver =new ChromeDriver();
		   driver.get("https://admin.dev.netrum-tech.com");
		   Thread.sleep(5000);
	       driver.manage().window().maximize();
		   Thread.sleep(5000);
	       driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kkhawale@etek.com");
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Komal@123");
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
		   Thread.sleep(35000);
		   
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//a[@href='/ManageUsers']//div[@class='sc-jIZahH Cuuip']//div[@class='sc-himrzO UWafo']")).click();
		   Thread.sleep(8000);
		   driver.findElement(By.xpath("(//tbody/tr[5]/td[6]//*[name()='svg'])[3]")).click();
		   Thread.sleep(5000);

		   driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(randomEmail);
		   Thread.sleep(5000);

		   driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(randomEmail);
		   Thread.sleep(5000);

		   driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();

		 
		  
}
	
	    }
	
	



