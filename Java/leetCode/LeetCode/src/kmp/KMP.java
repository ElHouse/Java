package kmp;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class KMP {

//	https://www.youtube.com/watch?time_continue=617&v=GTJr8OvyEVQ

//	Runtime: 3 ms, faster than 33.65% of Java online submissions for Implement strStr().
//	Memory Usage: 35.8 MB, less than 100.00% of Java online submissions for Implement strStr().
	public int KPM(String haystack, String needle) {
		
		//validaciones basicas 
		if (haystack == null || needle == null || haystack.length() < needle.length()) {
	       return -1;
	    } else if (needle.isEmpty()) {
	       return 0;
	    }
		
		
		int[] lps = getAuxPrefix(needle.toCharArray());
	    int i = 0;
	    int j = 0;
	    
	    while( i < haystack.length()) {
	   
	    	if(haystack.charAt(i) == needle.charAt(j) ) {
	    		i++;
	    		j++;
	    		if(j == needle.length()) {
	    			return i - j;
	    		}
	    	}else {
    			
    			if( j == 0) {
    				i++;
    			}else {
    				j = lps[j-1];
    			}
    			
    		}
	    	
	    }
	    
	    return -1;
		
	}
	
	//crea el index con la relacion de sufijosy prefijos
	public int[] getAuxPrefix(char[] arr) {
				
		int[] auxPrefix = new int[arr.length];
		int i = 1;
		int j = 0;
		
		while(i < arr.length) {
			if(arr[i] == arr[j]) {
				auxPrefix[i] = ++j;
				i++;
			}else {
				if(j==0) {
					i++;
				}else {
					j = auxPrefix[j-1];
				}
			}
			
		}

		System.out.println(Arrays.toString(auxPrefix));
		
		return auxPrefix;
	}
	
	
	@Test
	public void getAppendix() {
		
		String haystack = "abxabcabcaby";
		String needle   = "abcaby";
		int[]  a   = {0,0,0,1,2,0};
		
		assertEquals(Arrays.toString(a), Arrays.toString(getAuxPrefix(needle.toCharArray())));
		assertEquals(6, KPM(haystack,needle)  );
	}
	
	
	@Test
	public void getAppendix2() {
		//                 01234
		String haystack = "hello";
		String needle   = "ll";
		int[]  a   = {0,1};
		
		assertEquals(Arrays.toString(a), Arrays.toString(getAuxPrefix(needle.toCharArray())));
		assertEquals(2, KPM(haystack,needle)  );
	}
	
	@Test
	public void getAppendix3() {
		//                 01234
		String needle   = "abcabcabcabc";
		int[]  a   = {0,0,0,1,2,3,4,5,6,7,8,9};
		
		assertEquals(Arrays.toString(a), Arrays.toString(getAuxPrefix(needle.toCharArray())));
		
	}
	
	
	@Test
	public void getAppendix4() {
		//                 01234
		String needle   = "abab";
		int[]  a   = {0,0,1,2};
		
		assertEquals(Arrays.toString(a), Arrays.toString(getAuxPrefix(needle.toCharArray())));
		
	}
	
	
	@Test
	public void getAppendix5() {
		//                 01234
		String needle   = "XXRAXXRBXXRAXXRB";
		int[]  a   = {0,1,0,0,1,2,3,0,1,2,3,4,5,6,7,8};
		
		assertEquals(Arrays.toString(a), Arrays.toString(getAuxPrefix(needle.toCharArray())));
		
	}
	
}
