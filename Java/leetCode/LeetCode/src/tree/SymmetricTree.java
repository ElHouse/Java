package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SymmetricTree {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left  = new TreeNode(2);
		root.right  = new TreeNode(2);
		
		root.left.left  = new TreeNode(4);
		root.right.right  = new TreeNode(4);
		
		System.out.println( levelOrder(root) );
		
	}
	

	public static boolean levelOrder(TreeNode root) {
		
		Queue<TreeNode> stack = new LinkedList<>();
		List<List<Integer>> retorno = new ArrayList<>();
		List<Integer> renglon = null;

		stack.add(root);
		
		try {
			while(!stack.isEmpty()) {
				
				renglon = elementsInStack(stack);
				retorno.add(renglon);
				stack = newStack(stack);
			}
		}catch(Exception e) {
			return false;
		}
		
		return true;
	}
		
	public static Queue<TreeNode> newStack(Queue<TreeNode> stack){
		
		Queue<TreeNode> retorno = new LinkedList<>();
		
		stack.forEach(s->{
			
			if(s.val!=Integer.MAX_VALUE) {
				
				if(s.left!=null) retorno.add(s.left);
				else             retorno.add(new TreeNode(Integer.MAX_VALUE));
				
				if(s.right!=null) retorno.add(s.right);
     			else              retorno.add(new TreeNode(Integer.MAX_VALUE));
			}
		});		
		
				
		return retorno;
	}
	
	public static List<Integer> elementsInStack(Queue<TreeNode> stack) throws Exception{
				
		List<Integer> renglon = new ArrayList<>();
		
		stack.forEach(s->{
			renglon.add(s.val);
		});		
		
		isValidMirror(renglon);
		
		return renglon;
	}
	
	public static void isValidMirror(List<Integer> list) throws Exception {
		
		int j = list.size()-1;
		for(int i=0; i<j; i++) {
			
			if(!(list.get(i).equals(list.get(j)))) {
				throw new Exception("No iguales");
			}
			j--;
		}
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