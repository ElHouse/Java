
public class _7_Reverse_Integer {

//	operaciones y buscar los request y response
	
	public static int reverse(int x) {

		if(x==0) return 0;
		if(x<10 && x>0) return x;
		int result = 0;
		
		boolean isNegative = x<0;
		x *= isNegative?-1:1;
		
		for(int i=10; i<x*10; i=i*10) {
				
			result = (result*10) + ((x%i) - ( x%(i/10)))/(i/10);	
		}
		
		if(isNegative) {
			result *= -1;
		}
		
		return result==0?isNegative?-1:1:result;
	}

	public static void main(String[] args) {

		
		for(int i=10; i<100000; i*=10) {
			
			System.out.println();
		}
		
		
		System.out.println(reverse(1534236469));
		
	}

}
