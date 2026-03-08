package com.extraquestions;

class Harshal {
	String name;
	public void speak() {
		System.out.println(1);
	}
}

class Deepak extends Harshal {
	int age;
	public void study() {
		System.out.println(2);
	}
}

public class Ex4 {

	public static void main(String[] args) {
		// upcasting
		Harshal h = new Deepak();
		h.name = "Abc";

		// downcasting
		Deepak d = (Deepak) h;
		d.age = 20;

		System.out.println(d.age);
		System.out.println(d.name);

		d.study();
		d.speak();

		// unsafe
//		Person p1 = new Person();
//		Student s1 = (Student)p1;
	}

}
