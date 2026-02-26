package com.loopingstatement;

public class ForLoops {

	public static void main(String[] args) {

		// Print 1 to 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("----------Even Numbers--------------");
//		print Even numbers between 1 to 10
		for (int i = 2; i <= 10; i = i + 2) {
			System.out.println(i);
		}

		System.out.println("----------Odd Numbers---------------");
//		print Odd numbers between 1 to 10
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println(i);
		}

	}

}
