package org.assignments;

class A {
	int i = 10;

	void m1() {
		System.out.println("Class A Method");
	}

	A() {
		System.out.println("Class A Constructor");
	}
}

class B extends A {
	int i = 20;

	void m1() {
		System.out.println("Class B Method");
	}

	B(int a) {
		System.out.println("Class B-1st Constructor");
	}

	B() {
// super();
		this(10);
		System.out.println("Class B-2nd Constructor");
	}

	void show(int i) {
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
		this.m1();
		super.m1();
	}
}

public class Assignment_5 {
	public static void main(String[] args) {
		B obj = new B();
		obj.show(30);
	}
}
