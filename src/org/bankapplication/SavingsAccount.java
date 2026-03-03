package org.bankapplication;

public class SavingsAccount extends BankAccount {

	
	private static final double MIN_BALANCE = 500;

	public SavingsAccount(String accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);

	}

	@Override
	public void withdraw(double amount) {
		if (balance - amount >= MIN_BALANCE) {
			balance = balance - amount;
			System.out.println("Withdrawl amount of " + amount + " is Sucessful");
		} else {
			System.out.println("Insufficient Funds");
		}

	}

	@Override
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposited --> " + amount  + " in your Account");

	}

}
