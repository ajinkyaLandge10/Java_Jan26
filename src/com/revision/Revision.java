package com.revision;


public class Revision {

	 int a =10;
	 static int b = 20;
	 
	 public static void test1() {
		 System.out.println("static method");
	 }
	 
	 public void test2() {
		 System.out.println("Non static method");
	 }
	 
	public static void main(String[] args) {
		
		Revision obj =new Revision();
		obj.test2();
		Revision.test1();
		System.out.println(obj.a);
		System.out.println(Revision.b);
		
		

	}

}
