import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class _561_Array_Partition_I {

	
	
//	Runtime: 14 ms, faster than 93.74% of Java online submissions for Array Partition I.
//	Memory Usage: 39 MB, less than 100.00% of Java online submissions for Array Partition I.
	public int arrayPairSum(int[] nums) {


		if(nums == null)     return 0;
		if(nums.length == 0) return 0;
 		if(nums.length == 2) {
 			return nums[0];
 		}
		
		Arrays.sort(nums);
		
		int suma = 0;
		for(int i=0;i<nums.length; i=i+2) {
			suma += nums[i];
		}
		
		return suma;
	}
	
	
	@Test
	public void case0() {
		
		assertEquals(0,arrayPairSum(null));
	}

	
	@Test
	public void case1() {
		
		int[] nums  = new int[2];
		
		assertEquals(0,arrayPairSum(nums));
	}
	
	
	
	@Test
	public void case2() {
		
		int[] nums = {1,4,3,2};
		
		assertEquals(4,arrayPairSum(nums));
	}
	
	
	@Test
	public void case3() {
		
		int[] nums = {1,4,3,2,654,3121,76543,21};
		
		assertEquals(3146,arrayPairSum(nums));
	}
	
	
	@Test
	public void case4() {
		
		int[] nums = {1,1,1,1,1,1,1,1};
		
		assertEquals(4,arrayPairSum(nums));
	}
	
	@Test
	public void case5() {
		int[] nums = {7,3,1,0,0,6};
		

		assertEquals(7, arrayPairSum(nums));
	}

	@Test
	public void case6() {
		int[] nums = {1,1,2,2,4,4,8,8,11,11};
		

		assertEquals(26, arrayPairSum(nums));
	}
	
}
