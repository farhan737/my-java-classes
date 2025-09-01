package farhan.experiments.main;

import farhan.experiments.OddEvenArray;
import farhan.util.CollUtils;

public class Lab2908 {
	public static void main(String[] args) {
		OddEvenArray n1 = new OddEvenArray();
		int[] numbers = { 1, 4, 2, 5, 6, 2 };
		numbers = n1.calcOddEven(numbers);
		CollUtils.printForEach(numbers, ", ");
		
	}
}
