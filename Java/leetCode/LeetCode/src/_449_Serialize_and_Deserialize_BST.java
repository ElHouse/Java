import java.util.LinkedList;
import java.util.Queue;

public class _449_Serialize_and_Deserialize_BST {
	
//	Runtime: 10 ms, faster than 32.73% of Java online submissions for Serialize and Deserialize BST.
//	Memory Usage: 38.1 MB, less than 100.00% of Java online submissions for Serialize and Deserialize BST.
	
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
	
	public static void main(String[] args) {
		
		_449_Serialize_and_Deserialize_BST  a = new _449_Serialize_and_Deserialize_BST();
		
////	        13 
////	     /     \
////	    9       15
////    /   \	   /  \
////	 7    11  14   30  
////	/ \   / \  
////	3  8 10 12
////   \
////    6
//		
//		
//		TreeNode root1 = new TreeNode(13);
//		 TreeNode root2 = new TreeNode(9);
//		  TreeNode root3 = new TreeNode(7);
//		   TreeNode root4 = new TreeNode(8);
//		  TreeNode root5 = new TreeNode(11);
//			TreeNode root51 = new TreeNode(10);
//			TreeNode root52 = new TreeNode(12);
//		 TreeNode root6 = new TreeNode(15);
//		 
//		 TreeNode rootx = new TreeNode(3);
//		 TreeNode rooty = new TreeNode(6);
//			 
//		 TreeNode roota = new TreeNode(14);
//		 TreeNode rootb = new TreeNode(30);
//		
//		 
//		 
//		root1.left = root2;
//		root1.right = root6;
//		
//		root2.left  = root3;
//		root2.right = root5;
//		
//		root3.right = root4;
//
//		root5.left = root51;
//		root5.right = root52;
//		
//		root3.left = rootx; 
//		rootx.right = rooty;
//
//		root6.left = roota;
//		root6.right= rootb;
		
		String cosa = "2,0,33,null,1,25,40,null,null,11,31,34,45,10,18,29,32,null,36,43,46,4,null,12,24,26,30,null,null,35,39,42,44,null,48,3,9,null,14,22,null,null,27,null,null,null,null,38,null,41,null,null,null,47,49,null,null,5,null,13,15,21,23,null,28,37,null,null,null,null,null,null,null,null,8,null,null,null,17,19,null,null,null,null,null,null,null,7,null,16,null,null,20,6";
		
		System.out.println(cosa);
		long inicio = System.currentTimeMillis();
		TreeNode newRoot = a.deserialize(cosa);
		long fin = System.currentTimeMillis()-inicio;
		System.out.println("desa  >"+fin);
		
		cosa = a.serialize(newRoot);
		System.out.println(cosa);
		newRoot = a.deserialize(cosa);
		cosa = a.serialize(newRoot);
		System.out.println(cosa);

		
		
//		System.out.println("-------------------------------------");
//		
//		
//		TreeNode aroot1 = null;
//		TreeNode aroot2 = new TreeNode(2);
//		TreeNode aroot3 = new TreeNode(3);


		
		
//		
//		
//		System.out.println("--------------------------------------------");
//		
//		TreeNode broot1 = new TreeNode(1);
//		TreeNode broot2 = new TreeNode(2);
//		TreeNode broot3 = new TreeNode(3);
//		TreeNode broot4 = new TreeNode(4);
//		TreeNode broot5 = new TreeNode(5);
//		TreeNode broot6 = new TreeNode(6);
//		TreeNode broot7 = new TreeNode(7);
//		TreeNode broot8 = new TreeNode(8);
//		TreeNode broot9 = new TreeNode(9);
//
//
//		broot1.right = broot2;
//		broot2.right = broot3;
//		broot3.right= broot4;
//		broot4.right = broot5;
//		broot5.right = broot6;
//		broot6.right= broot7;
//		broot7.right = broot8;
//		broot8.right= broot9;
//		
//		System.out.println(a.serialize(broot1));
////		a.algo(broot1);
//		
//		System.out.println("--------------------------------------------");
//		
//		
//		TreeNode croot1 = new TreeNode(5);
//		TreeNode croot2 = new TreeNode(3);
//		TreeNode croot3 = new TreeNode(6);
//		TreeNode croot4 = new TreeNode(2);
//		TreeNode croot5 = new TreeNode(4);
//		TreeNode croot6 = new TreeNode(8);
//		TreeNode croot7 = new TreeNode(1);
//		TreeNode croot8 = new TreeNode(7);
//		TreeNode croot9 = new TreeNode(9);
//
//		croot1.left  = croot2;
//		croot1.right = croot3;
//		
//		croot2.left  = croot4;
//		croot2.right = croot5;
//		
//		croot3.right  = croot6;
//		
//		croot4.left  = croot7;
//		
//		croot6.left  = croot8;
//		croot6.right = croot9;
//		

		
//		
//		System.out.println(a.serialize(croot1));
//		
//		
////		a.algo(croot1);
//		
		
	}

}
