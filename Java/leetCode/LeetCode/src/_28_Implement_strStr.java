import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class _28_Implement_strStr {

	
//	Runtime: 552 ms, faster than 5.12% of Java online submissions for Implement strStr().
//	Memory Usage: 37 MB, less than 100.00% of Java online submissions for Implement strStr().
	public int strStr(String haystack, String needle) {

		int count = 0;

		if(needle   == null) return -1;
		if(haystack == null) return -1;
		if(needle   != null && needle.isEmpty())   return 0;
		if(haystack != null && haystack.isEmpty()) return -1;
		
		for( int i=0; i<haystack.length(); i++) {
			
			if(haystack.charAt(i) == needle.charAt(0) ) {
				count++;
				
				int a = i;
				for(int j=1; j<needle.length(); j++) {
					System.out.println(j+"<--->"+ needle.charAt(j));
					int aux = ++a;
					if(aux>=haystack.length()) break;
					if(haystack.charAt(aux) == needle.charAt(j)) count++;				
				}

				System.out.println("i-->"+i);
				System.out.println("count-->"+count);
				
				if(count == needle.length()) return a-(count-1);
						
				count = 0;
			}
			
		}
		
		return -1;
	}
	
	
	
	
	@Test
	public void case1() {
//		                   01234
		String haystack = "hello";
		String needle   = "ll";
//		                   01
	
		assertEquals(haystack.indexOf(needle), strStr(haystack, needle));
	}
	
	@Test
	public void case2() {
		
		String haystack = "aaaaa";
		String needle   = "bba";
	
		assertEquals(-1, strStr(haystack, needle));
	}
	
	@Test
	public void case3() {
		
		String haystack = "hello";
		String needle   = "";
	
		assertEquals(0, strStr(haystack, needle));
	}
	
	
	@Test
	public void case4() {
		
		String haystack = "heaaaaallbbbbbo";
		String needle   = "llbbb";
	
		assertEquals(haystack.indexOf(needle), strStr(haystack, needle));
	}
	
	
	@Test
	public void case5() {
		
		String haystack = "aaaabbc";
		String needle   = "bba";
	
		assertEquals(haystack.indexOf(needle), strStr(haystack, needle));
	}

	
	@Test
	public void case6() {
		
		String haystack = "microsfot";
		String needle   = "micro";
	
		assertEquals(haystack.indexOf(needle), strStr(haystack, needle));
	}
	
	
	@Test
	public void case7() {
		
		String haystack = "aaaaaaaaaaac";
		String needle   = "c";
	
		assertEquals(haystack.indexOf(needle), strStr(haystack, needle));
	}
	
	@Test
	public void case8() {
		
		String haystack = "a";
		String needle   = "a";
	
		assertEquals(haystack.indexOf(needle), strStr(haystack, needle));
	}
	
	
	
	@Test
	public void case9() {
		
		String haystack = "";
		String needle   = "";
	
		assertEquals(haystack.indexOf(needle), strStr(haystack, needle));
	}
	
	@Test
	public void case10() {
		
		String haystack = "";
		String needle   = "a";
	
		assertEquals(haystack.indexOf(needle), strStr(haystack, needle));
	}

}
