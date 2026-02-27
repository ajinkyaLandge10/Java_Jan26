package com.abstraction;

abstract class Bank1 {
    protected double principal;
    protected int time;   // in years
    
    Bank1(double principal, int time) {   // Constructor
        this.principal = principal;
        this.time = time;
    }
    abstract double calculateInterest();
    double calculateTotalAmount() {
        return principal + calculateInterest();
    }
}

class SBI1 extends Bank1 {
    private double rate;
    SBI1(double principal, int time, double rate) {
        super(principal, time);
        this.rate = rate;
    }
    double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

class HDFC1 extends Bank1 {
    private double rate;
    HDFC1(double principal, int time, double rate) {
        super(principal, time);
        this.rate = rate;
    }
    double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}
public class Test1 {
	public static void main(String[] args) {
		Bank1 sbi = new SBI1(100000, 2, 6.5);
        System.out.println("SBI Interest: " + sbi.calculateInterest());
        System.out.println("SBI Total Amount: " + sbi.calculateTotalAmount());

        System.out.println("------------------------");

        Bank1 hdfc = new HDFC1(100000, 2, 7.2);
        System.out.println("HDFC Interest: " + hdfc.calculateInterest());
        System.out.println("HDFC Total Amount: " + hdfc.calculateTotalAmount());
	}

}
