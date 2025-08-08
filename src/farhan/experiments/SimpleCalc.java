package farhan.experiments;

import java.util.Scanner;

public class SimpleCalc {
    int a;
    int b;
    int c;
    int d;
    int e;
    int temp;
    Scanner sc = new Scanner(System.in);

    public void subtract() {
        System.out.println("enter a: ");
        a = sc.nextInt();
        System.out.println("enter b: ");
        b = sc.nextInt();
        temp = a - b;
        System.out.println(a + " - " + b + " = " + temp);
        add();
    }

    public void add() {
        System.out.println("enter c: ");
        c = sc.nextInt();
        temp = temp + c;
        System.out.println((a - b) + " + " + c + " = " + temp);
        multiply();
    }

    public void multiply() {
        System.out.println("enter d: ");
        d = sc.nextInt();
        temp = temp * d;
        System.out.println(((a - b) + c) + " * " + d + " = " + temp);
        divide();
    }

    public void divide() {
        System.out.println("enter e: ");
        e = sc.nextInt();
        temp = temp / e;
        System.out.println((((a - b) + c) * d) + " / " + e + " = " + temp);
    }
}
