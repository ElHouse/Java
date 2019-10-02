import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class _728_Self_Dividing_Numbers {

//	Runtime: 2 ms, faster than 72.29% of Java online submissions for Self Dividing Numbers.
//	Memory Usage: 33.8 MB, less than 33.33% of Java online submissions for Self Dividing Numbers.
	public List<Integer> selfDividingNumbers(int left, int right) {
		
		
		List<Integer> retorno = new ArrayList<>();
		
		for(int i=left; i<=right; i++) {
			
			if(isValid(i)) {
				retorno.add(i);
			}
		}		
		
		return retorno;
	}

	public boolean isValid(int number) {
		
		int n = 10;
		
		do {
			int a = ( number % n - ( number % (n/10)))/ (n/10) ;
			
			
			if( a == 0 )		 return false;
			else if(number%a!=0) return false;
						
			n*=10;
			
		}while(n<(number*10));
		
		
		return true;		
	}
	
	
	@Test
	public void case1() {
		assertEquals(13,selfDividingNumbers(1, 22).size());
	}
	
}
