import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class _890_Find_and_Replace_Pattern {

//	Runtime: 1 ms, faster than 94.73% of Java online submissions for Find and Replace Pattern.
//	Memory Usage: 36.4 MB, less than 100.00% of Java online submissions for Find and Replace Pattern.

	public List<String> findAndReplacePattern(String[] words, String pattern) {

		List<String> list = new ArrayList<>();

		for (String word : words) {
			if (algo(word, pattern))
				list.add(word);
		}
		
		return list;
	}

	public boolean algo(String word, String pattern) {

		Map<Character,Character> map1 = new HashMap<>();
		Map<Character,Character> map2 = new HashMap<>();
		
		for(int i=0; i<pattern.length(); i++) {

			char p = pattern.charAt(i);
			char w = word.charAt(i);
					
			if(!map1.containsKey(p)) {
				map1.put(p,w);
			}else {
				char aux = map1.get(p);
				if(aux != w) return false;
			}
			
			if(!map2.containsKey(w)) {
				map2.put(w,p);
			}else {
				char aux = map2.get(w);
				if(aux != p) return false;
			}
		}
		
		return true;
	}

	@Test
	public void case1() {
		String[] words = { "abc", "deq", "mee", "aqq", "dkd", "ccc","baa" };
		String pattern                                      = "abb";
		assertEquals("[mee, aqq, baa]", findAndReplacePattern(words, pattern).toString() );
	}

	@Test
	public void case2() {
		String[] words = { "ef","fq","ao","at","lx" };
		String pattern   =           "ya";
		//["ef","fq","ao","at","lx"]
		//["ef","fq","          lx"]
		assertEquals("[ef, fq, ao, at, lx]", findAndReplacePattern(words, pattern).toString() );
	}

}
