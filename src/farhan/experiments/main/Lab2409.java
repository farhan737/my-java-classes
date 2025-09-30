package farhan.experiments.main;

public class Lab2409 {

	public static boolean isAnagram1(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;

		char[] charSequence1 = new char[str1.length()];
		char[] charSequence2 = new char[str2.length()];

		// convert string into a char array
		for (int i = 0; i < str1.length(); i++) {
			charSequence1[i] = str1.charAt(i);
			charSequence2[i] = str2.charAt(i);
		}

		// sort the arrays
		for (int i = 0; i < str1.length(); i++) {
			for (int j = i + 1; j < str1.length(); j++) {
				if (charSequence1[i] > charSequence1[j]) {
					char temp = charSequence1[i];
					charSequence1[i] = charSequence1[j];
					charSequence1[j] = temp;
				}
				if (charSequence2[i] > charSequence2[j]) {
					char temp = charSequence2[i];
					charSequence2[i] = charSequence2[j];
					charSequence2[j] = temp;
				}
			}
		}
//		ArrayUtils.printForEach(charSequence1, " ");
//		System.out.println();
//		ArrayUtils.printForEach(charSequence2, " ");
//		System.out.println();

		// check if the arrays are the same
		for (int i = 0; i < str1.length(); i++) {
			if (charSequence1[i] != charSequence2[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isAnagram1("listsn", "silsnt"));
	}
}
