import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.junit.Test;

public class _429_N_ary_Tree_Level_Order_Traversal {

//	Runtime: 3 ms, faster than 77.58% of Java online submissions for N-ary Tree Level Order Traversal.
//	Memory Usage: 47.6 MB, less than 50.00% of Java online submissions for N-ary Tree Level Order Traversal.
	public List<List<Integer>> levelOrder(Node root) {

		if(root == null) return null;
		
		List<List<Integer>> retorno = new ArrayList<>();
		Queue<Node> cola = new LinkedList<>();
		
		findChildren(root, cola);
		List<Integer>  b  = new ArrayList<>();
		b.add(root.val);
		
		retorno.add(b);
		
		while(!cola.isEmpty()) {
			
			List<Integer> aux     = new ArrayList<>();
			List<Node>    auxNode = new ArrayList<>();
			while(!cola.isEmpty()) {
				Node n = cola.poll();
				aux.add(n.val);
				auxNode.add(n);
			}
			
			for(Node n: auxNode) {
				
				findChildren(n, cola);
			}
			
			retorno.add(aux);
		}
		
		System.out.println("size>"+retorno.size());
				
		for(List<Integer> i : retorno) {
			System.out.println(i.toString());
		}
		
		return retorno;
	}
	
	
	public void findChildren(Node node,Queue<Node> cola) {
		
		if(node.children != null) {
			
			for(Node n: node.children) {
				cola.add(n);
			}
			
		}
	}
	
	@Test
	public void case1() {
		
		Node root = new Node(1,null);
		
		Node root21 = new Node(3,null);
		Node root22 = new Node(2,null);
		Node root23 = new Node(4,null);
		
		Node root31 = new Node(5,null);
		Node root32 = new Node(6,null);
		Node root33 = new Node(8,null);
		Node root34 = new Node(11,null);
		
		Node root41 = new Node(7,null);
		
		Node root51 = new Node(91,null);
		Node root52 = new Node(92,null);
		Node root53 = new Node(93,null);

		List<Node> c1 = new ArrayList<>();
		c1.add(root21);
		c1.add(root22);
		c1.add(root23);
		root.children = c1;
		
		List<Node> c3 = new ArrayList<>();
		c3.add(root31);
		c3.add(root32);
		root21.children = c3;
			
		List<Node> c2 = new ArrayList<>();
		c2.add(root33);
		root22.children = c2;
		
		List<Node> c4 = new ArrayList<>();
		c4.add(root34);
		root23.children = c4;
				
		List<Node> c8 = new ArrayList<>();
		c8.add(root41);
		root33.children = c8;
		
		List<Node> c7 = new ArrayList<>();
		c7.add(root51);
		c7.add(root52);
		c7.add(root53);
		root41.children = c7;
		
		levelOrder(root);
		
		
	}

	class Node {

		public int val;
		public List<Node> children;

		public Node() {
		}

		public Node(int _val, List<Node> _children) {
			val = _val;
			children = _children;
		}
	};
}
