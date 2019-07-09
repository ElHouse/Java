
public class _112_PathSum {

	
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right =  new TreeNode(8);
		root.left.left =  new TreeNode(11);
		root.left.left.left =  new TreeNode(7);
		root.left.left.right =  new TreeNode(2);
		
		root.right.left =  new TreeNode(13);
		root.right.right =  new TreeNode(4);
		root.right.right.right =  new TreeNode(1);
		
		System.out.println(hasPathSum(root,18));
	}
	
	public static boolean hasPathSum(TreeNode root, int sum) {
        
		return logic(root,0,sum);
    }
	
	public static boolean logic(TreeNode root, int sum, int valor) {
		

		boolean isLeaf = true;
		if(hasLeft(root)) {
			System.out.println(root.val);
			isLeaf = false;
			int sumAux = sum + root.val;
			if(logic(root.left,sumAux,valor)){
				return true;
			}
		}
		
		if(hasRight(root)) {
			System.out.println(root.val);
			isLeaf = false;
			int sumAux = sum + root.val;
			if(logic(root.right,sumAux,valor)) {
				return true;
			}
		}
		
		if(isLeaf) {
			System.out.println(root.val);
			System.out.println("----------------"+(sum+root.val));
			return valor == (sum+root.val);
		}
		
		return false;
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
	      TreeNode(int x) { val = x; }
	}
 
}