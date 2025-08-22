package farhan.experiments;

import java.util.Scanner;

public class PaymentsDriver {
	Scanner sc = new Scanner(System.in);
	
	private int paymentAmount;

	public int getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	
	CreditCard creditCard = new CreditCard();
	
	Upi upi = new Upi();
	
	Paypal paypal = new Paypal();
	
	public void greet() {
		System.out.println("hi customer");
		System.out.println("enter the amount to pay: ");
		paymentAmount = sc.nextInt();
		setPaymentAmount(paymentAmount);
		selectPayment();
	}
	
	public void selectPayment() {
		System.out.println("enter the payment option:");
		System.out.println("1. CreditCard ");
		System.out.println("2. UPI");
		System.out.println("3. PayPal");
		int option = sc.nextInt();
		switch (option) {
		case 1 -> creditCard.payment();
		case 2 -> upi.payment();
		case 3 -> paypal.payment();
		case 4 -> System.out.println("exiting");
		default -> System.out.println("default, exiting");
		}
	}
	
}
