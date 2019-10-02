import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class _1185_Day_of_the_Week {

	
//	Runtime: 33 ms, faster than 13.37% of Java online submissions for Day of the Week.
//	Memory Usage: 34.8 MB, less than 100.00% of Java online submissions for Day of the Week.
	public String dayOfTheWeek(int day, int month, int year) {

		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};
		
		LocalDate dia = LocalDate.of(year, month, day).getDayOfWeek().getValue()-1;
				
		return days[dia.getDayOfWeek().getValue()-1];
	}
	
	@Test
	public void case1() {
		
		assertEquals("Saturday",dayOfTheWeek(31, 8, 2019));
	}

	
	@Test
	public void case2() {
		
		assertEquals("Sunday",dayOfTheWeek(18, 7, 1999));
	}
	
	@Test
	public void case3() {
		
		assertEquals("Sunday",dayOfTheWeek(15, 8, 1993));
	}
}
