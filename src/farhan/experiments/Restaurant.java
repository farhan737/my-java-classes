package farhan.experiments;

import java.util.Scanner;

public class Restaurant {
    int starter = 100;
    int maincourse = 200;
    int dessert = 100;
    int scount;
    int mcount;
    int dcount;
    double subTotal;
    double total;
    static Scanner sc = new Scanner(System.in);

    public int addStarter(int count) {
        return count * starter;
    }

    public int addMainCourse(int count) {
        return count * maincourse;
    }

    public int addDessert(int count) {
        return count * dessert;
    }

    public void subBill() {
        System.out.println("enter starters count: ");
        scount = sc.nextInt();
        subTotal = subTotal + addStarter(scount);
        System.out.println("enter maincourse count: ");
        mcount = sc.nextInt();
        subTotal = subTotal + addMainCourse(mcount);
        System.out.println("enter dessert count: ");
        dcount = sc.nextInt();
        subTotal = subTotal + addDessert(dcount);
        System.out.println("total final amount: " + mainBill());
    }

    public double mainBill() {
        System.out.println("starters (" + scount + "N): " + scount * starter);
        System.out.println("maincourse (" + mcount + "N): " + mcount * maincourse);
        System.out.println("dessert (" + dcount + "N): " + dcount * dessert);
        System.out.println("the subtotal for ordered items is: " + subTotal);
        System.out.println("the fixed tax rate is 5%: " + subTotal * 0.05);
        System.out.println("the service charge amount is 10%: " + subTotal * 0.1);
        return total = subTotal + (subTotal * 0.05) + (subTotal * 0.1);
    }
}
