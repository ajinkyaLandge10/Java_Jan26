package com.abstraction;

class Test_1{
	int a = 10;
	void m1() {
		System.out.println("m1 method in class Test1");
	}
}
class Test_2{
	int a = 20;
	void m1() {
		System.out.println("m1 method in class Test2");
	}
}

class Extend{
	
	Test_1 T1 = new Test_1();
	Test_2 T2 = new Test_2();
}


public class Ex4 {

	public static void main(String[] args) {

		Extend E = new Extend();
		System.out.println(E.T1.a); 
		E.T1.m1();
		
		System.out.println(E.T2.a); 
		E.T2.m1();
		
		

	}

}
