package com.Interface;

interface Calc{
	public abstract int add(int a, int b);
	public abstract int sub(int a, int b);
	public abstract int div(int a, int b);
	public abstract int mul(int a, int b);
	
}
public class Ex1 implements Calc {
	public int add(int a, int b) {
		System.out.println("Addition");
		return a+b;
	}
	public int sub(int a, int b) {
		System.out.println("Subtraction");
		return a-b;
	}
	public int div(int a, int b) {
		System.out.println("Division");
		return a/b;
	}
	public int mul(int a, int b) {
		System.out.println("Multiplication");
		return a*b;
	}
	
	public static void main(String[] args) {
		
		Ex1 obj = new Ex1();
		System.out.println(obj.add(20, 10));
		System.out.println(obj.sub(20, 10));
		System.out.println(obj.div(20, 10));
		System.out.println(obj.mul(20, 10));
		
	}

}
