import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class _1219_Path_with_Maximum_Gold {


	int max  = 0;
	int[][] aux ;
	
	public int getMaximumGold(int[][] grid) {

		aux = new int[grid.length][grid[0].length];
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
			
				if(grid[i][j]!=0 && aux[i][j]==0 ) {
					System.out.println("---1");
					dfs(grid,i,j,0);
				}
			}
		}
		
		return max;
	}
	
	
	public void  dfs(int[][] grid, int x, int y, int count) {
		
		if(x >= 0 && x < grid.length && y>=0 && y<grid[0].length  && grid[x][y] != 0 && aux[x][y]==0 ) {
						
			count+=grid[x][y];
			max = Math.max(max, count);
			
			aux[x][y]=1;
			
			dfs(grid,x+1,y,count);
			dfs(grid,x-1,y,count);
			dfs(grid,x,y+1,count);
			dfs(grid,x,y-1,count);
			aux[x][y]=0;
		}
		
	}

	@Test
	public void case1() {
	
		int[][] grid = {{0,6,0},{5,8,7},{0,9,0}};
		
		assertEquals(24, getMaximumGold(grid));
		
	}
	@Test
	public void case2() {
	
		int[][] grid = {{1,0,7},{2,0,6},{3,4,5},{0,3,0},{9,0,20}};
		
		assertEquals(28, getMaximumGold(grid));
		
	}
	
}
