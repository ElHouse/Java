import org.junit.Test;


public class _450_Delete_Node_in_a_BST {

	public TreeNode deleteNode(TreeNode root, int key) {

		if(root == null) return null;
		
		
		if(root.val == key && root.left == null && root.right == null) {
			return null;
		}
		
//		if(root.val == key) {
//			TreeNode aux = searchLeftMost(root);
//			int min = aux.val;
//			System.out.println(">>>"+min);
//			algo(root, min);
//			root.val = min;
//		}else {
			TreeNode aux = new TreeNode(999);
			aux.left =root;
			algo(aux,key);
//		}
		return  root;
	}
	
	public void algo(TreeNode root, int val) {
		
		if(root == null) return ;
		System.out.println("....algo>"+root.val);
				
		if(root.val >= val) {
			if(root.left != null && root.left.val == val ) {
				
				TreeNode left  = root.left.left;
				TreeNode right = root.left.right;
				

				if(left == null && right == null) {//is a leaf
					System.out.println("is a leaf");
					root.left = null;
				}else if(left != null && right != null) {//two nodes
					System.out.println("two nodes");
					TreeNode auxT = searchLeftMost(root.left.right);
					int aux = auxT!=null?auxT.val:Integer.MAX_VALUE;
					System.out.println("aux R>"+aux);
					algo(root.left,aux);
					root.left.val =  aux;
				}else if(left != null && right == null) {//one node,  left
					System.out.println("solo left>"+left.val);
					int aux = left.val;
					algo(root.left,aux);
					root.left.val = aux;
				}else if(left == null && right != null) {//one node, right
					System.out.println("Solo right");
					int aux = right.val;
					algo(root.left,aux);
					root.left.val = aux;
				}
				
			}else {
				algo(root.left,val);
			}
		}else if(root.val <= val) {
			if(root.right != null && root.right.val == val ) {
				
				TreeNode left  = root.right.left;
				TreeNode right = root.right.right;
				
				if(left == null && right == null) {//is a leaf
					root.right = null;
				}else if(left != null && right != null) {//two nodes
					
					TreeNode auxT = searchLeftMost(root.right.right);
					int aux = auxT!=null?auxT.val:Integer.MAX_VALUE;
					System.out.println("aux R>"+aux);
					algo(root.right,aux);
					root.right.val =  aux;
				}else if(left != null && right == null) {//one node,  left
					
					System.out.println("Solo  left ");
					int aux = left.val;
					algo(root.right,aux);
					root.right.val = aux;
					
				}else if(left == null && right != null) {//one node, right
					
					System.out.println("Solo right");
					int aux = right.val;
					algo(root.right,aux);
					root.right.val = aux;
				}
				
			}else {
				algo(root.right,val);
			}
		}
		
	}
	

	public TreeNode searchLeftMost(TreeNode root) {
		
		System.out.println("searchLeftMost>"+root.val);

		TreeNode element  = root;
		
		while(element.left!=null) {
			element = element.left;
		}
				
		return element;
	}
	
	@Test
	public void case1() {
		System.out.println("8--------------case 1");
		TreeNode root1 = new TreeNode(13);
		 TreeNode root2 = new TreeNode(9);
		  TreeNode root3 = new TreeNode(7);
		   TreeNode root4 = new TreeNode(8);
		  TreeNode root5 = new TreeNode(11);
		 TreeNode root6 = new TreeNode(15);
		  TreeNode root7 = new TreeNode(14);
		  TreeNode root8 = new TreeNode(16);
		   TreeNode root9 = new TreeNode(20);
		    TreeNode root10 = new TreeNode(18);
		    TreeNode root11 = new TreeNode(30);

		root1.left = root2;
		root1.right = root6;
		
		root2.left  = root3;
		root2.right = root5;
		
		root3.right = root4;
		root6.left  = root7;
		root6.right = root8;
		 
		root8.right = root9;

		root9.left = root10;
		root9.right= root11;
		
		

		printTree(root1);System.out.println();
		deleteNode(root1, 8);
		System.out.println();
		printTree(root1);
	}
	

	@Test
	public void case2() {
		System.out.println("");
		System.out.println("18--------------case 2");
		TreeNode root1 = new TreeNode(13);
		 TreeNode root2 = new TreeNode(9);
		  TreeNode root3 = new TreeNode(7);
		   TreeNode root4 = new TreeNode(8);
		  TreeNode root5 = new TreeNode(11);
		 TreeNode root6 = new TreeNode(15);
		  TreeNode root7 = new TreeNode(14);
		  TreeNode root8 = new TreeNode(16);
		   TreeNode root9 = new TreeNode(20);
		    TreeNode root10 = new TreeNode(18);
		    TreeNode root11 = new TreeNode(30);

			root1.left = root2;
			root1.right = root6;
			
			root2.left  = root3;
			root2.right = root5;
			
			root3.right = root4;
			root6.left  = root7;
			root6.right = root8;
			 
			root8.right = root9;

			root9.left = root10;
			root9.right= root11;
			
		
		

		printTree(root1);System.out.println();
		deleteNode(root1, 18);
		System.out.println();
		printTree(root1);
	}
	
	@Test
	public void case3() {
		System.out.println();
		System.out.println("30--------------case 3");
		TreeNode root1 = new TreeNode(13);
		 TreeNode root2 = new TreeNode(9);
		  TreeNode root3 = new TreeNode(7);
		   TreeNode root4 = new TreeNode(8);
		  TreeNode root5 = new TreeNode(11);
		 TreeNode root6 = new TreeNode(15);
		  TreeNode root7 = new TreeNode(14);
		  TreeNode root8 = new TreeNode(16);
		   TreeNode root9 = new TreeNode(20);
		    TreeNode root10 = new TreeNode(18);
		    TreeNode root11 = new TreeNode(30);

			root1.left = root2;
			root1.right = root6;
			
			root2.left  = root3;
			root2.right = root5;
			
			root3.right = root4;
			root6.left  = root7;
			root6.right = root8;
			 
			root8.right = root9;

			root9.left = root10;
			root9.right= root11;
			
		
		

		printTree(root1);System.out.println();
		deleteNode(root1, 30);
		System.out.println();
		printTree(root1);
	}
	
	
	@Test
	public void case4() {
		System.out.println();
		System.out.println("16--------------case 4");
		TreeNode root1 = new TreeNode(13);
		 TreeNode root2 = new TreeNode(9);
		  TreeNode root3 = new TreeNode(7);
		   TreeNode root4 = new TreeNode(8);
		  TreeNode root5 = new TreeNode(11);
		 TreeNode root6 = new TreeNode(15);
		  TreeNode root7 = new TreeNode(14);
		  TreeNode root8 = new TreeNode(16);
		   TreeNode root9 = new TreeNode(20);
		    TreeNode root10 = new TreeNode(18);
		    TreeNode root11 = new TreeNode(30);

			root1.left = root2;
			root1.right = root6;
			
			root2.left  = root3;
			root2.right = root5;
			
			root3.right = root4;
			root6.left  = root7;
			root6.right = root8;
			 
			root8.right = root9;

			root9.left = root10;
			root9.right= root11;
			
		
		

		printTree(root1);System.out.println();
		deleteNode(root1, 16);
		System.out.println();
		printTree(root1);
	}
	
	@Test
	public void case5() {
		System.out.println();
		System.out.println("9--------------case 5");
		TreeNode root1 = new TreeNode(13);
		 TreeNode root2 = new TreeNode(9);
		  TreeNode root3 = new TreeNode(7);
		   TreeNode root4 = new TreeNode(8);
		  TreeNode root5 = new TreeNode(11);
		 TreeNode root6 = new TreeNode(15);
		  TreeNode root7 = new TreeNode(14);
		  TreeNode root8 = new TreeNode(16);
		   TreeNode root9 = new TreeNode(20);
		    TreeNode root10 = new TreeNode(18);
		    TreeNode root11 = new TreeNode(30);

			root1.left = root2;
			root1.right = root6;
			
			root2.left  = root3;
			root2.right = root5;
			
			root3.right = root4;
			root6.left  = root7;
			root6.right = root8;
			 
			root8.right = root9;

			root9.left = root10;
			root9.right= root11;
			
		
		

		printTree(root1);System.out.println();
		deleteNode(root1, 9);
		System.out.println();
		printTree(root1);
	}
	
	@Test
	public void case6() {
		System.out.println();
		System.out.println("15--------------case 6");
		TreeNode root1 = new TreeNode(13);
		 TreeNode root2 = new TreeNode(9);
		  TreeNode root3 = new TreeNode(7);
		   TreeNode root4 = new TreeNode(8);
		  TreeNode root5 = new TreeNode(11);
		 TreeNode root6 = new TreeNode(15);
		  TreeNode root7 = new TreeNode(14);
		  TreeNode root8 = new TreeNode(16);
		   TreeNode root9 = new TreeNode(20);
		    TreeNode root10 = new TreeNode(18);
		    TreeNode root11 = new TreeNode(30);

			root1.left = root2;
			root1.right = root6;
			
			root2.left  = root3;
			root2.right = root5;
			
			root3.right = root4;
			root6.left  = root7;
			root6.right = root8;
			 
			root8.right = root9;

			root9.left = root10;
			root9.right= root11;
			
		
		

		printTree(root1);System.out.println();
		deleteNode(root1, 15);
		System.out.println();
		printTree(root1);
	}
	
	@Test
	public void case7() {
		System.out.println();
		System.out.println("13--------------case 7");
		TreeNode root1 = new TreeNode(13);
		 TreeNode root2 = new TreeNode(9);
		  TreeNode root3 = new TreeNode(7);
		   TreeNode root4 = new TreeNode(8);
		  TreeNode root5 = new TreeNode(11);
		 TreeNode root6 = new TreeNode(15);
		  TreeNode root7 = new TreeNode(14);
		  TreeNode root8 = new TreeNode(16);
		   TreeNode root9 = new TreeNode(20);
		    TreeNode root10 = new TreeNode(18);
		    TreeNode root11 = new TreeNode(30);

			root1.left = root2;
			root1.right = root6;
			
			root2.left  = root3;
			root2.right = root5;
			
			root3.right = root4;
			root6.left  = root7;
			root6.right = root8;
			 
			root8.right = root9;

			root9.left = root10;
			root9.right= root11;

		printTree(root1);System.out.println();
		deleteNode(root1, 13);
		System.out.println();
		printTree(root1);
	}
	
	
	@Test
	public void case8() {
		System.out.println();
		System.out.println("2--------------case 8");
		TreeNode root1 = new TreeNode(2);
		TreeNode root2 = new TreeNode(1);

		
		root1.left = root2;

		printTree(root1);System.out.println();
		deleteNode(root1, 2);
		System.out.println();
		printTree(root1);
	}
	
	
	@Test
	public void case9() {
		System.out.println();
		System.out.println("5--------------case 9");
		TreeNode root1 = new TreeNode(5);
		
		TreeNode root2 = new TreeNode(3);
		TreeNode root3 = new TreeNode(6);
		
		TreeNode root4 = new TreeNode(2);
		TreeNode root5 = new TreeNode(4);
		TreeNode root6 = new TreeNode(7);

		root1.left  = root2;
		root1.right = root3;

		root2.left  = root4;
		root2.right = root5;
		
		root3.right = root6;
		
//	     5
//	    / \
//	   3   6
//	  / \   \
//	 2   4   7

		printTree(root1);System.out.println();
		deleteNode(root1, 5);
		System.out.println();
		printTree(root1);
	}
	
	@Test
	public void case10() {
		System.out.println();
		System.out.println("5--------------case 9");
		TreeNode root1 = new TreeNode(5);
		
		TreeNode root2 = new TreeNode(3);
		TreeNode root3 = new TreeNode(6);
		
		TreeNode root4 = new TreeNode(2);
		TreeNode root5 = new TreeNode(4);
		TreeNode root6 = new TreeNode(7);

		root1.left  = root2;
		root1.right = root3;

		root2.left  = root4;
		root2.right = root5;
		
		root3.right = root6;
		
//	     5
//	    / \
//	   3   6
//	  / \   \
//	 2   4   7

		printTree(root1);System.out.println();
		deleteNode(root1, 0);
		System.out.println();
		printTree(root1);
	}
	
	public void printTree(TreeNode root) {
	
		
		if(root.left!= null) {
			printTree(root.left);	
		}
		System.out.print(" "+root.val);
		
		if(root.right!= null) {
			printTree(root.right);
		}
		
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
