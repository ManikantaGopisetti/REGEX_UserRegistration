package com.bridgelabz.UserRegistrationProgram;

import java.util.Scanner;

public class UserRegistrationApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first name : ");
		String firstName = sc.nextLine(); // reading input
		System.out.print("Enter last name : ");
		String lastName = sc.nextLine();

		UserRegistration userRegistration = new UserRegistration();
		userRegistration.firstNameValidation(firstName); // validating first name
		userRegistration.lastNameValidation(lastName);
		sc.close();

	}

}
