package org.logicalProgs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int no = sc.nextInt();
		int temp = 0;

		for (int i = 2; i <= no - 1; i++) {
			if (no % i == 0) {
				temp = temp + 1;
			}
		}

		if (temp > 0) {
			System.out.println(no + " : Is Not a Prime Number");
		} else {
			System.out.println(no + " : Is a Prime Number");
		}

		sc.close();

	}
}
