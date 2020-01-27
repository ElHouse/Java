import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class _977_Squares_of_a_Sorted_Array {

//	Runtime: 3 ms, faster than 33.08% of Java online submissions for Squares of a Sorted Array.
//	Memory Usage: 40.6 MB, less than 96.34% of Java online submissions for Squares of a Sorted Array.
	public int[] sortedSquares(int[] answer) {

			if(answer== null) return null;
			Map<Integer,Integer> cache = new HashMap<>();
			
			for (int i = 0; i < answer.length; i++) {
				int aux = answer[i];
				
				if(cache.containsKey(aux)) {
					answer[i] = cache.get(aux);
				}else {
					int d = (int) Math.pow(aux, 2);
					answer[i] = d;
					cache.put(aux,d);
				}
			}
			
			
			Arrays.sort(answer);
			
			return answer;
	}
	
	@Test
	public void case1() {
		int[] a = {-4,-1,0,3,10};
		assertEquals("[0, 1, 9, 16, 100]", Arrays.toString(sortedSquares(a)));
	}
	@Test
	public void case2() {
		int[] a = {-7,-3,2,3,11};
		assertEquals("[4, 9, 9, 49, 121]", Arrays.toString(sortedSquares(a)));
	}
}
