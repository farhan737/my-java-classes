package farhan.experiments.main;

import java.util.Scanner;

import farhan.experiments.CheckPass;

public class Lab2006a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        CheckPass checker = new CheckPass();
        System.out.println(checker.passOrfail(a, b, c, 35));
        sc.close();

    }
}
