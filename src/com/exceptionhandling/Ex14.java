package com.exceptionhandling;

import java.util.Scanner;

// custom Exception by using Throw

class YoungerAgeException extends RuntimeException {
	YoungerAgeException(String msg) {
		super(msg);
	}
}

public class Ex14 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		try {
			if (age < 18) {
				throw new YoungerAgeException("You are not Eligible to Vote");
			} else {
				System.out.println("You are Eligible to Vote");
			}
		} catch (YoungerAgeException e) {
			e.printStackTrace();
		}
		
		System.out.println("Hello");

	}

}
