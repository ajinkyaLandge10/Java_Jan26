package com.static_nonstatic;

public class Ex7 {
	
//	Nonstatic - static
	public static int b = 20, c = 30;

	public static void main(String[] args) {

	}

	public void test1() {
		System.out.println(Ex7.b);
		System.out.println(Ex7.c);

		Ex7.test2();
	}

	public static void test2() {

	}

}
