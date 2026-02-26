package com.polymorphism;

public class BankAcct {

	private double balance = 0;

	public void deposit(double amount) {
		balance += amount;
	}

	public void deposit(double amount, String chequeNumber) {
		balance += amount;
	}

	public void deposit(double amount, String chequeNumber, String bankName) {
		balance += amount;
	}

	public void showBalance() {
		System.out.println("Balance return");
	}

	public static void main(String[] args) {

		// calling via object creation
	}

}
