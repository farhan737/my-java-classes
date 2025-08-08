package farhan.exeperiments.mainmethods;

import java.util.Scanner;

import com.farhan.others.Calc;

public class Lab3007 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Calc c1 = new Calc();
		printNthPrime(c1);
		printNPrime(c1);

	}

	static void printNthPrime(Calc c) {
		System.out.println("which prime number do you want in the sequence: ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i <= 100; i++) {
			if (c.isPrime(i)) {
				count++;
				if (count == n) {
					System.out.println("the " + n + "th prime number is: ");
					System.out.println(i);
				}
			}
		}
	}

	static void printNPrime(Calc c) {
		System.out.println("enter the number of prime numbers you want to print: ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; count != n; i++) {
			if (c.isPrime(i)) {
				System.out.println(i + " ");
				count++;
			}
		}
	}
}
