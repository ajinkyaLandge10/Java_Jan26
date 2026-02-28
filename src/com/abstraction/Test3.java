package com.abstraction;

interface Payment3 {
    void pay(double amount);  
    default void generateReceipt(double amount) {
        System.out.println("Payment of - " + amount + " successful.");
        System.out.println("Thank you for using our service.");
    }
    static boolean validateAmount(double amount) {
        return amount > 0;
    }
}

class UPI3 implements Payment3 {
	@Override
    public void pay(double amount) {
        System.out.println("Paid - " + amount + " using UPI.");
    }
}

class CreditCard3 implements Payment3 {
	@Override
    public void pay(double amount) {
        System.out.println("Paid - " + amount + " using Credit Card.");
    }
}

public class Test3 {
    public static void main(String[] args) {

        double amount = 5000;
        Payment3 p = new UPI3();
        if (Payment3.validateAmount(amount)) {  
            p.pay(amount);
            p.generateReceipt(amount);
            System.out.println("Valid amount");
        } else {
            System.out.println("Invalid amount");
        }
    }
}
