package com.abstraction;

//		Create:
//			- An abstract class Bank
//			- Abstract method calculateInterest()
//			- Two child classes: SBI, HDFC
//			- Use different interest logic

abstract class Bank {
	double principal = 100000;
	int time = 1; // 1 years

	abstract double calculateInterest(); // abstract method

	void displayBankName() {
		System.out.println("Welcome to Bank");
	}
}

class SBI extends Bank {
	double rate = 6.5; // 6.5%

	double calculateInterest() {
		return (principal * rate * time) / 100;
	}
}

class HDFC extends Bank {
	double rate = 7.2; // 7.2%

	double calculateInterest() {
		return (principal * rate * time) / 100;
	}
}

public class Test {
	public static void main(String[] args) {

		Bank bank1 = new SBI();
		System.out.println("SBI Interest: " + bank1.calculateInterest());

		Bank bank2 = new HDFC();
		System.out.println("HDFC Interest: " + bank2.calculateInterest());
	}

}
