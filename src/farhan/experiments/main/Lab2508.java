package farhan.experiments.main;

import farhan.util.ArrayUtils;

public class Lab2508 {
	public static void main(String[] args) {
		ArrayUtils c1 = new ArrayUtils();
		String[] numbers = { "10", "120", "23", "54" };
		String[] reversed = c1.reverseArrayElements(numbers);
		ArrayUtils.printForEach(reversed, ", ");
	}
}
