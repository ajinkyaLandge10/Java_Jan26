package com.polymorphism;

// CompileTime Poly-Morphism - Method Overloading/Early Binding/Static Binding
//   In same Class
//    - Method name should be same
//    - Number,Type & Sequence Of parameter Should be Different

class Test {

	void m1() {
		System.out.println("1");
	}

	void m1(int a ) {
		System.out.println("2");
	}

	void m1(int a, String str ) {
		System.out.println("3");
	}
	
	void m1(String str,int a ) {
		System.out.println("4");
	}
}

public class Ex1 {

	public static void main(String[] args) {
		
		Test T = new Test();
		T.m1();
		T.m1(10);
		T.m1(10, "ABC");
		T.m1("ABC", 10);

	}

}
