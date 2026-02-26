package com.loops_Part2;

public class Ex3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { // no of rows
			for (int j = 5; j >= i; j--) { // no of *
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
