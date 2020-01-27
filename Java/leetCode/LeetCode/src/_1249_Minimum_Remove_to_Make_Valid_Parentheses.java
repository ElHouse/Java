import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class _1249_Minimum_Remove_to_Make_Valid_Parentheses {

//	Runtime: 12 ms, faster than 86.67% of Java online submissions for Minimum Remove to Make Valid Parentheses.
//	Memory Usage: 38.5 MB, less than 100.00% of Java online submissions for Minimum Remove to Make Valid Parentheses
	public String minRemoveToMakeValid(String s) {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			if( c == ')' ) {
				if(count > 0 ) {
					count--;
					sb.append(c);
				}
			}else if( c == '('  ) {
				count++;
				sb.append(c);
			}else {
				sb.append(c);
			}
			
		}
		
		while(count>0) {
			System.out.println("--->"+sb.toString());
			removeLastParentesis(sb);
			count--;
		}
		
		return sb.toString();
	}
	
	public void removeLastParentesis(StringBuilder sb) {
		
		int pos = -1;
		for (int i = sb.length()-1; i >= 0; i--) {
			if( sb.charAt(i) == '(' ) {
				pos = i;
				break;
			}
		}
		
		if(pos != -1) sb.deleteCharAt(pos);
		
	}
	
	
	
	
	
	
	@Test
	public void case1() {
		String s = "lee(t(c)o)de)";
		assertEquals("lee(t(c)o)de", minRemoveToMakeValid(s));
	}
	
	@Test
	public void case2() {
		String s =  "a)b(c)d";
		assertEquals("ab(c)d", minRemoveToMakeValid(s));
	}
	
	@Test
	public void case3() {
		String s =  "))((";
		assertEquals("", minRemoveToMakeValid(s));
	}
	
	@Test
	public void case4() {
		String s =  "(a(b(c)d)";
		assertEquals("(a(bc)d)", minRemoveToMakeValid(s));
	}
	
	
	
	
	
	
	
	
	
	
}
