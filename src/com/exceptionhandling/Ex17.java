package com.exceptionhandling;

import java.util.Scanner;

// Custom Exception Class - for Un-Checked Exceptions - in this for compilation of program no need of try catch

class UnderAgeException extends RuntimeException {

	UnderAgeException() {
		super("You are UnderAge");
	}

	UnderAgeException(String Message) {
		super(Message);
	}
}

public class Ex17 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		try {
			if (age < 19) {
				throw new UnderAgeException("you are Not Eligible To Vote");
			} else {
				System.out.println("you are Eligible To Vote");
			}
		} catch (UnderAgeException e) {
			e.printStackTrace();
		}

		System.out.println("Furthur Execution");
	}

}
