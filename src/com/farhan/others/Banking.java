package com.farhan.others;

import java.util.Scanner;

public class Banking {
    static Scanner sc = new Scanner(System.in);
    int balance;
    int accountNumber;
    String accountName;

    static String branchName = "KPHB";
    static long IFSC = 123456123345L;

    public Banking() {
        System.out.println("enter account name: ");
        accountName = sc.nextLine();
        System.out.println("enter account number: ");
        accountNumber = sc.nextInt();
        System.out.println("enter account balance: ");
        balance = sc.nextInt();
        sc.nextLine();
    }

    public void deposite(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount) {
        if (balance > amount) {
            balance = balance - amount;
        } else
            System.out.println("no enough funds");
    }

    public int printBalance() {
        return balance;
    }

    public String printAccname() {
        return accountName;
    }

    public int printAccnumber() {
        return accountNumber;
    }

    public long printIFSC() {
        return IFSC;
    }

    public String printBranch() {
        return branchName;
    }
}
