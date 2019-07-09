
public class _14_LongestCommonPrefix {

	//Runtime: 1 ms, faster than 99.83% of Java online submissions for Longest Common Prefix.
//	Memory Usage: 38.9 MB, less than 16.64% of Java online submissions for Longest Common Prefix.
	    public String longestCommonPrefix(String[] strs) {
	        
	        if(strs== null || strs.length==0) return "";
	                
	        int minSize = strs[0].length();
	        for(int i=0; i<strs.length; i++){    
	           if(strs[i].length()<minSize)  minSize = strs[i].length();            
	        }
	        
	        StringBuilder sb = new StringBuilder("");
	        
	        for(int i=0; i<minSize; i++){            
	          
	            if(hasPrefix(strs,strs[0].charAt(i), i)) sb.append(strs[0].charAt(i));
	            else break;
	        }
	        
	        return sb.toString();
	    }
	    
	    private boolean hasPrefix(String[] strs, char element, int i){
	        
	        for(int j=0; j<strs.length; j++){
	             
	          if(element != strs[j].charAt(i)){
	              return false;
	          }  
	        }
	        
	        return true;
	    }
}
