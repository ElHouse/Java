import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class _557_Reverse_Words_in_a_String_III {

	
//	Runtime: 11 ms, faster than 34.18% of Java online submissions for Reverse Words in a String III.
//	Memory Usage: 39.4 MB, less than 78.95% of Java online submissions for Reverse Words in a String III.
    public String reverseWords(String s) {
    	
    	if(s==null) return "";
    	Queue<String> cola = new LinkedList<>();
    	
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
    			if(x!=-1) {
    				
    				StringBuilder sb = new StringBuilder();
    				for(int a = x; a<y+1; a++) {
    					sb.append(s.charAt(a));
    				}
    				cola.add(sb.reverse().toString());
    			}
    			x = -1;
    			y = -1;
    		}
		}
    	
    	if(x!=-1) {
    		StringBuilder sb = new StringBuilder();
			for(int a = x; a<y+1; a++) {
				sb.append(s.charAt(a));
			}
			cola.add(sb.reverse().toString());
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	while(!cola.isEmpty()) {

    		sb.append(cola.poll());
    		sb.append(" ");
    	}
    	
    	
    	System.out.println("final->"+sb.toString());
    	
        	
    	return sb.toString().trim();
    }
    
    
    
    @Test
    public void case1() {
    	String s = "Let's take LeetCode contest";
    	assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWords(s));
    }
    
    @Test
    public void case2() {
    	String s = null;
    	assertEquals(null, reverseWords(s));
    }
}
