package com.extraquestions;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a");
		int a = scan.nextInt();
		System.out.println("Enter b");
		int b = scan.nextInt();

		int add = a + b;
		System.out.println("Addition is : "+add);
	}

}
