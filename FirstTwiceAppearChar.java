package javachallenge;

import java.util.HashSet;
import java.util.Set;

public class FirstTwiceAppearChar {

	public static void main(String[] args) {
		String input = "abccbaacz";
		char[] ch = input.toCharArray();
		Set<Character> firstAppearSet = new HashSet<>();
		
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if(firstAppearSet.contains(c)) {
				System.out.println("First letter to appear twice in the given string is "+c);
				break;
			}
			else {
				firstAppearSet.add(c);
			}
		}
	}
}
