
public class _172_FactorialTrailingZeroes {

	
	public static void main(String[] args) {
		
		for(int i=3; i<36; i++)
		System.out.println(i+"R:"+algo2(i));
	}
	
	
	public static int algo2(int n) {
		
		if(n<=4 ) return 0;
		
		
		int newN = n;
		
		int div = newN / 5;
		
		int xx = n/25;
		div+=xx;
		
		int xxx = n/200;
		div+=xxx;

			
		return div;
		
	}
	
	 public static int trailingZeroes(int n) {
	        
		    if(n==0) return 0;
	        long num = 1;
	        for(int i=2; i<=n; i++){
	            num = num * i;
	        }
	        
	        System.out.println(num);
	        if(num==0) return 0;
	        int count = 0 ;
	        int i = 10;
	        while(true) {
	        	
	        	if(num%i==0) {
	        		count++;
	        		i*=10;
	        	}else {
	        		break;
	        	}
	        		
	        }
	        
	        
	        return count;
	    }
}
