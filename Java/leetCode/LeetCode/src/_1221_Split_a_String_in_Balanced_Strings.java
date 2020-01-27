import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class _1221_Split_a_String_in_Balanced_Strings {

//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Split a String in Balanced Strings.	
//	Memory Usage: 34.2 MB, less than 100.00% of Java online submissions for Split a String in Balanced Strings.
	public int balancedStringSplit(String s) {

		if(s==null) return 0;
		
		int count = 0;
		int l     = 0;
		int r     = 0;
		
		for (int i = 0; i < s.length(); i++) {

			if(s.charAt(i)=='L') l++;
			else if(s.charAt(i)=='R') r++;
		
			if(l == r) {
				count++;
				l = 0;
				r = 0;
			}
		}
		
		return count;
	}

	
	@Test
	public void case1() {
		String s = "RLRRLLRLRL";
		assertEquals(4, balancedStringSplit(s));
	}
	@Test
	public void case2() {
		String s = "RLLLLRRRLR";
		assertEquals(3, balancedStringSplit(s));
	}
	@Test
	public void case3() {
		String s = "LLLLRRRR";
		assertEquals(1, balancedStringSplit(s));
	}
	@Test
	public void case4() {
		String s = "RLRRRLLRLL";
		assertEquals(2, balancedStringSplit(s));
	}
	
	
	
	
}
