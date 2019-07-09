package tree;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left  = new TreeNode(2);
		root.right  = new TreeNode(3);
		
		root.left.left  = new TreeNode(4);
		root.right.right  = new TreeNode(5);
		
		List<List<Integer>>  lista = levelOrder(root);
		for(List<Integer> ls : lista) {
			System.out.println(ls.toString());
		}
	}

	public static List<List<Integer>> levelOrder(TreeNode root) {

		
		Queue<TreeNode> stack = new LinkedList<>();
		List<List<Integer>> retorno = new ArrayList<>();
		List<Integer> renglon = null;

		stack.add(root);
		
		while(!stack.isEmpty()) {
			
			renglon = elementsInStack(stack);
			retorno.add(renglon);
			stack = newStack(stack);
		}
		
		return retorno;
	}
		
	public static Queue<TreeNode> newStack(Queue<TreeNode> stack){
		
		Queue<TreeNode> retorno = new LinkedList<>();
		
		stack.forEach(s->{
			if(s.left!=null) {
				retorno.add(s.left);
			}
			if(s.right!=null) {
				retorno.add(s.right);
			}
			
		});		
		
				
		return retorno;
	}
	
	public static List<Integer> elementsInStack(Queue<TreeNode> stack){
				
		List<Integer> renglon = new ArrayList<>();
		
		stack.forEach(s->{
			renglon.add(s.val);
		});		

		return renglon;
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
