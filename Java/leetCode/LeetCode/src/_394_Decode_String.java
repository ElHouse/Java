import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Stack;

import org.junit.Test;

public class _394_Decode_String {

	public String decodeString(String s) {

		if(s==null) return "";
		
		return algo(s,1);
	}

	public String algo(String s, int repeticions) {
		
		StringBuilder sb = new StringBuilder();
		int count = 0;
		while(count<repeticions) {
			
			for (int i = 0; i < s.length(); i++) {
				
					
					if(Character.isDigit(s.charAt(i))) {
						
						int aux = i;
						while(Character.isDigit(s.charAt(++aux))){
							
						}
						
						aux--;
						
						int j = finder(s,aux+1);
						sb.append( algo(s.substring(aux+2,j), Integer.valueOf(s.substring(i,aux+1)) ));
						i=j;
					}else {
						char c = s.charAt(i);
						sb.append(c);
					}
				
			}
			count++;	
		}
		
		
		return sb.toString();
	}
	
	
	public int finder(String s, int x) {
		
		Stack<Character> stack = new Stack<>();
		for (int i = x; i < s.length(); i++) {
			
			if(s.charAt(i)=='[') {
				stack.add('[');
			}else if(s.charAt(i)==']') {
				stack.pop();
			}
			
			if(stack.isEmpty()) return i;
			
		}
		return -1;
	}
	
	
	
	@Test
	public void case1() {
	
		String s = "3[a2[c]]";
		assertEquals("accaccacc", decodeString(s));
	}
	
	
	@Test
	public void case2() {
	
		String s = "3[a]2[bc]";
		assertEquals("aaabcbc", decodeString(s));
	}
	
	
	@Test
	public void case3() {
	
		String s = "2[abc]3[cd]ef";
		//            abcabccdcdcd 
		assertEquals("abcabccdcdcdef", decodeString(s));
	}

	@Test
	public void case4() {
	//              0123456789012
		String s = "10[leetcode]";
		
//		System.out.println("c4 a>"+s.substring(0,3));
//		System.out.println("c4 b>"+s.substring(0,1));
		
		
		assertEquals("leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode", decodeString(s));
	}

}
