import org.junit.Test;


public class _814_Binary_Tree_Pruning {

//	POST ORDER 
	
//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Pruning.
//	Memory Usage: 34.3 MB, less than 100.00% of Java online submissions for Binary Tree Pruning.
    public TreeNode pruneTree(TreeNode root) {

    	delete(root);
    	
    	return root;
    }
    
    //
    public boolean delete(TreeNode root) {
    	
    	if(root.left != null) {
    		
    		
    		boolean delete = delete(root.left);
    		if(delete) root.left = null;
    	
    	}
    	
    	
    	
    	if(root.right != null) {
    		
    		boolean delete = delete(root.right);
    		if(delete) root.right = null;
    	}
    	
    	if(root.right == null && root.left == null && root.val == 0) {
    		return true;
    	}
    	
    	return false;  	
    }
    
    
    public void	printTree(TreeNode root) {
    	
    	
    	if(root.left != null) {
    		
    		printTree(root.left);
    	}
    	
    	
    	if(root.right != null) {
    		
    		printTree(root.right);
    	}
    	System.out.println(root.val + "-- "+root);
    	
    	//1 3 5 4 2 8 9 7 6
    }
    
	
//    @Test
//    public void case1() {
//    	
//    	TreeNode root = new TreeNode(0);
//    	
//    	TreeNode l1 = new TreeNode(1);
//    	TreeNode l2 = new TreeNode(1);
//    	TreeNode l3 = new TreeNode(1);
//    	TreeNode l4 = new TreeNode(0);
//    	
//    	TreeNode r1 = new TreeNode(0);
//    	TreeNode r2 = new TreeNode(1);
//    	TreeNode r3 = new TreeNode(0);
//    	
//    	root.right = r1;
//    	r1.right = r2;
//    	r1.left  = r3;
//    	
//    	root.left = l1;
//    	l1.left   = l2;
//    	l1.right  = l3;
//    	
//    	l2.left = l4;
// 
//    	printTree(root);
//    	pruneTree(root);
//    	System.out.println("+++++++++++++++++++++");
//    	printTree(root);
//    	
//    
//    }
    
//    @Test
//    public void case1() {
//    	
//    	TreeNode root = new TreeNode(1);
//    	
//    	TreeNode l1 = new TreeNode(0);
//    	TreeNode l2 = new TreeNode(0);
//    	TreeNode l3 = new TreeNode(0);
//    	
//    	TreeNode r1 = new TreeNode(1);
//    	TreeNode r2 = new TreeNode(1);
//    	TreeNode r3 = new TreeNode(0);
//    	
// 
//    	root.left = l1;
//    	l1.left = l2;
//    	l1.right = l3;
//    	
//    	root.right = r1;
//    	r1.left = r3;
//    	r1.right = r2;
//    	
//    	printTree(root);
//    	pruneTree(root);
//    	System.out.println("+++++++++++++++++++++");
//    	printTree(root);
//    	
//    
//    }
    
    
    @Test
    public void case1() {
    	
    	TreeNode root = new TreeNode(1);
    	
    	TreeNode l2 = new TreeNode(0);
    	TreeNode l3 = new TreeNode(0);    	
    	TreeNode r1 = new TreeNode(1);

    	root.right = l2;
    	l2.left = l3;
    	l2.right = r1;
 
    	
    	printTree(root);
    	pruneTree(root);
    	System.out.println("+++++++++++++++++++++");
    	printTree(root);
    	
    
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
