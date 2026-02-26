package com.inheritance;

// Multi-Level Inheritance

class A2 {
	void m1() {
		System.out.println("M1 Method in Class A2");
	}
}

class B2 extends A2 {
	void m2() {
		System.out.println("M2 Method in Class B2");
	}
}

class C2 extends B2 {
	void m3() {
		System.out.println("M3 Method in Class C2");
	}
}

public class Ex2 {

	public static void main(String[] args) {

		A2 obj1 = new A2();
		obj1.m1();
		
		System.out.println("\n");
		
		B2 obj2 = new B2();
		obj2.m2();
		obj2.m1();

		System.out.println("\n");
		
		C2 obj3 = new C2();
		obj3.m3();
		obj3.m2();
		obj3.m1();
	}

}
