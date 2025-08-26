package farhan.experiments.main;

import farhan.util.CollectionFunctions;

public class Lab2508 {
	public static void main(String[] args) {
		CollectionFunctions c1 = new CollectionFunctions();
		String[] numbers = { "10", "120", "23", "54" };
		String[] reversed = c1.reverseArrayElements(numbers);

		c1.printForEach(reversed);
	}
}
