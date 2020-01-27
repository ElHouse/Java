import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class _1170_Compare_Strings_by_Frequency_of_the_Smallest_Character {

	public int[] numSmallerByFrequency(String[] queries, String[] words) {


		int[] result = new int[queries.length];
		int[] A  = new int[queries.length];
		int[] B  = new int[words.length];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = algo(queries[i]);
		}

		for (int i = 0; i < B.length; i++) {
			B[i] = algo(words[i]);
		}
		
		Arrays.sort(B);
		
		System.out.println("A");
		System.out.println(Arrays.toString(A));
		

		System.out.println("B");
		System.out.println(Arrays.toString(B));
		
	
		
		for (int i = 0; i < A.length; i++) {
			int count = 0;
			for (int j = 0; j < B.length; j++) {
				
				if(A[i] < B[j]) {
					count++;
				}
			}
			result[i] = count;
		}
		
		return result;
	}
	
	public int algo(String word) {
		
		int min = Integer.MAX_VALUE;
		Map<Character,Integer> map = new HashMap<>();
		
		for (int i = 0; i < word.length(); i++) {
			
			if(map.containsKey(word.charAt(i)))
				map.compute(word.charAt(i), (k,v)-> v+=1 );
			else {
				map.put(word.charAt(i),1);
			}
		}
		
		for(Character c : map.keySet()) {
			min = Math.min(min, c);
		}
		
		return map.get((char) min);
	}
	
	
	@Test
	public void case1() {
		String[] queries = {"cbd"};
		String[] words   = {"zaaaz"};
		
		assertEquals("[1]",	Arrays.toString(numSmallerByFrequency(queries, words) ));
	}
	
	
	
	@Test
	public void case2() {
		String[] queries = {"bbb","cc"};
		String[] words   = {"a","aa","aaa","aaaa"};
		
		assertEquals("[1, 2]",	Arrays.toString(numSmallerByFrequency(queries, words) ));
	}
	
	@Test
	public void case3() {
		String[] queries = {"bba","abaaaaaa","aaaaaa","bbabbabaab","aba","aa","baab","bbbbbb","aab","bbabbaabb"};
		String[] words   = {"aaabbb","aab","babbab","babbbb","b","bbbbbbbbab","a","bbbbbbbbbb","baaabbaab","aa"};
		
		assertEquals("[6, 1, 1, 2, 3, 3, 3, 1, 3, 2]" ,Arrays.toString(numSmallerByFrequency(queries, words) ));
	}
	
	
}
