import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class _824_Goat_Latin {

//	Runtime: 2 ms, faster than 95.69% of Java online submissions for Goat Latin.
//	Memory Usage: 35.8 MB, less than 100.00% of Java online submissions for Goat Latin.
	public String toGoatLatin(String S) {

		if(S==null) return "";
		String[] words = S.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<words.length; i++) {
			
			sb.append(algo(words[i],i+1));
			sb.append(" ");
		}
	
		sb.deleteCharAt(sb.length()-1);
		
		return sb.toString();
	}
	
	public String algo(String word, int count) {
		
		StringBuilder sb  = new StringBuilder();
		
		char aux = word.toLowerCase().charAt(0);
		
		if(aux == 'a' || aux == 'e' || aux == 'i' || aux == 'o' || aux == 'u') {
			
			sb.append(word);
			
		}else {
			sb.append(word.substring(1));
			sb.append(word.charAt(0));
		}
		
		sb.append("ma");
		
		for (int i = 0; i < count; i++) {
			sb.append("a");
		}
		
		return sb.toString();
	}
	
	@Test
	public void case1() {
		String S = "I speak Goat Latin";
		assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", toGoatLatin(S));
	}
	
	@Test
	public void case2() {
		String S =  "The quick brown fox jumped over the lazy dog";
		assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa", toGoatLatin(S));
	}
	
	
}
