package javachallenge;

public class LastWordLength {
	public static void main(String[] args) {
		
		String str = "Hello Selenium, I am learning this in last one months";
		String lastWord = str.substring(str.lastIndexOf(" ") +1);
		System.out.println(lastWord.length());
				
	}
}
