import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class _367_Valid_Perfect_Square {

//	Runtime: 792 ms, faster than 5.08% of Java online submissions for Valid Perfect Square.
//	Memory Usage: 32.9 MB, less than 6.12% of Java online submissions for Valid Perfect Square.
	public boolean isPerfectSquare(int num) {

		
		System.out.println("num>"+num);
		if(num == 1) return true;
		
		for (int i = 1; i < num; i++) {
			if(i*i==num) {
				return true;
			}else if(i*i>num) {
				return false;
			}
		}
		
		return false;
	}

	
	
	
	@Test
	public void case1() {
		
		int[] nums = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169};
		 
		
		for (int i = 0; i < nums.length; i++) {

			assertTrue(isPerfectSquare(nums[i]));	
		}
	}
	
	@Test
	public void case2() {
		
		assertFalse(isPerfectSquare(14));
		assertFalse(isPerfectSquare(15));
		assertFalse(isPerfectSquare(3));
		assertFalse(isPerfectSquare(2));
		assertFalse(isPerfectSquare(83));
	}
	
	
//	System.out.println("num>"+num);
//	if(num == 1) return true;
//	
//	for (int i = 1; i < num; i++) {
//		if(i*i==num) {
//			return true;
//		}else if(i*i>num) {
//			return false;
//		}
//	}
//	
//	return false;
}
