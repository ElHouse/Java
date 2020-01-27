import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class _695_Max_Area_of_Island {

	
//	Runtime: 2 ms, faster than 100.00% of Java online submissions for Max Area of Island.
//	Memory Usage: 44.9 MB, less than 44.44% of Java online submissions for Max Area of Island.
    public int maxAreaOfIsland(int[][] grid) {
     
    	if(grid==null) return 0;
    	
    	for (int i = 0; i < grid.length; i++) {
			
    		for (int j = 0; j < grid[0].length; j++) {
				
				if(grid[i][j] == 1) {
					algo(grid,i,j);
					max = Math.max(max,count);
					count=0;	
				}
    		}
		}
    	
    	

    	for (int i = 0; i < grid.length; i++) {
			
    		for (int j = 0; j < grid[0].length; j++) {
				System.out.print(grid[i][j]);    		
    		}
    		System.out.println();
		}
    	
    	
    	System.out.println("max>"+max);
    	
    	return max;
    }
    
    int count = 0;
    int max   = 0;
    public int algo(int[][] grid, int x, int y) {
    	
    	grid[x][y] = 2;
    	count++;
    	
    	//up
    	if(isValid(x-1, y, grid) && grid[x-1][y] == 1) algo(grid, x-1,y);
    	//down
    	if(isValid(x+1, y, grid) && grid[x+1][y] == 1) algo(grid, x+1,y);
    	//left
    	if(isValid(x, y-1, grid) && grid[x][y-1] == 1) algo(grid, x,y-1);
    	//right
    	if(isValid(x, y+1, grid) && grid[x][y+1] == 1) algo(grid, x,y+1);
    	
    	
    	return 0;
    }
    
    
    public boolean isValid(int x, int y, int[][] grid) {
    	
    	if(x < 0) return false;
    	if(y < 0) return false;
    	
    	if(x >= grid.length ) return false;
    	if(y >= grid[0].length) return false;
    		
    	return true;
    }
    
    @Test
    public void case1() {
    	int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
    	                {0,0,0,0,0,0,0,1,1,1,0,0,0},
    	                {0,1,1,0,1,0,0,0,0,0,0,0,0},
    	                {0,1,0,0,1,1,0,0,1,0,1,0,0},
    	                {0,1,0,0,1,1,0,0,1,1,1,0,0},
    	                {0,0,0,0,0,0,0,0,0,0,1,0,0},
    	                {0,0,0,0,0,0,0,1,1,1,0,0,0},
    	                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
    
    	 assertEquals(6,maxAreaOfIsland(grid));
    	
    }
	
    @Test
    public void case2() {
    	int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0}};
    
    	 assertEquals(0,maxAreaOfIsland(grid));
    	
    }
    
    
	
    @Test
    public void case3() {
    	int[][] grid = {{0,0,0,0,0,0,0,0,0,0,0,0,0}};
    
    	 assertEquals(0,maxAreaOfIsland(grid));
    	
    }
    
    
	
    @Test
    public void case4() {
    	int[][] grid = {{1,1,1,1,1,1,1,1,1,1,1,1,1},
    			{1,1,1,1,1,1,1,1,1,1,1,1,1},
    			{1,1,1,1,1,1,1,1,1,1,1,1,1},
    			{1,1,1,1,1,1,1,1,1,1,1,1,1},
    			{1,1,1,1,1,1,1,1,1,1,1,1,1},
    			{1,1,1,1,1,1,1,1,1,1,1,1,1},
    			{1,1,1,1,1,1,1,1,1,1,1,1,1},
    			{1,1,1,1,1,1,1,1,1,1,1,1,1}};
    	 assertEquals(104,maxAreaOfIsland(grid));
    	
    }
    
    @Test
    public void case5() {
    	int[][] grid = {{0,0,0,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,0,0,0,0,0,0,1,1,0,0,0,0}};
    	 assertEquals(6,maxAreaOfIsland(grid));
    	
    }






    @Test
    public void case6() {
    	int[][] grid = {{1,1,0,1,1},{1,0,0,0,0},{0,0,0,0,1},{1,1,0,1,1}};
    	 assertEquals(3,maxAreaOfIsland(grid));
    	
    }






}
