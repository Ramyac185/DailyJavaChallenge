package javachallenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class FindLuckyInteger {

	public static int freqNum(int[] arr) {
		Arrays.sort(arr);
		
		Map<Integer, Integer> nonRepeatingNum = new TreeMap<>(Collections.reverseOrder());
		
		for (int i : arr) {
			nonRepeatingNum.put(i, nonRepeatingNum.getOrDefault(i, 0)+1);
		}
		
		System.out.println("Frequency of each number in an array: "+nonRepeatingNum);
		
		for (Map.Entry<Integer,Integer> i : nonRepeatingNum.entrySet()) {
			if (i.getValue() == i.getKey())
				return (i.getValue());
		}
		return -1;		
	}
	
	public static void main(String[] args) {
		int[] nums = {2,2,3,4};
		System.out.println(freqNum(nums));
		
	}

}
