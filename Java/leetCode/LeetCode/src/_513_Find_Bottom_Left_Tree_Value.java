import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class _513_Find_Bottom_Left_Tree_Value {

	
	int maxLevel     = 0;
	int leftest      = 0;
	
//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Bottom Left Tree Value.
//	Memory Usage: 39 MB, less than 78.26% of Java online submissions for Find Bottom Left Tree Value.
	public int findBottomLeftValue(TreeNode root) {

		leftest = root.val;
		leftTheMost(root, 1);
		
		
		return leftest;
	}


	public void leftTheMost(TreeNode root, int level) {
		
		
		if(root == null) return ;

			if(level > maxLevel ) {
				maxLevel = level;
				leftest  = root.val;
			}
		
		if(root.left  != null) leftTheMost(root.left ,level+1);
		if(root.right != null) leftTheMost(root.right,level+1);
		
	}
	
	@Test
  	public void case1() {
  	

  		System.out.println("-----case1");
//  	    2
//  	   / \
//  	  1   3
  	

  		TreeNode root = new TreeNode(2);
  		TreeNode rootL = new TreeNode(1);
  		TreeNode rootR = new TreeNode(3);

  		root.left  = rootL;
  		root.right = rootR;
  		
  		assertEquals(1, findBottomLeftValue(root));
  		
  	}
  	
	@Test
  	public void case2() {
  		
  		System.out.println("-----case2");
//        1
//       / \
//      2   3
//     /   / \
//    4   5   6
//       /
//      7
  		TreeNode root1 = new TreeNode(1);
  		
  		TreeNode root2 = new TreeNode(2);
  		TreeNode root3 = new TreeNode(3);
  		
  		TreeNode root4 = new TreeNode(4);
  		TreeNode root5 = new TreeNode(5);
  		TreeNode root6 = new TreeNode(6);
  		
  		TreeNode root7 = new TreeNode(7);

  		root1.left  = root2;
  		root1.right = root3;
  		
  		root2.left = root4;
  		root3.left  = root5;
  		root3.right = root6;
  		
  		root5.left = root7;
  		
  		
  		assertEquals(7, findBottomLeftValue(root1));
  		
  		
  	}
	
  	@Test
  	public void case3() {
  		

  		System.out.println("-----case3");
//      1
//     / \
//    2   3
//   /   / \
//  4   5   6
//       \
//        7
//  	   \
//  		8
//  	   /
//  	  9
		TreeNode root1 = new TreeNode(1);
		
		TreeNode root2 = new TreeNode(2);
		TreeNode root3 = new TreeNode(3);
		
		TreeNode root4 = new TreeNode(4);
		TreeNode root5 = new TreeNode(5);
		TreeNode root6 = new TreeNode(6);
		
		TreeNode root7 = new TreeNode(7);
		TreeNode root8 = new TreeNode(8);
		TreeNode root9 = new TreeNode(9);

		root1.left  = root2;
		root1.right = root3;
		
		root2.left = root4;
		root3.left  = root5;
		root3.right = root6;
		
		root5.right = root7;

		root7.right = root8;
		root8.left = root9;
		
		assertEquals(9, findBottomLeftValue(root1));
		
		
	}
  	
  	
	@Test
  	public void case4() {
  	

  		System.out.println("-----case4");
//  	    2
//  	   / \
//  	  1   3
  	

  		TreeNode root = new TreeNode(0);

  		assertEquals(0, findBottomLeftValue(root));
  		
  	}
	
	@Test
  	public void case5() {
  	

  		System.out.println("-----case5");
//  	    2
//  	     \
//  	      3
  	

  		TreeNode root = new TreeNode(2);
  		TreeNode rootR = new TreeNode(3);

  		root.right = rootR;
  		
  		assertEquals(3, findBottomLeftValue(root));
  		
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
