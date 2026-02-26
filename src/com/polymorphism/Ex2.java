package com.polymorphism;

//RunTime Poly-Morphism - Method Overriding/Late Binding/Dynamic Binding
//In Different Class
//- Method name should be same
//- Number,Type & Sequence Of parameter Should also be same
//- Inheritance should be used

class A{
	void m1() {
		System.out.println("M1 Method in Class A");
	}
}
class B extends A{
	@Override
	void m1() {
		System.out.println("M1 Method in Class B");
	}
	void m2() {
		System.out.println("M2 Method in Class B");
	}
}


public class Ex2 {

	public static void main(String[] args) {
		
		A obj1 = new A();
		obj1.m1();
		
		System.out.println("\n");
		
		B obj2 = new B();
		obj2.m1();
		obj2.m2();

	}

}
