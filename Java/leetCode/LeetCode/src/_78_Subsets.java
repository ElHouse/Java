import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class _78_Subsets {

	List<List<Integer>> answer = new ArrayList<>();
//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Subsets.
//	Memory Usage: 37.3 MB, less than 99.18% of Java online submissions for Subsets.
	public List<List<Integer>> subsets(int[] nums) {

		if(nums.length<0 ) return answer;
		
		List<Integer> empty = new ArrayList<>();
		answer.add(empty);
		
		for (int i = 0; i < nums.length; i++) {
			List<Integer> list = new ArrayList<>();
			backTracking( i, nums, list);
		}
		
		return answer;
	}

	public void backTracking(int n, int[] nums, List<Integer> list) {

		answer.add(list);
		list.add(nums[n]);
		
		for(int i = n+1; i<nums.length; i++) {	
			List<Integer> aux = new ArrayList<>();
			aux.addAll(list);
			backTracking(i, nums, aux);
		}
	}
	
	
	@Test
	public void case1() {
		int[] nums = {1,2,3,4,5};
		subsets(nums);
	}

}
