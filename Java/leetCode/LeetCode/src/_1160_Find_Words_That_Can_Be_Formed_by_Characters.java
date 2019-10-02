import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class _1160_Find_Words_That_Can_Be_Formed_by_Characters {

	
//	Runtime: 85 ms, faster than 5.46% of Java online submissions for Find Words That Can Be Formed by Characters.
//	Memory Usage: 36.9 MB, less than 100.00% of Java online submissions for Find Words That Can Be Formed by Characters.
	public int countCharacters(String[] words, String chars) {

		if(chars ==  null) return 0;
		if(words ==  null) return 0;
		
		Map<Character,Integer> letters = trasformWordToMap(chars);
		int count = 0;
		
		for(String word: words) {
		
			Map<Character,Integer> wordMap = trasformWordToMap(word);
			
			if(isEnoughLetters(wordMap, letters)) {
				count += word.length();
			}
			
		}
		
		return count;
	}
	
	public boolean isEnoughLetters(Map<Character,Integer> word, Map<Character,Integer> letters) {
		
		for(Character c : word.keySet()) {
		
			if(letters.containsKey(c)) {
				if( letters.get(c) < word.get(c)){
					return false;
				}
			}else {
				return false;
			}
		}
		
		return true;
	}

	
	public Map<Character,Integer> trasformWordToMap(String word){
		
		Map<Character,Integer> map = new HashMap<>();
		
		word.chars().forEach(c->{
			if(map.containsKey((char)c)) {
				map.replace((char)c, map.get((char)c)+1);
			}else {
				map.put((char)c, 1);
			}
		});
		
		return map;
	}
	
	
	@Test
	public void case0() {
		
		assertEquals(0,countCharacters(null, null));
	}
	
	@Test
	public void case1() {
		
		String[] words = {"cat","bt","hat","tree"};
		String   chars = "atach";
		
		assertEquals(6,countCharacters(words, chars));
	}
	
	@Test
	public void case2() {
		
		String[] words = {"hello","world","leetcode"};
		String   chars = "welldonehoneyr";
		
		assertEquals(10,countCharacters(words, chars));
	}
	
	
	@Test
	public void case3() {
		
		String[] words = {"hello","world","leetcode"};
		String   chars = "well";
		
		assertEquals(0,countCharacters(words, chars));
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
