import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class _49_Group_Anagrams {

//	Runtime: 41 ms, faster than 11.82% of Java online submissions for Group Anagrams.
//	Memory Usage: 41.4 MB, less than 94.74% of Java online submissions for Group Anagrams.
	public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> answer = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();
		
		
		for(String str : strs) {
			
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			
			String aux = String.valueOf(chars);
						
			if(!map.containsKey(aux)) map.put(aux,  new ArrayList<>());
		                        
			map.get(aux).add(str);
		}
		
		map.forEach((k,v)->{
			answer.add(v);
		} );
				
		return answer;
	}
	
	
	
	
	
	
//	@Test
	public void case1() {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
	
		groupAnagrams(strs);
	}
	
	
	@Test
	public void case2() {
		String[] strs = {"abc", "dbc", "qwe", "ksajd","sad"};
	
		groupAnagrams(strs);
	}
	
	
}