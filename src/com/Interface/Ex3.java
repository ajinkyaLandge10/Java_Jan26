package com.Interface;

interface I1 {
	 public int MARKS = 10;	
	 public void test();
}

public class Ex3 implements I1 {

	public void test() {
		System.out.println("Test Method is implemnted");
		
	}
	public static void main(String[] args) {

		System.out.println(I1.MARKS);
		Ex3 obj = new Ex3();
		obj.test();

	}
	

}
