import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class _872_Leaf_Similar_Trees {



//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Leaf-Similar Trees.
//	Memory Usage: 34.5 MB, less than 100.00% of Java online submissions for Leaf-Similar Trees.
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {

		if(root1 == null || root2 == null) return false;
		
		List<Integer> leafRoot1 = new ArrayList<>();
		List<Integer> leafRoot2 = new ArrayList<>();
		
		getLeafList(root1, leafRoot1);
		getLeafList(root2, leafRoot2);
		
		if(leafRoot1.size() != leafRoot2.size()) return false;
		
		for (int i = 0; i < leafRoot1.size(); i++) {
			if(leafRoot1.get(i) != leafRoot2.get(i)) return false;
			
		}
	
		return true;
	}
	
	
	public void getLeafList(TreeNode root, List<Integer> list) {
		
		if(root.left != null) {
			getLeafList(root.left,list);
		}
		
		if(root.right != null) {
			getLeafList(root.right,list);
		}
		
		if(root.right == null && root.left == null) {
			list.add(root.val);
		}
		
	}
	
	
	@Test
	public void case1() {
		
		TreeNode root = new TreeNode(3);
		
		TreeNode root11 = new TreeNode(5);
		TreeNode root12 = new TreeNode(1);
				
		TreeNode root21 = new TreeNode(6);
		TreeNode root22 = new TreeNode(2);
		TreeNode root23 = new TreeNode(9);
		TreeNode root24 = new TreeNode(8);
		
		TreeNode root31 = new TreeNode(7);
		TreeNode root32 = new TreeNode(4);

		root.left  = root11;
		root.right = root12;

		root11.left  = root21;
		root11.right = root22;

		root22.left = root31;
		root22.right = root32;

		root12.left = root23;
		root12.right = root24;
		
		
		TreeNode aroot = new TreeNode(3);
		
		TreeNode aroot11 = new TreeNode(5);
		TreeNode aroot12 = new TreeNode(1);
				
		TreeNode aroot21 = new TreeNode(6);
		TreeNode aroot22 = new TreeNode(2);
		TreeNode aroot23 = new TreeNode(9);
		TreeNode aroot24 = new TreeNode(8);
		
		TreeNode aroot31 = new TreeNode(7);
		TreeNode aroot32 = new TreeNode(2);

		aroot.left  = aroot11;
		aroot.right = aroot12;

		aroot11.left  = aroot21;
		aroot11.right = aroot22;

		aroot22.left = aroot31;
		aroot22.right = aroot32;

		aroot12.left = aroot23;
		aroot12.right = aroot24;
		
//		printInOrder(root);
		System.out.println("---INCIIA");
		assertFalse(leafSimilar(root,aroot));
	}
	
	
	
	@Test
	public void case2() {
		System.out.println("case 2");
		TreeNode root = new TreeNode(1);
		
		TreeNode root11 = new TreeNode(2);
		TreeNode root12 = new TreeNode(3);
				
		root.left  = root11;
		root.right = root12;

		TreeNode aroot = new TreeNode(1);
		
		TreeNode aroot11 = new TreeNode(3);
		TreeNode aroot12 = new TreeNode(2);
		
		aroot.left  = aroot11;
		aroot.right = aroot12;

		
//		printInOrder(root);
		System.out.println("---INCIIA");
		assertFalse(leafSimilar(root,aroot));
	}
	

	public void printInOrder(TreeNode root) {
		if(root.left != null) {
			printInOrder(root.left);
		}
		System.out.println(root.val);
		
		if(root.right != null) {
			printInOrder(root.right);
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
