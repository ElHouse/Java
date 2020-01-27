import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class _500_Keyboard_Row {

	
//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Keyboard Row.
//	Memory Usage: 34.9 MB, less than 92.31% of Java online submissions for Keyboard Row.
    public String[] findWords(String[] words) {
     
    	
    	List<String> answer = new ArrayList<>();
    	String line1= "qwertyuiop";
    	String line2= "asdfghjkl";
    	String line3= "zxcvbnm";

    	boolean[] set1 = new boolean[26];
    	boolean[] set2 = new boolean[26];
    	boolean[] set3 = new boolean[26];
    	
    
    	for (int i = 0; i < line1.length(); i++) {
			set1[line1.charAt(i)-'a'] = true;
		}
    	
    	for (int i = 0; i < line2.length(); i++) {
			set2[line2.charAt(i)-'a'] = true;
		}
    	
    	for (int i = 0; i < line3.length(); i++) {
			set3[line3.charAt(i)-'a'] = true;
		}
    	
    	
    	for(String word : words) {
    	
    		String aux = word.toLowerCase();
    		
    		if(isInThisSet(set1, aux) || isInThisSet(set2, aux) ||isInThisSet(set3, aux) ) {
    			
    			answer.add(word);    			
    		}
    	}
    	    	
    	answer.forEach(System.out::println);
    	
    	
    	String[] itemsArray = new String[answer.size()];
        itemsArray = answer.toArray(itemsArray);
    	return itemsArray;
    
    }
    
    
    public boolean isInThisSet(boolean[] set, String word) {
    	
    	for(Character c : word.toCharArray()) {
    	    		
    		if(set[c-'a']==false) return false;
    		
    	}
    	
    	return true;
    }
    
    
    @Test
    public void case1() {
    	
    	String[] words = {"Hello", "Alaska", "Dad", "Peace"};
    
    	findWords(words);
    }
    
}
