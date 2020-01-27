import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class _154_Find_Minimum_in_Rotated_Sorted_Array_II {
	
	
	public int findMin(int[] nums) {

		if (nums == null || nums.length == 0)
			return -1;

		int n = findPivot(nums);

		return nums[n == -1 ? 0 : n];
	}

	public int findPivot(int[] nums) {

		int x = 0;
		int y = nums.length - 1;

		while (y > x) {

			int mid = (y + x) / 2 + (y + x) % 2;

			System.out.println("x>"+x);
			System.out.println("y>"+y);
			System.out.println("mid>"+mid);
			if (mid == 0) {
				System.out.println("return  | >");
				return nums.length;
			}
			if (nums[mid - 1] > nums[mid]) {
				System.out.println("return  || >");
				return mid;
			} else {
				if (nums[mid] > nums[x]) {
					x = mid;
				} else if(nums[mid] < nums[x]){
					y = mid;
				}else {
					y--;
				}
			}

		}

		return -1;
	}

	@Test
	public void case1() {
		int[] nums = { 3, 4, 5, 1, 1, 2 ,2, 2};
		assertEquals(1, findMin(nums));
	}

	@Test
	public void case2() {
		int[] nums = { 4, 5, 6, 7, 0, 0, 1, 2 };
		assertEquals(0, findMin(nums));
	}

	@Test
	public void case3() {
		int[] nums = { 4 ,4 };
		assertEquals(4, findMin(nums));
	}

	@Test
	public void case4() {
		int[] nums = { 4, 4, 5 };
		assertEquals(4, findMin(nums));
	}

	@Test
	public void case5() {
		int[] nums = { 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 0, 0, 1, 2, 3 };
		assertEquals(0, findMin(nums));
	}

	@Test
	public void case6() {
		int[] nums = { 0, 1, 2 };
		assertEquals(0, findMin(nums));
	}

	@Test
	public void case7() {
		int[] nums = { 4, 5, 6, 7, 0, 0 ,0, 0, 0, 0, 1, 2 };
		assertEquals(0, findMin(nums));
	}

	
	@Test
	public void case8() {
		int[] nums = { 1,3,5 };
		assertEquals(1, findMin(nums));
	}

	@Test
	public void case9() {
		int[] nums = { 2,2,2,0,1 };
		assertEquals(0, findMin(nums));
	}
	
	@Test
	public void case10() {
		int[] nums = {3,1,3,3};
		assertEquals(1, findMin(nums));
	}
	
}
