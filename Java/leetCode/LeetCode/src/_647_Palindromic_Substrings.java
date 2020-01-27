import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class _647_Palindromic_Substrings {

//	Runtime: 285 ms, faster than 5.03% of Java online submissions for Palindromic Substrings.
//	Memory Usage: 36.7 MB, less than 44.30% of Java online submissions for Palindromic Substrings.
    public int countSubstrings(String s) {
   	
    	int count = 0;
    	if(s == null || s.isEmpty() )return count;
    	
    	for(int i = 0; i<s.length(); i++) {
    		
    		for(int j=i+1; j<=s.length(); j++) {
    			if( isPalindrome(s.substring(i,j)) ) count++;
    		}
    	}
    	
    	return count;
    }
    
    
    
    
    public boolean isPalindrome(String a) {

    	
    	StringBuilder sb = new StringBuilder(a);
    	sb.reverse();
    	
    	return sb.toString().equals(a);
    }
    
    
    
    @Test
    public void case1() {
    	String s = "abc";
    	assertEquals(3, countSubstrings(s));
    }
    @Test
    public void case2() {
    	String s = "aaa";
    	assertEquals(6, countSubstrings(s));
    }
    @Test
    public void case3() {
    	String s = "abcdefghi";
    	assertEquals(9, countSubstrings(s));
    }
    @Test
    public void case4() {
    	String s = "abcdeefghi";
    	assertEquals(11, countSubstrings(s));
    }
}
