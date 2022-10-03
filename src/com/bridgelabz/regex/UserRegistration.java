package com.bridgelabz.regex;

import java.util.Scanner;

public class UserRegistration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First Name:");
		String firstName = sc.next();
		userFirstName(firstName);
		System.out.println("Enter your Last Name:");
		String lastName = sc.next();
		userLastName(lastName);
		System.out.println("Enter your email");
		String email = sc.next();
		userEmail(email);
		System.out.println("Enter your mobile Number");
		String mobileNumber = sc.next();
		userMobileNumber(mobileNumber);

	}
	
	private static void userFirstName(String firstName) {
		
		UserInputValidation.isValidName(firstName);
		
	}

	private static void userLastName(String lastName) {

		UserInputValidation.isValidName(lastName);
	}
	
	public static void userEmail(String email) {
		
		UserInputValidation.isValidEmail(email);
	}
	
	public static void userMobileNumber(String mobileNumber) {
		
		UserInputValidation.isValidMobileNumber(mobileNumber);
	}

}
