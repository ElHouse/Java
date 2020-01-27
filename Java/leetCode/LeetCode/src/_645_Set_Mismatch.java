import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class _645_Set_Mismatch {

	public int[] findErrorNums(int[] nums) {
		if (nums == null)	return new int[2];
		
		int[] answer = new int[2];
		int numberNotFound = -1;
		int numberRepeated = -1;
		
		Arrays.sort(nums);

		for (int i = 0; i < nums.length ; i++) {
		
			if(numberNotFound == -1 && nums[i] != i+1   ) {
				numberNotFound = i+1;
			}
			
			if (numberRepeated == -1 && nums[i] == nums[i + 1]) {
				numberRepeated  =  nums[i];
			}
		}

//		System.out.println("numberNotFound>"+numberNotFound);
//		System.out.println("numberRepeated>"+numberRepeated);

		answer[0] = numberRepeated;
		answer[1] = numberNotFound;
		
		return answer;
	}
	
	
	public int repeatedNumber(int[] nums) {
		
		if (nums == null)	return -1;

		
		
		
		return -1;
		
	}
	
	
	@Test
	public void case1() {
		System.out.println("--------------CASE 1");
		int[] nums = {1,2,2,4};
		int[] ans = {2,3};
		
		assertEquals(Arrays.toString(ans), Arrays.toString(findErrorNums(nums)));
	}

	
	@Test
	public void case2() {

		System.out.println("--------------CASE 2*");
		int[] nums = {1,2,3,4,4};
		int[] ans = {4,5};
		
		assertEquals(Arrays.toString(ans), Arrays.toString(findErrorNums(nums)));
	}
	
	
	@Test
	public void case3() {

		System.out.println("--------------CASE 3");
		int[] nums = {1,1,3,4};
		int[] ans = {1,2};
		
		assertEquals(Arrays.toString(ans), Arrays.toString(findErrorNums(nums)));
	}
	
	
	@Test
	public void case4() {

		System.out.println("--------------CASE 4");
		int[] nums = {1,2,3,4,5,6,7,8,9,9,11};
		int[] ans = {9,10};
		
		assertEquals(Arrays.toString(ans), Arrays.toString(findErrorNums(nums)));
	}
	
	@Test
	public void case5() {

		System.out.println("--------------CASE 5*");
		int[] nums = {1,1};
		int[] ans = {1,2};
		
		assertEquals(Arrays.toString(ans), Arrays.toString(findErrorNums(nums)));
	}
	
	
	
	@Test
	public void case6() {

		System.out.println("--------------CASE 6");
		int[] nums = {2,2};
		int[] ans = {2,1};
		
		assertEquals(Arrays.toString(ans), Arrays.toString(findErrorNums(nums)));
	}
	
	@Test
	public void case7() {

		System.out.println("--------------CASE 7");
		int[] nums = {3,2,3,4,6,5};
		int[] ans = {3,1};
		
		assertEquals(Arrays.toString(ans), Arrays.toString(findErrorNums(nums)));
	}
	
	@Test
	public void case8() {

		System.out.println("--------------CASE 7");
		int[] nums = {1,5,3,2,2,7,6,4,8,9};
		int[] ans = {2,10};
		
		assertEquals(Arrays.toString(ans), Arrays.toString(findErrorNums(nums)));
	}
	
	
}
