import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class _819_Most_Common_Word {

	public boolean isBanned(String word, String[] banned) {
		
		for (int i = 0; i < banned.length; i++) {
			if(word.equals(banned[i])) {
				return true;
			}
		}
		return false;
	}
	
//	Runtime: 15 ms, faster than 62.07% of Java online submissions for Most Common Word.
//	Memory Usage: 36.8 MB, less than 87.88% of Java online submissions for Most Common Word.
	public String mostCommonWord(String paragraph, String[] banned) {

		System.out.println("---------------");
		if(paragraph == null) return null;
		
		System.out.println(paragraph);
		
		paragraph = paragraph.replaceAll("!","")
				.replaceAll("\\?","")
				.replaceAll("'","")
				.replaceAll(","," ")
				.replaceAll(";","")
				.replaceAll("\\.","").toLowerCase();
		
		paragraph.replace("  ", " ").trim();
		
		System.out.println("sin signos->"+paragraph );
		
		String[] spl = paragraph.split(" ");
		
		Map<String,Integer>  mapa = new HashMap<>();
		
		for (int i = 0; i < spl.length; i++) {
			
			if(!isBanned(spl[i], banned) && !spl[i].equals("")) {
				if(mapa.containsKey(spl[i])) {
					mapa.put(spl[i],mapa.get(spl[i])+1);
				}else {
					mapa.put(spl[i], 1);
				}
			}
			
		}
		
		int max = 0;
		String aux = "";
		for(String str: mapa.keySet()) {
		
			System.out.println("->"+str);
			
			if(max < mapa.get(str)) {
				max = mapa.get(str);
				aux = str;
			}
			
		}
		
		
		return aux;
	}
	
	@Test
	public void case1() {
		
		String   paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned    = {"hit"};
		
		assertEquals("ball",mostCommonWord(paragraph, banned));
		
	}
	
	
	@Test
	public void case2() {
		
		String   paragraph = "Bob hit a ball the the ! the , the hit BALL flew far after it was hit.";
		String[] banned    = {"hit"};
		
		assertEquals("the",mostCommonWord(paragraph, banned));
		
	}
	
	
	@Test
	public void case3() {
		
		String   paragraph = "was";
		String[] banned    = {"hit"};
		
		assertEquals("was",mostCommonWord(paragraph, banned));
		
	}
	
	
	@Test
	public void case4() {
		
		String   paragraph = "Bob hit a a a ball, the hit BALL flew far after it was hit .";
		String[] banned    = {"hit","the","it","ball"};
		
		assertEquals("a",mostCommonWord(paragraph, banned));
		
	}
	
	@Test
	public void case45() {
		
		String   paragraph = "Bob. hIt, baLl";
		String[] banned    = {"bob", "hit"};
		
		assertEquals("ball",mostCommonWord(paragraph, banned));
		
	}
	
	
	@Test
	public void case46() {
		
		String   paragraph = "a, a, a, a, b,b,b,c, c";
		String[] banned    = {"a"};
		
		assertEquals("b",mostCommonWord(paragraph, banned));
		
	}
	
	
	@Test
	public void case47() {
		
		String   paragraph = "abc abc? abcd the jeff!";
		String[] banned    = {"abc","abcd","jeff"};
		
		assertEquals("the",mostCommonWord(paragraph, banned));
		
	}
	
}
