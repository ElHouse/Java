import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class _700_Search_in_a_Binary_Search_Tree {

	
//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in a Binary Search Tree.
//	Memory Usage: 39.7 MB, less than 86.67% of Java online submissions for Search in a Binary Search Tree.
	public TreeNode searchBST(TreeNode root, int val) {
	
		if(root == null) {
			
		}
		
		return search(root, val);
	}

	public TreeNode search(TreeNode root, int val) {
	
		TreeNode element = null;
		
		if(root.val == val) {
			element = root;
			return element;
		}
		
		if(root.left!= null) {
			element = search(root.left, val);
			if(element != null) return element;
		}
		
		if(root.right!= null) {
			element = search(root.right, val);
			if(element != null) return element;
		}
		
		return element;
	}
	
	
	@Test
	public void case1() {
		
		TreeNode root1 = new TreeNode(13);
		 TreeNode root2 = new TreeNode(9);
		  TreeNode root3 = new TreeNode(7);
		   TreeNode root4 = new TreeNode(8);
		  TreeNode root5 = new TreeNode(11);
		 TreeNode root6 = new TreeNode(15);
		 
		 

		root1.left = root2;
		root1.right = root6;
		
		root2.left  = root3;
		root2.right = root5;
		
		root3.right = root4;
		
		assertEquals(root3,searchBST(root1,7));
		
	}
	
	
	@Test
	public void case2() {
		
		TreeNode root1 = new TreeNode(13);
		 TreeNode root2 = new TreeNode(9);
		  TreeNode root3 = new TreeNode(7);
		   TreeNode root4 = new TreeNode(8);
		  TreeNode root5 = new TreeNode(11);
		 TreeNode root6 = new TreeNode(15);
		 
		 

		root1.left = root2;
		root1.right = root6;
		
		root2.left  = root3;
		root2.right = root5;
		
		root3.right = root4;
		
		assertEquals(null,searchBST(root1,71));
		
	}
	
	
	@Test
	public void case3() {
		
		TreeNode root1 = new TreeNode(13);
		 TreeNode root2 = new TreeNode(9);
		  TreeNode root3 = new TreeNode(7);
		   TreeNode root4 = new TreeNode(8);
		  TreeNode root5 = new TreeNode(11);
		 TreeNode root6 = new TreeNode(15);
		 
		 

		root1.left = root2;
		root1.right = root6;
		
		root2.left  = root3;
		root2.right = root5;
		
		root3.right = root4;
		
		assertEquals(root6,searchBST(root1,15));
		
	}
	
	
	@Test
	public void case4() {
		
		TreeNode root1 = new TreeNode(13);
		 TreeNode root2 = new TreeNode(9);
		  TreeNode root3 = new TreeNode(7);
		   TreeNode root4 = new TreeNode(8);
		  TreeNode root5 = new TreeNode(11);
		 TreeNode root6 = new TreeNode(15);
		 
		 

		root1.left = root2;
		root1.right = root6;
		
		root2.left  = root3;
		root2.right = root5;
		
		root3.right = root4;
		
		assertEquals(root6.val,searchBST(root1,15).val);
		
	}
	
	@Test
	public void case5() {
		
		
		assertEquals(null,searchBST(null,0));	
	}
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}
