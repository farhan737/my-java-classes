package farhan.experiments;

import java.util.Scanner;

public class FoodRestaurant {
	static Scanner sc = new Scanner(System.in);
	double bill;
	double sIndian1 = 60; // Masala Dosa
	double sIndian2 = 70; // Sambar Idli
	double sIndian3 = 140; // Hyderabadi Biryani

	double nIndian1 = 200; // Butter Chicken
	double nIndian2 = 150; // Paneer Tikka
	double nIndian3 = 100; // Chole Bhature

	double chinese1 = 120; // Hakka Noodles
	double chinese2 = 140; // Manchurian
	double chinese3 = 110; // Fried Rice

	double comboOffer = 0;
	double discountOffer = 0;

	int s1Count, s2Count, s3Count;
	int n1Count, n2Count, n3Count;
	int c1Count, c2Count, c3Count;

	void greetCuisine() {
		System.out.println("*".repeat(10) + "WELCOME TO VCUBE RESTAURANT" + "*".repeat(10));
		System.out.println("1. SOUTH INDIAN\n2. NORTH INDIAN\n3. CHINESE\n4. FINAL BILL\n5. EXIT");
	}

	void selectType() {
		while (true) {
			greetCuisine();
			System.out.print("Select cuisine (1-5): ");
			int n = sc.nextInt();
			switch (n) {
			case 1 -> sIndianBill();
			case 2 -> nIndianBill();
			case 3 -> chineseBill();
			case 4 -> {
				finalizeBill();
				return;
			}
			case 5 -> {
				System.out.println("Thank you for visiting VCUBE Restaurant!");
				return;
			}
			default -> System.out.println("Invalid option selected. Try again.");
			}
		}
	}

	void sIndianBill() {
		while (true) {
			System.out.println(
					"1. MASALA DOSA - ₹60\n2. SAMBAR IDLI - ₹70\n3. HYDERABADI BIRYANI - ₹140\n4. GO TO MAIN MENU");
			System.out.print("Select food: ");
			int n = sc.nextInt();
			switch (n) {
			case 1 -> {
				System.out.println("SELECTED MASALA DOSA.");
				System.out.print("Enter quantity: ");
				s1Count += sc.nextInt();
				bill += s1Count * sIndian1;
			}
			case 2 -> {
				System.out.println("SELECTED SAMBAR IDLI.");
				System.out.print("Enter quantity: ");
				s2Count += sc.nextInt();
				bill += s2Count * sIndian2;
			}
			case 3 -> {
				System.out.println("SELECTED HYDERABADI BIRYANI.");
				System.out.print("Enter quantity: ");
				s3Count += sc.nextInt();
				bill += s3Count * sIndian3;
			}
			case 4 -> {
				return;
			}
			default -> System.out.println("Invalid option. Try again.");
			}
		}
	}

	void nIndianBill() {
		while (true) {
			System.out.println(
					"1. BUTTER CHICKEN - ₹200\n2. PANEER TIKKA - ₹150\n3. CHOLE BHATURE - ₹100\n4. GO TO MAIN MENU");
			System.out.print("Select food: ");
			int n = sc.nextInt();
			switch (n) {
			case 1 -> {
				System.out.println("SELECTED BUTTER CHICKEN.");
				System.out.print("Enter quantity: ");
				n1Count += sc.nextInt();
				bill += n1Count * nIndian1;
			}
			case 2 -> {
				System.out.println("SELECTED PANEER TIKKA.");
				System.out.print("Enter quantity: ");
				n2Count += sc.nextInt();
				bill += n2Count * nIndian2;
			}
			case 3 -> {
				System.out.println("SELECTED CHOLE BHATURE.");
				System.out.print("Enter quantity: ");
				n3Count += sc.nextInt();
				bill += n3Count * nIndian3;
			}
			case 4 -> {
				return;
			}
			default -> System.out.println("Invalid option. Try again.");
			}
		}
	}

	void chineseBill() {
		while (true) {
			System.out
					.println("1. HAKKA NOODLES - ₹120\n2. MANCHURIAN - ₹140\n3. FRIED RICE - ₹110\n4. GO TO MAIN MENU");
			System.out.print("Select food: ");
			int n = sc.nextInt();
			switch (n) {
			case 1 -> {
				System.out.println("SELECTED HAKKA NOODLES.");
				System.out.print("Enter quantity: ");
				c1Count += sc.nextInt();
				bill += c1Count * chinese1;
			}
			case 2 -> {
				System.out.println("SELECTED MANCHURIAN.");
				System.out.print("Enter quantity: ");
				c2Count += sc.nextInt();
				bill += c2Count * chinese2;
			}
			case 3 -> {
				System.out.println("SELECTED FRIED RICE.");
				System.out.print("Enter quantity: ");
				c3Count += sc.nextInt();
				bill += c3Count * chinese3;
			}
			case 4 -> {
				return;
			}
			default -> System.out.println("Invalid option. Try again.");
			}
		}
	}

	void finalizeBill() {
		System.out.println("\n************ BILL SUMMARY ************");

		if (s1Count > 0) {
			applyOffers(s1Count, 60, "MASALA DOSA");
		}
		if (s2Count > 0) {
			applyOffers(s2Count, 70, "SAMBAR IDLI");
		}
		if (s3Count > 0) {
			applyOffers(s3Count, 140, "HYDERABADI BIRYANI");
		}
		if (n1Count > 0) {
			applyOffers(n1Count, 200, "BUTTER CHICKEN");
		}
		if (n2Count > 0) {
			applyOffers(n2Count, 150, "PANEER TIKKA");
		}
		if (n3Count > 0) {
			applyOffers(n3Count, 100, "CHOLE BHATURE");
		}
		if (c1Count > 0) {
			applyOffers(c1Count, 120, "HAKKA NOODLES");
		}
		if (c2Count > 0) {
			applyOffers(c2Count, 140, "MANCHURIAN");
		}
		if (c3Count > 0) {
			applyOffers(c3Count, 110, "FRIED RICE");
		}

		System.out.println("\nTotal without discounts: ₹" + (bill - (discountOffer + comboOffer)));
		System.out.println("Discounts: ₹" + (-discountOffer));
		System.out.println("Combo Offers: ₹" + (-comboOffer));
		System.out.println("Final Bill: ₹" + bill);
		System.out.println("*".repeat(20));
	}

	void applyOffers(int count, double price, String itemName) {
		double itemTotal = count * price;
		if (count == 2)
			discountOffer -= 10;
		else if (count > 2)
			comboOffer -= 20;
		System.out.println(itemName + ": " + count + " × ₹" +  price + " = ₹" + itemTotal);
	}

}
