import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class _771_Jewels_and_Stones {

	
//	Runtime: 1 ms, faster than 94.07% of Java online submissions for Jewels and Stones.
//	Memory Usage: 34.6 MB, less than 100.00% of Java online submissions for Jewels and Stones.
	public int numJewelsInStones(String J, String S) {

		if(J==null     || S== null)     return 0;
		if(J.isEmpty() || S.isEmpty() ) return 0;
		
		int count = 0 ;
		char[] jewels = J.toCharArray();
		char[] mine   = S.toCharArray();
		
		
		for (int i = 0; i < mine.length; i++) {
			
			for (int x = 0; x < jewels.length; x++) {
				if(jewels[x] == mine[i]) count++;
				
			}	
		}
		
		System.out.println(count);
		
		return count;
	}

	@Test
	public void case1() {
		String J = "bc";
		String S = "aaabbbcccd";
		
	 	assertEquals(6, numJewelsInStones(J, S));		
	}

	
	
	@Test
	public void case2() {
		String J = "poiuytrewq";
		String S = "aaabbbcccd";
		
	 	assertEquals(0, numJewelsInStones(J, S));		
	}
	
	
	@Test
	public void case3() {
		String J = "a";
		String S = "aaabbbcccd";
		
	 	assertEquals(3, numJewelsInStones(J, S));		
	}
	
	@Test
	public void case4() {
		String J = "aJjXcvbnmÑLKJHGFDSAQWERTYUIOPqwertyuiop";
		String S = "aaaaabbbbbcccccdddddeeeeefffffggggghhhhhiiiiijjjjj";
		
	 	assertEquals(30, numJewelsInStones(J, S));		
	}
	
	
	@Test
	public void case5() {
		String J = "aA";
		String S = "aA";
		
	 	assertEquals(2, numJewelsInStones(J, S));		
	}
	
	
	
	@Test
	public void case6() {
		String J = null;
		String S = null;
		
	 	assertEquals(0, numJewelsInStones(J, S));		
	}
	
	
	@Test
	public void case7() {
		String J = "";
		String S = "";
		
	 	assertEquals(0, numJewelsInStones(J, S));		
	}
	
}
