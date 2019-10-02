import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class _993_Cousins_in_Binary_Tree {

	int depthX = -1;
	int depthY = -2;
	TreeNode parentX = null;
	TreeNode parentY = null;
	
//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Cousins in Binary Tree.
//	Memory Usage: 34.4 MB, less than 100.00% of Java online submissions for Cousins in Binary Tree.
	public boolean isCousins(TreeNode root, int x, int y) {

//		System.out.println("-------------------");
		algo(root, x, y, 0, root);
//		System.out.println("X>"+depthX);
//		System.out.println("Y>"+depthY);
//		
//		System.out.println("X N>"+parentX.val);	
//		System.out.println("Y N>"+parentY.val);
//		
//		System.out.println(parentX != parentY);
		
		if(depthX==depthY) {
			if(parentX != parentY) {
				return true;
			}
		}

		
		
		return false;
	}

	
	public void algo(TreeNode root, int x, int y, int depth, TreeNode parent) {

		if(root.val == x) { 
			parentX = parent;
			depthX  = depth;
		}
		if(root.val == y) {
			parentY = parent;
			depthY  = depth;
		}
		
		if(root.left != null) {
			algo(root.left, x, y, depth+1,root);
		}
				
		if(root.right != null) {
			algo(root.right, x, y, depth+1,root);
		}
	}

	@Test
	public void case1() {

		TreeNode root1 = new TreeNode(1);
		
		TreeNode root2 = new TreeNode(2);
		TreeNode root3 = new TreeNode(3);
	
		TreeNode root4 = new TreeNode(4);

		root1.left  = root2;
		root1.right = root3;
		
		root2.left  = root4;
		
		assertFalse(isCousins(root1, 4, 3));
	}
	
	
	@Test
	public void case2() {

		TreeNode root1 = new TreeNode(1);
		
		TreeNode root2 = new TreeNode(2);
		TreeNode root3 = new TreeNode(3);
	
		TreeNode root4 = new TreeNode(4);

		root1.left  = root2;
		root1.right = root3;
		
		root2.left  = root4;
		
		assertFalse(isCousins(root1, 2, 3));
	}
	
	@Test
	public void case3() {

		TreeNode root1 = new TreeNode(1);
		
		TreeNode root2 = new TreeNode(2);
		TreeNode root3 = new TreeNode(3);
	
		TreeNode root4 = new TreeNode(4);
		TreeNode root5 = new TreeNode(5);

		root1.left  = root2;
		root1.right = root3;
		
		root2.left  = root4;
		
		root3.right = root5;
		
		assertTrue(isCousins(root1, 5, 4));
	}
	
	@Test
	public void case4() {

		TreeNode root1 = new TreeNode(1);
		
		TreeNode root2 = new TreeNode(2);
		TreeNode root3 = new TreeNode(3);
	
		TreeNode root4 = new TreeNode(4);
		TreeNode root5 = new TreeNode(5);

		root1.left  = root2;
		root1.right = root3;
		
		root2.left  = root4;
		
		root3.right = root5;
		
		assertFalse(isCousins(root1, 15, 4));
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
