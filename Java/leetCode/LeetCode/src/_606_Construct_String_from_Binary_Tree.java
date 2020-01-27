import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.junit.Test;


public class _606_Construct_String_from_Binary_Tree {

//	Runtime: 6 ms, faster than 75.94% of Java online submissions for Construct String from Binary Tree.
//	Memory Usage: 37.9 MB, less than 100.00% of Java online submissions for Construct String from Binary Tree.
	public String tree2str(TreeNode t) {

		String a = treeSerialization(t);
				
		return a.substring(1, a.length()-1);
	}

	public String treeSerialization(TreeNode root) {

		StringBuilder sb = new StringBuilder();
		
		sb.append("(");
		
		sb.append(root.val);
		
		if(root.left != null && root.right != null) {
			sb.append( treeSerialization(root.left));
			sb.append( treeSerialization(root.right));
		}else if(root.left != null && root.right == null) {
			
			sb.append( treeSerialization(root.left));
		}else if(root.left == null && root.right != null) {
		
			sb.append("()");
			sb.append( treeSerialization(root.right));
		}
		
        sb.append(")");
		
		return sb.toString();
		
	}
	
	
	@Test
	public void caese1() {

//	         13 
//	      /     \
//	     9      15
//     /  \	    / \
//    7   11   14 30  
//   / \   / \  
//  3   8 10 12
//   \
//    6
		
//    13(9(7(3()(6))(8))(11(10)))(15(14()(12))(30))		
		
	TreeNode root1 = new TreeNode(13);
	 TreeNode root2 = new TreeNode(9);
		  TreeNode root3 = new TreeNode(7);
		  	    TreeNode rootx = new TreeNode(3);
		  	    
		  	    	TreeNode rooty = new TreeNode(6);
		   		TreeNode root4 = new TreeNode(8);
		  TreeNode root5 = new TreeNode(11);
				TreeNode root51 = new TreeNode(10);
				TreeNode root52 = new TreeNode(12);
	 TreeNode root6 = new TreeNode(15);
	 
	 
	 
		 
	 TreeNode roota = new TreeNode(14);
	 TreeNode rootb = new TreeNode(30);
	
	 
	 
	root1.left = root2;
	root1.right = root6;
	
	root2.left  = root3;
	root2.right = root5;
	
	root3.right = root4;
	root3.left = rootx; 
	
	root5.left = root51;
	root5.right = root52;
	
	
	rootx.right = rooty;

	root6.left = roota;
	root6.right= rootb;
	
	
	 assertEquals( "13(9(7(3()(6))(8))(11(10)(12)))(15(14)(30))" ,tree2str(root1));
	
	}
	
	
	@Test
	public void caese2() {

		TreeNode root1 = new TreeNode(1);
		TreeNode root2 = new TreeNode(2);
		TreeNode root3 = new TreeNode(3);
		TreeNode root4 = new TreeNode(4);

		root1.left = root2;
		root1.right = root3;
	
		root2.left = root4;
	
//		              1(2(4)())(3)
		assertEquals("1(2(4))(3)", tree2str(root1));
	}
	
	
	@Test
	public void caese3() {

		TreeNode root1 = new TreeNode(1);
		TreeNode root2 = new TreeNode(2);
		TreeNode root3 = new TreeNode(3);
		TreeNode root4 = new TreeNode(4);

		root1.left = root2;
		root1.right = root3;
	
		root2.right = root4;
	
		assertEquals("1(2()(4))(3)", tree2str(root1));
	}
	
	@Test
	public void caese4() {

		TreeNode root1 = new TreeNode(1);
		TreeNode root2 = new TreeNode(2);
		TreeNode root3 = new TreeNode(3);
		TreeNode root4 = new TreeNode(4);
		TreeNode root5 = new TreeNode(5);
	
		
		root1.left = root2;
		root2.right = root3;
		root3.right = root4;
		root4.right = root5;
//  		          1(2()(3()(4()(5))))
		assertEquals("1(2()(3()(4()(5))))", tree2str(root1));
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