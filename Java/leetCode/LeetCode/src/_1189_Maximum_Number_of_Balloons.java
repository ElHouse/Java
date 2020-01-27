import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class _1189_Maximum_Number_of_Balloons {

//	Runtime: 2 ms, faster than 73.88% of Java online submissions for Maximum Number of Balloons.
//	Memory Usage: 37.8 MB, less than 100.00% of Java online submissions for Maximum Number of Balloons.
	public int maxNumberOfBalloons(String text) {

		int count = 0;
		if(text == null) return count;
		int b = 0;
		int a = 0;
		int l = 0;
		int o = 0;
		int n = 0;

		for (int i = 0; i < text.length(); i++) {
			
			switch(text.charAt(i)) {
				case 'b': {
					  b++;
				}break;
				case 'a': {
					  a++;
				}break;
				case 'l': {
					  l++;
				}break;
				case 'o': {
					  o++;
				}break;
				case 'n': {
					  n++;
				}break;
			}
		}
		
		
		
		while(true) {
			
			if(b >= 1 && a>=1 && l>=2 && o>= 2 && n>=1) {
				b-=1;
				a-=1;
				l-=2;
				o-=2;
				n-=1;
				count++;
			}else {
				return count;
			}
		
		}

	}
	
	
	@Test
	public void case1() {
		String  text = "nlaebolko";
		assertEquals(1, maxNumberOfBalloons(text));
	}


	
	@Test
	public void case2() {
		String  text = "loonbalxballpoon";
		assertEquals(2, maxNumberOfBalloons(text));
	}

	@Test
	public void case3() {
		String  text = "leetcode";
		assertEquals(0, maxNumberOfBalloons(text));
	}

}
