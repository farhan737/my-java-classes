package farhan.experiments.main;

import farhan.util.ArrayUtils;

public class Lab1410 {
	public static void main(String[] args) {
		String str = "ABC";
		for (String s : ArrayUtils.allPossiblePermutations(str)) {
			System.out.println(s);
		}
		// System.out.println(str.substring(0,3));
	}
}
