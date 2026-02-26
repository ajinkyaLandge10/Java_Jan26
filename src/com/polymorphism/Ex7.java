package com.polymorphism;

class Test1 {

	public int add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
		return sum;
	}
}

public class Ex7 extends Test1 {

	public static void main(String[] args) {

	}

	// overriding //IS-A child-parent
	@Override
	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	// overloading
	public int add(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}

}
