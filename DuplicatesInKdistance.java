package javachallenge;

public class DuplicatesInKdistance {
	
		public static boolean checkDuplicates(int[] nums, int k) {
			
			int n = nums.length;

			for (int i = 0; i < n; i++) {
			      int j = i + 1;
			      int distance = k;
			      while (distance > 0 && j < n) {
			        if (nums[i] == nums[j]) {
			          return true;
			        }
			        j++;
			        distance--;
			      }
			    }
			    return false;
			  }

	public static void main(String[] args) {
		int[] nums = {1,0,2,1};
		int k = 2;
		System.out.println(checkDuplicates(nums,k));
	}

}
