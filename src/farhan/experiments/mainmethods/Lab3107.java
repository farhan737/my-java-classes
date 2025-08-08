package farhan.exeperiments.mainmethods;

import com.farhan.others.Calc;

public class Lab3107 {
	public static void main(String[] args) {
		Calc c1 = new Calc();
		System.out.println(c1.printLargestPrime(1, 200));
		c1.printNPalindromes(100, 200, 5);
	}
}
