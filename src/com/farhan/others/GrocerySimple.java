package com.farhan.others;

import java.util.Scanner;

public class GrocerySimple {
    int rice = 45;
    int sugar = 40;
    int oil = 130;
    Scanner sc = new Scanner(System.in);
    int bill = 0;
    int amount = 0;

    public void calculate() {
        System.out.println("1.rice: \t45\n2.sugar: \t40\n3.oil: \t130");
        System.out.print("\n enter the amount of rice: ");
        int r = sc.nextInt();
        System.out.print("\n enter the amount of sugar: ");
        int s = sc.nextInt();
        System.out.print("\n enter the amount of oil: ");
        int o = sc.nextInt();
        bill = (r * rice + s * sugar + o * oil);
        System.out.println("the total bill is: \t" + bill);
        System.out.print("\nenter amount to pay: \t");
        amount = sc.nextInt();
        pay(amount);
    }

    public void pay(int amount) {
        System.out.println("paid " + amount + " out of " + bill);
        bill -= amount;
        System.out.println("remaining due amount to pay " + bill);
        if (bill > 0) {
            System.out.print("\nenter amount to pay: \t");
            amount = sc.nextInt();
            pay(amount);
        }
    }
}
