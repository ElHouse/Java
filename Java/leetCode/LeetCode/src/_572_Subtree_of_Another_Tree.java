import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class _572_Subtree_of_Another_Tree {

	
	List<TreeNode> list = new ArrayList<>();
	
//	Runtime: 6 ms, faster than 93.31% of Java online submissions for Subtree of Another Tree.
//	Memory Usage: 40.1 MB, less than 97.78% of Java online submissions for Subtree of Another Tree.
	public boolean isSubtree(TreeNode s, TreeNode t) {

		if(s == null || t== null) return false;
		
		findElement(s, t);
				
		if(list.isEmpty()) return false;
		
		for(TreeNode aux: list) {
			if(areEqualTrees(aux, t)) return true;
		}
		
		return false;
	}
	
	public boolean areEqualTrees(TreeNode aux, TreeNode t) {
		
		if(aux.val != t.val) return false;
		
		if(aux.left == null && t.left != null) return false;
		else if(aux.left != null && t.left == null) return false;
		else if(aux.left != null){
			boolean a = areEqualTrees(aux.left, t.left);
			if(!a) return false;
		}
		
		if(aux.right == null && t.right != null) return false;
		else if(aux.right != null && t.right == null) return false;
		else if(aux.right != null){
			boolean a = areEqualTrees(aux.right, t.right);
			if(!a) return false;
		}
		
		return true;
	}
	
	public void findElement(TreeNode s, TreeNode t) {
		
		if(s.val == t.val) list.add(s);

		
		if(s.left  != null) {
		   findElement(s.left , t);
		}
		
		if(s.right != null) {
		   findElement(s.right, t);
		}
		
	}
	
	
	@Test
	public void case1() {

		TreeNode root3 = new TreeNode(3);
		TreeNode root4 = new TreeNode(4);
		TreeNode root5 = new TreeNode(5);
		TreeNode root1 = new TreeNode(1);
		TreeNode root2 = new TreeNode(2);
		
 
		root3.left  = root4;
		root3.right = root5;
		root4.left  = root1;
		root4.right = root2;
		

		TreeNode roo4 = new TreeNode(4);
		TreeNode roo1 = new TreeNode(1);
		TreeNode roo2 = new TreeNode(2);

		roo4.left  = roo1;
		roo4.right = roo2;
		
		assertTrue(isSubtree(root3, roo4));
		
		
		
	}
	
	@Test
	public void case2() {

		TreeNode root3 = new TreeNode(3);
		TreeNode root4 = new TreeNode(4);
		TreeNode root5 = new TreeNode(5);
		TreeNode root1 = new TreeNode(1);
		TreeNode root2 = new TreeNode(2);
		TreeNode root0 = new TreeNode(0);
 
		root3.left  = root4;
		root3.right = root5;
		root4.left  = root1;
		root4.right = root2;
		root2.left  = root0;

		TreeNode roo4 = new TreeNode(4);
		TreeNode roo1 = new TreeNode(1);
		TreeNode roo2 = new TreeNode(2);

		roo4.left  = roo1;
		roo4.right = roo2;
		
		assertFalse(isSubtree(root3, roo4));
	}

	
	@Test
	public void case3() {

		TreeNode root3 = new TreeNode(3);
		TreeNode root4 = new TreeNode(4);
		TreeNode root5 = new TreeNode(5);
		TreeNode root1 = new TreeNode(1);
		TreeNode root2 = new TreeNode(2);
		TreeNode root0 = new TreeNode(0);
 
		root3.left  = root4;
		root3.right = root5;
		root4.left  = root1;
		root4.right = root2;
		root2.left  = root0;

		TreeNode roo4 = new TreeNode(4);
		TreeNode roo1 = new TreeNode(1);
		TreeNode roo2 = new TreeNode(2);
		TreeNode roo0 = new TreeNode(0);

		roo4.left  = roo1;
		roo4.right = roo2;
		roo2.left  = roo0;
		
		assertTrue(isSubtree(root3, roo4));
	}
	
	
	@Test
	public void case4() {

		TreeNode root3 = new TreeNode(3);
		TreeNode root4 = new TreeNode(4);
		TreeNode root5 = new TreeNode(5);
		TreeNode root1 = new TreeNode(1);
		TreeNode root2 = new TreeNode(2);
		TreeNode root0 = new TreeNode(0);
 
		root3.left  = root4;
		root3.right = root5;
		root4.left  = root1;
		root4.right = root2;
		root2.left  = root0;

		TreeNode roo4 = new TreeNode(4);
		TreeNode roo1 = new TreeNode(1);
		TreeNode roo2 = new TreeNode(2);
		TreeNode roo0 = new TreeNode(0);

		roo4.left  = roo1;
		roo4.right = roo2;
		roo2.left  = roo0;
		
		assertTrue(isSubtree(root3, root3));
	}
	
	
	@Test
	public void case5() {

		TreeNode root3 = new TreeNode(3);
 


		TreeNode roo4 = new TreeNode(3);

		
		assertTrue(isSubtree(root3, roo4));
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
