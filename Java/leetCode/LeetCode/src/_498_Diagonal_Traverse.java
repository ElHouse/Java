import java.util.Arrays;

import org.junit.Test;

public class _498_Diagonal_Traverse {

	int step = 0;
	int i    = 0;
	int x    = 0;
	int y    = 0;
	public int[] findDiagonalOrder(int[][] matrix) {

		int[] answer = new int[matrix.length + matrix[0].length];
		
		answer[i++] = matrix[x][y];
		movements(matrix, answer);
		
		return answer;
	}
	
	public boolean isValid(int[][] matrix, int x, int y) {
		
		if(x<0) return false;
		if(y<0) return false;
		
		
		int M = matrix.length;
		int N = matrix[0].length;
		
		if(x >= M || y >= N ) return false;
		
		return true;
	}
	
	
	public void movements(int[][] matrix, int[] answer) {
		
		if(x ==answer.length) return ;
		
		System.out.println("########################------------movements-->");
		System.out.println("X>"+x);
		System.out.println("Y>"+y);
		
		switch(step) {
			case 0:{
//				  int auxX = x;
//				  int auxY = y+1;
				  
				  y+=1;
				  
				  step = 1;				 
			}break;
			case 1:{
				 System.out.println("case 1 antes ->X:"+x+"<Y:"+y);
				 getDownLine(matrix, x, y, answer); 
				 System.out.println("case 1 despues ->X:"+x+"<Y:"+y);
				 step = 2;
			}break;
			case 2:{
				 x+=1;				
				 step = 3;
			}break;
			case 3:{
				 System.out.println("case 1 antes ->X:"+x+"<Y:"+y);
				 getUpLine(matrix, x, y, answer); 
				 System.out.println("case 1 despues ->X:"+x+"<Y:"+y);
				 step = 0;
			}break;
		
		}//fin .whiele
		
		System.out.println("---------------paso>"+step);
		System.out.println(Arrays.toString(answer));
		
		movements(matrix, answer);
	}
	public void getUpLine(int[][] matrix, int x, int y, int[] answer) {
		
		
		int auxX = x;
		int auxY = y;
		
		while(isValid(matrix, auxX, auxY)) {
						
			answer[i++] = matrix[auxX][auxY];
			auxX-=1;
			auxY+=1;
		}
	
		this.x = auxX+1;
		this.y = auxY-1;
		
	}

	public void getDownLine(int[][] matrix, int x, int y, int[] answer) {
		
		int auxX = x;
		int auxY = y;
		
		while(isValid(matrix, auxX, auxY)) {
			
			answer[i++] = matrix[auxX][auxY];

			auxX+=1;
			auxY-=1;
		
		}
		this.x = auxX-1;
		this.y = auxY+1;
	}
	
	@Test
	public void case1() {
		int count = 0;
		int[][] matrix = new int[5][5];
		
		for (int i = 0; i < matrix.length; i++) {         
	         for (int j = 0; j < matrix[i].length; j++) {   
	            matrix[i][j] = ++count;
	         }  
		}
		printMatrix(matrix);
		int[] a = findDiagonalOrder(matrix);
		
		System.out.println(Arrays.toString(a));
		
	}
	
//	@Test
	public void casex() {
		
		int[][] matrix = new int[5][5];
		printMatrix(matrix);
		System.out.println("------cuadro");
		System.out.println(matrix.length);
		System.out.println(matrix[0].length);
		
		System.out.println("------racta h");
matrix = new int[2][5];
		
printMatrix(matrix);
		System.out.println(matrix.length);
		System.out.println(matrix[0].length);
	
		
		System.out.println("------reacta v");
matrix = new int[5][2];
		
printMatrix(matrix);
		System.out.println(matrix.length);
		System.out.println(matrix[0].length);
		
		System.out.println("------raro 1");
matrix = new int[5][1];
		
printMatrix(matrix);

		System.out.println(matrix.length);
		System.out.println(matrix[0].length);
		
		System.out.println("------ raro 2");
matrix = new int[1][5];

		printMatrix(matrix);

		System.out.println(matrix.length);
		System.out.println(matrix[0].length);
	}
	
	
	public void printMatrix(int[][] matrix) {
		System.out.println("#################");
		for (int i = 0; i < matrix.length; i++) {         //this equals to the row in our matrix.
	         for (int j = 0; j < matrix[i].length; j++) {   //this equals to the column in each row.
	            System.out.print(matrix[i][j] + " ");
	         }
	         System.out.println(); //change line on console as row comes to end in the matrix.
	      }
		
		System.out.println("#################");
	}
	
}
