package DFS;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class dfs_printPaths {

	
	class Node {
		
		char letter;
		List<Node> nodes;
		
		public Node(char letter) {
			this.letter = letter;
			this.nodes  = null;
		}
	}
		
	public void dfs_pahts(Node node, String path, Node prev) {
		
		path+="->"+node.letter;
		
		if(node.nodes == null) {
			System.out.println(path);
		}else {
			
			for(Node aux: node.nodes) {
				if(aux != prev) dfs_pahts(aux, path, node);
			}			
		}
		
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
		ca.add(nb);
		ca.add(nd);
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
		
		dfs_pahts(na, "", null);
	}
	
	
	
}
