
public class _167_TwoSumII_Input_array_is_sorted {
	
	
//	Runtime: 1 ms, faster than 55.19% of Java online submissions for Two Sum II - Input array is sorted.
//	Memory Usage: 38.4 MB, less than 45.52% of Java online submissions for Two Sum II - Input array is sorted.
	
    public int[] twoSum(int[] numbers, int target) {
        
        int L = 0;
		int R = numbers.length-1;
		int[] index = new int[2];
		
		while(R>L) {
			
			int suma = numbers[L] + numbers[R];
			if(suma == target) {
				index[0] = ++L;
				index[1] = ++R;
				return index;
			}else if(suma > target) {
				R--;
			}else
				L++;
		}
		
		return null;

	}
}
