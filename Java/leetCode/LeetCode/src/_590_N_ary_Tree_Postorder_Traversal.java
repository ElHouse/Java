import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class _590_N_ary_Tree_Postorder_Traversal {

	
//	Runtime: 5 ms, faster than 15.46% of Java online submissions for N-ary Tree Postorder Traversal.
//	Memory Usage: 49.5 MB, less than 16.22% of Java online submissions for N-ary Tree Postorder Traversal.
	public List<Integer> postorder(Node root) {

		List<Integer> result = new ArrayList<>();
		Stack<Node> pila  = new Stack<>();
		
		Stack<Node> pila22  = new Stack<>();
		pila.add(root);
		
		while(!pila.isEmpty()) {
		
			Node aux = pila.pop();
		
			pila22.add(aux);
			if(aux.children != null) {
				for(Node n: aux.children) {
					pila.add(n);
				}
			}
			
		}
		
		while(!pila22.isEmpty()) {
			
			Node aux = pila22.pop();
		
			result.add(aux.val);
			System.out.print(aux.val+" ");
			
		}
		return result;
	}

	
	
	
	
	@Test
	public void case1() {

		System.out.println("----------case 1");
		Node root = new Node(1, null);
		
		Node root11 = new Node(3, null);
		Node root12 = new Node(2, null);
		Node root13 = new Node(4, null);
		
		
		Node root21 = new Node(5, null);
		Node root22 = new Node(6, null);
		
		List<Node > c1 = new ArrayList<>();
		c1.add(root11);
		c1.add(root12);
		c1.add(root13);
		
		List<Node > c2 = new ArrayList<>();
		c2.add(root21);
		c2.add(root22);
		
		
		root.children = c1;
		root11.children = c2;
		
		postorder(root);
		
	}
	
	@Test
	public void case2() {
		System.out.println("----------case 2");
		Node root = new Node(1, null);
		
		Node root11 = new Node(3, null);
		Node root12 = new Node(2, null);
		Node root13 = new Node(4, null);
		
		
		Node root21 = new Node(5, null);
		Node root22 = new Node(6, null);
		
		
		
		Node root2a = new Node(7, null);
		Node root2b = new Node(8, null);
		
		
		Node root3a = new Node(9, null);
		Node root3b = new Node(10, null);
		
		List<Node > c1 = new ArrayList<>();
		c1.add(root11);
		c1.add(root12);
		c1.add(root13);
		
		List<Node > c2 = new ArrayList<>();
		c2.add(root21);
		c2.add(root22);
		
		List<Node > c3 = new ArrayList<>();
		c3.add(root2a);
		c3.add(root2b);
		
		List<Node > c4 = new ArrayList<>();
		c4.add(root3a);
		c4.add(root3b);
		
		root.children = c1;
		root11.children = c2;
		root12.children = c3;
		root13.children = c4;
		
		
		//5 6 3 7 8 2 9 10 4 1
		postorder(root);
		
	}
	
	
	@Test
	public void case3() {

		System.out.println("----------case 3");
		Node root = new Node(1, null);
		
		Node root11 = new Node(3, null);
		Node root12 = new Node(2, null);
		Node root13 = new Node(4, null);
		
		
		Node root21 = new Node(5, null);
		Node root22 = new Node(6, null);
		
		
		
		Node root2a = new Node(7, null);
		Node root2b = new Node(8, null);
		
		
		Node root3a = new Node(9, null);
		Node root3b = new Node(10, null);
		
		Node root4a = new Node(11, null);
		Node root4b = new Node(12, null);
	
		
		List<Node > c1 = new ArrayList<>();
		c1.add(root11);
		c1.add(root12);
		c1.add(root13);
		
		List<Node > c2 = new ArrayList<>();
		c2.add(root21);
		c2.add(root22);
		
		List<Node > c3 = new ArrayList<>();
		c3.add(root2a);
		c3.add(root2b);
		
		List<Node > c4 = new ArrayList<>();
		c4.add(root3a);
		c4.add(root3b);
	
		List<Node > c5 = new ArrayList<>();
		c5.add(root4a);
		c5.add(root4b);
		
		root.children = c1;
		root11.children = c2;
		root12.children = c3;
		root13.children = c4;
		
		root22.children = c5;	
		
		//5 11 12 6 3 7 8 2 9 10 4 1
		postorder(root);
		
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
