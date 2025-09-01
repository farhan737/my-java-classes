package farhan.experiments.main;

import farhan.util.CollUtils;

public class Lab2508 {
	public static void main(String[] args) {
		CollUtils c1 = new CollUtils();
		String[] numbers = { "10", "120", "23", "54" };
		String[] reversed = c1.reverseArrayElements(numbers);
		CollUtils.printForEach(reversed, ", ");
	}
}
