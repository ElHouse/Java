import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.junit.Test;


public class Borrar {

//	recorridos para n-array tree
	
	
	//Searh tree FULL FINAL BINARY TREE
	//buscar un nodo en especifico o el padre de un nodo
	
	public TreeNode searchBST(TreeNode root, int val) {
		
		if(root == null) return null;
		
		TreeNode element = null;

		if (root.val == val) {
			return root;
		}else if(root.val > val) {
			element = searchBST(root.left, val);
		}else {
			element = searchBST(root.right, val);
		}

		return element;
	}

	
	public TreeNode searchBSTFather(TreeNode root, int val) {
		
		if(root == null) return null;
		
		TreeNode element = null;
		
		if(root.val > val) {
			
			if(root.left != null && root.left.val == val) {
				return root;
			}else if(root.left == null){
				return null;
			}else {
				element = searchBSTFather(root.left, val);
			}
		}else {

			if(root.right != null && root.right.val == val) {
				return root;
			}else if(root.right == null){
				return null;
			}else {
				element = searchBSTFather(root.right, val);
			}
		}
		
		return element;
	}
	
	
	@Test
	public void caseSearchBST_and_BASTFATHRE() {
		System.out.println("##########################caseNumberDigits");
		
//		      13 
//		   /     \
//		  9      15
//	    /   \	 /  \
//     7     11 14   30  
//    / \   /  \  
//   3   8 10  12
//	  \
//	   6
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
		
		System.out.println("Antes");
		System.out.println(print(root1));
		
//		assertEquals(null,searchBST(root1,6).val);
		int a = 12;
		try {
			TreeNode search =  searchBST(root1,a);
			TreeNode father =  searchBSTFather(root1,a);
		
			System.out.println("S>"+(search==null?"nul":search.val));
			System.out.println("F>"+(father==null?"nul":father.val));
			
		}catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		System.out.println("Despues");
		System.out.println(print(root1));
	}
	

	public String print(TreeNode root) {
	
		if(root == null) return "x";
		
		StringBuilder sb = new StringBuilder(String.valueOf(root.val));

		sb.append(" ");

		if(root.left!= null) {
			sb.append( print(root.left));
		}

		
		
		if(root.right!= null) {
			sb.append( print(root.right));
		}
		
		return sb.toString();
	}

	

	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	
//  REVERSE A NUMBER
	// imprime el numero en orden y al reves, con una pila o cola se puede acceder
	public void numberDigits(int num) {

		if(num>0) {
			numberDigits(num/10);
			System.out.print((num%10)+" ");
		}
	}

	public void numberDigitsReverse(int num) {
		System.out.println();
		System.out.println("(numberDigitsReverse)--->"+num);
		while(num>0) {
			
			int aux = num%10;
			System.out.print(aux+" ");
			
			
			num = num / 10;
			
		}
		System.out.println();
		
	}
	
	@Test
	public void caseNumberDigits() {
		
		System.out.println("##########################caseNumberDigits");
		int n = 2198764;
		numberDigits(n);
		numberDigitsReverse(n);
	}
	
	
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	
	
	//BINAR SEACH
	// caso base de buscas binarias
	
	public int searchWithBinarySearch(int[] nums, int num) {
		
		if(nums==null) return -1;
		
		int l = 0;
		int r = nums.length-1;
		
		while(l<=r) {
			
			int mid = ((r+l)/2)+(r+l)%2 ;

			if(nums[mid]==num) {	
				return mid;
			}else if(nums[mid]>num) {
				r = mid-1;
			}else {
				l = mid+1;
			}	
		}
		
		return -1;
	}
	
	@Test
	public void caseFindBinarySearch() {
		System.out.println("##########################caseFindBinarySearch");
		int[] nums = {1,2,3,4,5,6,7,9,10,11};
		//            0 1 2 3 4 5 6 7 8  9
		
//		for (int i = 1; i <= nums.length; i++) {
			assertEquals(7, searchWithBinarySearch(nums, 9));	
//		}
		
	}
	
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	
	
	public int[] quickSort(int[] nums) {
		return null;
//		return quick(nums, 0, nums.length-1);
	}
	
	public void quicksort(int A[], int izq, int der) { 

		   int pivote=A[izq]; 
		   int i=izq; // i realiza la búsqueda de izquierda a derecha
		   int j=der; // j realiza la búsqueda de derecha a izquierda
		   int aux;
		  
		   while(i<j){            // mientras no se crucen las búsquedas
		      while(A[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
		      while(A[j]>pivote)         j--; // busca elemento menor que pivote
		      
		      if (i<j) {                      // si no se han cruzado                      
		          aux= A[i];                  // los intercambia
		          A[i]=A[j];
		          A[j]=aux;
		      }
		    }
		    A[izq]=A[j]; // se coloca el pivote en su lugar de forma que tendremos
		    A[j]=pivote; // los menores a su izquierda y los mayores a su derecha
		    if(izq<j-1)
		       quicksort(A,izq,j-1); // ordenamos subarray izquierdo
		    if(j+1 <der)
		       quicksort(A,j+1,der); // ordenamos subarray derecho
		
			
	}
	
	@Test
	public void case1QuickSort() {
		System.out.println("##########################case1QuickSort");
		int[] nums = {1,8,4,5,7,3,2,10,9,6};
		System.out.println(Arrays.toString(nums));
		quicksort(nums,0,nums.length-1);
		System.out.println(Arrays.toString(nums));
		
	}
	
	
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	
	
	
	
	public List<List<TreeNode>> listsOfATree(TreeNode root){
		
		if(root==null) return null;
		
		Queue<TreeNode> cola = new LinkedList<>();
		List<List<TreeNode>> retorno = new ArrayList<>();
		cola.add(root);
				
		while(!cola.isEmpty()) {
			
			List<TreeNode> list = listOfQueue(cola);
			retorno.add(list);
			
			for(TreeNode n : list) {
				if(n.left !=null) cola.add(n.left);
				if(n.right!=null) cola.add(n.right);
				
			}
			
		}
		
		
		return retorno;
	}
	
	
	public List<TreeNode> listOfQueue(Queue<TreeNode> cola){
		
		List<TreeNode> list = new ArrayList<>();
		
		while(!cola.isEmpty()) {
			TreeNode aux = cola.poll();
			list.add(aux);
		}
		
		return list;
	}
	
	@Test
	public void case1TreeToList() {
		
		System.out.println("#######################--->TreeToList");
		
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
		 
		 List<List<TreeNode>> lists = listsOfATree(root1);
		 
		 for(List<TreeNode> l : lists) {
			 
			 for(TreeNode ll : l) {

				 System.out.print( ll.val+ ",");
			 }			 
			 System.out.println();
		 }
		 
		 
		 
	}
	
	
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	

	public TreeNode cuartaPregunta(String str) {
		
		
//		A+B * C*D
		
//		     *
//		   /   \
//		  +     -
//		 / \   / \
//		A   B C   D
		
		
		
		
		
		
		return null;
	}
	
	
	
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
	//###########################################################################################
		
 	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
