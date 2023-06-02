package javachallenge;


public class FindLargestSentenceInArray {
	
	 public static int mostWordsFound(String[] sentence) {
	        int maxLength = 0;
	        int length = sentence.length;
	        System.out.println("Number of elements in an array is "+length);
	        for(int i = 0; i < length; i++) {
	            int currentLength = sentence[i].split(" ").length;
	            if(currentLength > maxLength){
	            	maxLength = currentLength;
	            }
	        }
	        System.out.println("Length of the largest string in array");
	        return maxLength;
	 }

	public static void main(String[] args) {
		String[] sentence = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		System.out.println(mostWordsFound(sentence));
	}
}
