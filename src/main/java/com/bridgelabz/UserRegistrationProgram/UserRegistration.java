package com.bridgelabz.UserRegistrationProgram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public void firstNameValidation(String firstName) {

		String firstNameRegex = "^[A-Z][a-z]{2,}$"; // First name starts with Cap and has minimum 3 characters
		Pattern pattern = Pattern.compile(firstNameRegex);
		Matcher matcher = pattern.matcher(firstName);
		System.out.println(matcher.matches());// prints true if valid otherwise false

	}

	public void lastNameValidation(String lastName) {

		String lastNameRegex = "^[A-Z][a-z]{2,}$"; // Last name starts with Cap and has minimum 3 characters
		Pattern pattern = Pattern.compile(lastNameRegex);
		Matcher matcher = pattern.matcher(lastName);
		System.out.println(matcher.matches());// prints true if valid otherwise false
	}

}
