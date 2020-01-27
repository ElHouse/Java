import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import org.junit.Test;

public class _652_Find_Duplicate_Subtrees {

	Map<String, TreeNode> map = new HashMap<>();
	Map<String, TreeNode> aux = new HashMap<>();
	List<TreeNode> answer = new ArrayList<>();

	public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

		if (root == null)	return answer;

		preOrder(root);

		aux.forEach((k, v) -> {
			answer.add(v);
		});

	    	System.out.println("+++++++++");
	    	answer.forEach(a->{
	    		System.out.println("........");
	    		print(a);
	    	} );

		return answer;
	}
	
	public void preOrder(TreeNode root) {
		
		
		StringBuilder sb = new StringBuilder();
		
		treeSerialization(root, sb);

		if(map.containsKey(sb.toString())) {
			aux.put(sb.toString(),root);
		}else {
			map.put(sb.toString(), root);
		}

		if(root.left!=null) preOrder(root.left);
		if(root.right!=null) preOrder(root.right);
		
	}
	

	public void treeSerialization(TreeNode root, StringBuilder sb) {

		int last = 0;
		int count = 0;
		List<String> auxL = new ArrayList<>();

		Queue<TreeNode> cola = new LinkedList<>();
		cola.add(root);
		
		
		while (!cola.isEmpty()) {

			List<TreeNode> hijos = new ArrayList<>();
			while (!cola.isEmpty()) {

				TreeNode aux = cola.poll();
				count++;
				if (aux != null) {
					auxL.add(String.valueOf(aux.val));
					hijos.add(aux.left);
					hijos.add(aux.right);
					last = count;
				} else {
					auxL.add("null");
				}

			}

			cola.addAll(hijos);
		}

		for (int i = 0; i < last; i++) {

			sb.append(auxL.get(i));
			sb.append(",");
		}

		sb.deleteCharAt(sb.length() - 1);

	}

//    @Test
	public void case1() {

		TreeNode root1 = new TreeNode(1);

		TreeNode root2 = new TreeNode(2);
		TreeNode root3 = new TreeNode(3);

		TreeNode root4 = new TreeNode(4);
		TreeNode root22 = new TreeNode(2);
		TreeNode root44 = new TreeNode(4);
		TreeNode root444 = new TreeNode(4);

		root1.left = root2;
		root1.right = root3;

		root2.left = root4;

		root3.left = root22;
		root3.right = root44;

		root22.left = root444;

		findDuplicateSubtrees(root1);

	}

//    @Test
	public void case2() {

		TreeNode root2 = new TreeNode(2);

		TreeNode root2l = new TreeNode(2);
		TreeNode root2r = new TreeNode(2);

		TreeNode root3 = new TreeNode(3);
		TreeNode root33 = new TreeNode(3);

		root2.left = root2l;
		root2.right = root2r;

		root2l.left = root3;
		root2r.left = root33;

		findDuplicateSubtrees(root2);

	}

	@Test
	public void case3() {

		TreeNode root2 = new TreeNode(0);

		TreeNode root2l = new TreeNode(0);
		TreeNode root2r = new TreeNode(0);

		TreeNode root3 = new TreeNode(0);
		TreeNode root33 = new TreeNode(0);
		TreeNode root333 = new TreeNode(0);

		root2.left = root2l;
		root2.right = root2r;

		root2l.left = root3;
		root2r.right = root33;
		root33.left = root333;

		findDuplicateSubtrees(root2);

	}


	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	
	public void print(TreeNode root) {
		
		
		System.out.println(root.val);

		if(root.left!=null) print(root.left);
		if(root.right!=null) print(root.right);
		
	}
	


}
