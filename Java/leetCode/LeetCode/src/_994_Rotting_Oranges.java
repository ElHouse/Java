import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class _994_Rotting_Oranges {

	int r = 4;
	boolean isARotten = false;
		
	public void rotting(int[][] grid, int x, int y) {
		
		if(x>= 0 && x < grid.length && y >= 0 && y<grid[x].length && grid[x][y] == 1 ) {
			isARotten = true;
			grid[x][y] = r;
		}
	}
	
//	Runtime: 1 ms, faster than 100.00% of Java online submissions for Rotting Oranges.
//	Memory Usage: 38.9 MB, less than 81.25% of Java online submissions for Rotting Oranges.
	public int orangesRotting(int[][] grid) {

		boolean isAFresh  = false;		
		int step = -1;
		
		do {
			
			step++;
			isAFresh  = false;
			isARotten = false;
			
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					
					if(grid[i][j]==r-2) {
						grid[i][j]=0;	
						rotting(grid, i-1, j);
						rotting(grid, i+1, j);
						rotting(grid, i  , j-1);
						rotting(grid, i  , j+1);
					}
					if(grid[i][j]==1) {
						isAFresh = true;
					}
				}
			}
			
			r+=2;

		}while(isARotten);
		
			
		if(!isARotten && isAFresh) {
			return -1;
		}
		
		System.out.println("step>"+step);
		
		return step;
	}
			
	@Test
	public void case1() {
		 System.out.println("-----------case 1");
		int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
		assertEquals(4,orangesRotting(grid));
	}
	
	@Test
	public void case2() {
		
		
		System.out.println("-------------case 2");
		int[][] grid = {{1,2,1},{0,0,0},{0,0,0}};
		 
		assertEquals(1,orangesRotting(grid));
	}

	@Test
	public void case3() {
		
		
		System.out.println("-------------case 3");
		int[][] grid = {{2,1,1},{0,1,1},{1,0,1}};
		
		assertEquals(-1,orangesRotting(grid));
	}
	
	@Test
	public void case4() {
		
		
		System.out.println("-------------case 4");
		int[][] grid = {{0,2}		};

		
		assertEquals(0,orangesRotting(grid));
	}
	
	@Test
	public void case5() {
		
		
		System.out.println("-------------case 5");
		int[][] grid = {{0}};

		
		assertEquals(0,orangesRotting(grid));
	}
	
	
	@Test
	public void case6() {
		
		
		System.out.println("-------------case 6");
		int[][] grid = {{1},{2}};

		
		assertEquals(1,orangesRotting(grid));
	}
	
}
