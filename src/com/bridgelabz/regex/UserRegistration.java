package com.bridgelabz.regex;

import java.util.Scanner;

public class UserRegistration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Last Name:");
		String lastName = sc.next();
		userLastName(lastName);

	}
	
	private static void userLastName(String lastName) {

		UserInputValidation.isValidName(lastName);
	}

}
