package com.abstraction;

abstract class Animal {

	public abstract void animalSound();

	public void sleep() {
		System.out.println("Zzz");
	}
}

class Pig extends Animal {

	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}

	public void Run() {
		System.out.println("The pig is Running");
	}
}

public class Ex6 {

	public static void main(String[] args) {

		Pig p = new Pig();
		p.sleep();
		p.animalSound();
		p.Run();
	}

}
