package com.inheritance;

// Hierarchical Inheritance

class A3 {
	void m1() {
		System.out.println("M1 Method in Class A3");
	}
}

class B3 extends A3 {
	void m2() {
		System.out.println("M2 Method in Class B3");
	}
}

class C3 extends A3{
	void m3() {
		System.out.println("M3 Method in Class C3");
	}
}

public class Ex3 {

	public static void main(String[] args) {

		A3 obj1 = new A3();
		obj1.m1();
		
		System.out.println("\n");
		
		B3 obj2 = new B3();
		obj2.m2();
		obj2.m1();
		
		System.out.println("\n");
		
		C3 obj3 = new C3();
		obj3.m3();
		obj3.m1();
		
	}

}
