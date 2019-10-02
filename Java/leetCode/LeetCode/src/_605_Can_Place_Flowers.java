import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class _605_Can_Place_Flowers {

//	Runtime: 1 ms, faster than 100.00% of Java online submissions for Can Place Flowers.
//	Memory Usage: 39 MB, less than 100.00% of Java online submissions for Can Place Flowers.
	public boolean canPlaceFlowers(int[] flowerbed, int n) {

		int count = 0;
		boolean flag = false;
		
		for (int i = 0; i < flowerbed.length; i++) {
			
			if(flowerbed[i]==1) flag = true; 
			else if(flowerbed[i]==0) {
				
				if(flag) flag = false;
				else {
					
					if(flowerbed.length == i+1) {
						flag = true;
						count++;
					}else if(flowerbed[i+1]==0) {
						flag = true;
						count++;
					}
				}
			}
		}
		
		return count >= n;
	}
	
	
	
	@Test
	public void case1() {
		
		int[] flowerbed = {1,0,0,0,1};
		int n = 1;
		assertTrue(canPlaceFlowers(flowerbed, n));		
	}

	
	@Test
	public void case2() {
		
		int[] flowerbed = {1,0,0,0,1};
		int n = 2;
		assertFalse(canPlaceFlowers(flowerbed, n));		
	}

	
	
	
	@Test
	public void case3() {
		
		int[] flowerbed = {0,0,0,0,0};
		int n = 3;
		assertTrue(canPlaceFlowers(flowerbed, n));		
	}
	
	@Test
	public void case4() {
		
		int[] flowerbed = {1,0,0,0,0,1};
		int n = 2;
		assertFalse(canPlaceFlowers(flowerbed, n));		
	}
	
	
	@Test
	public void case5() {
		
		int[] flowerbed = {1,0,0,0,1,0,0};
		int n = 2;
		assertTrue(canPlaceFlowers(flowerbed, n));		
	}
	
	@Test
	public void case6() {
		
		int[] flowerbed = {0,0,1,0,0};
		int n = 1;
		assertTrue(canPlaceFlowers(flowerbed, n));		
	}
	
	
}
