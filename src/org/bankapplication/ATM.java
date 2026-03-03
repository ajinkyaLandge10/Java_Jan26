package org.bankapplication;

public class ATM {

	private static int total_Transactions;
	
	static {
		total_Transactions=0;
		System.out.println("ATM SYSTEM INITIATED");
	}
	
	public static void performTransaction(BankAccount account, String type,double amount) {
		
		switch (type.toLowerCase()) {
		case "withdraw":
			account.withdraw(amount);
			total_Transactions++;
			break;
			
		case "deposit":
			account.deposit(amount);
			total_Transactions++;
			break;

		default:
			System.out.println("Invalid Transaction Type");
			break;
		}
	}
	
	public static void printTransactionSummary() {
		System.out.println("Total Transaction for the day --> "+total_Transactions);
	}
}
