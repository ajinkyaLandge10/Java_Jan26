package com.inheritance;

// Hybrid Inheritance - Diamond ambiguity Problem -  Can be Overcome by Interface

class A5{
	void m1() {
		System.out.println("M1 Method in Class A5");
	}
}
class B5 extends A5{
	void m2() {
		System.out.println("M2 Method in Class B5");
	}	
}
class C5 extends A5{
	void m3() {
		System.out.println("M3 Method in Class C5");
	}	
}
//class D5 extends B5,C5{
//	void m4() {
//		System.out.println("M4 Method in Class D5");
//	}
//}


public class Ex5 {

	public static void main(String[] args) {
		
	}

}
