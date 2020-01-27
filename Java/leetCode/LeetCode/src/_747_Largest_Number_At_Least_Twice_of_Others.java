import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class _747_Largest_Number_At_Least_Twice_of_Others {

	public int dominantIndex(int[] nums) {

		if(nums==null || nums.length == 0) return-1;
		if(nums.length == 1) return 0;
		
		int[] numsAux = new int[nums.length];
				
		for (int i = 0; i < nums.length; i++) {
			numsAux[i] = nums[i];
		}
		
		
		Arrays.sort(numsAux);
		
		
		int last     = numsAux[nums.length-1];
		int anteLast = numsAux[nums.length-2];
		
		if(!( anteLast*2 <= last )) return -1;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == last) return i;
		}

		
		return -1;
	}
	
	@Test
	public void case2() {
		
		System.out.println("...............case 2");
		
		int[] nums = {1,2,3,4};
		
		assertEquals(-1, dominantIndex(nums));
	}
	
	
	@Test
	public void case3() {
		
		System.out.println("...............case 3");
		
		int[] nums = {3, 6, 1, 0,6, 31};
		
		assertEquals(5, dominantIndex(nums));
	}
	
	
	@Test
	public void case4() {
		
		System.out.println("...............case 4");
		
		int[] nums = {12, 12, 12, 6};
		
		assertEquals(-1, dominantIndex(nums));
	}
	
	
	
	@Test
	public void case5() {
		
		System.out.println("...............case 5");
		
		int[] nums = {16, 8, 1};
		
		assertEquals(0, dominantIndex(nums));
	}
	
	@Test
	public void case6() {
		
		System.out.println("...............case 6");
		
		int[] nums = {16, 9, 1};
		
		assertEquals(-1, dominantIndex(nums));
	}
	@Test
	public void case7() {
		
		System.out.println("...............case 6");
		
		int[] nums = {16};
		
		assertEquals(0, dominantIndex(nums));
	}
	
}
