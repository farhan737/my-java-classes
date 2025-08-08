package farhan.experiments;

import java.util.Scanner;

public class ZoomCar {

    String company;
    int days;
    static Scanner sc = new Scanner(System.in);

    public int takeOrder(int days, String company) {
        return ((days * 1500) + 500);
    }

    public void printInvoice() {
        System.out.println("the company name is: " + company);
        System.out.println("the total days for rental: " + days);
        System.out.println("the insurrance price: 500");
        System.out.println("the final price for rental: " + takeOrder(days, company));
    }

    public void takeCompany() {
        company = sc.nextLine();
    }

    public void takeDays() {
        days = sc.nextInt();
    }

    public void greet() {
        System.out.println("*".repeat(10) + "HELLO CUSTOMER" + "*".repeat(10));
    }
}
