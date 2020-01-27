import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class _1106_Parsing_A_Boolean_Expression {
	
//	Runtime: 2 ms, faster than 85.28% of Java online submissions for Parsing A Boolean Expression.
//	Memory Usage: 37.5 MB, less than 100.00% of Java online submissions for Parsing A Boolean Expression.
	public boolean parseBoolExpr(String expression) {

	
		for (int i = 0; i < expression.length(); i++) {
			
			char c = expression.charAt(i);
			switch(c) {
			
				case '|':{
					int b = getClosePosition(expression, i+1);
					return or( expression.substring(2,b) );
				}
				case '!': {
					int b = getClosePosition(expression, i+1);
					return inverse( expression.substring(2,b) );
				}
				case '&': {
					int b = getClosePosition(expression, i+1);
					return and( expression.substring(2,b) );
				
				}case 't':{
					return true;
				}case 'f':{
					return false;
				}case '(':{
					return expression.charAt(1)=='t';
				}
			}
		}
		
		return false;
	}
	
	

	public boolean or(String aux) {

		System.out.println("OR>"+aux);
		List<String> elements  = splitExpression(aux);
		
		for(String str: elements) {
			
			char c = str.charAt(0);
			
			switch(c) {
			
				case '|':{
					int b = getClosePosition(str, 1);
					if( or(str.substring(2,b)) ) return true; 
				}break;
				case '!': {
					int b = getClosePosition(str, 1);
					if(inverse(str.substring(2, b)) ) return true;
				}break;
				case 't':{
					return true;
				}
				case '&':{
					int b = getClosePosition(str, 1);
					if( and(str.substring(2,b) ) ) return true;
				}
			}
			
		}
		
		return false;
	}

	public boolean and(String aux) {
		
		System.out.println("AND>"+aux);
		List<String> elements  = splitExpression(aux);
		
		for(String str: elements) {
			
			char c = str.charAt(0);
			
			switch(c) {
			
				case '|':{
					int b = getClosePosition(str, 1);
					if(! or(str.substring(2,b)) ) return false; 
				}break;
				case '!': {
					int b = getClosePosition(str, 1);
					if(!inverse(str.substring(2, b)) ) return false;
				}break;
				case 'f':{
					return false;
				}
				case '&':{
					int b = getClosePosition(str, 1);
					if( ! and(str.substring(2,b) ) ) return false;
				}
			
			}
			
		}
		
		return true;
	}

	
	public boolean inverse(String aux) {
		
		System.out.println("INVERSE>"+aux);
		return !parseBoolExpr(aux);
	}

	public List<String> splitExpression(String aux) {
		
		List<String> elements = new ArrayList<>();
		
		for(int i = 0; i < aux.length(); i++) {
			char c = aux.charAt(i);
			
			switch(c) {
			
				case '|':{
					int b = getClosePosition(aux, i+1);
					elements.add(aux.substring(i,b+1) );
					i = b;
				}break;
				case '!': {
					int b = getClosePosition(aux, i+1);
					elements.add(aux.substring(i,b+1) );
					i = b;
				}break;
				case '&': {
					int b = getClosePosition(aux, i+1);
					elements.add(aux.substring(i,b+1) );
					i = b;
				}break;
				case '(':{
					int b = getClosePosition(aux, i);
					elements.add(aux.substring(i+1,b) );
					i = b;
				}break;
				case 't':{
					elements.add("t");
					i += 1;
				}break;
				case 'f':{
					elements.add("f");
					i += 1;
				}break;
			
			}
			
		}
		
		System.out.println("splited->");
		System.out.println(elements);
		
		return elements;
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
	
	
	@Test
	public void case1() {
		String a = "!(f)";
		assertTrue(parseBoolExpr(a));
	}
	@Test
	public void case2() {		
		String a = "|(f,t)";
		assertTrue(parseBoolExpr(a));
	}	
	@Test
	public void case3() {	
		String a = "&(t,f)";
		assertFalse(parseBoolExpr(a));
	}
	@Test
	public void case4() {
		String a = "|(&(t,f,t),!(t))";
		assertFalse(parseBoolExpr(a));
	}
	@Test
	public void case5() {
		String a = "|(f,&(t,t))";
		assertTrue(parseBoolExpr(a));
	}
	@Test
	public void case6() {	
		String a = "!(&(!(&(f)),&(t),|(f,f,t)))";
		assertFalse(parseBoolExpr(a));
	}
	
}
