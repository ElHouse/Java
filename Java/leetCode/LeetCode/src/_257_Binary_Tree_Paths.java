import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class _257_Binary_Tree_Paths {

	List<String> list = new ArrayList<>();
	
//	Runtime: 1 ms, faster than 100.00% of Java online submissions for Binary Tree Paths.
//	Memory Usage: 36.7 MB, less than 100.00% of Java online submissions for Binary Tree Paths.
	public List<String> binaryTreePaths(TreeNode root) {

		if(root == null) return list;
		algo(root, new StringBuilder());
		
		list.forEach(System.out::println);
		
		return list;
	}

	
	public void algo(TreeNode root, StringBuilder path) {
		
		
		if(root.left == null && root.right == null) {
			path.append(root.val);
			list.add(path.toString());
		}else {
			path.append(root.val);
			path.append("->");		
		}
		
		if(root.left != null) {
			algo(root.left, new StringBuilder(path));
		}
		
		if(root.right != null) {
			algo(root.right, new StringBuilder(path));
		}
		
		
	}
	
	@Test
	public void case1() {
		
		
//	    	  13 
//		   /     \
//		  9       15
//  	/   \	 /  \
//	   7    11  14   30  
//	  / \   / \  
//	  3 8  10 12
//     \
//      6
		TreeNode root1 = new TreeNode(13);
		 TreeNode root2 = new TreeNode(9);
		  TreeNode root3 = new TreeNode(7);
		   TreeNode root4 = new TreeNode(8);
		  TreeNode root5 = new TreeNode(11);
			TreeNode root51 = new TreeNode(10);
			TreeNode root52 = new TreeNode(12);
		 TreeNode root6 = new TreeNode(15);
		 
		 TreeNode rootx = new TreeNode(3);
		 TreeNode rooty = new TreeNode(6);
			 
		 TreeNode roota = new TreeNode(14);
		 TreeNode rootb = new TreeNode(30);
		
		 
		 
		root1.left = root2;
		root1.right = root6;
		
		root2.left  = root3;
		root2.right = root5;
		
		root3.right = root4;

		root5.left = root51;
		root5.right = root52;
		
		root3.left = rootx; 
		rootx.right = rooty;

		root6.left = roota;
		root6.right= rootb;
		
		
		binaryTreePaths(root1);
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
