import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class _110_Balanced_Binary_Tree {

//	Runtime: 1 ms, faster than 99.92% of Java online submissions for Balanced Binary Tree.
//	Memory Usage: 38.4 MB, less than 90.74% of Java online submissions for Balanced Binary Tree.
	public boolean isBalanced(TreeNode root) {

		algo(root);
		
		return answer;
	}
	
	boolean answer = true;
	
	public int algo(TreeNode node) {
		
		if(!answer) {
			
		}else if(node.left == null && node.right == null) {
			return 1;
		}else {
			
			int l = 0;
			int r = 0;
			
			if(node.left  != null) l = algo(node.left); 
			if(node.right != null) r = algo(node.right); 
			
			if(l==r || (l > r  && l -r == 1 )|| (r > l && r -l == 1) ) return Math.max(l, r)+1;
			else  answer = false;			
		}
		
		return Integer.MAX_VALUE;
	}
	
	
	@Test
	public void case1() {
	
		

		TreeNode r3 = new TreeNode(3);
		TreeNode r9 = new TreeNode(3);
		TreeNode r20 = new TreeNode(3);
		TreeNode r15 = new TreeNode(3);
		TreeNode r7  = new TreeNode(3);

		r3.left  = r9;
		r3.right = r20;
		
		r20.left = r15;
		r20.right = r7;

		assertTrue(isBalanced(r3));
	
	}
	
	
	@Test
	public void case2() {

		TreeNode r1 = new TreeNode(1);
		TreeNode r2 = new TreeNode(2);
		TreeNode r22 = new TreeNode(22);
		TreeNode r3 = new TreeNode(3);
		TreeNode r33  = new TreeNode(33);
		TreeNode r4 = new TreeNode(4);
		TreeNode r44 = new TreeNode(44);
	

		r1.left  = r2;
		r1.right = r22;
		
		r2.left = r3;
		r2.right = r33;

		r3.left = r4;
		r3.right = r44;

		assertFalse(isBalanced(r1));
	
	}
	
	
	@Test
	public void case3() {

		TreeNode r1 = deserialize("1,2,22,3,33,333,3333,4,44,444,4444,44444,444444,null,null,5,55");
		assertTrue(isBalanced(r1));	
	}
	
	@Test
	public void case4() {

		TreeNode r1 = deserialize("1,null,2,null,3");
		assertFalse(isBalanced(r1));	
	}
		
	
	public TreeNode deserialize(String data) {

		if(data == null || data.isEmpty()) return null;
		
		//ever time a null is found in the nodes array, it is count to skip 2 positions 
		int nulls = 0;

		String[] array = data.split(",");
		  
		TreeNode[] nodes = new TreeNode[array.length];
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i].trim().equals("null")) {
				nodes[i] = null;
			}else {
			
				int number = Integer.parseInt(array[i].trim());
				TreeNode aux = new TreeNode(number);
				nodes[i] = aux;
			}
		}
		
		int i = 0;
		while(i < array.length) {
			
			if(nodes[i] == null) {
				nulls++;
			}else {
				
				int l = ( (2*i)+1 )-(2*nulls);
				int r = ( (2*i)+2 )-(2*nulls);

				if(l<array.length) nodes[i].left  = nodes[l];
				if(r<array.length) nodes[i].right = nodes[r];	
			}

			i++;
		}
						
		return nodes[0];
	}
}
