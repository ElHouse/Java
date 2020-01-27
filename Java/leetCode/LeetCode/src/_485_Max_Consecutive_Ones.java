import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class _485_Max_Consecutive_Ones {

//	Runtime: 2 ms, faster than 99.60% of Java online submissions for Max Consecutive Ones.
//	Memory Usage: 38.3 MB, less than 100.00% of Java online submissions for Max Consecutive Ones.
	public int findMaxConsecutiveOnes(int[] nums) {

		
		int max = 0;
		int aux = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			if(nums[i]==1) {
				aux++;
			}else {
				
				max = Math.max(max, aux);
				aux = 0;
			}
		}
		
		max = Math.max(max, aux);
		
		return max;
	}
	
	
	@Test
	public void case1() {
		int[] nums = {1,1,0,1,1,1};
		
		assertEquals(3,findMaxConsecutiveOnes(nums));
		
	}
	
	@Test
	public void case2() {
		int[] nums = {1,1,0,1,1,1,0,0,0,1,1,1,1};
		
		assertEquals(4,findMaxConsecutiveOnes(nums));
		
	}
	
	@Test
	public void case3() {
		int[] nums = {0};
		
		assertEquals(0,findMaxConsecutiveOnes(nums));
		
	}
	
	@Test
	public void case4() {
		int[] nums = {1,1,1,1,1,1};
		
		assertEquals(6,findMaxConsecutiveOnes(nums));
		
	}
	
	
	
}
