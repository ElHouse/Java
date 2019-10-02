import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class _657_Robot_Return_to_Origin {

	
//	Runtime: 49 ms, faster than 5.38% of Java online submissions for Robot Return to Origin.
//	Memory Usage: 39 MB, less than 52.70% of Java online submissions for Robot Return to Origin.
//	public boolean judgeCircle(String moves) {
//		
//		if(moves == null)   return false;
//		if(moves.isEmpty()) return true;
//		
//		long D = moves.chars().filter(c->c=='D').count();
//		long U = moves.chars().filter(c->c=='U').count();
//		
//		long L = moves.chars().filter(c->c=='L').count();
//		long R = moves.chars().filter(c->c=='R').count();
//		
//		return D==U && L==R;
//		
//	}
//	
//	
//	Runtime: 9 ms, faster than 38.37% of Java online submissions for Robot Return to Origin.
//	Memory Usage: 36.6 MB, less than 100.00% of Java online submissions for Robot Return to Origin.
	public boolean judgeCircle(String moves) {
		
		if(moves == null)   return false;
		if(moves.isEmpty()) return true;
		
		int v = 0;
		int h = 0;
		
		for(int i=0; i<moves.length(); i++) {
			switch(moves.charAt(i)) {
				case 'U': v++; break;
				case 'D': v--; break;
				case 'L': h++; break;
				case 'R': h--; break;
			}
		}
		
		return v==0 && h==0;
	}
	
	@Test
	public void case0() {
		
		assertFalse(judgeCircle(null));
		
	}
	
	@Test
	public void case1() {
		
		assertTrue(judgeCircle("UUDDLLRR"));
		
	}
	
	@Test
	public void case2() {
		
		assertTrue(judgeCircle("UD"));
		
	}
	
	@Test
	public void case3() {
		
		assertFalse(judgeCircle("UDL"));
		
	}
	
	@Test
	public void case4() {
		
		assertFalse(judgeCircle("U"));
		
	}
}
