import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Test;

public class _463_Island_Perimeter {

	int area = 0;
	
//	Runtime: 7 ms, faster than 74.34% of Java online submissions for Island Perimeter.
//	Memory Usage: 58.6 MB, less than 97.92% of Java online submissions for Island Perimeter.
    public int islandPerimeter(int[][] grid) {
     
    	if(grid==null) return 0;
    	int area = 0;
    	for (int i = 0; i < grid.length; i++) {
    		for (int j = 0; j < grid[0].length; j++) {
				
    			if(grid[i][j]==1) {
    				
    				if(i-1 < 0 ||  grid[i-1][j] == 0) area++;
			    	if(j-1 < 0 ||  grid[i][j-1] == 0) area++;
			    	
			    	if(i+1 >= grid.length    || grid[i+1][j] == 0)   area++;
			    	if(j+1 >= grid[0].length || grid[i][j+1] == 0) area++;

    			}
    		}
		}
    		
    	return area;
    }
    
    public void print(int[][] grid) {
    	
    	for (int i = 0; i < grid.length; i++) {
    		for (int j = 0; j < grid[0].length; j++) {
    			
    			System.out.print(" "+grid[i][j]);
    		}
    		System.out.println();
    	}
    }
    
//	Runtime: 10 ms, faster than 30.35% of Java online submissions for Island Perimeter.
//	Memory Usage: 58.9 MB, less than 97.92% of Java online submissions for Island Perim 
    public int islandPerimeter2(int[][] grid) {
        
    	if(grid==null) return 0;
    	
    	for (int i = 0; i < grid.length; i++) {
			
    		for (int j = 0; j < grid[0].length; j++) {
				
    			if(grid[i][j]==1) {
    				
    				//up
    		    	if(isValid(i-1, j, grid)) { 
    		    	
    		    		if( grid[i-1][j] != 1) {
	    		    		area++;
    		    		}
    		    	}else {
    		    		area++;
    		    	}
    		    	
    		    	//down
    		    	if(isValid(i+1, j, grid)) { 
        		    	
    		    		if( grid[i+1][j] != 1) {
	    		    		area++;
    		    		}
    		    	}else {
    		    		area++;
    		    	}
    		    	
    		    	//left
    		    	if(isValid(i, j-1, grid)) { 
        		    	
    		    		if( grid[i][j-1] != 1) {
	    		    		area++;
    		    		}
    		    	}else {
    		    		area++;
    		    	}
    		    	
    		    	//right
    		    	if(isValid(i, j+1, grid)) { 
        		    	
    		    		if( grid[i][j+1] != 1) {
	    		    		area++;
    		    		}
    		    	}else {
    		    		area++;
    		    	}
    			}
    		}
		}
    		
    	return area;
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
    	
    	
    	int[][] grid = {{0,1,0,0},
				    	{1,1,1,0},
				    	{0,1,0,0},
				    	{1,1,0,0}};
    	
    	assertEquals(16, islandPerimeter(grid));
    	
    	
    }
    
    
    @Test
    public void case2() {
    	
    	
    	int[][] grid = {{1,1,1,1},
				    	{1,1,1,1},
				    	{1,1,1,1},
				    	{1,1,1,1}};
    	
    	assertEquals(16, islandPerimeter(grid));
    	
    	
    }
    
    
    @Test
    public void case3() {
    	
    	
    	int[][] grid = {{0,0,0,0},
				    	{1,1,1,1},
				    	{0,0,0,1},
				    	{0,0,0,1}};
    	
    	assertEquals(14, islandPerimeter(grid));
    	
    	
    }
    
    @Test
    public void case4() {
    	
    	
    	int[][] grid = {{0,0,0,0},
				    	{0,1,1,0},
				    	{0,1,1,0},
				    	{0,0,0,0}};
    	
    	assertEquals(8, islandPerimeter(grid));
    	
    	
    }
    
    
    @Test
    public void case5() {
    	
    	
    	int[][] grid = {{0,0,0,0},
				    	{0,1,0,0},
				    	{0,0,0,0},
				    	{0,0,0,0}};
    	
    	assertEquals(4, islandPerimeter(grid));
    	
    	
    }
    
    
    @Test
    public void case6() {
    	
    	
    	int[][] grid = {{0,0,0,0},
				    	{0,1,1,0},
				    	{0,0,0,0},
				    	{0,0,0,0}};
    	
    	assertEquals(6, islandPerimeter(grid));
    	
    	
    }
    
    

	
	
}
