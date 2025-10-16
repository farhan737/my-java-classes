package farhan.experiments.main;

import farhan.util.ArrayUtils;

public class Lab1310 {

	static String calculate(String line) {
		String[] words = line.split(" ");

		// replacing with $ for words that have duplicates in them
		for (int i = 0; i < words.length; i++) {
			if (!words[i].equals(ArrayUtils.removeDuplicateChars(words[i]))) {
				words[i] = "$";
			}
		}
		char[] VOWELS = { 'a', 'e', 'i', 'o', 'u' };
		String word = "";
		for (int i = 0; i < words.length; i++) {
			boolean hasVowel = false;
			// if vowel is present break the loop and set hasVowel to true
			for (char v : VOWELS) {
				if (words[i].toLowerCase().indexOf(v) != -1) {
					hasVowel = true;
					break;
				}
			}
			// compare word and words[i] and if the later is greater in size then assign the
			// value of words[i] to word.
			if (hasVowel) {
				word = words[i].length() > word.length() ? words[i] : word;
			}
		}
		return word;
	}

	public static void main(String[] args) {
		String line = "smart people plan daily work perfectly";
		System.out.println(calculate(line));
	}
}
