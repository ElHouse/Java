import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


//Runtime: 0 ms, faster than 100.00% of Java online submissions for To Lower Case.
//Memory Usage: 34.2 MB, less than 98.70% of Java online submissions for To Lower Case.
public class _709_To_Lower_Case {

	public String toLowerCase(String str) {

		if(str == null ) return null;
		if(str.isEmpty()) return str;
		
		StringBuilder sb = new StringBuilder();
				
		for(int i=0; i<str.length(); i++) {
			
			char aux = str.charAt(i);
			
			if(aux>=65&& aux<=90) aux+=(char) +32;
			
			sb.append(aux);
			
		}
		
		return sb.toString();
	}
	

	@Test
	public void case0() {
		
		assertEquals(null, toLowerCase(null));
		
	}

	@Test
	public void case1() {
		
		String result = "acr";
		String str    = "ACR";
		
		assertEquals(result, toLowerCase(str) );
		
	}
	
	@Test
	public void case2() {
		
		String result = "2222";
		String str    = "2222";
		
		assertEquals(result, toLowerCase(str) );
		
	}
	
	@Test
	public void case3() {
		
		String result = "hola y adios ";
		String str    = "Hola Y ADIos ";
		
		assertEquals(result, toLowerCase(str) );
		
	}
	
	
	@Test
	public void case4() {
		
		String result = " uju ";
		String str    = " UjU ";
		
		assertEquals(result, toLowerCase(str) );
	}
	
	
}
