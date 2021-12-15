package com.autoShop;
import com.autoShop.*;

public class MyOwnAutoShop {
	public static void main(String[] args) {
        System.out.println("Welcome To The AutoShop");
        
        Sedan sedan = new Sedan(150, 5000, "blue", 10);
  		System.out.println(" The price of Sedan car is: " + sedan.getSalePrice());
  		
  		Sedan sedan1 = new Sedan(180, 5000, "blue", 50);
  		System.out.println(" The price of Sedan car is: " + sedan1.getSalePrice());
  		
  		System.out.println("===========================================================");
    	
        
		Ford ford1 = new Ford(250, 5000, "blue", 1965, 20);
		System.out.println(" \n The price of Ford car is: " + ford1.getSalePrice());

		Ford ford2 = new Ford(150, 5000, "red", 2002, 10);
		System.out.println(" The price of Ford car is : " + ford2.getSalePrice());
		
		System.out.println("===========================================================");
		
		Truck truck = new Truck(100, 5000, "black", 5000);
		System.out.println(" The price of truck is: " + truck.getSalePrice());
		
		Truck truck1 = new Truck(100, 5000, "black", 1000);
		System.out.println(" The price of truck is: " + truck1.getSalePrice());
		
		System.out.println("===========================================================");
		
		Car car = new Car(250, 5000, "blue");
		System.out.println(" \n Car Price: " + car.getSalePrice());
	}

}
