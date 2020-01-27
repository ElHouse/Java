import org.junit.Test;

public class _59_Spiral_Matrix_II {

//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Spiral Matrix II.
//	Memory Usage: 34.6 MB, less than 8.33% of Java online submissions for Spiral Matrix II.
	public int[][] generateMatrix(int n) {

		int sum = 0;
		int x = 0;
		int aux = n;
		int[][] matrix = new int[n][n];
		
		while(sum<=(n*n)) {
			
			for(int i=x; i<aux; i++) { //left
				matrix[x][i] = ++sum;
			}
			if(sum>=(n*n)) return matrix;
			
			for(int i=x+1; i<aux; i++) {// down
				matrix[i][aux-1] = ++sum;
			}
			if(sum>=(n*n)) return matrix;
			
			for(int i=aux-2; i>=x; i--) {//right
				matrix[aux-1][i] = ++sum;
			}
			if(sum>=(n*n)) return matrix;
			
			for (int i = aux-2; i > x; i--) {//up
				matrix[i][x] = ++sum;
			}
			if(sum>=(n*n)) return matrix;
			
			
			aux--;
			x++;
		}
		
		
		return matrix;
	}
	
	
	@Test
	public void case1() {
		
		int[][] matrix = generateMatrix(10);
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]+"-");
			}
			System.out.println();
		}
	}
	
}
