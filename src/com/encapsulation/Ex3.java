package com.encapsulation;

class A {
	private int a = 10, b = 20;

	private void test1() {
		System.out.println("test1");
	}
	public void test2() {
		System.out.println("test2");
		test1();
	}

}

public class Ex3 {
	public static void main(String[] args) {

		// a, b , test1()

		A obj = new A();
		obj.test2(); // indirectly access the private data test1()

	}

}

//concept: we used public methods to access the private data indirectly
//data hiding

