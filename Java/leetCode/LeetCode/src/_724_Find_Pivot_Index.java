import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class _724_Find_Pivot_Index {

//	Runtime: 2 ms, faster than 51.93% of Java online submissions for Find Pivot Index.
//	Memory Usage: 38.4 MB, less than 100.00% of Java online submissions for Find Pivot Index.
	public int pivotIndex(int[] nums) {

		if(nums== null || nums.length < 1) return -1;

		int aux = 0;
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			sum+= nums[i];
		}
		
		for (int i = 0; i < nums.length; i++) {
			
			if(aux==sum-aux-nums[i]) return i;
			aux+=nums[i];
		}
	
		return -1;
	}
	
	@Test
	public void case1() {
		System.out.println("###############> case 1");
		int[] nums = {1, 7, 3, 6, 5, 6};
		
		assertEquals(3, pivotIndex(nums));
	}
	
	@Test
	public void case2() {
		System.out.println("###############> case 2");
		int[] nums = {1,2,3};
		
		assertEquals(-1, pivotIndex(nums));
	}
}
