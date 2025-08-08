package farhan.exeperiments;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public void charCount(String input) {

        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate over each character in the string
        for (char ch : input.toCharArray()) {
            // Skip spaces (optional)
            if (ch == ' ')
                continue;

            // Update count in map
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print the character counts
        System.out.println("Character counts:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' = " + entry.getValue());
        }
    }

    public void charCountmapLess(String input) {

        // Create an array for ASCII characters (0–255)
        int[] count = new int[256];

        // Count each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Optional: skip spaces
            if (ch == ' ')
                continue;
            count[ch]++;
        }

        // Display character counts
        System.out.println("Character counts:");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println("'" + (char) i + "' = " + count[i]);
            }
        }

    }
}
