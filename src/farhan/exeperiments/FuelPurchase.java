package farhan.exeperiments;

import java.util.Scanner;

public class FuelPurchase {
	String vehicleNumber;
	double petrol;
	double diesel;
	double pCost = 100;
	double dCost = 104;
	static Scanner sc = new Scanner(System.in);

	public FuelPurchase() {
		System.out.println("welcome to the fuel pump");
		System.out.println("enter vehicle number: ");
		vehicleNumber = sc.nextLine();
		System.out.println("enter petrol amount: ");
		petrol = sc.nextDouble();
		System.out.println("enter diesel amount: ");
		diesel = sc.nextDouble();
		printBill();
	}

	void printBill() {
		System.out.println("petrol amount purchased: " + petrol);
		System.out.println("diesel amount purchased: " + diesel);
		System.out.println("petrol cost: " + petrol * pCost);
		System.out.println("diesel cost: " + diesel * dCost);
	}
}
