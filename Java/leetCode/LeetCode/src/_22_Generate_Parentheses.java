import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class _22_Generate_Parentheses {

	List<String> answer = new ArrayList<>();
	
    public List<String> generateParenthesis(int n) {
    
    	if(n<0) return answer;
    	
    	backTracking(1, n, "()");
    	
    	System.out.println(answer.size());
    	System.out.println(answer);
    	
    	return answer;
    }
    
    
    
    public void backTracking(int i, int target, String str) {
    	
    	if(answer.contains(str)) return ;		
    	    	
    	if(i == target) {
    		answer.add(str);
    		return ;
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	
    	
    	//left
    	sb.setLength(0);
    	sb.append("()");
    	sb.append(str);
    	backTracking(i+1, target, sb.toString());
    	
    	//right
    	sb.setLength(0);
    	sb.append(str);
    	sb.append("()");
    	backTracking(i+1, target, sb.toString());
    
    	//surrounding
    	//full
    	int auxX = -1;
		int y = 0;
		int count = 0;
		for (int x = 0; x < str.length(); y++) {
			
			char c = str.charAt(y);
			if(c  == '(') count++;
			else count --;

			if(count==0) {
				
				sb.setLength(0);
				sb.append(str.substring(0, x));
				sb.append("(");
				sb.append(str.substring(x, y+1));
				sb.append(")");
				sb.append(str.substring(y+1));
				
				backTracking(i+1, target, sb.toString());
				
				if(auxX==-1) {
					auxX = y;
				}
				if(y==str.length()-1) {
					x = auxX ;
					auxX = -1;
					y = x;
					x++;
				}
				
			}
			
		}
    
    }
    
    @Test
    public void case1() {
    	generateParenthesis(8);
    }
    
}
