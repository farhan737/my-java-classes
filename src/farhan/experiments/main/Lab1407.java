package farhan.experiments.main;

import farhan.experiments.ElectricCar;

public class Lab1407 {
	static void printCar(ElectricCar c) {
		System.out.println("the vehicle type: " + c.type);
		System.out.println("the vehicle brand: " + c.brand);
		System.out.println("the vehicle range: " + c.batteryCapacity);
	}
	public static void main(String[] args) {
		ElectricCar c1 = new ElectricCar("Car", "tesla", 300);
		printCar(c1);
	}

}
