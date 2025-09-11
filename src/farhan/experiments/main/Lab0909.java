package farhan.experiments.main;

// Custom exception
class InvalidAge extends RuntimeException {
	// Constructor with default message
	public InvalidAge() {
		super("age is higher than 18");
	}
}

public class Lab0909 {
	public static void main(String[] args) {
		System.out.println("hello");

		int age = 20;

		// Throw custom exception if condition is met
		try {
			if (age > 18) {
				throw new InvalidAge(); // uses default message
			}
		} catch (InvalidAge e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
