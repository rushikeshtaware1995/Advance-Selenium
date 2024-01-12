package Test;

import java.util.Random;

public class randmonemail {

	
	 public static void main(String[] args) {
		  int length = 8; // Desired length of the local part of the email
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
	        StringBuilder localPart = new StringBuilder();

	        Random random = new Random();

	        for (int i = 0; i < length; i++) {
	            int index = random.nextInt(characters.length());
	            char randomChar = characters.charAt(index);
	            localPart.append(randomChar);
	        }

	        String domain = "example"; // Domain name
	        String tld = "com"; // Top-level domain

	        String randomEmail = localPart.toString() + "@" + domain + "." + tld;
	        System.out.println("Random Email: " + randomEmail);
	}
}
	
	

