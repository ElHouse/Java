package tree;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

	
	public static void main(String[] args) {
		
		
	}
	
	
	public static TreeNode algo(int[] postOrder, int i, int[] inorder) {
		
		if(postOrder.length == 0) return null;
		if(postOrder.length == 1) return new TreeNode(postOrder[0]);
		
		TreeNode root = new TreeNode(postOrder[i]);
		
		
		
				
		return null;
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
