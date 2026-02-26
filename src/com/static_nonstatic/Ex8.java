package com.static_nonstatic;

public class Ex8 {

//	Nonstatic - Nonstatic
	public int b = 20, c = 30;

	public static void main(String[] args) {

	}

	public void test1() {
		System.out.println(this.b);
		System.out.println(this.c);

		this.test2();

	}

	public void test2() {

	}

}
