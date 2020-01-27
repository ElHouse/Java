import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class _537_Complex_Number_Multiplication {

//	Runtime: 2 ms, faster than 49.29% of Java online submissions for Complex Number Multiplication.
//	Memory Usage: 34.6 MB, less than 100.00% of Java online submissions for Complex Number Multiplication.

//	Runtime: 1 ms, faster than 79.89% of Java online submissions for Complex Number Multiplication.
//	Memory Usage: 34.3 MB, less than 100.00% of Java online submissions for Complex Number Multiplication.
	public String complexNumberMultiply(String a, String b) {

		Integer x1,x2,y1,y2;
		
		String[] splited = a.split("\\+");
		x1 = Integer.valueOf(splited[0]);
		String[] img = splited[1].split("i");
		y1 = Integer.valueOf(img[0]);
		
		String[] splited2 = b.split("\\+");
		x2 = Integer.valueOf(splited2[0]);
		String[] img2 = splited2[1].split("i");
		y2 = Integer.valueOf(img2[0]);
				
		Integer x3 = (x1*x2)+( (y1*y2) * -1);
		Integer y3 = (x1*y2)+(y1*x2);
		
		StringBuilder sb = new StringBuilder();
		sb.append(x3);
		sb.append("+");
		sb.append(y3);
		sb.append("i");
		
		return sb.toString();
	}
	
	@Test
	public void case1() {
		
		String a  = "1+1i";
		String b  =  "1+1i";

		assertEquals("0+2i", complexNumberMultiply(a, b));
	}

	@Test
	public void case2() {
		
		String a  = "1+-1i";
		String b  = "1+-1i";

		assertEquals("0+-2i", complexNumberMultiply(a, b));
	}
	
	
	@Test
	public void case3() {
		
		String a  = "-100+-100i";
		String b  = "-100+-100i";

		assertEquals("0+20000i", complexNumberMultiply(a, b));
	}
}
