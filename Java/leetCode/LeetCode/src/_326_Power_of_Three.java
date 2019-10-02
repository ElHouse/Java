import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class _326_Power_of_Three {

	
//	Runtime: 11 ms, faster than 75.31% of Java online submissions for Power of Three.
//	Memory Usage: 35.8 MB, less than 6.25% of Java online submissions for Power of Three.
	public boolean isPowerOfThree(int n) {

		if(n<=0) return false;
		if(n==1) return true;
		
		
		int aux = 3;
		while (true) {
			
			if (aux == n)	  return true;
			else if (aux > n) return false;
			else if(aux <0 )  return false;
			aux *= 3;
		}

	}
	
	@Test
	public void case0() {

		assertTrue(isPowerOfThree(3));
	}


	@Test
	public void case1() {

		assertTrue(isPowerOfThree(9));
	}

	@Test
	public void case2() {
		assertTrue(isPowerOfThree(27));
	}

	@Test
	public void case3() {
		assertTrue(isPowerOfThree(81));
	}

	@Test
	public void case4() {
		assertTrue(isPowerOfThree(243));
	}

	@Test
	public void case5() {
		assertTrue(isPowerOfThree(729));
	}

	@Test
	public void case6() {
		assertFalse(isPowerOfThree(0));
	}

	@Test
	public void case7() {
		assertFalse(isPowerOfThree(45));
	}

	@Test
	public void case8() {
		assertFalse(isPowerOfThree(8));
	}

	@Test
	public void case9() {
		assertFalse(isPowerOfThree(213));
	}

	@Test
	public void case10() {
		assertFalse(isPowerOfThree(53));
	}

	@Test
	public void case11() {
		assertFalse(isPowerOfThree(-1));
	}

	@Test
	public void case12() {
		assertFalse(isPowerOfThree(Integer.MAX_VALUE));
	}

	@Test
	public void case13() {
		assertFalse(isPowerOfThree(9876));
	}

	@Test
	public void case14() {
		assertFalse(isPowerOfThree(2));
	}

}
