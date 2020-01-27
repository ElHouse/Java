import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class _90_Subsets_II {

	List<List<Integer>> answer = new ArrayList<>();
	List<String> firms = new ArrayList<>();
	
//	Runtime: 5 ms, faster than 10.26% of Java online submissions for Subsets II.
//	Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for Subsets II.
	public List<List<Integer>> subsetsWithDup(int[] nums) {

		if (nums.length < 0)
			return answer;

		Arrays.sort(nums);
	
					
		for (int i = 0; i < nums.length; i++) {
			List<Integer> list = new ArrayList<>();
			backTracking(i, nums, list);
		}

		List<Integer> empty = new ArrayList<>();
		answer.add(empty);

		for(List<Integer> l: answer) {
			System.out.println(l);
		}
		
		
		
		return answer;
	}

	public void backTracking(int n, int[] nums, List<Integer> list) {

		list.add(nums[n]);
		
		if(!firms.contains(list.toString())) {
			
			answer.add(list);
			firms.add(list.toString());
	
			for (int i = n + 1; i < nums.length; i++) {
				List<Integer> aux = new ArrayList<>();
				aux.addAll(list);
				backTracking(i, nums, aux);
			}
		}
	}


	@Test
	public void case1() {
		int[] nums = {2,2};
		subsetsWithDup(nums);
	}
	
}
