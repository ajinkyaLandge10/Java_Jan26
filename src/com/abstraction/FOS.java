package com.abstraction;

// Food Ordering System

abstract class FoodItem {
    protected String name;
    protected double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract double calculatePrice();
}
class VegItem extends FoodItem {

    public VegItem(String name, double price) {
        super(name, price);
    }

    double calculatePrice() {
        return price;
    }
}
class NonVegItem extends FoodItem {

    public NonVegItem(String name, double price) {
        super(name, price);
    }

    double calculatePrice() {
        return price + 20;  // extra charge
    }
}
public class FOS {

	public static void main(String[] args) {
		FoodItem f1 = new VegItem("Paneer", 200);
        FoodItem f2 = new NonVegItem("Chicken", 250);

        System.out.println("Veg Price: " + f1.calculatePrice());
        System.out.println("NonVeg Price: " + f2.calculatePrice());

	}

}
