import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class _1046_Last_Stone_Weight {

	
//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Last Stone Weight.
//	Memory Usage: 34.2 MB, less than 100.00% of Java online submissions for Last Stone Weight.
	public int lastStoneWeight(int[] stones) {

		if(stones == null) return 0;
		
		Arrays.sort(stones);
		int n = stones.length-1;
		
		while(n>=0) {
			
			if(n>=1) {
				
				int y = stones[n--];
				int x = stones[n];

				stones[n+1]= Integer.MAX_VALUE;
				
				if(x==y) {
					stones[n--]= Integer.MAX_VALUE;
				}else {
					stones[n]= y-x;
				}
					

				Arrays.sort(stones);
				
			}else {
				return stones[0];
			}
			
		}
		
		
		return 0;
	}
	
	@Test
	public void case1(){
		
		int[] stones = {2,7,4,1,8,1};
		assertEquals(1, lastStoneWeight(stones));
	}
	
	@Test
	public void case2(){
		
		int[] stones = {2,2};
		assertEquals(0, lastStoneWeight(stones));
	}
	
	@Test
	public void case3(){
		
		int[] stones = {221321};
		assertEquals(221321, lastStoneWeight(stones));
	}
	
	@Test
	public void case4(){
		
		int[] stones = {9,18,83,21,23,218,15};
		assertEquals(49, lastStoneWeight(stones));
	}
	
	@Test
	public void case5(){
		
		int[] stones = {2,7,4,1,8,1,7};
		assertEquals(0, lastStoneWeight(stones));
	}
	
	
	@Test
	public void case6(){
		
		int[] stones = null;
		assertEquals(0, lastStoneWeight(stones));
	}
	
	
	@Test
	public void case7(){
		
		int[] stones = {};
		assertEquals(0, lastStoneWeight(stones));
	}
	
	
}
