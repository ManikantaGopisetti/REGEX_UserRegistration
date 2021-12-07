package com.bridgelabz.UserRegistrationProgram;

public class InvalideUserDetailsException extends RuntimeException {

	public InvalideUserDetailsException() {
		super();
	}

	public InvalideUserDetailsException(String message) {
		super(message);
	}

	public InvalideUserDetailsException(String message, Throwable cause) {
		super(message, cause);
	}

}
