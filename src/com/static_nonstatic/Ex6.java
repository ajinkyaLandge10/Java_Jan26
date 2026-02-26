package com.static_nonstatic;

public class Ex6 {
	
//	static - Nonstatic
	public int b = 20, c = 30;

	public static void main(String[] args) {
		Ex6 obj = new Ex6();
		System.out.println(obj.b);
		System.out.println(obj.c);

		obj.test1();
		obj.test2();
	}

	public void test1() {

	}

	public void test2() {

	}

}
