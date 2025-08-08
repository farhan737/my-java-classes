package farhan.experiments;

import java.util.Scanner;

public class Grocery {
    double rice = 45;
    double sugar = 40;
    double oil = 130;
    double paid = 0;
    double bill = 0;
    int rCount = 0;
    int sCount = 0;
    int oCount = 0;

    Scanner sc = new Scanner(System.in);

    public void pay(double paid) {
        System.out.println("paid: " + paid);
        this.paid += paid;
    }

    public void addRice(int count) {
        System.out.println("added " + count + " units of rice to the cart");
        bill += rice * count;
        rCount += count;
    }

    public void addSugar(int count) {
        System.out.println("added " + count + " units of sugar to the cart");
        bill += sugar * count;
        sCount += count;
    }

    public void addOil(int count) {
        System.out.println("added " + count + " units of oil to the cart");
        bill += oil * count;
        oCount += count;
    }

    public void invoice() {
        if (paid >= bill) {
            System.out.println("the bill ammount is: " + bill + "\nthe amount paid is: " + paid);
            System.out.println("the cash return after paying: " + (paid - bill));
        } else {
            System.out
                    .println("insufficient amount paid, needed due amount:" + (bill - paid) + " to complete the order");
        }
    }

    public void selectCart() {
        // System.out.println("=".repeat(10) + "WELCOME CUSTOMER!!" + "=".repeat(10));
        System.out.println("select item");
        System.out.println("1. Rice :\t45 per kilogram");
        System.out.println("2. Sugar :\t40 per kilogram");
        System.out.println("3. Edible Oil :\t130 per litre");
        System.out.println("4. Payment");
        System.out.println("5. Exit");
        int key = sc.nextInt();
        int q = 0;
        switch (key) {
            case 1:
                System.out.println("enter the quantity: ");
                q = sc.nextInt();
                addRice(q);
                selectCart();
                break;
            case 2:
                System.out.println("enter the quantity: ");
                q = sc.nextInt();
                addSugar(q);
                selectCart();
                break;
            case 3:
                System.out.println("enter the quantity: ");
                q = sc.nextInt();
                addOil(q);
                selectCart();
                break;
            case 4:
                payOptions();
                break;
            default:
                break;
        }
    }

    public void printBill() {
        if (rCount != 0)
            System.out.println("Rice (" + rCount + "N)\t:" + rCount * rice);
        if (sCount != 0)
            System.out.println("Sugar (" + sCount + "N)\t:" + sCount * sugar);
        if (oCount != 0)
            System.out.println("Edible Oil (" + oCount + "N)\t:" + oCount * oil);
        System.out.println("total bill amount\t:" + bill);
    }

    public void payOptions() {
        System.out.println("options:");
        System.out.println("1. pay \n2. invoice\n3. go back to cart\n4. bill");
        int key = sc.nextInt();
        switch (key) {
            case 1:
                int p = sc.nextInt();
                pay(p);
                payOptions();
                break;
            case 2:
                invoice();
                payOptions();
            case 3:
                selectCart();
            case 4:
                printBill();
                payOptions();
            default:
                break;
        }
    }
}
