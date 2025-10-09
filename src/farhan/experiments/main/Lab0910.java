package farhan.experiments.main;

import farhan.util.ArrayUtils;

public class Lab0910 {

	public static String swapFirstNLast(String word) {
		char[] characters = word.toCharArray();
		char temp = characters[0];
		characters[0] = characters[characters.length - 1];
		characters[characters.length - 1] = temp;
		return String.valueOf(characters);
	}

	public static String swappingCharactersInEach(String line) {
		String[] words = line.split(" ");
		for (int i = 0; i < words.length; i++) {
			words[i] = swapFirstNLast(words[i]);
		}
		return String.join(" ", words);
	}

	public static void main(String[] args) {
		String line = "hello hi how are you";
		String line1 = "Hello World";
		System.out.println(ArrayUtils.reverseInWords(line));
		System.out.println(swappingCharactersInEach(line1));
	}
}
