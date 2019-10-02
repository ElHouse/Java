import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class _852_Peak_Index_in_a_Mountain_Array {
	public int peakIndexInMountainArray(int[] A) {

		for (int i = 1; i < A.length-1; i++) {
			
			if(isMoutain(A[i-1],A[i],A[i+1])){
				return i;
			}
			
		}
		
		
		return 0;
	}
	
	public boolean isMoutain(int a, int b, int c) {
			
		return  a < b && b > c;
	}
	
	@Test
	public void case1() {
		int[] A = {0,1,0};
		
		assertEquals(1, peakIndexInMountainArray(A));
	
	}
	
	@Test
	public void case2() {
		int[] A = {0,1,0,1,0,1,0};
		
		assertEquals(1, peakIndexInMountainArray(A));
	
	}
	
	
	@Test
	public void case3() {
		int[] A = {0,1,0,0,0,0,0,1};
		
		assertEquals(1, peakIndexInMountainArray(A));
	
	}

	
	
	@Test
	public void case4() {
		int[] A = {0,1,0,0,2,0,2,1};
		
		assertEquals(1, peakIndexInMountainArray(A));
	
	}

	
	
	@Test
	public void case5() {
		int[] A = {3,4,5,1};
		
		assertEquals(2, peakIndexInMountainArray(A));
	
	}
	
}


