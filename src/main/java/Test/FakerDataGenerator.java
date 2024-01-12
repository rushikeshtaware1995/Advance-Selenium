package Test;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class FakerDataGenerator {
	
	@Test
	
	
	void fakerdata() {
		
		
		
		Faker faker = new Faker();
		
		String firstName=  faker.name().firstName();
		String lastName=  faker.name().lastName();
		String emailAddress=  faker.internet().emailAddress();
		int number=  faker.number().numberBetween(0, 100000);
		String password=  faker.internet().password(0, 1000);
		String country=  faker.address().country();

		String book=  faker.book().title();
		String color=  faker.color().name();
		String companyname=  faker.company().industry();
		
		System.out.println("company name :" + companyname);
		
		System.out.println(companyname+".dev");
		
		


//		System.out.println(firstName+" "+lastName);
//		System.out.println(emailAddress);
//		System.out.println(number);
//		System.out.println(password);

		System.out.println(book);
		System.out.println(country);
		System.out.println(color);
		
		
		    String businessName = faker.company().name();
	        String businessType = faker.company().industry();
	        String phoneNumber = faker.phoneNumber().phoneNumber();
	        String address = faker.address().fullAddress();
	        String city = faker.address().city();
	        String state = faker.address().state();
	        String zipCode = faker.address().zipCode();

	        // Display the generated business information
	        System.out.println("Business Name: " + businessName);
	        System.out.println("Business Type: " + businessType);
	        System.out.println("Phone Number: " + phoneNumber);
	        System.out.println("Address: " + address);
	        System.out.println("City: " + city);
	        System.out.println("State: " + state);
	        System.out.println("Zip Code: " + zipCode);
		
		
		
		
		
		
		
		

		
	}
	
	
}
