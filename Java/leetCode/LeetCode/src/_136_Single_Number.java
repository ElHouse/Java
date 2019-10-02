import java.util.Arrays;

public class _136_Single_Number {

	
	public static void main(String[] args) {
		
		int[] nums = {4,1,2,1,2};
//		int[] nums = {2,2,1};
	
		System.out.println("R:>"+singleNumber2(nums));
		
	}
	
	public static int singleNumber2(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a ^= nums[i];
            System.out.println("a_"+a);
        }
        return a;
    }
	
	public static int singleNumber(int[] nums) {

		Arrays.sort(nums);
		
		for(int i=0; i<nums.length; i+=2) {
			
					
			if(nums[i]!=nums[i+1]) {
				return nums[i];
			}			
		}
		
		return nums[nums.length];
    }
	
}
