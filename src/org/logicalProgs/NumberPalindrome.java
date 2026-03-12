package org.logicalProgs;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int no = sc.nextInt();
		int temp = no;
		int rev = 0, rem;

		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		System.out.println("Reverse : "+rev);
		
		if(no==rev) {
			System.out.println("It is Palindrome Number");
		}else {
			System.out.println("Not a Plaindrome Number");
		}
		sc.close();

	}

}
