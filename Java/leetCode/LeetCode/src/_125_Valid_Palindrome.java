import java.util.Arrays;

public class _125_Valid_Palindrome {
//
//	Runtime: 6 ms, faster than 39.68% of Java online submissions for Valid Palindrome.
//	Memory Usage: 37.5 MB, less than 100.00% of Java online submissions for Valid Palindrome.
//	public static boolean isPalindrome(String s) {
//System.out.println("----------");
//		if (s == null)   return false;
//        if (s.isEmpty()) return true;
//		
//		s = s.toLowerCase();
//
//		char[] normal  = new char[s.length()];
//		char[] reverse = new char[s.length()];
//
//		int n = 0;
//		for (int i = 0; i < s.length(); i++) {
//
//			if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
//				normal[n++] = s.charAt(i);
//			}else if(s.charAt(i) >= 48 && s.charAt(i) <= 57) {
//				normal[n++] = s.charAt(i);
//			}
//		}
//		
//		n = 0;
//		for (int i = s.length()-1; i >= 0; i--) {
//			
//			if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
//				if(normal[n++] != s.charAt(i)) return false;
//			}else if(s.charAt(i) >= 48 && s.charAt(i) <= 57) {
//				if(normal[n++] != s.charAt(i)) return false;
//			}
//		}
//
//		return true;
//	}
	
	//
//	Runtime: 4 ms, faster than 82.19% of Java online submissions for Valid Palindrome.
//	Memory Usage: 36.5 MB, less than 100.00% of Java online submissions for Valid Palindrome.
	public static boolean isPalindrome(String s) {
System.out.println("----------");
		if (s == null)   return false;
        if (s.isEmpty()) return true;
		
		s = s.toLowerCase();

		char[] normal  = new char[s.length()];
		char[] reverse = new char[s.length()];

		int n = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				normal[n++] = s.charAt(i);
			}else if(s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				normal[n++] = s.charAt(i);
			}
		}
		
		int r = 0;
		for (int i = s.length()-1; i >= 0; i--) {
			
			if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				reverse[r++] = s.charAt(i);
			}else if(s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				reverse[r++] = s.charAt(i);
			}
		}

		return Arrays.equals(normal, reverse);
	}

	public static void main(String[] args) {
		
		String s = "anita lava la tina";
		System.out.println(isPalindrome(s));//trye
		
		s = "123321";
		System.out.println(isPalindrome(s));//trye
		
		s = "1235321";
		System.out.println(isPalindrome(s));//trye
		
		
		s = "12355321";
		System.out.println(isPalindrome(s));//trye
		
		s = "1234315321";
		System.out.println(isPalindrome(s));//false
		
		
		
		s = null;
		System.out.println(isPalindrome(s));//false
		
		
		s = "";
		System.out.println(isPalindrome(s));//trye
		
		
		
		s = "anita, lava, la tina ? .,.";
		System.out.println(isPalindrome(s));//trye
		
		
		
		
		
		
		
		
	}

}
