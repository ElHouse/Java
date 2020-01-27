import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class _980_Unique_Paths_III {

	 int oneTotal = 1;
	 int paths = 0;
	 String parO = "(";
	 String parC = ")";
	 String comma = ",";
		
//	 Runtime: 9 ms, faster than 10.82% of Java online submissions for Unique Paths III.
//	 Memory Usage: 43.3 MB, less than 6.67% of Java online submissions for Unique Paths III.
	 public int uniquePathsIII(int[][] matrix) {
	        
		 if(matrix == null ) return 0;
		 
		 int x = 0;
		 int y = 0;
		 for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					if(matrix[i][j]==0) {
						oneTotal++;
					}else if(matrix[i][j]==1) {
						x = i;
						y = j;
					}
				}		
			}
			dfs(x, y, 0, matrix, "");
						
			return paths;
	    }

	 
		public void dfs(int x, int y, int count, int[][] matrix, String path) {
			
			int[][] auxMatrix = new int[matrix.length][matrix[0].length];
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < auxMatrix.length; i++) {
				for (int j = 0; j < auxMatrix[i].length; j++) {
					auxMatrix[i][j] = matrix[i][j];
				}		
			}
			
			sb.append(path);
			sb.append(parO);
		  	sb.append(x);
			sb.append(comma);
			sb.append(y);
			sb.append(parC);
			sb.append(comma);
							
			if(auxMatrix[x][y] == 2 && oneTotal == count) {
				paths++;
			}else if(auxMatrix[x][y] != 2) {

				auxMatrix[x][y] = 3;				
				//up
				if(isValid(x-1, y, auxMatrix)) {				
					dfs(x-1, y, count+1, auxMatrix, sb.toString());
				}
				//down
				if(isValid(x+1, y, auxMatrix)) {				
					dfs(x+1, y, count+1, auxMatrix, sb.toString());
				}
				//left
				if(isValid(x, y-1, auxMatrix)) {				
					dfs(x, y-1, count+1, auxMatrix, sb.toString());
				}
				//right
				if(isValid(x, y+1, auxMatrix)) {				
					dfs(x, y+1, count+1, auxMatrix, sb.toString());
				}							
			}
			
		}
		
		public boolean isValid(int x, int y, int[][] matrix) {
			
			return (x>= 0 && x<matrix.length && y>=0 && y < matrix[0].length && matrix[x][y] != -1 && matrix[x][y] != 3 );
			
		}
		
		
		@Test
		public void case1() {
			
			int[][] matrix = {{0,1},{2,0}};		
			
			assertEquals(0, uniquePathsIII(matrix));
		}
	 
		
		@Test
		public void case2() {
			
			int[][] matrix = {{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
						
			assertEquals(2, uniquePathsIII(matrix));
		}
		
		
		@Test
		public void case3() {
			
			int[][] matrix = {{1,0,0,0},{0,0,0,0},{0,0,0,2}};
			
			
			assertEquals(4, uniquePathsIII(matrix));
		}
}
