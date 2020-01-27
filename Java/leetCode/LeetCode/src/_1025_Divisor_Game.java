import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class _1025_Divisor_Game {

//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Divisor Game.
//	Memory Usage: 33.2 MB, less than 13.33% of Java online submissions for Divisor Game
	
	public boolean divisorGame(int N) {

		boolean alice = false;
		
		while(N>1) {
			
			int aux = algo(N);
			N-=aux;

			System.out.println("aux>"+aux+"--n>"+N);
			alice = !alice;
			
		}
		
		return alice ;
	}

	public int algo(int n) {

		for (int i = 1; i<n-1;i++) {
			
			if( n%i  == 0) return i;
		}
		
		return 1;
	}
	
	
	
	@Test
	public void case1() {
		assertTrue( divisorGame(2));
	}
	@Test
	public void case2() {
		assertTrue( divisorGame(4));
	}
	@Test
	public void case3() {
		assertFalse(divisorGame(3));
	}

}
