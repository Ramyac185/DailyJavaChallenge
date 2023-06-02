package javachallenge;

import java.util.HashMap;
import java.util.Map;

public class SortingSentenceUsingNumber {
	public static void sortSentence(String str) {
		Map<String,Integer> sentMap = new HashMap<>();
		String[] inputSplit = str.split(" ");
		
		for (String s : inputSplit) {
			for (char c : s.toCharArray()) {
				if(Character.isDigit(c)) {
					sentMap.put(s,Character.getNumericValue(c));
				}
			}
		}
		System.out.println("Fetched the integer from each word: "+sentMap);
		
		String[] sort = new String[str.length()];
        
        for (Map.Entry<String, Integer> i : sentMap.entrySet()) {
            sort[i.getValue()] = i.getKey();
        }
        String joinString = String.join(" ", sort);
        String removeNull = joinString.replaceAll("null", "");
        System.out.println("String has been sorted based on the integer present in the word: "+removeNull.replaceAll("[0-9]", ""));
    }
	

	public static void main(String[] args) {
		String s = "Myself2 Me1 I4 and3";
		sortSentence(s);
	}

}
