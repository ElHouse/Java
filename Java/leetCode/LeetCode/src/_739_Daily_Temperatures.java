import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class _739_Daily_Temperatures {

//	Runtime: 222 ms, faster than 11.41% of Java online submissions for Daily Temperatures.
//	Memory Usage: 44.9 MB, less than 15.25% of Java online submissions for Daily Temperatures.
	public int[] dailyTemperatures2(int[] T) {

		int[]  answer = new int[T.length];
		
		answer[T.length-1] = 0;
		
		for (int i = T.length-1;  i >=0  ;i--) {
			
			int next = 0;
			int aux = T[i];
			for (int j = i+1; j < T.length; j++) {
				if(T[j]>aux) {
					next = j-i;
					break;
				}
			}
			answer[i] = next;
		}
		
		System.out.println(Arrays.toString(answer));
		
		return answer;
	}
	
	int[] temperatures = new int[70];
	
	public int[] dailyTemperatures(int[] T) {

		int[]  answer = new int[T.length];
				
		for (int i = T.length-1;  i >=0  ;i--) {

			int x = T[i] - 30;
			temperatures[x] = T[i];
			answer[i] = find(x, T[i]);
			
		}
		
		System.out.println(Arrays.toString(answer));
		
		return answer;
	}
	
	public int find(int x, int temp) {
		
		System.out.println("x>"+x);
		
		for (int i = x; i < temperatures.length; i++) {
			
			if(temperatures[i]>temp) {
				System.out.print(temperatures[i]);
				System.out.println("---"+temp+"=="+(i-x));
				return i-x;
			}
		}
		
		return 0;
	}
	
	
	@Test
	public void case1() {
		int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
	
		assertEquals("[1, 1, 4, 2, 1, 1, 0, 0]" , Arrays.toString(dailyTemperatures(T)));
	}
		
}
