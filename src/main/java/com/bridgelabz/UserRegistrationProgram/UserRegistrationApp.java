package com.bridgelabz.UserRegistrationProgram;

import java.util.Scanner;

public class UserRegistrationApp {

	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first name : ");
		String firstName = sc.nextLine(); // reading input
		userRegistration.firstNameValidation(firstName); // validating first name
		System.out.print("Enter last name : ");
		String lastName = sc.nextLine();
		userRegistration.lastNameValidation(lastName);
		System.out.print("Enter email id: ");
		String email = sc.nextLine();
		userRegistration.emailValidation(email);
		System.out.print("Enter mobile number : ");
		String mobileNum = sc.nextLine();
		userRegistration.mobileNumValidation(mobileNum);
		System.out.print("Enter password : ");
		String password = sc.nextLine();
		userRegistration.passwordValidation(password);
		
		sc.close();

	}

}
