package javachallenge;

import java.util.HashSet;

public class FindJewelInStone {

	public static int numOfJewels(String jewels, String stones) {
        HashSet<Character> jewelSet = new HashSet<Character>();
        for(int i=0;i<jewels.length();i++) {
            jewelSet.add(jewels.charAt(i));
        }
        System.out.println(jewelSet);
       
        int result = 0;
        for(int i=0;i<stones.length(); i++){
            if(jewelSet.contains(stones.charAt(i)) == true) {
                result++;
            }
        }     
        return result;
    }
    
	public static void main (String[] args){
		String jewels = "A";
		String stones = "aabbB";
		System.out.println(numOfJewels(jewels, stones));
  }

}
