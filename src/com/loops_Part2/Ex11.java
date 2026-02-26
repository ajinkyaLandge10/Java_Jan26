package com.loops_Part2;

public class Ex11 {

	public static void main(String[] args) {
		int k = 1;
		do {
			if (k == 5) { // 1==5?
				k++;
				continue;
			}
			System.out.println(k); // 1 , 2
			k++; // 1 || 2 || 3
		} while (k <= 10); // 2<=10? || 3<=10?
	}

}
