package com.polymorphism;

class Animal1 {

	public void makesound() {
		System.out.println("Animal makes sound");
	}

	public void sleep() {
		System.out.println("Animal sleeping");
	}
}

class Dog1 extends Animal1 {
	
	@Override
	public void makesound() {
		System.out.println("Dog1 makes sound");
	}
	@Override
	public void sleep() {
		System.out.println("Dog1 sleeping");
	}
}

public class Ex5 {

	public static void main(String[] args) {

//		parent reference
		Animal1 A1 = new Animal1();
		A1.makesound();
		A1.sleep();

//		child reference 
		Dog1 D1 = new Dog1();
		D1.makesound();
		D1.sleep();

//		using parent reference , child object(Up-casting)
		Animal1 A2 = new Dog1();
		A2.makesound();
		A2.sleep();

	}
}
