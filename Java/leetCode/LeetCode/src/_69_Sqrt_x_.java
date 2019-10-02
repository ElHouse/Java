
public class _69_Sqrt_x_ {

	public int mySqrt(int x) {

		return 0;
	}
	
	
	public static void main(String[] args) {
//		2.8284271247461903
		int x = 8;
		
		float left  = 1;
		float right = x/2;
		double pow = 0;
		while(right > left) {
System.out.println("---->");
			System.out.println("left>"+left);
			System.out.println("right>"+right);
			float mid = (right-left)/2;
			pow = Math.pow(mid, 2);
			System.out.println("mid >"+mid);
			System.out.println("pow >"+pow);
			
			if(pow == x) {
				break;
			}
			
			if(pow<x) {
				left += 1;
			}else {
				right-= 1;
			}
			
			
		}
		
		System.out.println("FInal>"+(int)pow);
		
	}
}
