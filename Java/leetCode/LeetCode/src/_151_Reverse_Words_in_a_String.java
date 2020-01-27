import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Stack;

import org.junit.Test;

public class _151_Reverse_Words_in_a_String {
	
//	Runtime: 4 ms, faster than 64.34% of Java online submissions for Reverse Words in a String.
//	Memory Usage: 37.6 MB, less than 83.87% of Java online submissions for Reverse Words in a Strin
    public String reverseWords(String s) {
    
    	
    	Stack<String> pila = new Stack<>();
    	
    	
    	int x = -1;
    	int y = -1;
    	for (int i = 0; i < s.length(); i++) {
			
    		if(s.charAt(i)!=' ') {
    			if(x==-1) {
    				x = i;
    				y = i; 
    			}else {
    				y=i;
    			}
    		}else {
    			if(x!=-1) pila.add(s.substring(x, y+1));
    			x = -1;
    			y = -1;
    		}
		}
    	
    	if(x!=-1) {
    		pila.add(s.substring(x, y+1));
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	while(!pila.isEmpty()) {
//    		System.out.println(pila.pop());
    		sb.append(pila.pop());
    		sb.append(" ");
    	}
    	
    	System.out.println("final->"+sb.toString());
    	
        	
    	return sb.toString().trim();
    }
    
    
    @Test
    public void case1() {
    	
    	String a = "the sky is blue";
    	assertTrue("blue is sky the".equals(reverseWords(a)));
    }

    
    @Test
    public void case2() {
    	
    	String a = "  hello world!  ";
    	assertEquals("world! hello",(reverseWords(a)));
    }
    
    
    @Test
    public void case3() {
    	
    	String a =  "a good   example";
    	assertEquals("example good a",(reverseWords(a)));
    }
    
  
}
