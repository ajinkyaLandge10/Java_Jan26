package com.exceptionhandling;

public class Ex24 {
	public static void main(String[] args) {

		try {
			for (int i = 1; i < 20; i++) {
				if (i == 10) {
					break;
				}
				System.out.println(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Always executed");
		}
	}
}
