import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class _1108_Defanging_an_IP_Address {

	public String defangIPaddr(String address) {

		if(address==null || address.isEmpty()) return null;
		
		return address.replaceAll("\\.", "[.]");
	}

	@Test
	public void case1() {
		
		String address = "1.1.1.1";
		assertEquals("1[.]1[.]1[.]1",defangIPaddr(address));
	}
	
	
	@Test
	public void case2() {
		
		String address =  "255.100.50.0";
		assertEquals("255[.]100[.]50[.]0",defangIPaddr(address));
	}

}
