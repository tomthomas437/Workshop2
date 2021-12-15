package com.autoShop;

public class Sedan extends Car {
	    int length;
	    double amount;

	    public Sedan (int speed, double regularPrice, String color, int length) {
	        super(speed, regularPrice, color);
	        this.length = length;

	    }
	    public double getSalePrice() {
	        double discount, salePrice;
	        if(length>20) {
	            System.out.println("\n Sedan's length is greater than 20 feet: 5% discount:");
	            discount = regularPrice *5 /100;
	            System.out.println("Discount amount is : " + discount);

	        }
	        else {
	            System.out.println("\n Sedan has a discount of 10% discount:");
	            discount = regularPrice * 10/100;
	            System.out.println("Discount amount is : " + discount);

	        }
	        salePrice = regularPrice -discount;
	        return salePrice;
	    }
}
