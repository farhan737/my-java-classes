package farhan.exeperiments.mainmethods;

import com.farhan.others.Calc;

public class Lab2907 extends Calc {

	public static void main(String[] args) {
		Calc c1 = new Calc();
		System.out.println("the sum of odd digits in the number is: " + c1.sumOfOddDigits(1234));
		System.out.println("the count of even digits in the number is: " + countOfEvenDigits(1234));

	}

}
