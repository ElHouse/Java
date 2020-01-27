import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Stack;

import org.junit.Test;

public class _150_Evaluate_Reverse_Polish_Notation {

//	Runtime: 5 ms, faster than 91.00% of Java online submissions for Evaluate Reverse Polish Notation.
//	Memory Usage: 37.4 MB, less than 98.00% of Java online submissions for Evaluate Reverse Polish Notation.
	public int evalRPN(String[] tokens) {

		Stack<Integer> stack = new Stack<>();		
		
		for (int i = 0; i < tokens.length; i++) {
			
			String s = tokens[i];

			switch(s) {
				case "+":{
					int a = stack.pop();
					int b = stack.pop();
					stack.add(b+a);
				}break;
				case "-":{
					int a = stack.pop();
					int b = stack.pop();
					stack.add(b-a);
				}break;
				case "/":{
					int a = stack.pop();
					int b = stack.pop();
					stack.add(b/a);
				}break;
				case "*":{
					int a = stack.pop();
					int b = stack.pop();
					stack.add(b*a);
				}break;
				default:{
					stack.add(Integer.parseInt(s));
				}
			}
			
			
		}
		
		return stack.pop();
	}
	
	
	@Test
	public void case1() {
		
		String[] tokens = {"2", "1", "+", "3", "*"};
		
		assertEquals(9,evalRPN(tokens));
	}
	
	@Test
	public void case2() {
		
		String[] tokens= {"4", "13", "5", "/", "+"};
		
		assertEquals(6,evalRPN(tokens));
	}
	
	@Test
	public void case3() {
		
		String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
		
		assertEquals(22,evalRPN(tokens));
	}
}
