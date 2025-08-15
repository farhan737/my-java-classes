package farhan.experiments.main;

import java.util.Scanner;

import farhan.experiments.UberDriver;

public class Lab1508 extends UberDriver {
	static Scanner sc = new Scanner(System.in);

	void setDriver() {
		System.out.println("enter driver name: ");
		setdName(sc.nextLine());
		System.out.println("enter vehicle details: ");
		setdVehicleDetails(sc.nextLine());
	}

	void giveRating() {
		System.out.println("rate the driver(1 - 5): ");
		setdRating(sc.nextInt());
	}

	void displayDriver() {
		System.out.println("driver name: " + getdName());
		System.out.println("vehicle details: " + getdVehicleDetails());
		System.out.println("driver rating: " + getdRating());
	}

	public static void main(String[] args) {
		Lab1508 d1 = new Lab1508();
		d1.setDriver();
		d1.giveRating();
		d1.displayDriver();
	}

}
