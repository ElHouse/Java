import java.util.Arrays;

public class _283_Move_Zeroes {

	public static void moveZeroes(int[] nums) {
		
		if(nums==null) return;
		if(nums.length <= 1) return;
				
		for(int i=0; i<nums.length; i++) {
			
			
			if(nums[i]==0) {
				
				for(int j=i+1;j<nums.length;j++) {
					if(nums[j]!=0) {
						
						nums[i]=nums[j];
						nums[j] = 0;
						j=nums.length;

					}
				}
			}
		}
		
	}

	
	public static void main(String[] ar) {
		
		int[] nums1 = {0,1,0,213,12};
		int[] nums2 = {1,1,3,12};
		int[] nums3 = null;
		int[] nums4 = new int[10];
		int[] nums5 = {0,0,0,0};
		int[] nums6 = {0,3,2,1,0};
		int[] nums7 = {};
		int[] nums8 = {0,1,0,1,0,1,0,1,0};
		int[] nums9 = {0,9,0,8,0,7,0,0,3};
		int[] nums0 = {0,1,0,213,12};
		
		moveZeroes( nums0);
		System.out.println(Arrays.toString(nums0));
	}
}
