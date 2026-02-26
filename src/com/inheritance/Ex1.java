package com.inheritance;

// Single Level Inheritance

class A1 {
	void m1() {
		System.out.println("M1 Method in Class A1");
	}
}

class B1 extends A1 {
	void m2() {
		System.out.println("M2 Method in Class B1");
	}
}

public class Ex1 {

	public static void main(String[] args) {

		A1 obj1 = new A1();
		obj1.m1();
		
		System.out.println("\n");
		
		B1 obj2 = new B1();
		obj2.m1();
		obj2.m2();

	}

}
