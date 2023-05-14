package javachallenge;

public class PhrasePalindrome {
	public static void main(String[] args) {
		String str = "A man,a plan,a canal: Panama";
		String str1 = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("After removing Alphanumeric characters: " +str1);
		String rev = "";
		for(int i = str1.length()-1; i >= 0; i--) {
			rev += str1.charAt(i);
		}
		System.out.println("Reversed string: "+rev);
		if(str1.equalsIgnoreCase(rev)) {
			System.out.println(str1+ " is a palindrome");
		}
		else {
			System.out.println(str1+ " is not a palindrome");
		}
	}
}
