import org.junit.Test;

public class _1038_Binary_Search_Tree_to_Greater_Sum_Tree {

//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search Tree to Greater Sum Tree.
//	Memory Usage: 34.5 MB, less than 100.00% of Java online submissions for Binary Search Tree to Greater Sum Tree.
	public TreeNode bstToGst(TreeNode root) {

		if(root == null ) return null;
		
		algo(root);
		
		return root;
	}
	
	int sum = Integer.MIN_VALUE;
	
	public void algo(TreeNode root) {
		
		
		if(root.right != null) {
			algo(root.right);
		}
		
		if(sum == Integer.MIN_VALUE) {
			sum = root.val;
		}else {
			sum += root.val;
			root.val = sum;
		}
		
		if(root.left != null) {
			algo(root.left);
		}
		
		
	}
	
	
	@Test
	public void case1() {

		TreeNode root4 = new TreeNode(4);
		
		TreeNode root1 = new TreeNode(1);
		TreeNode root6 = new TreeNode(6);
		
		TreeNode root0 = new TreeNode(0);
		TreeNode root2 = new TreeNode(2);
		TreeNode root5 = new TreeNode(5);
		TreeNode root7 = new TreeNode(7);
		
		TreeNode root3 = new TreeNode(3);
		TreeNode root8 = new TreeNode(8);
		

		root4.left = root1;
		root4.right = root6;
		
		root1.left = root0;
		root1.right = root2;
		root6.left = root5;
		root6.right = root7;
		
		
		root2.right = root3; 
		root7.right = root8; 
		
		print(root4);
		
		bstToGst(root4);

		System.out.println("sale");
		print(root4);
	}
	
	
	public void print(TreeNode root) {
		
		System.out.println(root.val);
		
		

		
		if(root.left != null) {
			print(root.left);
		}
		
		if(root.right != null) {
			print(root.right);
		}
		
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
