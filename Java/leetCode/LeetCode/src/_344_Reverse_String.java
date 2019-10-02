import java.util.Arrays;

public class _344_Reverse_String {

	public static void reverseString(char[] s) {

		
		if(s==null) 	 return ;
		if(s.length < 1) return ;
		
		int i = 0;
		int f = s.length-1;
		while(i<f) {
			
			char aux = s[i];
			s[i] = s[f];
			s[f] = aux;
			
			i++;
			f--;
			
		}
		
	}

	public static void main(String[] args) {

//		 ["h","e","l","l","o"]
//	     ["H","a","n","n","a","h"]
		
		char[] s = {};
		
		reverseString(s);
		
		System.out.println("final");
		System.out.println(Arrays.toString(s));
		
	}

}