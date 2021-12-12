package com.bridgelabz.UserRegistrationProgram;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class UserValidationTest {

	UserRegistration uRegistration;

	@Before
	public void userinit() {
		uRegistration = new UserRegistration();
	}

	// for Happy and Sad

	@Test
	public void firstNameValidationHappy() {
		boolean output = uRegistration.iUserRegestration.userValidation("Manikanta", UserRegistration.FIRST_NAME_REGEX);
		assertEquals(true, output);
	}

	@Test
	public void firstNameValidationsad() {
		boolean output = uRegistration.iUserRegestration.userValidation("man", UserRegistration.FIRST_NAME_REGEX);
		assertEquals(false, output);
	}

	@Test
	public void lastNameValidationHappy() {
		boolean output = uRegistration.iUserRegestration.userValidation("Man", UserRegistration.LAST_NAME_REGEX);
		assertEquals(true, output);
	}

	@Test
	public void lastNameValidationsad() {
		boolean output = uRegistration.iUserRegestration.userValidation("manikanta", UserRegistration.LAST_NAME_REGEX);
		assertEquals(false, output);
	}

	@Test
	public void emailValidationHappy() {
		boolean output = uRegistration.iUserRegestration.userValidation("manikanta@gmail.com",
				UserRegistration.EMAIL_REGEX);
		assertEquals(true, output);
	}

	@Test
	public void emailValidationSad() {
		boolean output = uRegistration.iUserRegestration.userValidation("mani@kanta@gmail.com",
				UserRegistration.EMAIL_REGEX);
		assertEquals(false, output);
	}

	@Test
	public void mobileNumValidationHappy() {
		boolean output = uRegistration.iUserRegestration.userValidation("91 9959965321",
				UserRegistration.MOBILE_NUM_REGEX);
		assertEquals(true, output);
	}

	@Test
	public void mobileNumValidationSad() {
		boolean output = uRegistration.iUserRegestration.userValidation("91 995996", UserRegistration.MOBILE_NUM_REGEX);
		assertEquals(false, output);
	}

	@Test
	public void passwordValidationHappy() {
		boolean output = uRegistration.iUserRegestration.userValidation("Mani@1234", UserRegistration.PASSWORD_REGEX);
		assertEquals(true, output);
	}

	@Test
	public void passwordValidationSad() {
		boolean output = uRegistration.iUserRegestration.userValidation("mani1234", UserRegistration.PASSWORD_REGEX);
		assertEquals(false, output);
	}

	// for exceptions

	@Test(expected = InvalideUserDetailsException.class)
	public void firstNameValidationException() {
		uRegistration.iUserRegestration.userValidation(null, UserRegistration.FIRST_NAME_REGEX);
	}

	@Test(expected = InvalideUserDetailsException.class)
	public void lastNameValidationException() {
		uRegistration.iUserRegestration.userValidation("", UserRegistration.LAST_NAME_REGEX);
	}

	@Test(expected = InvalideUserDetailsException.class)
	public void emailValidationException() {
		uRegistration.iUserRegestration.userValidation(null, UserRegistration.EMAIL_REGEX);
	}

	// for practice tried if it was working or not
	@Test
	public void mobileNumValidationException() {
		try {
			uRegistration.iUserRegestration.userValidation(null, UserRegistration.MOBILE_NUM_REGEX);
		} catch (InvalideUserDetailsException e) {
			e.printStackTrace();
		}
	}

	@Test(expected = InvalideUserDetailsException.class)
	public void passwordValidationException() {
		uRegistration.iUserRegestration.userValidation(null, UserRegistration.PASSWORD_REGEX);

	}

}
