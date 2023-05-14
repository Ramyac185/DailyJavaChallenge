package javachallenge;

public class FindMajority {

	public static void main(String[] args) {
		int[] nums = {3,2,1,2};
		int n = nums.length;
		double halfSize = n/2;
		int  count;
		
		for(int i = 0; i < n; i++) {
			count = 0;
			for (int j = 1; j < n; j++) {
				if(nums[i] == nums[j]) {
					count++;
				}
			}
			if(count >= halfSize) {
				System.out.println(nums[i]+ " is occurred Majority in the array");
			}
		}
	}

}
