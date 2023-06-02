package javachallenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindSumOfUniqueNum {
	public static void uniqueFreq(int[] arr) {
		int sum = 0;
			
		Map<Integer, Integer> nonRepeatingNum = new HashMap<>();
		
		for (int i : arr) {
			nonRepeatingNum.put(i, nonRepeatingNum.getOrDefault(i, 0)+1);
		}
		
		System.out.println("Frequency of each number in an array: "+nonRepeatingNum);
		
		HashSet<Integer> uniqueSet = new HashSet<>();
		for (Map.Entry<Integer,Integer> i : nonRepeatingNum.entrySet()) {
			if (i.getValue() == 1)
	        	uniqueSet.add(i.getKey());
		}
		System.out.println(uniqueSet);
	
		for (Integer i : uniqueSet) {
			sum +=i;
		}
		System.out.println("Sum of the unique occurence of the number in the list is "+sum);
	}
	
	

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		uniqueFreq(nums);
	}
}
