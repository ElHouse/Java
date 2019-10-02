import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class _821_Shortest_Distance_to_a_Character {


	
//	Runtime: 2 ms, faster than 33.87% of Java online submissions for Shortest Distance to a Character.
//	Memory Usage: 36.5 MB, less than 100.00% of Java online submissions for Shortest Distance to a Character.
	public int[] shortestToChar(String S, char C) {

		int[] retorno = new int[S.length()];

	    for(int i=0; i<S.length(); i++) {
	    	
	    	if(S.charAt(i)==C) {
	    		
	    		retorno[i] = 0;
	    		
	    	}else {
	    		int backward = backwardFinder(S, C, i);
	    		int forward  = forwardFinder(S, C, i);
	    	
//	    		if(backward == -1) {
//	    			retorno[i] = forward ;
//	    		}else if(forward == -1) {
//	    			retorno[i] = backward ;
//	    		}else {
	    			retorno[i] = Integer.min(forward ,  backward);
//	    		}
	    		
	    		
	    	}
	    	
	    }
	    
	    
	    
		return retorno;
	}
	
	
	public int backwardFinder(String S, char c, int pos) {
		int count = 0;
		for(int i= pos; i>=0; i--) {
			if(S.charAt(i) == c ) {
				return count;
			}
			count++;
		}
		return Integer.MAX_VALUE;
		
	}
	
	public int forwardFinder(String S, char c, int pos) {
		
		int count = 0;
		for(int i= pos; i<S.length(); i++) {
			if(S.charAt(i) == c ) {
				return count;
			}
			count++;
		}
		return Integer.MAX_VALUE;
		
	}
	
	@Test
	public void case1() {
		
		String S = "loveleetcode";
		char   C = 'e';
		String result = "[3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]";
		
		assertEquals(result,Arrays.toString( shortestToChar(S, C)));
	}
	
	
	
}
