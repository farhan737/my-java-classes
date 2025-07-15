package com.farhan;

import com.farhan.others.Car2;

public class Lab1507 {
	static void printcarVehicle(Car2 c){
		System.out.println("vehicle type: " + c.vehicleType);
		System.out.println("car type: " + c.carType);
	}
	public static void main(String[] args) {
		Car2 c1 = new Car2(args[0], args[1]);
		printcarVehicle(c1);
	}

}
