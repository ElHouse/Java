import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class _162_Find_Peak_Element {

	
//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Peak Element.
//	Memory Usage: 37.3 MB, less than 100.00% of Java online submissions for Find Peak Element.
	public int findPeakElement(int[] nums) {

		if(nums == null || nums.length == 0) return -1;
		
		for (int i = 0; i < nums.length; i++) {
			double prev = getNumsValue(nums, i-1);
			double next = getNumsValue(nums, i+1);
			
			if(prev < nums[i] && nums[i] > next) {
				return i;
			}
			
		}
		
		return -1;
	}
	
	public double getNumsValue(int[] nums, int n) {

		if(n==-1)           return Double.NEGATIVE_INFINITY;
		if(n==nums.length) return  Double.NEGATIVE_INFINITY;
		
		return nums[n];
	}
	
	@Test
	public void case1(){
		
		int[] nums = {1,2,3,1};
		assertEquals(2,findPeakElement(nums));
	}
	
	
	@Test
	public void case2(){
		
		int[] nums = {1,2,1,3,5,6,4};
		assertEquals(1,findPeakElement(nums));
	}
	
	
	@Test
	public void case3(){
		
		int[] nums = {8};
		assertEquals(0,findPeakElement(nums));
	}
	
	
	@Test
	public void case4(){
		
		int[] nums = {1,2,4,5,6,7,8,9};
		assertEquals(7,findPeakElement(nums));
	}
	
	@Test
	public void case5(){
		
		int[] nums = {-2147483648};
		assertEquals(0,findPeakElement(nums));
	}
	
}
