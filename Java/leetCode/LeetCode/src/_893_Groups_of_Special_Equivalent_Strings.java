import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class _893_Groups_of_Special_Equivalent_Strings {

	
//	Runtime: 4 ms, faster than 85.60% of Java online submissions for Groups of Special-Equivalent Strings.
//	Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Groups of Special-Equivalent Strings.
	public int numSpecialEquivGroups(String[] A) {

		int count = 0;
		if(A == null) return count;
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < A.length; i++) {
			algo(A[i],map);
		}
	
		map.forEach((k,v)->{
			System.out.println(k+"<-->"+v);
		});


		
		return map.size();
	}


	
	public void algo(String A, Map<String, Integer> map) {

		StringBuilder pair = new StringBuilder();
		StringBuilder odd  = new StringBuilder();
		
		boolean flag = true;
		for(int i=0; i<A.length(); i++) {
			
			
			if(flag) {
				pair.append(A.charAt(i));
			}else {
				odd.append(A.charAt(i));
			}
			
			flag = !flag;
		}

		
		char[] auxPair = pair.toString().toCharArray();
		char[] auxOdd  = odd.toString().toCharArray();
			
		Arrays.sort(auxPair);
		Arrays.sort(auxOdd);

		String mix = String.valueOf(auxPair) +String.valueOf(auxOdd) ;
				
		if(map.containsKey(mix)) {
			int count = map.get(mix);
			map.put(mix,count+1);
		}else {
			map.put(mix,1);		
		}
		
	}
	
	
	@Test
	public void case1() {
		String[] A = {"abcd","cdab","cbad","xyzz","zzxy","zzyx"};
		assertEquals(3, numSpecialEquivGroups(A));
	}
	
	
	@Test
	public void case2() {
		String[] A = {"abc","acb","bac","bca","cab","cba"};
		assertEquals(3, numSpecialEquivGroups(A));
	}

}
