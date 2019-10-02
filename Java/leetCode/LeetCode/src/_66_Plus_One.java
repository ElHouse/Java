import java.util.Arrays;

public class _66_Plus_One {
	 public int[] plusOne(int[] digits) {
	        
	        boolean allNine = true;
	        for(int i=0; i<digits.length; i++){
	            if(digits[i]!=9){
	                allNine = false;
	            }
	        }
	        
	        
	        if(allNine) return allNineCase(digits.length);
	        
	        
	        for(int i=digits.length-1; i>-1; i--){
	            
	            if(digits[i]==9){
	                digits[i]=0;
	            }else{
	                digits[i]=digits[i]+1;
	                break;
	            }
	        }
	        
	        return digits;
	    }

	    public static int[] allNineCase(int length){
	        
	        int[] digits = new int[length+1];
	        digits[0] = 1;
	        
	        return digits;
	        
	    }
}
