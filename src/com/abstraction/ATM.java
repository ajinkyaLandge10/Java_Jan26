package com.abstraction;
// ATM Machine

interface ATMOperations {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}
class Account implements ATMOperations {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
public class ATM {

	public static void main(String[] args) {
		Account acc = new Account(5000);
        acc.deposit(1000);
        acc.withdraw(6000);
        acc.checkBalance();

	}

}
