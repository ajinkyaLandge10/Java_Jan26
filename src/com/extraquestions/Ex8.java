package com.extraquestions;

public class Ex8 {

	int a = 10;
//	In Java, Singleton is a design pattern that ensures that a class can only have one object.

	public static void main(String[] args) {

//		public class Singleton {
//		    private static Singleton instance;
//		    private Singleton() {} // Private constructor
//
//		    public static Singleton getInstance() {
//		        if (instance == null) {
//		            instance = new Singleton();
//		        }
//		        return instance;
//		    }
//		}

		Ex8 obj = new Ex8();
		System.out.println(obj.a); // 10

		obj.a = 100;

		System.out.println(obj.a); // 100

		Ex8 obj1 = new Ex8();
		System.out.println(obj1.a); // 10

		Ex8 obj2 = new Ex8();
		System.out.println(obj2.a); // 10

	}

}
