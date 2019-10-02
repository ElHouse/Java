
public class _8_String_to_Integer_atoi {

	
//	Runtime: 2 ms, faster than 60.88% of Java online submissions for String to Integer (atoi).
//	Memory Usage: 36.1 MB, less than 100.00% of Java online submissions for String to Integer (atoi).
	public int myAtoi(String str) {

		
		if(str == null)   return 0;
		if(str.isEmpty()) return 0;
		
		boolean numberFound = false;
		boolean isNegative = false;
		int x = -1;
		int y = -1;

		for (int i = 0; i <str.length(); i++) {

			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {//numero

				if (x == -1) {
					
					if(str.charAt(i) != 48) {
						x = i;
						y = i;
					}

					numberFound = true;
				} else {
					y = i;
				}

			} else if (str.charAt(i) == 45) {//signo de - 

				if (isNegative || numberFound) {
					i = str.length()+1;
				}else {
					isNegative = true;
					numberFound = true;
				}
			}else if (str.charAt(i) == 43) {//signo de +

				if (numberFound ) {
					i = str.length()+1;
				}
				numberFound = true;
			}else if( str.charAt(i) == 32 ) {//espacio
				if(numberFound) {
					i = str.length()+1;
				}
			} else {//otros

				i = str.length()+1;
				
			}

		}

		if(x==-1) return 0;
		else if( y-x >10 ) {
			return isNegative?Integer.MIN_VALUE:Integer.MAX_VALUE;
		}
		
		
		long number = Long.parseLong(str.substring(x, ++y));
		
		if(number>Integer.MAX_VALUE) {
			number = isNegative?Integer.MIN_VALUE:Integer.MAX_VALUE;
			return (int) number;
		}
		
//		
		return (int) (isNegative?(number*-1):number);
		
	}
	
	public void valid(String testCase, int result) {
		
		System.out.println(testCase+ "->" + (result==myAtoi(testCase)));
	}

	public static void main(String[] args) {

		_8_String_to_Integer_atoi a = new _8_String_to_Integer_atoi();
	//  0123456789
//		2147483647

//		System.out.println(".."+Integer.MAX_VALUE);
//		System.out.println(".."+Integer.MIN_VALUE);
		
		a.valid("42", 42);
		a.valid("  +42", 42);
		a.valid("1111", 1111);
		a.valid("2", 2);
		a.valid("42", 42);
		a.valid("42", 42);
		a.valid("   -42", -42);
		a.valid("42", 42);
		a.valid("4193 with words", 4193);
		a.valid("words and 987", 0);
		a.valid("-91283472332", Integer.MIN_VALUE);
		a.valid("sajdlksjadlsajd-2313", 0);
		a.valid(" -123 123 ", -123);
		a.valid(" -1 23 123 ",-1);
		a.valid(" - 123 123 ", 0);
		a.valid("   ", 0);
		a.valid("", 0);
		a.valid(null, 0);
		a.valid("20000000000000000000", Integer.MAX_VALUE);
		a.valid("0-1", 0);
		a.valid("-91283472332", Integer.MIN_VALUE);
		a.valid("  0000000000012345678", 12345678);
    	a.valid("-2147483647", -2147483647);
    	a.valid("123-", 123);
    	a.valid("123+", 123);
    	a.valid("+123+", 123);
    	a.valid("-123+", -123);
	}

	
}
