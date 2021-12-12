//package com.bridgelabz.UserRegistrationProgram;
//
//import java.util.Scanner;
//
//public class UserRegistrationApp {
//
//	public static void main(String[] args) {
//		UserRegistration userRegistration = new UserRegistration();
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter first name : ");
//		String firstName = sc.nextLine(); // reading input
//		userRegistration.iUserRegestration.userValidation(firstName, UserRegistration.FIRST_NAME_REGEX);
//		System.out.print("Enter last name : ");
//		String lastName = sc.nextLine();
//		userRegistration.iUserRegestration.userValidation(lastName, UserRegistration.LAST_NAME_REGEX);
//		System.out.print("Enter email id: ");
//		String email = sc.nextLine();
//		userRegistration.iUserRegestration.userValidation(email, UserRegistration.EMAIL_REGEX);
//		System.out.print("Enter mobile number : ");
//		String mobileNum = sc.nextLine();
//		userRegistration.iUserRegestration.userValidation(mobileNum, UserRegistration.MOBILE_NUM_REGEX);
//		System.out.print("Enter password : ");
//		String password = sc.nextLine();
//		userRegistration.iUserRegestration.userValidation(password, UserRegistration.PASSWORD_REGEX);
//
//		sc.close();
//
//	}
//
//}
