import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class _235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree {

	
	boolean found = false;

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {


		List<TreeNode> path1 = new ArrayList<>();
		List<TreeNode> path2 = new ArrayList<>();
		
		algo(root, path1, p );
		found = false;
		algo(root, path2, q );
		
		if( path1.size() == 0 || path2.size()==0) return null;
		
		int auxI = path1.size()>path2.size()?path1.size()-path2.size():0;
		int auxJ = path2.size()>path1.size()?path2.size()-path1.size():0;
		
		
		
		for (int i = Math.max(auxI, auxJ); i < Math.max(path1.size(), path2.size()); i++) {
						
			if(path1.get(auxI++).equals(path2.get(auxJ++))) return path1.get(auxI-1);
			
		}
		
		return null;
	}
	
	
	public void algo(TreeNode root, List<TreeNode> path, TreeNode target) {
		
		
		
		if(root.val == target.val) {
			
			found = true;
			path.add(root);
		}else {		
		
			if(root.left != null && !found) {
				algo(root.left, path , target);
			}
			
			if(root.right != null && !found) {
				algo(root.right, path, target);
			}
			
			if(found) path.add(root);
		}
		
	}

	
	@Test
	public void case1() {
//	       13 
//	     /     \
//	    9       15
//    /   \	   /  \
//	 7    11  14   30  
//	/ \   / \  
//	3 8  10 12
//   \
// 	  6
	TreeNode root1 = new TreeNode(13);
	 TreeNode root2 = new TreeNode(9);
	  TreeNode root3 = new TreeNode(7);
	   TreeNode root4 = new TreeNode(8);
	  TreeNode root5 = new TreeNode(11);
		TreeNode root51 = new TreeNode(10);
		TreeNode root52 = new TreeNode(12);
	 TreeNode root6 = new TreeNode(15);
	 
	 TreeNode rootx = new TreeNode(3);
	 TreeNode rooty = new TreeNode(6);
		 
	 TreeNode roota = new TreeNode(14);
	 TreeNode rootb = new TreeNode(30);
	
	 
	 
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
	
	
	  assertEquals( 13  ,lowestCommonAncestor(root1, rooty, rootb).val);
	}
	
	
	@Test
	public void case2() {
//	       13 
//	     /     \
//	    9       15
//    /   \	   /  \
//	 7    11  14   30  
//	/ \   / \  
//	3 8  10 12
//   \
// 	  6
	TreeNode root1 = new TreeNode(13);
	 TreeNode root2 = new TreeNode(9);
	  TreeNode root3 = new TreeNode(7);
	   TreeNode root4 = new TreeNode(8);
	  TreeNode root5 = new TreeNode(11);
		TreeNode root51 = new TreeNode(10);
		TreeNode root52 = new TreeNode(12);
	 TreeNode root6 = new TreeNode(15);
	 
	 TreeNode rootx = new TreeNode(3);
	 TreeNode rooty = new TreeNode(6);
		 
	 TreeNode roota = new TreeNode(14);
	 TreeNode rootb = new TreeNode(30);
	
	 
	 
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
	
	
	  assertEquals( 7,lowestCommonAncestor(root1, rootx, root4).val);
	}
	
	
	@Test
	public void case3() {
//	       13 
//	     /     \
//	    9       15
//    /   \	   /  \
//	 7    11  14   30  
//	/ \   / \  
//	3 8  10 12
//   \
// 	  6
	TreeNode root1 = new TreeNode(13);
	 TreeNode root2 = new TreeNode(9);
	  TreeNode root3 = new TreeNode(7);
	   TreeNode root4 = new TreeNode(8);
	  TreeNode root5 = new TreeNode(11);
		TreeNode root51 = new TreeNode(10);
		TreeNode root52 = new TreeNode(12);
	 TreeNode root6 = new TreeNode(15);
	 
	 TreeNode rootx = new TreeNode(3);
	 TreeNode rooty = new TreeNode(6);
		 
	 TreeNode roota = new TreeNode(14);
	 TreeNode rootb = new TreeNode(30);
	
	 
	 
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
	
	
	  assertEquals( 9  ,lowestCommonAncestor(root1, rootx, root5).val);
	}
	
	
	@Test
	public void case4() {
//	       13 
//	     /     \
//	    9       15
//    /   \	   /  \
//	 7    11  14   30  
//	/ \   / \  
//	3 8  10 12
//   \
// 	  6
	TreeNode root1 = new TreeNode(13);
	 TreeNode root2 = new TreeNode(9);
	  TreeNode root3 = new TreeNode(7);
	   TreeNode root4 = new TreeNode(8);
	  TreeNode root5 = new TreeNode(11);
		TreeNode root51 = new TreeNode(10);
		TreeNode root52 = new TreeNode(12);
	 TreeNode root6 = new TreeNode(15);
	 
	 TreeNode rootx = new TreeNode(3);
	 TreeNode rooty = new TreeNode(6);
		 
	 TreeNode roota = new TreeNode(14);
	 TreeNode rootb = new TreeNode(30);
	
	 
	 
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
	
	
	  assertEquals( 15  ,lowestCommonAncestor(root1, roota, rootb).val);
	}
	
	@Test
	public void case5() {
//	       13 
//	     /     \
//	    9       15
//    /   \	   /  \
//	 7    11  14   30  
//	/ \   / \  
//	3 8  10 12
//   \
// 	  6
	TreeNode root1 = new TreeNode(13);
	 TreeNode root2 = new TreeNode(9);
	  TreeNode root3 = new TreeNode(7);
	   TreeNode root4 = new TreeNode(8);
	  TreeNode root5 = new TreeNode(11);
		TreeNode root51 = new TreeNode(10);
		TreeNode root52 = new TreeNode(12);
	 TreeNode root6 = new TreeNode(15);
	 
	 TreeNode rootx = new TreeNode(3);
	 TreeNode rooty = new TreeNode(6);
		 
	 TreeNode roota = new TreeNode(14);
	 TreeNode rootb = new TreeNode(30);
	
	 
	 
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
	
	
	  assertEquals( 7  ,lowestCommonAncestor(root1, root3, root4).val);
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
