package com.accessspecifier1;

public class Ex1 {

	public void publicMethod()
	{

	}
 void defaultMethod()
	{

	}
private void privateMethod()
	{

	}
protected void protectedMethod()
	{

	}

	public static void main(String[] args) {
		Ex1 obj = new Ex1();
		obj.privateMethod();			//within the class
		obj.protectedMethod();	    // within the package and sub class of diff package
		obj.publicMethod();			// access anywhere
		obj.defaultMethod();			// within the same package
	}

}
