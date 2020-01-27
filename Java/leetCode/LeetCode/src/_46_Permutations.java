import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class _46_Permutations {

	List<List<Integer>> answer = new ArrayList<>();
	
//	Runtime: 1 ms, faster than 97.49% of Java online submissions for Permutations.
//	Memory Usage: 37.5 MB, less than 95.74% of Java online submissions for Permutations.
    public List<List<Integer>> permute(int[] nums) {
     
    	if(nums == null || nums.length == 0 ) return answer;
    	
    	boolean[] used = new boolean[nums.length];
    	
    	for (int i = 0; i < nums.length; i++) {
				
				List<Integer> posi = new ArrayList<>();
				posi.add(nums[i]);
				used[i] = true;

		    	backT(posi, nums,used);    
		    	used[i] = false;    		
		}
    	
    	return answer;
    }
    
    public void backT(List<Integer> result, int[] nums, boolean[] used ) {
    	
    	if(result.size() == nums.length) {
    		answer.add(result);
    		return ;
    	}

    	for (int i = 0; i < nums.length; i++) {
			if(!used[i]) {
				used[i] = true;
				List<Integer> resultAux = new ArrayList<>();
				resultAux.addAll(result);
				resultAux.add(nums[i]);
				backT(resultAux,nums,used);
				used[i] = false;
			}
		}
    	
    	
    }
    
    @Test
    public void case1() {
    	int[] nums = {1,2,3,4,5};
    	permute(nums);
    }
    
    
}
