package javachallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
	
	private static Character indexOfNonRepeating(String input) {
		
		char[] ch = input.toCharArray();
		Arrays.sort(ch);
		Map<Character, Integer> nonRepeatingChar = new HashMap<Character,Integer>();
		
		for (char count : ch) {
			nonRepeatingChar.put(count, nonRepeatingChar.getOrDefault(count, 0) +1);
		}
		
		System.out.println("Frequency of each character in the string are ");
		System.out.println(nonRepeatingChar);
		
		for (char count : ch) {
			if(nonRepeatingChar.get(count) == 1) {
				return count;
			}	
		}
		return null;
	}

	public static void main(String[] args) {
		String input = "geeksforgeeks";
		System.out.println(indexOfNonRepeating(input));
	}

}
