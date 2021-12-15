package com.autoShop;

public class Ford extends Car {
	int year;
	int manufacturerDiscount;
	  
	public Ford(int speed, double salePrice, String color, int year, int manufacturerDiscount) {
		super(speed, salePrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	public double getSalePrice() {
		return regularPrice - regularPrice * (manufacturerDiscount / 100.0);
	}
}


