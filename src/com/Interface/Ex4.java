package com.Interface;

interface Animal {
	public void sound();
}

abstract class Monkey {
	public abstract void walk();

	public void jump() {
		System.out.println("Monkey is Jumping");
	}
}

class Dog extends Monkey implements Animal {
	public void sound() {
		System.out.println("Dog is Barking");

	}

	public void walk() {
		System.out.println("Dog is Walking");
	}
}

public class Ex4 {
	public static void main(String[] args) {

		Dog obj = new Dog();
		obj.sound();
		obj.walk();
		obj.jump();

	}

}
