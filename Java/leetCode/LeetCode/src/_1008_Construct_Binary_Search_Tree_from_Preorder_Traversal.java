import org.junit.Test;

public class _1008_Construct_Binary_Search_Tree_from_Preorder_Traversal {

	
//	Runtime: 1 ms, faster than 40.70% of Java online submissions for Construct Binary Search Tree from Preorder Traversal.
//	Memory Usage: 35.8 MB, less than 100.00% of Java online submissions for Construct Binary Search Tree from Preorder Traversal.
    public TreeNode bstFromPreorder(int[] preorder) {
        
    	if(preorder == null || preorder.length == 0) return null;
    	
    	TreeNode root = new TreeNode(preorder[0]);
    	
    	for (int i = 1; i < preorder.length; i++) {
			
    		creaArbol(root, preorder[i]);
		}
    	
    	return root;
    }
	
    public TreeNode creaArbol(TreeNode root, int val) {
    	
    	
    	if(root.val < val) {
    		
    		if(root.right == null) {
    			root.right = new TreeNode(val);
    		}else {
    			creaArbol(root.right, val);
    		}
    	}else {
    		
    		if(root.left == null) {
    			root.left = new TreeNode(val);
    		}else {
    			creaArbol(root.left, val);
    		}
    	}
    			
		return root;
    }
    
	
    @Test
    public void case1() {
    	int[] nums = {8,5,1,7,10,12};
    	TreeNode root = bstFromPreorder(nums);
   
    	printTree(root);
    }
    
	public static void printTree(TreeNode root) {

		boolean isLeaf = true;
		if (hasLeft(root)) {
			System.out.println(root.val);
			isLeaf = false;
			printTree(root.left);
		}
		if (hasRight(root)) {
			System.out.println(root.val);
			isLeaf = false;
			printTree(root.right);
		}

		if (isLeaf) {
			System.out.println(root.val);
			System.out.println("----------------");
		}

	}

	public static boolean hasRight(TreeNode root) {

		return root.right != null;
	}

	public static boolean hasLeft(TreeNode root) {

		return root.left != null;
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
