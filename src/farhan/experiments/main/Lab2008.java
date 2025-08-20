package farhan.experiments.main;

import farhan.util.Calc;

public class Lab2008 {
	public static void main(String[] args) {
		Calc c1 = new Calc();
		System.out.println(c1.isDuckNumber("01"));
		System.out.println(c1.printNthFibonacci(1));
		for(int i = 1;i < 10; i++ ) {
			System.out.println(" " + c1.printNthFibonacci(i));
		}
	}
}
