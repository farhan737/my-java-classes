package farhan.util;

public class CollectionFunctions {

	public void printForEach(byte[] numberArray) {
		for (byte a : numberArray) {
			System.out.println(a + " ");
		}
	}

	public void printForEach(short[] numberArray) {
		for (short a : numberArray) {
			System.out.println(a + " ");
		}
	}

	public void printForEach(int[] numberArray) {
		for (int a : numberArray) {
			System.out.println(a + " ");
		}
	}

	public void printForEach(long[] numberArray) {
		for (long a : numberArray) {
			System.out.println(a + " ");
		}
	}

	public void printForEach(float[] floatArray) {
		for (float a : floatArray) {
			System.out.println(a + " ");
		}
	}

	public void printForEach(double[] floatArray) {
		for (double a : floatArray) {
			System.out.println(a + " ");
		}
	}

	public void printForEach(char[] charArray) {
		for (char a : charArray) {
			System.out.println(a + " ");
		}
	}

	public void printForEach(boolean[] booleanArray) {
		for (boolean a : booleanArray) {
			System.out.println(a + " ");
		}
	}

	public void printForEach(String[] stringArray) {
		for (String a : stringArray) {
			System.out.println(a + " ");
		}
	}

	public String[] reverseArrayElements(String[] numbers) {
		String currentString = "";
		for (int i = 0; i < numbers.length; i++) {
			for (int j = numbers[i].length() - 1; j >= 0; j--) {
				currentString = currentString + numbers[i].charAt(j);
			}
			numbers[i] = currentString;
			currentString = "";
		}
		return numbers;
	}
}
