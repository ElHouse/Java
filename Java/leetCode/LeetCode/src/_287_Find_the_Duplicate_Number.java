import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class _287_Find_the_Duplicate_Number {

	public int findDuplicate(int[] nums) {

		if(nums == null) return -1;
		
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]==nums[i+1]) {
				return nums[i];
			}
		}
		
		return -1;
	}
	
	@Test
	public void case1() {
		
		int[] nums = {1,3,4,2,2};
		
		assertEquals(2, findDuplicate(nums));
		
	}

	
	@Test
	public void case2() {
		
		int[] nums = {3,1,3,4,2};
		
		assertEquals(3, findDuplicate(nums));
		
	}

	
	@Test
	public void case3() {
		
		int[] nums = {2};
		
		assertEquals(-1, findDuplicate(nums));
		
	}


	@Test
	public void case4() {
		
		int[] nums = {2,2};
		
		assertEquals(2, findDuplicate(nums));
		
	}
	
	
	@Test
	public void case5() {
		int[] nums = {1,2,3};
		
		assertEquals(-1, findDuplicate(nums));
		
	}
	
	
	@Test
	public void case6() {
		
		int[] nums = {2,2,3,4,5};
		
		assertEquals(2, findDuplicate(nums));
		
	}
	
	@Test
	public void case7() {
		
		int[] nums = {2,3,4,5,6,8,9,9};
		
		assertEquals(9, findDuplicate(nums));
		
	}
}