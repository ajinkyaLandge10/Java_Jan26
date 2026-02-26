package com.loops_Part2;

public class Ex2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { // no of rows
			for (int k = 5; k > i; k--) { // no of spaces
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) { // no of *
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
