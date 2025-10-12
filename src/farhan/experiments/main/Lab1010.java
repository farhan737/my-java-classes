package farhan.experiments.main;

import java.util.ArrayList;

public class Lab1010 {
	/**
	 * to iteratively remove adjacent characters that are same in a given String
	 * 
	 * @param line
	 * @return
	 */
	public static String removeAdjacent(String line) {
		ArrayList<Character> letters = new ArrayList<Character>();
		// add characters of the String to letters.
		for (char c : line.toCharArray())
			letters.add(c);
		boolean changed = true;
		while (changed) {
			changed = false;
			// remove characters that are same and adjacent and then breaks the loop after
			// setting the changed flag to true
			for (int i = 0; i < letters.size() - 1; i++) {
				if (letters.get(i).equals(letters.get(i + 1))) {
					letters.remove(i + 1);
					letters.remove(i);
					changed = true;
					break;
				}
			}
		}

		// finally append the characters to the StringBuilder and return the final
		// String
		StringBuilder sb = new StringBuilder();
		for (char c : letters)
			sb.append(c);
		return sb.toString();
	}

	public static ArrayList<String> getAllSubstrings(String str) {
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				list.add(str.substring(i, j));
			}
		}
		return list;
	}

	public static void main(String[] args) {
		String line = "MACHILLIPATNAM";
		System.out.println(getAllSubstrings(line));
		System.out.println(removeAdjacent(line));
	}
}
