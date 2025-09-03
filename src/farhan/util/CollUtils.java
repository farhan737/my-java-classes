package farhan.util;

final public class CollUtils {

	Calc calc = new Calc();

	public static void printForEach(byte[] numberArray, String seperator) {
		for (byte a : numberArray) {
			System.out.print(a + seperator);
		}
	}

	public static void printForEach(short[] numberArray, String seperator) {
		for (short a : numberArray) {
			System.out.print(a + seperator);
		}
	}

	public static void printForEach(int[] numberArray, String seperator) {
		for (int a : numberArray) {
			System.out.print(a + seperator);
		}
	}

	public static void printForEach(long[] numberArray, String seperator) {
		for (long a : numberArray) {
			System.out.print(a + seperator);
		}
	}

	public static void printForEach(float[] floatArray, String seperator) {
		for (float a : floatArray) {
			System.out.print(a + seperator);
		}
	}

	public static void printForEach(double[] floatArray, String seperator) {
		for (double a : floatArray) {
			System.out.print(a + seperator);
		}
	}

	public static void printForEach(char[] charArray, String seperator) {
		for (char a : charArray) {
			System.out.print(a + seperator);
		}
	}

	public static void printForEach(boolean[] booleanArray, String seperator) {
		for (boolean a : booleanArray) {
			System.out.print(a + seperator);
		}
	}

	public static void printForEach(String[] stringArray, String seperator) {
		for (String a : stringArray) {
			System.out.print(a + seperator);
		}
	}

	public String[] reverseArrayElements(String[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = calc.reverseString(numbers[i]);
		}
		return numbers;
	}

	public String[] filterPalindrome(String[] numbers) {
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i].equals(calc.reverseString(numbers[i])))
				count++;
		}
		String[] palindrome = new String[count];
		count = 0;
		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j].equals(calc.reverseString(numbers[j]))) {
				palindrome[count] = numbers[j];
				count++;
			}
		}
		return palindrome;
	}

	public static void printRepeated(int[] numbers) {
		int count = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					int temp = numbers[i + 1];
					numbers[i + 1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		for (int a : numbers) {
			System.out.println(a);
		}
	}
	
	//1(0,0) 2(0,1) 1 3
	//3(1,0) 4(1,1) 2 4
	public static void transposeMatrix(int[][] matrix) {
		int[][] duplicateMatrix = new int[matrix[0].length][matrix.length];
		for(int i = 0;i<matrix.length;i++) {
			for(int j = 0;j < matrix[i].length;j++) {
				duplicateMatrix[j][i] = matrix[i][j];
			}
		}
		
		for(int[] row :duplicateMatrix) {
			for(int col : row) {
				System.out.print(col+ " ");
			}
			System.out.println();
		}
	}

}
