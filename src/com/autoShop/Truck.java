package com.autoShop;

public class Truck extends Car {
	int weight;
    double amount;

    public Truck(int speed, double regularPrice, String color,int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}
    
    public double getSalePrice() {
        double salePrice , discount;

        if(weight> 2000) {
            System.out.println("\n Truck's weight is greater than 2000: 10% discount");
            discount = regularPrice * 10/100;
            System.out.println("Discount amount is : " + discount);

        }
        else {
            System.out.println("\n Truck has a discount of 20% discount");
            discount = regularPrice * 20/100;
            System.out.println("Discount amount is : " + discount);

        }
        salePrice = regularPrice - discount;
        return salePrice;
    }
}
