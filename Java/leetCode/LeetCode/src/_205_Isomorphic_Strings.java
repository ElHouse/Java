import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class _205_Isomorphic_Strings {

//	Runtime: 9 ms, faster than 60.48% of Java online submissions for Isomorphic Strings.
//	Memory Usage: 37.1 MB, less than 100.00% of Java online submissions for Isomorphic Strings.
	public boolean isIsomorphic(String s, String t) {
		
		return isA(s, t) && isA(t, s);
	}
	
	
	public boolean isA(String s, String t) {
	
		Map<Character, Character> mapa = new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {

			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			
			if(mapa.containsKey(c1)) {
				
				if(mapa.containsKey(c2)) {
					char aux = mapa.get(c2);
					if(aux != c1) return false;
										
				}else{
					char aux = mapa.get(c1);
					if(aux != c2) return false;
				}
			}else {
				mapa.put(c1, c2);
			}
			
		}
		
		return true;
	}
	
	
	
	@Test
	public void case1() {
		String s = "egg";
		String t = "add";
		
		assertTrue(isIsomorphic(s, t));	
	}
	
	
	@Test
	public void case2() {
		String s = "foo";
		String t = "bar";
		
		assertFalse(isIsomorphic(s, t));	
	}
	
	
	@Test
	public void case3() {
		String s = "paper";
		String t = "title";
		
		assertTrue(isIsomorphic(s, t));	
	}
	
	@Test
	public void case4() {
		String s = "ab";
		String t = "aa";
		
		assertFalse(isIsomorphic(s, t));	
	}
}
