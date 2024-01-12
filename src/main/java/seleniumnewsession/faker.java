package seleniumnewsession;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class faker {

	
	
	public static void main(String[] args) {
	Faker faker = new Faker();

	String businessName = faker.company().name();

    System.out.println("Business Name: " + businessName);
}	
		
	  
		
		}	
	
	
	
	
