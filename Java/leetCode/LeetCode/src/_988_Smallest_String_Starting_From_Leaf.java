import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class _988_Smallest_String_Starting_From_Leaf {


	List<String> list = new ArrayList<>();

//	Runtime: 5 ms, faster than 12.94% of Java online submissions for Smallest String Starting From Leaf.
//	Memory Usage: 36.9 MB, less than 100.00% of Java online submissions for Smallest String Starting From Leaf.
	public String smallestFromLeaf(TreeNode root) {

		if(root == null) return null;
		
		algo(root, new StringBuilder());

		Collections.sort(list);
		
		list.forEach(System.out::println);
		
		
		return list.get(0).toLowerCase();
	}
		
	public void algo(TreeNode root, StringBuilder path) {
		
		
		if(root.left == null && root.right == null) {
			path.append((char)(root.val +65));
			list.add(path.reverse().toString());
		
		}else {
			path.append((char)(root.val+65));
		}
		
		if(root.left != null) {
			algo(root.left, new StringBuilder(path));
		}
		
		if(root.right != null) {
			algo(root.right, new StringBuilder(path));
		}
		
		
	}

	@Test
	public void case1() {
		
		
//	    	  0 
//		   /     \
//		  9       1
//  	/   \	 /  \
//	   7    11  14   2
//	  / \   / \       
//	  3 8  10 12      
//     \
//      6
		TreeNode root1 = new TreeNode(0);
		 TreeNode root2 = new TreeNode(9);
		  TreeNode root3 = new TreeNode(7);
		   TreeNode root4 = new TreeNode(8);
		  TreeNode root5 = new TreeNode(11);
		   TreeNode root51 = new TreeNode(10);
		   TreeNode root52 = new TreeNode(12);
		 TreeNode root6 = new TreeNode(1);
		 
		 TreeNode rootx = new TreeNode(3);
		 TreeNode rooty = new TreeNode(6);
			 
		 TreeNode roota = new TreeNode(14);
		 TreeNode rootb = new TreeNode(25);
		
		 
		 
		root1.left = root2;
		root1.right = root6;
		
		root2.left  = root3;
		root2.right = root5;
		
		root3.right = root4;

		root5.left = root51;
		root5.right = root52;
		
		root3.left = rootx; 
		rootx.right = rooty;

		root6.left = roota;
		root6.right= rootb;
		
		
		System.out.println("final->"+smallestFromLeaf(root1));
	}
	
	@Test
	public void case2() {
		
		TreeNode roota = new TreeNode(0);
		 TreeNode rootb = new TreeNode(1);
		  TreeNode rootc = new TreeNode(2);
		   TreeNode rootd = new TreeNode(3);
		  TreeNode roote = new TreeNode(4);
		   TreeNode rootdd = new TreeNode(4);
		   TreeNode rootee = new TreeNode(5);

		   roota.left  = rootb;
		   roota.right = rootc;

		   rootb.left  = rootd;
		   rootb.right = roote;

		   rootc.left  = rootdd;
		   rootc.right = rootee;
		   
		  System.out.println("final->"+smallestFromLeaf(roota));
		   
	}
	
	
	@Test
	public void case3() {
		
		TreeNode roota = new TreeNode(0);
		 TreeNode rootb = new TreeNode(1);
		  TreeNode rootc = new TreeNode(2);
		   TreeNode rootd = new TreeNode(3);
		  TreeNode roote = new TreeNode(4);
		   TreeNode rootdd = new TreeNode(1);
		   TreeNode rootee = new TreeNode(5);

		   roota.left  = rootb;
		   roota.right = rootc;

		   rootb.left  = rootd;
		   rootb.right = roote;

		   rootc.left  = rootdd;
		   rootc.right = rootee;
		   
		  System.out.println("final->"+smallestFromLeaf(roota));
		   
	}
	
	@Test
	public void case4() {
		
		TreeNode roota = new TreeNode(2);
		
		 TreeNode rootb = new TreeNode(2);
		 TreeNode rootc = new TreeNode(1);
		
		 TreeNode rootd = new TreeNode(1);
		 TreeNode roote = new TreeNode(0);
		 
		 TreeNode rootdd = new TreeNode(0);

		   roota.left  = rootb;
		   roota.right = rootc;

		   rootb.right  = rootd;
		   rootd.right  = roote;

		   rootc.left  = rootdd;
		   
		  System.out.println("final->"+smallestFromLeaf(roota));
		   
	}
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}