


public class _263_Ugly_Number {

//	Runtime: 1 ms, faster than 
//		95.31% of Java online submissions for Ugly Number.
//	Memory Usage: 32.2 MB, less than
//		100.00% of Java online submissions for Ugly Number.
	public static void main(String[] args) {
		

		System.out.println("6-true>"+ isUgly(6));
		System.out.println("8-true>"+ isUgly(8));
		System.out.println("14-false>"+ isUgly(14));

		System.out.println("20-true>"+ isUgly(20));
		System.out.println("40-true>"+ isUgly(40));
		System.out.println("17-false>"+ isUgly(17));
	
	
	}
	
	
	
	 public static boolean isUgly(int num) {
		    
	        
	        if(num==1) return true;
	        if(num<0)  return false;
	        
	        int aux = num;
	        
	        while(aux>0) {
//	        System.out.println("aux>"+aux);
	        	if(aux%2==0)      aux = aux/2;
	        	else if(aux%3==0) aux = aux/3;
	        	else if(aux%5==0) aux = aux/5;
	        	else if(aux == 1) return true;
	        	else return false;
	        	
	        }
	
	                
	        return true;
	    
	    }
}
