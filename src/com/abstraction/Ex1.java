package com.abstraction;

abstract class Payment{
	abstract void pay();
}

class UPI extends Payment{
	void pay() {
		System.out.println("Payment Using UPI");
	}
}
class CreditCard extends Payment{
	void pay() {
		System.out.println("Payment Using CreditCard");
	}
}
class NetBanking extends Payment{
	void pay() {
		System.out.println("Payment Using NetBanking");
	}
}

public class Ex1 {

	public static void main(String[] args) {
		
		Payment P1 = new UPI();
		P1.pay();
		
		Payment P2 = new CreditCard();
		P2.pay();
		
		Payment P3 = new NetBanking();
		P3.pay();
		
		

	}

}
