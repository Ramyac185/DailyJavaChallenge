package javachallenge;

public class DuplicatesInKdistance {
	
		public static boolean checkDuplicates(int[] nums, int k) {
			
			int n = nums.length;

			for (int i = 0; i < n; i++) {
			      int j = i + 1;
			      int distance = k;
			      while ( j < n) {
			    	  if(distance > 0)
			    		  if (nums[i] == nums[j]) {
			    			  return true;
			    		  }
			    	  j +=1;
			    	  distance--;
			      }
			    }
			    return false;
			  }

	public static void main(String[] args) {
		int[] nums = {1,0,1,1};
		int k = 1;
		System.out.println(checkDuplicates(nums,k));
	}

}
