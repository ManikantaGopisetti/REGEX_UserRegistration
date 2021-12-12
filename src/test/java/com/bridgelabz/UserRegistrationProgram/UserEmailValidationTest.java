package com.bridgelabz.UserRegistrationProgram;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class UserEmailValidationTest {

	String email;
	boolean expected;
	UserRegistration uRegistration;

	public UserEmailValidationTest(String email, boolean expected) {
		super();
		this.email = email;
		this.expected = expected;
	}

	@Parameters
	public static Collection emaiInput() {
		return Arrays.asList(new Object[][] { 
				{ "abc@yahoo.com", true }, 
				{ "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, 
				{ "abc111@abc.com", true }, 
				{ "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, 
				{ "abc@1.com", true }, 
				{ "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, 
				{ "abc", false }, 
				{ "abc@.com.my", false }, 
				{ "abc123@gmail.a", false },
				{ "abc123@.com", false }, 
				{ "abc123@.com.com", false }, 
				{ ".abc@abc.com", false },
				{ "abc()*@gmail.com", false }, 
				{ "abc@%*.com", false }, 
				{ "abc..2002@gmail.com", false },
				{ "abc.@gmail.com", false }, 
				{ "abc@abc@gmail.com", false }, 
				{ "abc@gmail.com.1a", false },
				{ "abc@gmail.com.aa.au", false } });

	}

	@Before
	public void userinit() {
		uRegistration = new UserRegistration();
	}

	@Test
	@Parameters(name = "emailInput()")
	public void emailValidation() {

		boolean output = uRegistration.iUserRegestration.userValidation(email, UserRegistration.EMAIL_REGEX);
		assertEquals(expected, output);
	}

}
