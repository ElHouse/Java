import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class _929_Unique_Email_Addresses {

	
//	Runtime: 8 ms, faster than 91.37% of Java online submissions for Unique Email Addresses.
//	Memory Usage: 38.7 MB, less than 93.67% of Java online submissions for Unique Email Addresses.
	public int numUniqueEmails(String[] emails) {

		if(emails == null || emails.length==0 ) return 0; 
		
		Set<String> retorno = new HashSet<>();
		
		for(String str: emails) {
			retorno.add(formatEmail(str));
		}
		
		return retorno.size();
	}
	
	public String formatEmail(String email) {
		
		StringBuilder sb = new StringBuilder(); 
		
		String[] split = email.split("@");
		
		for(int i=0; i<split[0].length(); i++) {

			if(split[0].charAt(i) == '+' ) break;
			else if(split[0].charAt(i) == '.' ) ;
			else {
				sb.append(split[0].charAt(i));
			}
		
		}
		
		sb.append("@");
		sb.append(split[1]);
		
		return sb.toString();
	}
	
	
	@Test
	public void case1() {
	
		String[] emails = {"test.email+alex@leetcode.com",
						   "test.e.mail+bob.cathy@leetcode.com",
						   "testemail+david@lee.tcode.com"};
		
		assertEquals(2, numUniqueEmails(emails));
	}

	
	@Test
	public void case2() {
	

		
		assertEquals(0, numUniqueEmails(null));
	}
	
	@Test
	public void case3() {
	
		String[] emails = {"test.email+alex@leetcode.com",
						   "test.e.mail+bob.cathy@leetcode.com",
						   "testemail+david@lee.tcode.com",
						   "acr@adssa.com"};
		
		assertEquals(3, numUniqueEmails(emails));
	}
	
	
	@Test
	public void case4() {
	
		String[] emails = {"test.email+alex@leetcode.com",
						   "test.e.mail+bob.cathy@leetcode.com",
						   "testemail+david@leetcode.com"};
		
		assertEquals(1, numUniqueEmails(emails));
	}
	
	
	@Test
	public void case5() {
	
		String[] emails = {"test.email+alex@leetcode.com"};
		
		assertEquals(1, numUniqueEmails(emails));
	}
	
}
