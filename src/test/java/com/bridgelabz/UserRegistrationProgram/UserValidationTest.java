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
	
	//for Happy and Sad

	@Test
	public void firstNameValidationHappy() {
		boolean output = uRegistration.firstNameValidation("Manikanta");
		assertEquals(true, output);
	}

	@Test
	public void firstNameValidationsad() {
		boolean output = uRegistration.firstNameValidation("man");
		assertEquals(false, output);
	}

	@Test
	public void lastNameValidationHappy() {
		boolean output = uRegistration.lastNameValidation("Man");
		assertEquals(true, output);
	}

	@Test
	public void lastNameValidationsad() {
		boolean output = uRegistration.lastNameValidation("manikanta");
		assertEquals(false, output);
	}

	@Test
	public void emailValidationHappy() {
		boolean output = uRegistration.emailValidation("manikanta@gmail.com");
		assertEquals(true, output);
	}

	@Test
	public void emailValidationSad() {
		boolean output = uRegistration.emailValidation("mani@kanta@gmail.com");
		assertEquals(false, output);
	}

	@Test
	public void mobileNumValidationHappy() {
		boolean output = uRegistration.mobileNumValidation("91 9959965321");
		assertEquals(true, output);
	}

	@Test
	public void mobileNumValidationSad() {
		boolean output = uRegistration.mobileNumValidation("91 995996");
		assertEquals(false, output);
	}

	@Test
	public void passwordValidationHappy() {
		boolean output = uRegistration.passwordValidation("Mani@1234");
		assertEquals(true, output);
	}

	@Test
	public void passwordValidationSad() {
		boolean output = uRegistration.passwordValidation("mani1234");
		assertEquals(false, output);
	}
	
	
	//for exceptions

	@Test(expected = InvalideUserDetailsException.class)
	public void firstNameValidationException() {
		boolean output = uRegistration.firstNameValidation(null);
		assertEquals(true, output);
	}

	@Test(expected = InvalideUserDetailsException.class)
	public void lastNameValidationException() {
		boolean output = uRegistration.lastNameValidation("");
		assertEquals(true, output);
	}

	@Test(expected = InvalideUserDetailsException.class)
	public void emailValidationException() {
		boolean output = uRegistration.emailValidation(null);
		assertEquals(true, output);
	}

	// for practice tried if it was working or not
	@Test
	public void mobileNumValidationException() {
		try {
			boolean output = uRegistration.mobileNumValidation(null);
			assertEquals(true, output);
		} catch (InvalideUserDetailsException e) {
			e.printStackTrace();
		}
	}

	@Test(expected = InvalideUserDetailsException.class)
	public void passwordValidationException() {
			boolean output = uRegistration.passwordValidation(null);
			assertEquals(true, output);
	}

}
