package com.bridgelabz.regex;

import java.util.Scanner;

public class UserRegistration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First Name:");
		String firstName = sc.next();
		userFirstName(firstName);

	}

	private static void userFirstName(String firstName) {

		UserInputValidation.isValidName(firstName);
	}

}
