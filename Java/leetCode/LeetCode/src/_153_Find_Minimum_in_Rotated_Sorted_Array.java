import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class _153_Find_Minimum_in_Rotated_Sorted_Array {

	
//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Minimum in Rotated Sorted Array.
//	Memory Usage: 38 MB, less than 100.00% of Java online submissions for Find Minimum in Rotated Sorted Array.
	public int findMin(int[] nums) {

		if(nums== null || nums.length == 0 ) return -1;
		
		int n = findPivot(nums);
		
		return nums[n==-1?0:n];
	}

	public int findPivot(int[] nums) {

		int x = 0;
		int y = nums.length - 1;

		while (y > x) {

			int mid = (y + x) / 2 + (y + x) % 2;

			if (mid == 0)
				return nums.length;

			if (nums[mid - 1] > nums[mid]) {
				return mid;
			} else {
				if (nums[mid] > nums[x]) {
					x = mid;
				} else {
					y = mid;
				}
			}

		}

		return -1;
	}

	
	@Test
	public void case1() {
		int[] nums = {3,4,5,1,2};
		assertEquals(1, findMin(nums));
	}
	
	@Test
	public void case2() {
		int[] nums = {4,5,6,7,0,1,2};
		assertEquals(0, findMin(nums));
	}
	
	
	
	@Test
	public void case3() {
		int[] nums = {4};
		assertEquals(0, findMin(nums));
	}
	
	
	
	
	@Test
	public void case4() {
		int[] nums = {4,5};
		assertEquals(4, findMin(nums));
	}
	
	
	
	
	@Test
	public void case5() {
		int[] nums = {4,5,6,7,8,9,10,11,12,13,0,1,2,3};
		assertEquals(0, findMin(nums));
	}
	
	
	
	@Test
	public void case6() {
		int[] nums = {0,1,2};
		assertEquals(0, findMin(nums));
	}
	
	
	
	@Test
	public void case7() {
		int[] nums = {4,5,6,7,0,1,2};
		assertEquals(0, findMin(nums));
	}
}
