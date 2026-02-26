package com.polymorphism;

public class Ex3 {
//	 Method Overloading

//	 way 1: no of Parameters

	public void add() {
	}

	public int add(int a) {
		return a;
	}

//	 way 2: type of Parameters

	public void add(int a, float b) { // 2
	}

	public int add(long a, char ch) { // 2
		return ch;

	}

//	way 3: Order/Sequence of Parameters

	public void add(byte a, float b) { // 2
	}

	public int add(float b, byte a) { // 2
		return a; 

	}

}
