import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class _240_Search_a_2D_Matrix_II {

	public boolean searchMatrix(int[][] matrix, int target) {

		return false;
	}


	public int findX(int[][] matrix, int target) {
		
		return -1;
	}


	
	@Test
	public void case1() {
		int[][] matrix = {
		  {1,   4,  7, 11, 15},
		  {2,   5,  8, 12, 19},
		  {3,   6,  9, 16, 22},
		  {10, 13, 14, 17, 24},
		  {18, 21, 23, 26, 30}
		 };
	
		int target = 4;


		assertEquals(0, findX(matrix, 18));
		
//		assertEquals(0, findX(matrix, 1));
//		assertEquals(1, findX(matrix, 4));
//		assertEquals(2, findX(matrix, 7));
//		assertEquals(3, findX(matrix, 11));
//		assertEquals(4, findX(matrix, 15));
		
				
	}

	

}
