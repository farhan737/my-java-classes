package farhan.experiments.main;

import farhan.util.ArrayUtils;


public class Lab2808 {
	public static void main(String[] args) {
		ArrayUtils c1 = new ArrayUtils();
		String[] original = {"123","121","323","434"};
		String[] palindrome = c1.filterPalindrome(original);
		ArrayUtils.printForEach(palindrome, "_");
	}
}
