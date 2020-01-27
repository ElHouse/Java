import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class _520_Detect_Capital {

	
//	Runtime: 1 ms, faster than 100.00% of Java online submissions for Detect Capital.
//	Memory Usage: 34.6 MB, less than 100.00% of Java online submissions for Detect Capital.
	public boolean detectCapitalUse(String word) {

		int count = 0;

		if(word == null || word.isEmpty() ) return false;

		for (int i = 0; i < word.length(); i++) {
			
			char c = word.charAt(i);
			if( 65 <= c && c <=90  ) {
				count++;
			}
		}
		
		if(count == word.length()) return true;
		else if(count == 1) {
			char c = word.charAt(0);
			if( 65 <= c && c <=90  ) {
				return true;
			}else {
				return false;
			}
		}else if(count > 1) {
			return false;
		}
				
		return true;
	}

	
	@Test
	public void case1() {
		
		String word = "USA";
		assertTrue(detectCapitalUse(word));
		
	}
	
	
	@Test
	public void case2() {
		
		String word = "FlaG";
		assertFalse(detectCapitalUse(word));
		
	}
	

	@Test
	public void case3() {
		
		String word = "g";
		assertTrue(detectCapitalUse(word));
		
	}
}