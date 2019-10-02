import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class _231_Power_of_Two {

	
//	Runtime: 1 ms, faster than 100.00% of Java online submissions for Power of Two.
//	Memory Usage: 33.5 MB, less than 7.32% of Java online submissions for Power of Two.
	public boolean isPowerOfTwo(int n) {

		if (n <= 0)
			return false;
		if (n == 1)
			return true;

		int aux = 2;
		while (true) {

			if (aux == n)		return true;
			else if (aux > n)	return false;
			else if (aux <= 0)	return false;
			aux *= 2;
			
			
		}

	}

	@Test
	public void case0() {
		assertTrue(isPowerOfTwo(2));
	}

	@Test
	public void case1() {
		assertTrue(isPowerOfTwo(4));
	}

	@Test
	public void case2() {
		assertTrue(isPowerOfTwo(16));
	}

	@Test
	public void case3() {
		assertTrue(isPowerOfTwo(16*2));
	}

	@Test
	public void case4() {
		assertTrue(isPowerOfTwo(16*2*2));
	}

	@Test
	public void case5() {
		assertTrue(isPowerOfTwo(1));
	}

	@Test
	public void case6() {
		assertFalse(isPowerOfTwo(0));
	}

	@Test
	public void case7() {
		assertFalse(isPowerOfTwo(45));
	}

	@Test
	public void case8() {
		assertFalse(isPowerOfTwo(28));
	}

	@Test
	public void case9() {
		assertFalse(isPowerOfTwo(213));
	}

	@Test
	public void case10() {
		assertFalse(isPowerOfTwo(53));
	}

	@Test
	public void case11() {
		assertFalse(isPowerOfTwo(-1));
	}

	@Test
	public void case12() {
		assertFalse(isPowerOfTwo(Integer.MAX_VALUE));
	}

	@Test
	public void case13() {
		assertFalse(isPowerOfTwo(9876));
	}

	@Test
	public void case14() {
		assertFalse(isPowerOfTwo(3));
	}
}
