import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;


public class _173_Binary_Search_Tree_Iterator {


	Queue<TreeNode> cola = new LinkedList<>(); 

//	Runtime: 57 ms, faster than 90.18% of Java online submissions for Binary Search Tree Iterator.
//	Memory Usage: 50.3 MB, less than 92.59% of Java online submissions for Binary Search Tree Iterator.
	public _173_Binary_Search_Tree_Iterator(TreeNode root) {
		
		setNewTail(root);
	}

	
	
	/** @return the next smallest number */
	public int next() {
		
		return cola.poll().val;
	}
	
	private void setNewTail(TreeNode root) {
		
		if(root.left!= null) {
			setNewTail(root.left);
		}
		
		cola.add(root);
		
		if(root.right!= null) {
			setNewTail(root.right);
		}
		
	
	}
	

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		return !cola.isEmpty();
	}

	
	public static void main(String[] args) {
	
		TreeNode root1 = new TreeNode(13);
		 TreeNode root2 = new TreeNode(9);
		  TreeNode root3 = new TreeNode(7);
		   TreeNode root4 = new TreeNode(8);
		  TreeNode root5 = new TreeNode(11);
		 TreeNode root6 = new TreeNode(15);
		 
		 

		root1.left = root2;
		root1.right = root6;
		
		root2.left  = root3;
		root2.right = root5;
		
		root3.right = root4;
		
		_173_Binary_Search_Tree_Iterator a = new _173_Binary_Search_Tree_Iterator(root1);
		System.out.println(a.hasNext());
		System.out.println(a.next());
		System.out.println(a.hasNext());
		System.out.println(a.next());
		System.out.println(a.hasNext());
		System.out.println(a.next());
		System.out.println(a.hasNext());
		System.out.println(a.next());
		System.out.println(a.hasNext());
		System.out.println(a.next());
		System.out.println(a.hasNext());
		System.out.println(a.next());
		System.out.println(a.hasNext());
	

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
