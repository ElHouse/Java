package DFS;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class dfs_matrix {
	
	int oneTotal = 1;
	List<String> paths = new ArrayList<>();
	
	public List<String> init(int[][] matrix, int x, int y) {
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j]==0) {
					oneTotal++;
				}
			}		
		}
		dfs(x, y, 0, matrix, "");
		
		paths.forEach(System.out::println);
		
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
		sb.append("(");
	  	sb.append(x);
		sb.append(",");
		sb.append(y);
		sb.append(")");
		sb.append(",");
		
		if(auxMatrix[x][y] == 2 && oneTotal == count) {
			
			paths.add(path.substring(0,path.length()-1));
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
//		int[][] matrix = {{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
		
		
		init(matrix, 0, 0);
	}

	
}
