package com.inheritance;

// Multiple Inheritance - Diamond ambiguity Problem -  Can be Overcome by Interface

class A4{
	void show() {
		System.out.println("Show Method in class A4");
	}
}
class B4 {
	void show() {
		System.out.println("Show Method in class B4");
	}
}
//class C4 extends A4,B4{   we can't write like this in classes
//	void show() {
//		System.out.println("Show Method in class C4");
//	}
//}
public class Ex4 {

	public static void main(String[] args) {
		

	}

}
