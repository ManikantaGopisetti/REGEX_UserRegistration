package com.bridgelabz.UserRegistrationProgram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public void firstNameValidation(String firstName) {

		String firstNameRegex = "^[A-Z][a-z]{2,}$"; // First name starts with Cap and has minimum 3 characters
		Pattern pattern = Pattern.compile(firstNameRegex);
		Matcher matcher = pattern.matcher(firstName);
		System.out.println("First name pattern match: "+matcher.matches());// prints true if valid otherwise false

	}

	public void lastNameValidation(String lastName) {

		String lastNameRegex = "^[A-Z][a-z]{2,}$"; // Last name starts with Cap and has minimum 3 characters
		Pattern pattern = Pattern.compile(lastNameRegex);
		Matcher matcher = pattern.matcher(lastName);
		System.out.println("Last name pattern match: "+matcher.matches());// prints true if valid otherwise false
	}

	public void emailValidation(String email) {
		// Email has 3 mandatory parts and 2 optional with precise @ and . positions
		String emailRegex = "^[A-Za-z0-9+_-]+([.][A-Za-z0-9+_-]+)*@[A-Za-z0-9]+([.][A-Za-z0-9]{2,})+$"; 
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email);
		System.out.println("Email pattern match: "+matcher.matches());
	}

	public void mobileNumValidation(String mobileNum) {
	
		String mobileNumRegex = "^[0-9]{2}[\\s][0-9]{10}$";  //country code followed by space and 10 digit number
		Pattern pattern = Pattern.compile(mobileNumRegex);
		Matcher matcher = pattern.matcher(mobileNum);
		System.out.println("Mobile number pattern match: "+matcher.matches());
		
	}

}
