import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class _133_Clone_Graph {

//	Runtime: 1 ms, faster than 100.00% of Java online submissions for Clone Graph.
//	Memory Usage: 32.3 MB, less than 97.65% of Java online submissions for Clone Graph.
	public Node cloneGraph(Node node) {

		if(node == null) return null;
				
		return dfs(node,null);
	}
	
	
	Map<Node,Node > map = new HashMap<>();
	
	public Node dfs(Node actual, Node prev) {
		
		Node node = new Node(actual.val,null);
		List<Node> neighbors = new ArrayList<>();
		map.put(actual,node);
		for(Node n: actual.neighbors) {
	
			if(map.containsKey(n)) {
				neighbors.add(map.get(n));
			}else {
				Node aux = dfs(n,actual);
				neighbors.add(aux);
			}			
			
		}
		
		node.neighbors = neighbors;
		
		return node;
	}

	@Test
	public void case1() {

		Node n1 = new Node(1,null);
		Node n2 = new Node(2,null);
		Node n3 = new Node(3,null);
		Node n4 = new Node(4,null);
	
		List<Node> v1 = new ArrayList<>();
		v1.add(n2);
		v1.add(n4);
		n1.neighbors = v1;
	
		List<Node> v2 = new ArrayList<>();
		v2.add(n1);
		v2.add(n3);
		n2.neighbors = v2;
		
		List<Node> v3 = new ArrayList<>();
		v3.add(n2);
		v3.add(n4);
		n3.neighbors = v3;
	
		List<Node> v4 = new ArrayList<>();
		v4.add(n1);
		v4.add(n3);
		n4.neighbors = v4;
		
		assertEquals(n1.toString(), cloneGraph(n1).toString());
		
	}
	
	
	@Test
	public void case2() {

		Node n1 = new Node(1,null);
		Node n2 = new Node(2,null);
		Node n3 = new Node(3,null);
		Node n4 = new Node(4,null);
	
		List<Node> v1 = new ArrayList<>();
		v1.add(n2);
		v1.add(n4);
		v1.add(n3);
		n1.neighbors = v1;
	
		List<Node> v2 = new ArrayList<>();
		v2.add(n1);
		v2.add(n3);
		n2.neighbors = v2;
		
		List<Node> v3 = new ArrayList<>();
		v3.add(n2);
		v3.add(n4);
		v3.add(n1);
		n3.neighbors = v3;
	
		List<Node> v4 = new ArrayList<>();
		v4.add(n1);
		v4.add(n3);
		n4.neighbors = v4;
		
		assertEquals(n1.toString(), cloneGraph(n1).toString());
		
	}
	
	@Test
	public void case3() {

		Node n1 = new Node(1,null);
		Node n2 = new Node(2,null);
		Node n3 = new Node(3,null);
		Node n4 = new Node(4,null);
	
		List<Node> v1 = new ArrayList<>();
		v1.add(n2);
		v1.add(n4);
		v1.add(n3);
		n1.neighbors = v1;
	
		List<Node> v2 = new ArrayList<>();
		v2.add(n1);
		n2.neighbors = v2;
		
		List<Node> v3 = new ArrayList<>();
		v3.add(n1);
		n3.neighbors = v3;
	
		List<Node> v4 = new ArrayList<>();
		v4.add(n1);
		n4.neighbors = v4;
		
		assertEquals(n1.toString(), cloneGraph(n1).toString());
		
	}
	
	class Node {
		public int val;
		public List<Node> neighbors;

		public Node() {
		}

		public Node(int _val, List<Node> _neighbors) {
			val = _val;
			neighbors = _neighbors;
		}
		
		public String stringNode(Node node, Set<Node> path) {
			
			StringBuilder sb = new StringBuilder();
			sb.append(node.val);
			sb.append("{");
			path.add(node);
			
			for(Node n: node.neighbors) {
				
				if(!path.contains(n)) {
					path.add(n);
					
					sb.append(stringNode(n, path));	
				}else {
					sb.append(n.val);
				}
				sb.append(",");
			}
			
			sb.append("}");
			return sb.toString();
		}
		
		@Override
		public String toString() {
			
			Set<Node> path = new HashSet<>();
			
			
			
			return stringNode(this, path);
		}
	};
}
