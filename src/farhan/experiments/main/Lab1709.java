package farhan.experiments.main;

import farhan.util.ArrayUtils;
import farhan.util.Calc;
import farhan.util.Patterns;

public class Lab1709 {
	public static void main(String[] args) {
		int[] numbers = { 1, 4, 20, 3, 10, 5 };
		int[] sum = Calc.subArraySum(33, numbers);
		ArrayUtils.printForEach(sum, " ");
		Patterns.pattern1(4);
	}
}
