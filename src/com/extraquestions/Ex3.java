package com.extraquestions;

class Person {
	public void speak() {
		System.out.println("Person - Speaking");
	}
}

class Student extends Person {
	public void study() {
		System.out.println("Student - Studying");
	}
}

public class Ex3 {

	public static void main(String[] args) {
		// upcasting
		Person p = new Student();

		// downcasting
		Student s = (Student) p;

		s.speak();
		s.study();

		// unsafe
//		Person p1 = new Person();
//		Student s1 = (Student)p1;
	}

}
