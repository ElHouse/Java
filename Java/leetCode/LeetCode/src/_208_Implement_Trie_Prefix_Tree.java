import org.junit.Test;

public class _208_Implement_Trie_Prefix_Tree {

     
    
   class TrieNode{
    	
    	public static final int N = 26;   
        TrieNode[] children = new TrieNode[N]; 
       
        boolean isWord; 
          
        TrieNode(){ 
        	isWord = false; 
            for (int i = 0; i < N; i++) 
                children[i] = null; 
        } 
    }; 
       
    TrieNode root = null;
    
    /** Initialize your data structure here. */
    public _208_Implement_Trie_Prefix_Tree() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        
    	
    	TrieNode aux = root;
    	
    	for (int i = 0; i < word.length(); i++) {
			if(aux.children[ word.charAt(i)-'a']  == null ) {
    			aux.children[ word.charAt(i)-'a'] = new TrieNode();
    		}
    		
    		aux = aux.children[ word.charAt(i)-'a'];
		}
    	
    	aux.isWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
    	    	
    	TrieNode aux = root;
    	
    	for (int i = 0; i < word.length(); i++) {
			
    		if(aux.children[ word.charAt(i)-'a']  == null ) {
    			return false;
    		}
    		
    		aux = aux.children[ word.charAt(i)-'a'];
		}
    	
        return aux.isWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        
    	TrieNode aux = root;
    	
    	for (int i = 0; i < prefix.length(); i++) {
			
    		if(aux.children[ prefix.charAt(i)-'a']  == null ) {
    			return false;
    		}
    		
    		aux = aux.children[ prefix.charAt(i)-'a'];
		}
    	
        return true;
    }
	
    
	public void printTrie(TrieNode root) {
		
		TrieNode aux = root;
		
		for (int i = 0; i < 26; i++) {
			if(aux.children[i]!=null) {
				System.out.print("-> "+(char)('a'+i));
				printTrie(aux.children[i]);
			}
		}
		
		if(aux == this.root)	System.out.println();
	}
    
    @Test
    public void case1() {
    	_208_Implement_Trie_Prefix_Tree trie = new _208_Implement_Trie_Prefix_Tree();

    	trie.insert("apple");
    	trie.printTrie(trie.root);
    	System.out.println(trie.search("apple"));   // returns true
    	System.out.println(trie.search("app"));     // returns false
    	System.out.println(trie.startsWith("app")); // returns true
    	trie.insert("app");  
    	trie.printTrie(trie.root);
    	trie.insert("dog");  
    	trie.printTrie(trie.root);
    	System.out.println(trie.search("app"));     // returns true
    }
    
    
    
}
