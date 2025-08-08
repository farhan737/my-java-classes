package farhan.exeperiments.mainmethods;

import java.util.Scanner;

import com.farhan.others.MethodOverloading;

public class Lab0707 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");
        int ch = sc.nextInt();
        MethodOverloading m = new MethodOverloading();
        System.out.println(m.ovMethod(ch));
        System.out.println("enter a character:");
        char num = sc.next().charAt(0);
        System.out.println(m.ovMethod(num));
        sc.close();
    }
}
