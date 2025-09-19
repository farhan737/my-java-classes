package farhan.experiments;

public class printCountChars {
	public static String printString(String string) {
		String temp = "";
		String length = "";
		String sequence = "";// abc23fe4hf6
		for (int i = 0; i < string.length(); i++) {
			if (Character.isAlphabetic(string.charAt(i))) {
				sequence = sequence + string.charAt(i);
				length = "";
				for (int j = i + 1; j < string.length() && Character.isDigit(string.charAt(j)); j++) {
					length = length + string.charAt(j);
				}
				if (!length.isEmpty()) {
					temp = temp + sequence.repeat(Integer.parseInt(length));
				} else
					continue;
				sequence = "";
			}
		}
		return temp;
	}
}
