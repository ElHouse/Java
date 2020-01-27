import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class _856_Score_of_Parentheses {

	
//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Score of Parentheses.
//	Memory Usage: 34.2 MB, less than 100.00% of Java online submissions for Score of Parentheses.
	public int scoreOfParentheses(String S) {

		int count = 0;
		
		if(S==null || S.isEmpty()) return 0;
		
		for(int i = 0; i<S.length(); i++) {
		
			int a = i;
			int b = getClosePosition(S, a);
						
			float aux = getScore(S, a, b) * 2f;
			
			count += aux;
			i = b;
		}
		
		return count;
	}
	
	
	public int getClosePosition(String str, int init) {
		int count = 0;
		for (int i = init; i < str.length(); i++) {
			
			char c = str.charAt(i);
			if(c == '(') {
				count++;
			}else if(c == ')') {
				count--;
				if(count == 0) {
					return i;
				}
			}
		}
		return -1;
	}
	
	public float getScore(String str, int a, int b) {
		
		if((a+1)==b) return .5f;
		return scoreOfParentheses(str.substring(a+1,b));		
	}
	
	@Test
	public void case1() {
		
		String S = "()";
		assertEquals(1, scoreOfParentheses(S));
	}
	
	@Test
	public void case2() {
		
		String S = "()()";
		assertEquals(2, scoreOfParentheses(S));
	}
	
	@Test
	public void case3() {
		
		String S = "(())";	
		assertEquals(2, scoreOfParentheses(S));
	}
	
	@Test
	public void case4() {
		String S = "(()(()))";
		assertEquals(6, scoreOfParentheses(S));
	}
	
	@Test
	public void case5() {
		String S = "(((((((())))))))";
		assertEquals(128, scoreOfParentheses(S));
	}
	
}
