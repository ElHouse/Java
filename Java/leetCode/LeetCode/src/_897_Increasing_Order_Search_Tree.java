import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class _897_Increasing_Order_Search_Tree {

	
	public TreeNode rootDumy= null;
	public TreeNode newRoot = null;
	public TreeNode leaf    = null;

//	Runtime: 2 ms, faster than 100.00% of Java online submissions for Increasing Order Search Tree.
//	Memory Usage: 44.4 MB, less than 40.63% of Java online submissions for Increasing Order Search Tree.
	public TreeNode increasingBST(TreeNode root) {

		createNewTree(root);

//		newRoot = cola.poll();
//		leaf    =  newRoot;
		
		
//		System.out.println("--");
//		printRight(newRoot);
		
		return newRoot;
	}
	
	public void createNewTree(TreeNode root) {
		
		if(root.left != null) {
			createNewTree(root.left);
		}
		
		if(newRoot == null) {
			newRoot = root;
			leaf = newRoot;
		}else {
			root.left = rootDumy;
			
			
			System.out.println("root  >"+root.val);
			System.out.println("root L>"+(root.left==null?"null":root.left.val));
			System.out.println("root R>"+(root.right==null?"null":root.right.val));
			leaf.right = root;
			leaf = leaf.right;
			System.out.println("======================");
			printRight(newRoot);
		}
		
		
		
		if(root.right != null) {
			createNewTree(root.right);
		}
		
		
		
	}

	
	@Test
	public void case1() {

		TreeNode root = new TreeNode(5);
		
		TreeNode root11 = new TreeNode(3);
		TreeNode root12 = new TreeNode(6);
		
		TreeNode root21 = new TreeNode(2);
		TreeNode root22 = new TreeNode(4);
		TreeNode root23 = new TreeNode(8);
		
		TreeNode root31 = new TreeNode(1);	
		TreeNode root32 = new TreeNode(7);
		TreeNode root33 = new TreeNode(9);

		root.left  = root11;
		root.right = root12;
		
		root11.left = root21;
		root11.right = root22;
		
		root12.right = root23;
		
		root21.left = root31;
		
		root23.left = root32;
		root23.right = root33;
	
//		
		System.out.println("---------INICIA");
		printRight(root);
		
		root = increasingBST(root);
		
		System.out.println("-----FINAL");
		printRight(root);
	
	}

	
	public void printRight(TreeNode root) {
		if(root.left != null) {
			System.out.println("mal>"+root.left.val);
			printRight(root.left);
			
		}
		System.out.println(root.val);
		
		if(root.right != null) {
			printRight(root.right);
		}
	}
	
	public void printInOrder(TreeNode root) {
		if(root.left != null) {
			printRight(root.left);
		}
		System.out.println(root.val);
		
		if(root.right != null) {
			printRight(root.right);
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
