import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class _494_Target_Sum {

//	Runtime: 397 ms, faster than 14.02% of Java online submissions for Target Sum.
//	Memory Usage: 34.6 MB, less than 100.00% of Java online submissions for Target Sum.
	public int findTargetSumWays(int[] nums, int S) {
		
		dfs(nums,0,0,S);
		
		
		map.forEach((k,v)->{
			System.out.println("k>"+k+"--"+v);
		});
		
		return total;
	}

	int total = 0;
	Map<Integer,Set<Integer>> map = new HashMap<>();
	
	
	public void dfs(int[] nums, int pos, int sum, int target) {
		
		if(pos == nums.length) {
			if(target == sum) total++;
		}else {
			//positive
			int positive = sum+nums[pos];
			int negative = sum+nums[pos]*-1;
			
			algo(pos+1,positive,nums,target);
			algo(pos+1,negative,nums,target);
			

			
			//negative
//			int negative = sum+nums[pos]*-1;
//			dfs(nums,pos+1,negative,target);
			
		}
		
	}

	public void algo(int pos, int value, int[] nums, int target) {
		
		if(!map.containsKey(pos)) {
			Set<Integer> values = new HashSet<>();
			values.add(value);
			map.put(value,values);
			dfs(nums,pos,value,target);
			dfs(nums,pos,value*-1,target);
		}else {
			
			if(!map.get(pos).contains(value)) {
				map.get(pos).add(value);
				dfs(nums,pos,value,target);
				dfs(nums,pos,value*-1,target);
			}
		}
	}
	
	@Test
	public void case1() {
		
		int[] nums = {1,1,1,1,1};
		int S =  3;
		assertEquals(5, findTargetSumWays(nums, S));
	}
	
	
	
}
