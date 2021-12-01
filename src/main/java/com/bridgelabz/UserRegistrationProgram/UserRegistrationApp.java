package com.bridgelabz.UserRegistrationProgram;

import java.util.Scanner;

public class UserRegistrationApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first name : ");
		String firstName = sc.nextLine(); // reading input

		UserRegistration userRegistration = new UserRegistration();
		userRegistration.firstNameValidation(firstName); // validating first name
		sc.close();

	}

}
