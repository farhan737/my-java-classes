package com.farhan.others;

public class ElectricCar extends Car {
	public int batteryCapacity;

	public ElectricCar(String type, String brand, int batteryCapacity) {
		super(type, brand);
		this.batteryCapacity = batteryCapacity;
	}
}
