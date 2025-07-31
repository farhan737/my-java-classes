package com.farhan.others;

public class Calc {

	public boolean isOdd(int num) {
		return !(num % 2 == 0);
	}

	public boolean isEven(int num) {
		return num % 2 == 0;
	}

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

	public int printLargestPrime(int start, int end) {
		for (int i = end; i >= start; i--) {
			if (isPrime(i)) {
				return i;
			}
		}
		return 0;
	}

	public int countDigits(int num) {
		int i = 0;
		while (num > 0) {
			num = num / 10;
			i++;
		}
		return i;
	}

	public int sumOfOddDigits(int num) {
		int sumOfOdd = 0;
		while (num > 0) {
			if ((num % 10) % 2 != 0)
				sumOfOdd += (num % 10);
			num /= 10;
		}
		return sumOfOdd;
	}

	public int sumOfEvenDigits(int num) {
		int sumOfEven = 0;
		while (num > 0) {
			if ((num % 10) % 2 == 0)
				sumOfEven += (num % 10);
			num /= 10;
		}
		return sumOfEven;
	}

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
}
