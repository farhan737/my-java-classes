package farhan.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class Calc {

	/**
	 * this method a boolean value true/false if the give number is an odd number
	 * 
	 * @param num
	 * @return boolean
	 */
	public boolean isOdd(int num) {
		boolean status = !(num % 2 == 0);
		return status;
	}

	/**
	 * this method a boolean value true/false if the give number is an even number
	 * 
	 * @param num
	 * @return
	 */
	public boolean isEven(int num) {
		boolean status = num % 2 == 0;
		return status;
	}

	/**
	 * return a boolean value for a number that is a prime number or not
	 * 
	 * @param num
	 * @return
	 */
	public boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	/**
	 * returns the last prime number in the given range, returns 0 as default
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	public int printLargestPrime(int start, int end) {
		for (int i = end; i >= start; i--) {
			if (isPrime(i)) {
				return i;
			}
		}
		return 0;
	}

	/**
	 * returns an integer for the number of digits in the given number
	 * 
	 * @param num
	 * @return
	 */
	public int countDigits(int num) {
		int i = 0;
		while (num > 0) {
			num = num / 10;
			i++;
		}
		return i;
	}

	/**
	 * returns the sum of odd digits in the given number
	 * 
	 * @param num
	 * @return
	 */
	public int sumOfOddDigits(int num) {
		int sumOfOdd = 0;
		while (num > 0) {
			if ((num % 10) % 2 != 0)
				sumOfOdd += (num % 10);
			num /= 10;
		}
		return sumOfOdd;
	}

	/**
	 * returns the sum of even digits in the given number
	 * 
	 * @param num
	 * @return
	 */
	public int sumOfEvenDigits(int num) {
		int sumOfEven = 0;
		while (num > 0) {
			if ((num % 10) % 2 == 0)
				sumOfEven += (num % 10);
			num /= 10;
		}
		return sumOfEven;
	}

	/**
	 * returns the integer value for the count of even digits in the given number
	 * 
	 * @param num
	 * @return
	 */
	public static int countOfEvenDigits(int num) {
		int i = 0;
		while (num > 0) {
			if ((num % 10) % 2 == 0)
				i++;
			num /= 10;
		}
		return i;
	}

	// needs to be properly implemented
	public static int secontPerfectNumber(int num) {
		int x = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				return x;
			}
		}
		return x;
	}

	public boolean isArmstrong(int num) {
		int original = num;
		int sum = 0;
		int digits = countDigits(num);

		while (num > 0) {
			sum += Math.pow(num % 10, digits);
			num /= 10;
		}
		return sum == original;
	}

	public int reverseNum(int num) {
		int reverse = 0;
		int i = (int) Math.pow(10, (countDigits(num) - 1));
		int n = 1;
		while (i > 0) {
			reverse += (num / i) * n;
			num %= i;
			i /= 10;
			n *= 10;
		}
		return reverse;
	}

	public boolean isPalindrome(int num) {
		if (num == reverseNum(num))
			return true;
		return false;
	}

	public void printNPalindromes(int start, int end, int range) {
		int count = 0;
		while (start <= end) {
			if (isPalindrome(start)) {
				count++;
				if (count <= range) {
					System.out.print(start + " ");
				} else
					break;
			}
			start++;
		}
	}

	public static int firstNonRepeating(int num) {
		int temp = num;
		int anotherTemp = num;
		int currentNum;
		int checkingNum;
		int count;
		while (num > 0) { // 2133, 213
			count = 0; // 2 - > 0,
			currentNum = num % 10; // 3, 3
			temp = anotherTemp;
			while (temp > 0) { // 2133
				checkingNum = temp % 10; // 3, 3
				if (currentNum == checkingNum) { // 3 == 3, 3 == 3
					count++;// 1, 2
				}
				if (count > 1)
					break;
				temp /= 10;
			}
			if (count == 1) {
				return currentNum;
			}
			num /= 10;
		}
		return -1;
	}

	public static int factorial(int num) {
		if (num == 1 || num == 0)
			return 1;
		else
			return num * factorial(num - 1);
	}

	public static int sumOfDigits(int num) {
		int sum = 0;
		while (num > 0) {
			int currentDigit = num % 10;
			sum += currentDigit;
			num /= 10;
		}
		return sum;
	}

	public int sumOfPoweredDigits(int num, int power) {
		int sum = 0;
		while (num > 0) {
			int currentDigit = num % 10;
			sum += Math.pow(currentDigit, power);
			num /= 10;
		}
		return sum;
	}

	public static int productOfDigits(int num) {
		int product = 1;
		while (num > 0) {
			int currentDigit = num % 10;
			product *= currentDigit;
			num /= 10;
		}
		return product;
	}

	public static boolean isStrongNumber(int num) {
		int temp = num;
		int sum = 0;
		while (num > 0) {
			int currentDigit = num % 10;
			sum += factorial(currentDigit);
			num /= 10;
		}
		if (sum == temp)
			return true;
		else
			return false;
	}

	public static boolean isSpyNumber(int num) {
		int sum = sumOfDigits(num);
		int product = productOfDigits(num);
		if (sum == product)
			return true;
		return false;
	}

	public static boolean isNeonNumber(int num) {
		int squaredNumber = num * num;
		int sumOfSquare = 0;
		while (squaredNumber > 0) {
			sumOfSquare += squaredNumber % 10;
			squaredNumber /= 10;
		}
		if (sumOfSquare == num)
			return true;
		else
			return false;
	}

	public static boolean isHarshad(int num) {
		int temp = num;
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		if (temp % sum == 0)
			return true;
		return false;
	}

	public boolean isPalinPrime(int n) {
		if (isPalindrome(n) && isPrime(n))
			return true;
		return false;
	}

	public boolean isSmithNumber(int num) { // 666
		int sumOfDigits = sumOfDigits(num);
		int sumOfPrimeFactors = 0;
		while (!isPrime(num)) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0 && isPrime(i)) {
					sumOfPrimeFactors += sumOfDigits(i);
					num /= i;
				}
			}
			if (isPrime(num))
				sumOfPrimeFactors += sumOfDigits(num);
		}
		return sumOfDigits == sumOfPrimeFactors;
	}

	public boolean isHappyNumber(int n) {
		int temp = n;
		String memory = "";
		do {
			temp = sumOfPoweredDigits(temp, 2);
			memory += " " + temp;
			if (temp == 1) {
				System.out.println(memory);
				return true;
			}

		} while (temp != n);
		return false;
	}

	public boolean isDisariumNumber(int num) {
		int sum = 0;
		String numToString = Integer.toString(num);
		for (int i = 0; i < numToString.length(); i++) {
			sum += Math.pow(Character.getNumericValue(numToString.charAt(i)), i + 1);
		}
		return sum == num;
	}

	public boolean isDuckNumber(String num) {
		if (num.charAt(0) == '0')
			return false;
		for (int i = 1; i < num.length(); i++) {
			if ((int) num.charAt(i) >= 48 && (int) num.charAt(i) <= 57) {
				if ((int) num.charAt(i) == '0')
					return true;
			}
		}
		return false;
	}

	/**
	 * return the reverse String of the given String
	 * 
	 * @param str
	 * @return
	 */
	public String reverseString(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		return reversed;
	}

	public int printNthFibonacci(int n) {
		int count = 1;
		int a = 0;
		int b = 1;
		int c = 0;
		while (count != n) {
			c = a + b;
			a = b;
			b = c;
			count++;
		}
		return a;
	}

	public boolean[] toBinary(int num) {
		int index = 0;
		while ((1 << index) <= num) {
			index++;
		}
		index--;
		boolean[] binary = new boolean[index + 1];
		for (int i = index; i >= 0; i--) {
			if (num - (1 << i) >= 0) {
				binary[i] = true;
				num -= (1 << i);
			}
		}
		return binary;
	}
//	&& noRepeat[i] == 0 && noRepeat[j] == 0

//	noRepeat[i] = 1;
//	noRepeat[j] = 1;
	public static void sumToGet(int[] numbers, int num) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j < numbers.length; j++) {
				if (numbers[i] + numbers[j] == num) {
					System.out.println(numbers[i] + " " + numbers[j]);
				}
			}
		}
	}

	/**
	 * this method tries to return a subarray of length 3 the sum of which will be
	 * the numbers passed in the first arguement
	 * 
	 * @param num     the target number for which the sum of subarray
	 * @param numbers the target array
	 * @return subArray the final sub array.
	 */
	public static int[] subArraySum(int num, int[] numbers) {
		int[] subArray = new int[3];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				for (int k = 0; k < numbers.length; k++) {
					if (numbers[i] + numbers[j] + numbers[k] == num) {
						subArray[0] = numbers[i];
						subArray[1] = numbers[j];
						subArray[2] = numbers[k];
					}
				}
			}
		}
		return subArray;
	}

	/**
	 * checks if the given Strings are anagrams or not.
	 * 
	 * @param str1
	 * @param str2
	 * @return <b>true</b> if the given Strings are anagrams
	 */
	public static boolean isAnagram(String str1, String str2) {
		char[] letters1 = str1.toCharArray();
		Arrays.sort(letters1);
		char[] letters2 = str2.toCharArray();
		Arrays.sort(letters2);
		return Arrays.equals(letters1, letters2);
	}

	public static Map<String, List<String>> printAnagrams(String[] words) {
		// Step 1: Remove duplicates
		List<String> uniqueWords = new ArrayList<>(new LinkedHashSet<>(Arrays.asList(words)));

		// Step 2: Group anagrams using sorted key
		Map<String, List<String>> grouped = new HashMap<>();
		for (String word : uniqueWords) {
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			String key = new String(chars);
			grouped.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
		}

		// Step 3: Convert grouped anagrams to map with representative word as key
		Map<String, List<String>> anagrams = new LinkedHashMap<>();
		for (List<String> group : grouped.values()) {
			if (!group.isEmpty()) {
				String key = group.get(0); // first word in group
				anagrams.put(key, group);
			}
		}

		// Step 4: Print output
		System.out.println("Unique words : " + uniqueWords);
		return anagrams;
	}

	public static Map<Character, Integer> printCharCount(String str) {
		char[] letters = str.toCharArray();
		Map<Character, Integer> count = new HashMap<>();
		for (char c : letters) {
			count.put(c, count.get(c) == null ? 1 : count.get(c) + 1);
		}
		return count;
	}

	public static Map<String, Integer> printWordCount(String sentence) {
		String[] words = sentence.split(" ");
		Map<String, Integer> count = new HashMap<>();
		for (String word : words) {
			count.put(word, count.get(word) == null ? 1 : count.get(word) + 1);
		}
		return count;
	}
}
