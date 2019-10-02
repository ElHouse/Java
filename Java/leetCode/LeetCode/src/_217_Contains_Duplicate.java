import java.util.Arrays;

public class _217_Contains_Duplicate {

	public static boolean containsDuplicate(int[] nums) {

		if(nums==null) 		 return false;
		if(nums.length <= 1) return false;
		
		Arrays.sort(nums);
		
		for(int i=1; i<nums.length; i++) {
			if(nums[i-1]==nums[i]) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		int[] nums1 = {1,3,1,1,3,3,4,3,2,4,2};
		int[] nums2 = {1,2,3,4};
		int[] nums3 = {1,2,3,4,5,2};
		int[] nums4 = {1};
		int[] nums5 = null;
		int[] nums6 = new int[10];
		
		
		boolean result=	containsDuplicate(nums6);
	    System.out.println(result);
	}

}
