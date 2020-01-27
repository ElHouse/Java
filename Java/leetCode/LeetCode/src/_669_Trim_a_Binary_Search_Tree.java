import org.junit.Test;


public class _669_Trim_a_Binary_Search_Tree {

	TreeNode newHead = new TreeNode(Integer.MAX_VALUE);
	
//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Trim a Binary Search Tree.
//	Memory Usage: 37.5 MB, less than 100.00% of Java online submissions for Trim a Binary Search Tree.
	public TreeNode trimBST(TreeNode root, int L, int R) {
		
		
		if(root == null) return null;
		inOrder(root, L, R, newHead);
		
		return newHead.left;
	}
	
	public void inOrder(TreeNode root, int L, int R, TreeNode newHead) {
		
		if(root== null) return ;
		
		if( L <=  root.val  && root.val <= R) {
			addToTrimTree(newHead, root.val);
		}
		
		if( root.val > L ) inOrder(root.left,  L, R,newHead); 
		if( root.val < R ) inOrder(root.right, L, R,newHead); 
		
		
	}

	
	public void addToTrimTree(TreeNode root, int val) {
	
		if(root.val < val) {
			
			if(root.right == null) {
				root.right = new TreeNode(val);
			}else {
				addToTrimTree(root.right, val);
			}
		}else {
			
			if(root.left == null) {
				root.left = new TreeNode(val);
			}else {
				addToTrimTree(root.left, val);
			}
			
		}
			
	}


	@Test
	public void case1() {
		System.out.println("---------case 1");
//	    3
//	    / \
//	   0   4
//	    \
//	     2
//	    /
//	   1
		

		TreeNode root3 = new TreeNode(3);
		TreeNode root0 = new TreeNode(0);
		TreeNode root4 = new TreeNode(4);
		TreeNode root2 = new TreeNode(2);
		TreeNode root1 = new TreeNode(1);
	

		root3.left  = root0;
		root3.right = root4;
		root0.right = root2;
		root2.left = root1;
		
		System.out.println("antes");
		System.out.println(print(root3));
		
		TreeNode answer = trimBST(root3, 1, 3);
		
		System.out.println("despues");
		System.out.println(print(answer));
		
	}
	
	
	@Test
	public void case2() {
		System.out.println("---------case 2");
//	    3
//	    / \
//	   0   4
//	    \
//	     2
//	    /
//	   1
		

		TreeNode root0 = new TreeNode(0);
		TreeNode root2 = new TreeNode(2);
		TreeNode root1 = new TreeNode(1);
	

		root1.left  = root0;
		root1.right = root2;
		
		System.out.println("antes");
		System.out.println(print(root1));
		
		TreeNode answer = trimBST(root1, 1, 3);
		
		System.out.println("despues");
		System.out.println(print(answer));
		
	}
	
	
	public String print(TreeNode root) {
		
		if(root == null) return "x";
		
		StringBuilder sb = new StringBuilder(String.valueOf(root.val));

		sb.append(" ");

		if(root.left!= null) {
			sb.append( print(root.left));
		}

		
		
		if(root.right!= null) {
			sb.append( print(root.right));
		}
		
		return sb.toString();
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