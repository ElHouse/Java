import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class _542_01_Matrix {

//	Runtime: 29 ms, faster than 13.83% of Java online submissions for 01 Matrix.
//	Memory Usage: 46.4 MB, less than 100.00% of Java online submissions for 01 Matrix.

	public int[][] updateMatrix(int[][] matrix) {

		if(matrix == null) return null;
		
		int[][] result = new int[matrix.length][matrix[0].length];
		
		for (int i = 0; i < matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				
				if(matrix[i][j]==1) {
					int x = algo(matrix, i, j);
					result[i][j] = x;
				}
				
			}
		}
		
		return result;
	}
	
	
	 public int algo(int[][] matrix, int x, int y ) {
		 
		 int step = 1;
		 Queue<Integer> cola = new LinkedList<>();
		 Queue<Integer> aux  = new LinkedList<>();
		  
		 addPosibleIndexes(cola, x, y, matrix);
		 
		 while(!cola.isEmpty()) {
			 
			 while(!cola.isEmpty()) {

				 int i = cola.poll();
				 int j = cola.poll();
				 
				 if(matrix[i][j] == 0) return step;
				 else {
					 addPosibleIndexes(aux, i, j, matrix);
				 }
				 
				 
			 }
			 
			 cola.addAll(aux);
			 step++;
		 }
		 
		 return -1;
	 }
	 
	 public void addPosibleIndexes(Queue<Integer> cola,int x, int y, int[][] matrix) {
		 
		 if(isValid(x-1, y, matrix)) {
			 cola.add(x-1);
			 cola.add(y);
		 }
		 
		 if(isValid(x+1, y, matrix)) {
			 cola.add(x+1);
			 cola.add(y);
		 }
		 
		 if(isValid(x, y-1, matrix)) {
			 cola.add(x);
			 cola.add(y-1);
		 }
		 
		 if(isValid(x, y+1, matrix)) {
			 cola.add(x);
			 cola.add(y+1);
		 }
	 }
	 
	 
	 public boolean isValid(int x, int y, int[][] matrix) {
		 
		 return (x >= 0 && x<matrix.length && y>=0 && y<matrix[x].length );
		 
	 }
	 
	 
	 @Test
	 public void case1() {
		 int[][] matrix = { {1,0},
		                    {1,1},
		                    {1,1}};
		 
		 
		 int[][] r = updateMatrix(matrix);
		 
		 
			for (int i = 0; i < matrix.length; i++) {
				for(int j=0; j<matrix[i].length; j++) {
					System.out.println(r[i][j]);
				}
				System.out.println();
			}
		
	 }
	
}
