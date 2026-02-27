package com.abstraction;

abstract class Vehicle1 {
	abstract void accelerate();
	abstract void brakes();
	int wheels;
	
	void horn() {
		System.out.println("Vehicle Honks");
	}
}

class Car1 extends Vehicle1 {
	@Override
	void accelerate() {
		System.out.println("Car is Accelerating");

	}
	@Override
	void brakes() {
		System.out.println("Car breakes are pushed");
	}
	@Override
	void horn() {
		System.out.println("Car Honks");
	}
	void Wheels(int w) {
		this.wheels=w;
		System.out.println("Car has -: " + this.wheels +" Wheels ");
	}

}
class Truck extends Vehicle1 {
	@Override
	void accelerate() {
		System.out.println("Truck is Accelerating");

	}
	@Override
	void brakes() {
		System.out.println("Truck breakes are pushed");
	}
	@Override
	void horn() {
		System.out.println("Truck Honks");
	}
	void Wheels(int w) {
		this.wheels=w;
		System.out.println("Truck has -: " + this.wheels +" Wheels ");
	}

}
class Rickshaw extends Vehicle1 {
	@Override
	void accelerate() {
		System.out.println("Rickshaw is Accelerating");

	}
	@Override
	void brakes() {
		System.out.println("Rickshaw breakes are pushed");
	}
	@Override
	void horn() {
		System.out.println("Rickshaw Honks");
	}
	void Wheels(int w) {
		this.wheels=w;
		System.out.println("Rickshaw has -: " + this.wheels +" Wheels ");
	}

}

public class Ex3 {

	public static void main(String[] args) {

		Car1 c1 = new Car1();
		c1.Wheels(4);
		c1.accelerate();
		c1.horn();
		c1.brakes();
		
		System.out.println("\n");
		
		Truck t1 = new Truck();
		t1.Wheels(6);
		t1.accelerate();
		t1.horn();
		t1.brakes();
	
		System.out.println("\n");
		
		Rickshaw r1 = new Rickshaw();
		r1.Wheels(3);
		r1.accelerate();
		r1.horn();
		r1.brakes();
		

	}

}
