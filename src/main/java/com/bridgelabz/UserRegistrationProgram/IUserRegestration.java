package com.bridgelabz.UserRegistrationProgram;

@FunctionalInterface
public interface IUserRegestration {
	
	public  boolean userValidation(String userDetails, String detailsRegex) throws InvalideUserDetailsException;

}
