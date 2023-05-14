package javachallenge;

public class FindDuplicateArray {

	public static boolean duplicateElement(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				if(nums[i] == nums[j])
					return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] data = {1,2,3,4};
		System.out.println(duplicateElement(data));
	}

}
