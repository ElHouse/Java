package DFS;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;



public class dfs_minPath {

	class Node {

		char letter;
		List<Node> nodes;

		public Node(char letter) {
			this.letter = letter;
			this.nodes = null;
		}
	}


	int steps = Integer.MAX_VALUE;
	String path = null;
	
	public void dfs_find_min_path(Node node, String path, Node target, int count, Node prev) {
		
		path+="->"+node.letter;
		count++;
		
		if(target == node) {
			if(count<steps) {
				steps = count;
				this.path = path;
			}
		}else {
			
			if(node.nodes != null) {
				for(Node aux: node.nodes) {
					if(aux != prev) dfs_find_min_path(aux, path, target, count, node);
				}
			}
		}
		
	}
	
	
	public String init(Node node, Node target) {
		
		dfs_find_min_path(node, "", target, 0, null);
		
		return path;
	}

	@Test
	public void case1() {

//	   a--b---f
////      \   |
//		   d--e
//		  / \
//		 h   g
 		 
		Node na = new Node('a');
		Node nb = new Node('b');
		Node nd = new Node('d');
		Node nh = new Node('h');
		Node ng = new Node('g');
		Node ne = new Node('e');
		Node nf = new Node('f');
	
		
		List<Node> ca = new ArrayList<>();
//		ca.add(nb);
		ca.add(nd);
//		ca.add(nf);
		na.nodes = ca;
		
		List<Node> cb = new ArrayList<>();
		cb.add(na);
		cb.add(nf);
		nb.nodes = cb;
		
		List<Node> cd = new ArrayList<>();
		cd.add(ne);
		cd.add(nh);
		cd.add(ng);
		nd.nodes = cd;
		
		List<Node> ce = new ArrayList<>();
		ce.add(nf);
		ne.nodes = ce;
		
		System.out.println(init(na, ng));
	}
	
	
	
}
