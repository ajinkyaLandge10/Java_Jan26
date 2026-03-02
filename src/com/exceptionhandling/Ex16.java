package com.exceptionhandling;

import java.util.Scanner;

// Custom Exception Class - for Checked Exceptions

class underAgeException extends Exception {

	underAgeException() {
		super("You are UnderAge");
	}

	underAgeException(String Message) {
		super(Message);
	}
}

public class Ex16 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		try {
			if (age < 18) {
				throw new underAgeException("you are Not Eligible To Vote");
			} else {
				System.out.println("you are Eligible To Vote");
			}
		} catch (underAgeException e) {
			e.printStackTrace();
		}

		System.out.println("Furthur Execution");

	}

}
