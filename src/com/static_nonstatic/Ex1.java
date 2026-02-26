package com.static_nonstatic;

public class Ex1 {

	public int a = 10; // Non-static variable
	public static int b = 20; // static variable

	public static void main(String[] args) {

	}

	public static void test1() { // Static method
		System.out.println("test1");
	}

	public void test2() { // Non-Static method
		System.out.println("test2");
	}

	public static void test3() { // Static method
		System.out.println("test3");
	}

	public void test4() { // Non -Static method
		System.out.println("test4");
	}
}
