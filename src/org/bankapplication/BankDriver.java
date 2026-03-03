package org.bankapplication;

public class BankDriver {

	public static void main(String[] args) {
		
		BankAccount saving =new SavingsAccount("261994", "Ajinkya", 10000.00);
		
		System.out.println("-------Display Balance-------");
		saving.displayBalance();
		
		System.out.println("\n");
		
		System.out.println("-------Deposit Operation-------");
		ATM.performTransaction(saving, "deposit", 900);
		saving.displayBalance();
		
		System.out.println("\n");
		
		System.out.println("-------Withdrawl Operation-------");
		ATM.performTransaction(saving, "withdraw", 9000);
		saving.displayBalance();
		
		System.out.println("\n");
		
		ATM.printTransactionSummary();
	}

}
