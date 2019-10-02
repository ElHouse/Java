import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class _994_Rotting_Oranges {

	int r = 4;
	
	public int orangesRotting(int[][] grid) {

		
		boolean flag = false;
		int step = -1;
		
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				
				System.out.print(" "+grid[i][j]);
			}
			System.out.println();
		}
		System.out.println("++++");
		do {
			
			step++;
			flag = false;
			
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					
					if(grid[i][j]==r-2) {
						flag = true;
						grid[i][j]=3;	
						rottenUp(grid, i-1, j);
						rottenDown(grid, i+1, j);
						rottenLeft(grid, i, j-1);
						rottenRight(grid, i, j+1);
					}
				}
			}
			r+=2;
		}while(flag);
		
		System.out.println("---------");
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				
				System.out.print(" "+grid[i][j]);
			}
			System.out.println();
		}
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if(grid[i][j]==1) {
					return -1;
				}
			}
		}
		
		
		
		System.out.println("step>"+step);
		
		return step-1;
	}
	
	public void rottenUp(int[][] grid, int x, int y) {
		
		
		if( x >= 0) {
			if(grid[x][y]==1) {
				grid[x][y] = r;
			}
		}
	}
	
	public void rottenDown(int[][] grid, int x, int y) {
		
		
		if( x < grid.length) {
			if(grid[x][y]==1) {
				grid[x][y] = r;
			}
		}
	}
	
	public void rottenLeft(int[][] grid, int x, int y) {
		
		System.out.println(x);
		System.out.println(y);

		if( y >= 0) {
			if(grid[x][y]==1) {
				grid[x][y] = r;
			}
		}
	}
	
	public void rottenRight(int[][] grid, int x, int y) {
		
		if( y < grid.length) {
			System.out.println("right");
			if(grid[x][y]==1) {
				grid[x][y] = r;
			}
		}
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
	
}
