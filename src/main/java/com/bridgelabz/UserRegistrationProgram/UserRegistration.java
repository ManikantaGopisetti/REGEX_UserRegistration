package com.bridgelabz.UserRegistrationProgram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}$";
	static final String LAST_NAME_REGEX = "^[A-Z][a-z]{2,}$";
	static final String EMAIL_REGEX = "^([-+a-zA-z0-9]+([.][a-zA-z0-9]+)*)@([\\w]+[.][a-zA-z]{2,}([.][a-zA-Z]{2,})?)$";
	static final String MOBILE_NUM_REGEX = "^[0-9]{2}[\\s][0-9]{10}$";
	static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=^[A-Za-z0-9]*[_\\W][A-Za-z0-9]*$).{8,}$";

	IUserRegestration iUserRegestration = (userDetails, detailsRegex) -> {
		if (userDetails == null || userDetails.equals("")) {
			throw new InvalideUserDetailsException("first name can't be null or Empty");
		}
		Pattern pattern = Pattern.compile(detailsRegex);
		Matcher matcher = pattern.matcher(userDetails);
		System.out.println("User details pattern match: " + matcher.matches());// prints true if valid otherwise false
		return matcher.matches();
	};

}
