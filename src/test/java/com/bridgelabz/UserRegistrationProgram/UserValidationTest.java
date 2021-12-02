package com.bridgelabz.UserRegistrationProgram;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserValidationTest {
	
	@Test
	public void firstNameValidationHappy(){
		UserRegistration uRegistration = new UserRegistration();
		boolean output=uRegistration.firstNameValidation("Manikanta");
		assertEquals(true, output);
	}
	
	@Test
	public void firstNameValidationsad(){
		UserRegistration uRegistration = new UserRegistration();
		boolean output=uRegistration.firstNameValidation("man");
		assertEquals(false, output);
	}
	
	@Test
	public void lastNameValidationHappy(){
		UserRegistration uRegistration = new UserRegistration();
		boolean output=uRegistration.lastNameValidation("Man");
		assertEquals(true, output);
	}
	
	@Test
	public void lastNameValidationsad(){
		UserRegistration uRegistration = new UserRegistration();
		boolean output=uRegistration.lastNameValidation("manikanta");
		assertEquals(false, output);
	}
	
	@Test
	public void emailValidationHappy(){
		UserRegistration uRegistration = new UserRegistration();
		boolean output=uRegistration.emailValidation("manikanta@gmail.com");
		assertEquals(true, output);
	}
	
	@Test
	public void emailValidationSad(){
		UserRegistration uRegistration = new UserRegistration();
		boolean output=uRegistration.emailValidation("mani@kanta@gmail.com");
		assertEquals(false, output);
	}
	
	@Test
	public void mobileNumValidationHappy(){
		UserRegistration uRegistration = new UserRegistration();
		boolean output=uRegistration.mobileNumValidation("91 9959965321");
		assertEquals(true, output);
	}
	
	@Test
	public void mobileNumValidationSad(){
		UserRegistration uRegistration = new UserRegistration();
		boolean output=uRegistration.mobileNumValidation("91 995996");
		assertEquals(false, output);
	}
	
	@Test
	public void passwordValidationHappy(){
		UserRegistration uRegistration = new UserRegistration();
		boolean output=uRegistration.passwordValidation("Mani@1234");
		assertEquals(true, output);
	}
	
	@Test
	public void passwordValidationSad(){
		UserRegistration uRegistration = new UserRegistration();
		boolean output=uRegistration.passwordValidation("mani1234");
		assertEquals(false, output);
	}

}
