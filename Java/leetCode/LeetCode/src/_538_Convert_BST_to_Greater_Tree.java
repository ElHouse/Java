import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class _538_Convert_BST_to_Greater_Tree {

	public TreeNode convertBST(TreeNode root) {

		if(root == null) return null;
		
		algo(root);
		return root;
	}
	
	int sum = Integer.MIN_VALUE;
	
	public void algo(TreeNode root) {
		
		
		if(root.right != null) {
			algo(root.right);
		}
		
		if(sum == Integer.MIN_VALUE) sum=root.val;
		else{
			root.val += sum;
			sum = root.val;
		}
		
		if(root.left != null) {
			algo(root.left);
		}
		
	}
	
	@Test
	public void case3() {

		TreeNode r1 = deserialize("1,2,2,3,3,3,3,4,4,4,4,4,4,null,null,5,5");
		convertBST(r1);	
	}
	
	@Test
	public void case4() {

		TreeNode r1 = deserialize("1,null,2,null,3");
		convertBST(r1);	
	}
		
	
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
	
	public void print(TreeNode root) {
		
		Queue<TreeNode> cola = new LinkedList<>();

		cola.add(root);
		
		while(!cola.isEmpty()) {
			
			TreeNode aux = cola.poll();
			System.out.print(aux.val+" ");
			if(aux.left  != null) cola.add(aux.left);
			if(aux.right != null) cola.add(aux.right);
			
		}

		
	}

}
