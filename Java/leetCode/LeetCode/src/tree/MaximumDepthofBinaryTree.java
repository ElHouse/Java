package tree;

public class MaximumDepthofBinaryTree {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		
		root.left  = new TreeNode(2);
		root.right  = new TreeNode(3);
		
		root.left.left  = new TreeNode(4);
		root.right.right  = new TreeNode(5);
		
		System.out.println("max>"+maxDepth(root));
		System.out.println("depth>"+depth);
	}

	public static int maxDepth(TreeNode root) {

		
		 algo(root,1);
		 return depth;
	}
	
	private static int depth = 0;
	
	public static void algo(TreeNode root, int val) {
				
		if(root.left!=null) 
			 algo(root.left, val+1);
		if(root.right!=null) 
			 algo(root.right, val+1);
		
		depth = Math.max(depth, val);
//		return val;
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
