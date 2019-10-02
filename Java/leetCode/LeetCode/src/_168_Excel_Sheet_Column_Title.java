import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class _168_Excel_Sheet_Column_Title {

	
	String[]  alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","Q","R","S","T","U","v","W","X","Y","Z" };
	
	
	//no jala
	public String letterFinder(int n) {
		
		int x = n%26;
		int y = n%26;
		String letter = "";
		
		
		if(x<26) {
			letter +=  alphabet[x];
			
		}else {
			letterFinder(x);
		}
		
		System.out.println(n+"---"+letter);
		
		return letter;
	}
	
	public String convertToTitle(int n) {

		return letterFinder(n);		
	}
	
	
	@Test
	public void case1() {
		System.out.println("case 1");
		assertEquals("A",convertToTitle(1));
	}

	
	
	@Test
	public void case2() {

		System.out.println("----------case 2");
		assertEquals("AB",convertToTitle(28));
	}
	
	
	@Test
	public void case3() {

		System.out.println("case 3");
		assertEquals("ZY",convertToTitle(701));
	}
	
	
	@Test
	public void case4() {

		System.out.println("case 4");
		assertEquals("ZZ",convertToTitle(702));
	}
	
	@Test
	public void case5() {

		System.out.println("case 5");
		assertEquals("AAA",convertToTitle(703));
	}
}
