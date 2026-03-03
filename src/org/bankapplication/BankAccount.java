package org.bankapplication;

public abstract class BankAccount {

	
	protected String accountNumber;
	protected String holderName;
	protected double balance;

	public BankAccount(String accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	public abstract void withdraw(double amount);
	public abstract void deposit(double amount);
	public void displayBalance() {
		System.out.println("Account Number --> " +accountNumber);
		System.out.println("Holder Name --> " +holderName);
		System.out.println("Current Balance --> "+balance);
	}

}
