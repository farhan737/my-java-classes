package farhan.experiments.main;

import farhan.util.Calc;

public class Lab2810 {
//	public static Map<String, List<String>> printAnagrams(String[] words) {
//		List<String> uniqueStrings = new ArrayList<>(new LinkedHashSet<>(Arrays.asList(words)));
//		List<String> uniqueAnagrams = new ArrayList<>();
//		Map<String, List<String>> anagrams = new HashMap<>();
//		for (int i = 0; i < uniqueStrings.size(); i++) {
//			boolean found = false;
//			for (int j = 0; j < uniqueAnagrams.size(); j++) {
//				if (Calc.isAnagram(uniqueAnagrams.get(j), uniqueStrings.get(i))) {
//					found = true;
//					break;
//				}
//			}
//			if (!found)
//				uniqueAnagrams.add(uniqueStrings.get(i));
//		}
//		for (int i = 0; i < uniqueAnagrams.size(); i++) {
//			List<String> temp = new ArrayList<>();
//			for (int j = 0; j < uniqueStrings.size(); j++) {
//				if (Calc.isAnagram(uniqueAnagrams.get(i), uniqueStrings.get(j))) {
//					temp.add(uniqueStrings.get(j));
//				}
//			}
//			anagrams.put(uniqueAnagrams.get(i), temp);
//		}
//		System.out.println(uniqueStrings);
//		System.out.println(uniqueAnagrams);
//		return anagrams;
//	}

	

	public static void main(String[] args) {
		String[] words = { "eat", "tea", "tea", "tan", "ate", "nat", "bat", "ate" };
		System.out.println(Calc.printAnagrams(words));
	}
}
