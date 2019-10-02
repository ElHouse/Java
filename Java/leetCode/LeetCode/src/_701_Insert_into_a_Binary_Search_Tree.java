import org.junit.Test;

public class _701_Insert_into_a_Binary_Search_Tree {

//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Insert into a Binary Search Tree.
//	Memory Usage: 39.1 MB, less than 100.00% of Java online submissions for Insert into a Binary Search Tree.
	
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
    	printTree(root);
    	System.out.println("++++++++++++++++");
    	algo(root, val);
    	printTree(root);
    	
    	return root;
    }
    
    
    public TreeNode algo(TreeNode root, int val){
    	
    	
    	if(root.val < val) {

    		if(root.right == null) {

    			root.right = new TreeNode(val);
    		}else {

    			algo(root.right,val);
    		}
    		
    	}else {
    		
    		if(root.left == null) {
    			root.left = new TreeNode(val);
    		}else {
    			algo(root.left,val);
    		}
    	}
    	
    	return root;
    	
    }
    
    
    
	public static void printTree(TreeNode root) {
		
		boolean isLeaf = true;
		if(hasLeft(root)) {
			System.out.println(root.val);
			isLeaf = false;
			printTree(root.left);
		}
		if(hasRight(root)) {
			System.out.println(root.val);
			isLeaf = false;
			printTree(root.right);
		}
		
		if(isLeaf) {
			System.out.println(root.val);
			System.out.println("----------------");
		}
		
	}
	public static boolean hasRight(TreeNode root) {
		
		return root.right!=null;
	}
	public static boolean hasLeft(TreeNode root) {
		
		return root.left!=null;
	}
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
//	@Test
//	public void case1() {
//
//		TreeNode root = new TreeNode(4);
//		
//		TreeNode l1 = new TreeNode(2);
//		TreeNode l2 = new TreeNode(1);
//		TreeNode l3 = new TreeNode(3);
//		
//		TreeNode r1 = new TreeNode(7);
//		
//		
//		root.left = l1;
//		l1.right  = l3;
//		l1.left   = l2;
//		
//		root.right = r1;
//		
//		insertIntoBST(root, 5);
//	}
	
	
	@Test
	public void case2() {

		TreeNode root = new TreeNode(10);
		
		TreeNode l1 = new TreeNode(5);
		TreeNode l2 = new TreeNode(3);
		TreeNode l3 = new TreeNode(7);
		
		TreeNode r1 = new TreeNode(15);
		TreeNode r2 = new TreeNode(18);
		TreeNode r3 = new TreeNode(13);
		
		
//		root.left = l1;
//		l1.right  = l3;
//		l1.left   = l2;
//		
//		root.right = r1;
//		r1.left  = r3;
//		r1.right = r2;
//		
		
		insertIntoBST(root, 2);
	}
	
	
//	@Test
//	public void case3() {
//
//		TreeNode root = new TreeNode(10);
//		
//		TreeNode l1 = new TreeNode(5);
//		TreeNode l2 = new TreeNode(3);
//		TreeNode l3 = new TreeNode(7);
//		
//		TreeNode r1 = new TreeNode(15);
//		TreeNode r2 = new TreeNode(13);
//		TreeNode r3 = new TreeNode(17);
//		
//		
//		root.left = l1;
//		l1.right  = l3;
//		l1.left   = l2;
//		
//		root.right = r1;
//		r1.left = r2;
//		r3.right = r3;
//		
//		
//		insertIntoBST(root, 1);
//	}
}



























