import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class _98_Validate_Binary_Search_Tree {

//	Runtime: 1 ms, faster than 49.58% of Java online submissions for Validate Binary Search Tree.
//	Memory Usage: 38.9 MB, less than 82.33% of Java online submissions for Validate Binary Search Tree.
	int lasDigit = Integer.MIN_VALUE+1;
	public boolean isValidBST(TreeNode root) {

		try {
			algo(root);
		} catch (Exception e) {
			return false;
		}
		
		return true;
	}
	
	
	
	public void algo(TreeNode root) throws Exception {
		
		
		
		if(root.left != null) {
			algo(root.left);
		}
		
		if(lasDigit == Integer.MIN_VALUE+1) {
			lasDigit = root.val;
		}else if(lasDigit > root.val) {

			System.out.println("ex root>"+root.val);
			System.out.println("ex last>"+lasDigit);
			throw new Exception("nop");
		}else {
			lasDigit = root.val;
		}
		
		if(root.right != null) {
			algo(root.right);
		}
		
		
		
	}
	
	@Test
	public void case1() {
		
		TreeNode root1 = new TreeNode(10);
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
		
		assertFalse(isValidBST(root1));
		
	
	
	}
	
	@Test
	public void case2() {
		System.out.println("case 2");
		
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
		
		assertTrue(isValidBST(root1));
	}
	
	
	@Test
	public void case3() {
		
		System.out.println("case 3");
		
		TreeNode root1 = new TreeNode(13);
		 TreeNode root2 = new TreeNode(9);
		  TreeNode root3 = new TreeNode(7);
		   TreeNode root4 = new TreeNode(8);
		  TreeNode root5 = new TreeNode(11);
		 TreeNode root6 = new TreeNode(15);
		  TreeNode root7 = new TreeNode(12);
		  TreeNode root8 = new TreeNode(20);
		 

		root1.left = root2;
		root1.right = root6;
		
		root2.left  = root3;
		root2.right = root5;
		
		root3.right = root4;

		root6.left  = root7;
		root6.right = root8;
		
		assertFalse(isValidBST(root1));
		
	
	
	}
	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}
