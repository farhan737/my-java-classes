package com.farhan.others;

public class RentalCar extends RentalService {
    int seats;

    public RentalCar(int vehicleNumber, String brand, int basePrice, int seats) {
        super(vehicleNumber, brand, basePrice);
        this.seats = seats;
    }

    public void printDetails() {
        System.out.println("vehicle number: " + super.vehicleNumber);
        System.out.println("vehicle brand: " + super.brand);
        System.out.println("the base price: " + super.basePrice);
        System.out.println("the total seats: " + this.seats);
    } 
}