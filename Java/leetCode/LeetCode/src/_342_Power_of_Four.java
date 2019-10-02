import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class _342_Power_of_Four {

	
//	Runtime: 1 ms, faster than 100.00% of Java online submissions for Power of Four.
//	Memory Usage: 33.4 MB, less than 6.67% of Java online submissions for Power of Four.
	public boolean isPowerOfFour(int num) {
		if (num <= 0)
			return false;
		if (num == 1)
			return true;

		int aux = 4;
		while (true) {

			if (aux == num)		return true;
			else if (aux > num)	return false;
			else if (aux <= 0)	return false;
			aux *= 4;
			
			
		}

	}

	@Test
	public void case0() {
		assertFalse(isPowerOfFour(2));
	}

	@Test
	public void case1() {
		assertTrue(isPowerOfFour(4));
	}

	@Test
	public void case2() {
		assertTrue(isPowerOfFour(16));
	}

	@Test
	public void case3() {
		assertTrue(isPowerOfFour(16*4));
	}

	@Test
	public void case4() {
		assertTrue(isPowerOfFour(16*4*4));
	}

	@Test
	public void case5() {
		assertTrue(isPowerOfFour(1));
	}

	@Test
	public void case6() {
		assertFalse(isPowerOfFour(0));
	}

	@Test
	public void case7() {
		assertFalse(isPowerOfFour(45));
	}

	@Test
	public void case8() {
		assertFalse(isPowerOfFour(28));
	}

	@Test
	public void case9() {
		assertFalse(isPowerOfFour(213));
	}

	@Test
	public void case10() {
		assertFalse(isPowerOfFour(53));
	}

	@Test
	public void case11() {
		assertFalse(isPowerOfFour(-1));
	}

	@Test
	public void case12() {
		assertFalse(isPowerOfFour(Integer.MAX_VALUE));
	}

	@Test
	public void case13() {
		assertFalse(isPowerOfFour(9876));
	}

	@Test
	public void case14() {
		assertFalse(isPowerOfFour(3));
	}
}
