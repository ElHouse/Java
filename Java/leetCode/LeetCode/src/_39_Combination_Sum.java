import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class _39_Combination_Sum {

//	Runtime: 264 ms, faster than 5.06% of Java online submissions for Combination Sum.
//	Memory Usage: 46.7 MB, less than 5.19% of Java online submissions for Combination Sum.
	public List<List<Integer>> combinationSum(int[] candidates, int target) {

		List<List<Integer>> answer = new ArrayList<>();

		if (candidates == null || candidates.length == 0)
			return answer;

		for (int i = 0; i < candidates.length; i++) {

			List<Integer> list = new ArrayList<>();
			dfs(i, candidates, target, candidates[i], list, answer);
		}

		return answer;
	}

	public void dfs(int x, int[] nums, int target, int sum, List<Integer> list, List<List<Integer>> answer) {

		list.add(nums[x]);

		Collections.sort(list);
		
		if (sum == target) {
			for (List<Integer> l : answer) {
				if (l.equals((list))) {
					return;
				}
			}
			answer.add(list);
		} else if (sum > target) {
			return;
		} else {

			for (int i = 0; i < nums.length; i++) {
				List<Integer> aux = new ArrayList<>();
				aux.addAll(list);
				dfs(i, nums, target, sum + nums[i], aux, answer);
			}
		}

	}

	@Test
	public void case1() {

		int[] candidates = { 2, 3, 5 };
		int target = 8;

		List<List<Integer>> answer = combinationSum(candidates, target);

		for (List<Integer> l : answer) {
			System.out.println(l);
		}

	}
	
	
	@Test
	public void case2() {

		int[] candidates = { 2,3,6,7};
		int target = 7;
	
		List<List<Integer>> answer =	combinationSum(candidates, target);
	
		for(List<Integer> l : answer) {
			System.out.println(l);
		}
	
	}
	
//	@Test
	public void case3() {

		System.out.println("########## case 3");
		int[] candidates = { 1,2,3,4,5,6};
		int target = 12;
	
		List<List<Integer>> answer =	combinationSum(candidates, target);
	
		for(List<Integer> l : answer) {
			System.out.println(l);
		}
	
	}
	
	@Test
	public void case4() {

		System.out.println("########## case4");
		int[] candidates = { 1,2};
		int target = 4;
	
		List<List<Integer>> answer =	combinationSum(candidates, target);
	
		for(List<Integer> l : answer) {
			System.out.println(l);
		}
	
	}

}
