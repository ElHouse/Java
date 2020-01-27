import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class _1207_Unique_Number_of_Occurrences {

//	Runtime: 1 ms, faster than 99.74% of Java online submissions for Unique Number of Occurrences.
//	Memory Usage: 34.6 MB, less than 100.00% of Java online submissions for Unique Number of Occurrences.
	public boolean uniqueOccurrences(int[] arr) {

		if(arr == null) return false;
		if(arr.length == 1) return true;
		
		List<Integer> nums = new ArrayList<>();
		Arrays.sort(arr);
		
	
		
		int numAux = arr[0];
		int count  = 1;
		
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i] != numAux) {
				if(nums.contains(count)) {
					return false;
				}else {
					nums.add(count);
				}
				count  = 1;
				numAux = arr[i];
			}else {
				count++;
			}
			
		}
		
		if(nums.contains(count)) {
			return false;
		}
		
		
		return true;
	}

	
	@Test
	public void case1() {
		
		
		int[] arr = {1,2,2,1,1,3};
		
		assertTrue(uniqueOccurrences(arr));
		
	}
	
	
	
	@Test
	public void case2() {
		
		
		int[] arr = {1,2};
		
		assertFalse(uniqueOccurrences(arr));
		
	}
	
	@Test
	public void case3() {
		
		
		int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
		
		assertTrue(uniqueOccurrences(arr));
		
	}
	
	@Test
	public void case4() {
		
		
		int[] arr = {1};
		
		assertTrue(uniqueOccurrences(arr));
		
	}
	
	@Test
	public void case5() {
		
		
		int[] arr = {1,2,2,6,6,6,6,7,7,7,7,7,8,8,8,8,8,8,8,9,9,9};
		
		assertTrue(uniqueOccurrences(arr));
		
	}
	
	@Test
	public void case6() {
		
		
		int[] arr = {1,1,1,1};
		
		assertTrue(uniqueOccurrences(arr));
		
	}
	
	
}
