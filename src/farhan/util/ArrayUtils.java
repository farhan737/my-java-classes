package farhan.util;

import java.util.HashSet;
import java.util.Set;

final public class ArrayUtils {

	Calc calc = new Calc();

	public static void printForEach(CharSequence[] numberArray, String seperator) {
		System.out.println(String.join(seperator, numberArray));
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

	// 1(0,0) 2(0,1) 1 3
	// 3(1,0) 4(1,1) 2 4
	public static void transposeMatrix(int[][] matrix) {
		int[][] duplicateMatrix = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				duplicateMatrix[j][i] = matrix[i][j];
			}
		}

		for (int[] row : duplicateMatrix) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	public static String returnLargest(String[] strings) {
		int maxLength = 0;
		for (String a : strings) {
			if (maxLength < a.length())
				maxLength = a.length();
		}
		for (String a : strings) {
			if (maxLength == a.length())
				return a;
		}
		return null;
	}

	public static String returnOrdered(String unordered) {
		return unordered;
	}

//	public static String reverseWithSpaces(String line) {
//
//		// creating an empty string for reversing the original string with no spaces
//		String noSpaces = "";
//		for (int i = 0; i < line.length(); i++) {
//			if (line.charAt(i) == ' ')
//				continue;
//			noSpaces = line.charAt(i) + noSpaces;
//		}
//
//		// finally adding the original spaces
//		String reverse = "";
//		int iterate = 0;
//		for (int i = 0; i < line.length(); i++) {
//			if (line.charAt(i) == ' ') {
//				reverse += " ";
//			} else {
//				reverse += noSpaces.charAt(iterate);
//				iterate++;
//			}
//		}
//		return reverse;
//	}

	public static String reverseWithSpaces(String line) {
		int left = 0;
		int right = line.length() - 1;
		char[] lineChars = line.toCharArray();
		while (left < right) {
			if (lineChars[left] == ' ') {
				left++;
			} else if (lineChars[right] == ' ') {
				right--;
			} else {
				char temp = lineChars[left];
				lineChars[left] = lineChars[right];
				lineChars[right] = temp;
				left++;
				right--;
			}
		}
		return String.copyValueOf(lineChars);
	}

	public static String findMaxLengthString(String line) {
		line = line.toLowerCase();
		if (line == null || line.isEmpty())
			return "";

		String[] words = line.split(" ");
		String longest = "";

		for (String word : words) {
			if (word.length() > longest.length()
					|| (word.length() == longest.length() && word.compareTo(longest) < 0)) {
				longest = word;
			}
		}

		return removeDuplicateChars(longest);
	}

	public static String removeDuplicateChars(String str) {
		StringBuilder sb = new StringBuilder();
		Set<Character> seen = new HashSet<>();

		for (char c : str.toCharArray()) {
			if (seen.add(c)) { // add() returns false if already present
				sb.append(c);
			}
		}
		return sb.toString();
	}

	public static String reverseString(String word) {
		char[] characters = word.toCharArray();
		char temp = ' ';
		for (int i = 0; i < word.length() / 2; i++) {
			temp = characters[i];
			characters[i] = characters[word.length() - 1 - i];
			characters[word.length() - 1 - i] = temp;
		}
		return String.valueOf(characters);
	}

	public static String reverseInWords(String line) {
		String[] words = line.split(" ");
		for (int i = 0; i < words.length; i++) {
			words[i] = reverseString(words[i]);
		}
		return String.join(" ", words);
	}

	public static HashSet<String> allPossiblePermutations(String str) {
		HashSet<String> result = new HashSet<>();
		permute("", str, result);
		return result;
	}

	private static void permute(String prefix, String remaining, HashSet<String> result) {
		if (remaining.isEmpty()) {
			result.add(prefix);
		} else {
			for (int i = 0; i < remaining.length(); i++) {
				char c = remaining.charAt(i);
				String before = remaining.substring(0, i);
				String after = remaining.substring(i + 1);
				permute(prefix + c, before + after, result);
			}
		}
	}
}
