package farhan.experiments;

public class OrderWords {
	public static void order(String sentence) {
		String[] words = sentence.split(" ");
		int[] positions = new int[words.length];// asdas13
		String position = "";
		for (int i = 0; i < words.length; i++) {
			for (int j = words[i].length() - 1; j >= 0; j--) {
				if (Character.isDigit(words[i].charAt(j))) {
					position = words[i].charAt(j) + position;
				}
			}
			words[i] = words[i].replaceAll("\\d", "");
			positions[i] = Integer.parseInt(position);
			position = "";
		}
		for (int i = 0; i < positions.length; i++) {
			int temp = 0;
			String tempWord = "";
			for (int j = i + 1; j < positions.length; j++) {
				if (positions[i] > positions[j]) {
					temp = positions[i];
					positions[i] = positions[j];
					positions[j] = temp;
					tempWord = words[i];
					words[i] = words[j];
					words[j] = tempWord;
				}
			}
		}
		System.out.println(String.join(" ", words));
	}
}
