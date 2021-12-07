package com.bridgelabz.UserRegistrationProgram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean firstNameValidation(String firstName) throws InvalideUserDetailsException {
		if (firstName == null || firstName.equals("")) {
			throw new InvalideUserDetailsException("first name can't be null or Empty");
		}
		String firstNameRegex = "^[A-Z][a-z]{2,}$"; // First name starts with Cap and has minimum 3 characters
		Pattern pattern = Pattern.compile(firstNameRegex);
		Matcher matcher = pattern.matcher(firstName);
		System.out.println("First name pattern match: " + matcher.matches());// prints true if valid otherwise false
		return matcher.matches();
	}

	public boolean lastNameValidation(String lastName) throws InvalideUserDetailsException {
		if (lastName == null || lastName.equals("")) {
			throw new InvalideUserDetailsException("Last name can't be null or Empty");
		}
		String lastNameRegex = "^[A-Z][a-z]{2,}$"; // Last name starts with Cap and has minimum 3 characters
		Pattern pattern = Pattern.compile(lastNameRegex);
		Matcher matcher = pattern.matcher(lastName);
		System.out.println("Last name pattern match: " + matcher.matches());
		return matcher.matches();
	}

	public boolean emailValidation(String email) throws InvalideUserDetailsException {
		// Email has 3 mandatory parts and 2 optional with precise @ and . positions
		if (email == null || email.equals("")) {
			throw new InvalideUserDetailsException("email can't be null or Empty");
		}
		String emailRegex = "^([-+a-zA-z0-9]+([.][a-zA-z0-9]+)*)@([\\w]+[.][a-zA-z]{2,}([.][a-zA-Z]{2,})?)$";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email);
		System.out.println("Email pattern match: " + matcher.matches());
		return matcher.matches();
	}

	public boolean mobileNumValidation(String mobileNum) throws InvalideUserDetailsException {
		String mobileNumRegex = "^[0-9]{2}[\\s][0-9]{10}$"; // country code followed by space and 10 digit number
		Pattern pattern = Pattern.compile(mobileNumRegex);
		try {
			Matcher matcher = pattern.matcher(mobileNum);
			System.out.println("Mobile number pattern match: " + matcher.matches());
			return matcher.matches();
		} catch (Exception e) {
			throw new InvalideUserDetailsException("Invalid Mobile Number", e);// throwing exception along with cause

		}
	}

	public boolean passwordValidation(String password) throws InvalideUserDetailsException {
		if (password == null || password == "") {
			throw new InvalideUserDetailsException("Password can't be null or Empty");
		}
		String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=^[A-Za-z0-9]*[_\\W][A-Za-z0-9]*$).{8,}$"; // exactly 1 special																							// // character
		Pattern pattern = Pattern.compile(passwordRegex);
		Matcher matcher = pattern.matcher(password);
		System.out.println("password pattern match: " + matcher.matches());
		return matcher.matches();
	}

}
