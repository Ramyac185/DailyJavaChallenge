package javachallenge;

public class TwoStringArrayMatch {
	public static boolean stringArrayMatch(String[] word1,String[] word2) {
		String delimiter = "";
		String result1 = String.join(delimiter, word1);
		String result2 = String.join(delimiter, word2);
		System.out.println("After joining word1 array of characters: "+result1);
		System.out.println("After joining word2 array of characters: "+result2);
		if(result1.equalsIgnoreCase(result2)){
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		String[] word1 = {"abc", "d", "defg"};
		String[] word2 = {"abcddefg"};
		System.out.println(stringArrayMatch(word1,word2));
		
	}

}
