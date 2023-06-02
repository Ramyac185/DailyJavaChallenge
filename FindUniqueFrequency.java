package javachallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindUniqueFrequency {
	public static boolean uniqueFreq(int[] arr) {
		Arrays.sort(arr);
		
		Map<Integer, Integer> nonRepeatingNum = new HashMap<>();
		
		for (int i : arr) {
			nonRepeatingNum.put(i, nonRepeatingNum.getOrDefault(i, 0)+1);
		}
		
		System.out.println("Frequency of each number in an array: "+nonRepeatingNum);
		
		HashSet<Integer> uniqueSet = new HashSet<>();
		for (Map.Entry<Integer,Integer> i : nonRepeatingNum.entrySet()) {
			if (uniqueSet.contains(i.getValue()))
	            return false;
	        else
	        	uniqueSet.add(i.getValue());
		}
		return true;
	}
	

	public static void main(String[] args) {
		int[] nums = {-3,0,1,-3,1,1,1,-3,10,0};
		System.out.println(uniqueFreq(nums));
	}
}
