package com.accessspecifier1;

public class Ex2 {

	public static void main(String[] args) {
			Ex1 obj1 = new Ex1();
			obj1.protectedMethod(); 	//Accessible within the package + ?
			obj1.publicMethod();		//Accessible anywhere
			obj1.defaultMethod();		// Accessible within the package
//			obj.privatemethod();    //Accessible within the class
	}

}
