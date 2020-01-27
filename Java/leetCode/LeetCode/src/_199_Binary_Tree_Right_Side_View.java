import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.junit.Test;

public class _199_Binary_Tree_Right_Side_View {

	
//	Runtime: 1 ms, faster than 99.35% of Java online submissions for Binary Tree Right Side View.
//	Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Binary Tree Right Side View.
	public List<Integer> rightSideView(TreeNode root) {

		List<Integer> list = new ArrayList<>();
		
		if(root != null) algo(root,list);
		
		return list;
	}

	
	
	public void algo(TreeNode root, List<Integer>  list) {
		
		Queue<TreeNode> cola = new LinkedList<>();
				
		cola.add(root);
		
		while(!cola.isEmpty()) {
					
			Queue<TreeNode> colaAux = new LinkedList<>();

			TreeNode node = null;

			while(!cola.isEmpty()) {
			
				node  = cola.poll();
				if(node.left  != null) colaAux.add(node.left);
				if(node.right != null) colaAux.add(node.right);
			}
			
			list.add(node.val);
			cola.addAll(colaAux);
		}
		
		
	}
	
	@Test
	public void case1() {
		
		String a = "1,2,3,null,5,null,4";
		
		TreeNode root = deserialize(a);
		
		assertEquals("[1, 3, 4]", rightSideView(root).toString() );
	}
	
	
	
	public String serialize(TreeNode root) {

		if(root == null) return "";
		
		StringBuilder sb = new StringBuilder();
		Queue<TreeNode> cola = new LinkedList<>();

		cola.add(root);

		while(!cola.isEmpty()) {
			
			TreeNode node = cola.poll();
			if(node != null) {
				cola.add(node.left );
				cola.add(node.right);
				sb.append(node.val);
			}else {
				sb.append("null");
			}
			sb.append(",");
		}
		
		return sb.toString();
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {

		if(data == null || data.isEmpty()) return null;
		
		//ever time a null is found in the nodes array, it is count to skip 2 positions 
		int nulls = 0;

		String[] array = data.split(",");
		  
		TreeNode[] nodes = new TreeNode[array.length];
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i].trim().equals("null")) {
				nodes[i] = null;
			}else {
			
				int number = Integer.parseInt(array[i].trim());
				TreeNode aux = new TreeNode(number);
				nodes[i] = aux;
			}
		}
		
		int i = 0;
		while(i < array.length) {
			
			if(nodes[i] == null) {
				nulls++;
			}else {
				
				int l = ( (2*i)+1 )-(2*nulls);
				int r = ( (2*i)+2 )-(2*nulls);

				if(l<array.length) nodes[i].left  = nodes[l];
				if(r<array.length) nodes[i].right = nodes[r];	
			}

			i++;
		}
						
		return nodes[0];
	}
	
	
	
}
