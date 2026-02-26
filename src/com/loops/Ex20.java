package com.loops;

public class Ex20 {

	public static void main(String[] args) {

		for (char i = 'A'; i <= 'C'; i++) {
			for (char ch = 'A'; ch < 'C'; ch++) {
				System.out.print(i + " : " + (int) ch + " ");
			}
			System.out.println();
		}

		System.out.println("--------------------------");

		for (char ch = 'A'; ch <= 'C'; ch++) {
			System.out.print(ch + "   ");
		}
		System.out.println();
		for (char i = 'A'; i < 'C'; i++) {
			for (char ch = 'A'; ch <= 'C'; ch++) {
				System.out.print((int) i + "  ");
			}
			System.out.println();
		}
	}

}
