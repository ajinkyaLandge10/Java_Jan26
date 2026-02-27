package com.abstraction;

abstract class Vehicle {
	abstract void start(); // abstract method
	void fuelType() { // normal method
		System.out.println("Petrol or Diesel");
	}
}

class Car extends Vehicle {
	void start() {
		System.out.println("Car starts with key");
	}
}

public class Ex2 {
	public static void main(String[] args) {
		Vehicle v = new Car(); // runtime poly-morphism
		v.start();
		v.fuelType();
	}

}
