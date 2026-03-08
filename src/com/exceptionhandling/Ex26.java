package com.exceptionhandling;

public class Ex26 {
	public static void main(String[] args) {

		try {
			for (int i = 1; i <= 10; i++) {
				if (i == 5) {
					Thread.sleep(2000);
				}
				System.out.println(i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Always executed");
		}
	}
}
