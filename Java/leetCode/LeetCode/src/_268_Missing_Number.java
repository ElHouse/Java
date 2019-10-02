import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class _268_Missing_Number {

	
//	Runtime: 7 ms, faster than 21.39% of Java online submissions for Missing Number.
//	Memory Usage: 39.2 MB, less than 100.00% of Java online submissions for Missing Number.
	public int missingNumber(int[] nums) {

		if (nums == null )	    return 0;
		if (nums.length == 0)	return 0;

		Arrays.sort(nums);

		int j = 0;
		for (; j < nums.length; j++) {

			if (j != nums[j])  return j;
		}

		return j;
	}

	@Test
	public void case1() {
	  assertEquals(2, missingNumber(new int[] {3,0,1}));
	}

	@Test
	public void case2() {
	  assertEquals(8, missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
	}
	
	
	@Test
	public void case3() {
	  assertEquals(0, missingNumber(null));
	}
	
	@Test
	public void case4() {
	  assertEquals(0, missingNumber(new int[] {1}));
	}
	
	@Test
	public void case5() {
	  assertEquals(1, missingNumber(new int[1]));
	}
}
