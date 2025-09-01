package farhan.experiments.main;

import farhan.util.CollUtils;


public class Lab2808 {
	public static void main(String[] args) {
		CollUtils c1 = new CollUtils();
		String[] original = {"123","121","323","434"};
		String[] palindrome = c1.filterPalindrome(original);
		CollUtils.printForEach(palindrome, "_");
	}
}
