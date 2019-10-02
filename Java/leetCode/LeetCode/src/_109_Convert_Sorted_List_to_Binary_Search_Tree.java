import java.util.Stack;

import org.junit.Test;


public class _109_Convert_Sorted_List_to_Binary_Search_Tree {

	public TreeNode sortedListToBST(ListNode head) {

		int size = getListSize(head);
		int start = (size/2)+ size%2;
		
		System.out.println("startt>"+start);

		TreeNode rootLeft = null;
		Stack<Integer> stack = new Stack<>();
		ListNode aux = head;
		
		System.out.println("parte 1");
		for (int i = start-1; i > 0 ; i--) {
						
			stack.add(aux.val);
			System.out.println(aux.val);
			aux = aux.next;
		}
		
		while(!stack.empty() ) {
			
			if(rootLeft == null) {
				rootLeft = new TreeNode(stack.pop());
			}else {
				insertInLeftSide(stack.pop(),rootLeft);
			}
		}
		
		System.out.println("--_>"+aux.val);
		
		TreeNode root = new TreeNode(aux.val);
		root.left = rootLeft;
		aux = aux.next;
		
		System.out.println("parte 2");
		for (int i = start+1; i < size+1; i++) {
			stack.add(aux.val);
			
			System.out.println(aux.val);
			aux = aux.next;
		}
		
		while(!stack.empty() ) {
			
			insertInRightSide(stack.pop(),root);
		}
		
		
		
		
		
		return root;
	}
	
	public void insertInRightSide(int element, TreeNode root) {
		
		
		if(root.right == null) {
			root.right = new TreeNode(element);
		}else {
			insertInLeftSide(element, root.right);
		}
		
	}
	
	public void insertInLeftSide(int element, TreeNode root) {
		
		
		if(root.left == null) {
			root.left = new TreeNode(element);
		}else {
			insertInLeftSide(element, root.left);
		}
		
	}
		
	public int getListSize(ListNode head) {
	
		int size = 0;
	
		ListNode aux = head;
		
		while(aux != null) {
			size++;
			aux = aux.next;
			
		}
		
		return size;
	}
	
	
	@Test
	public void case1() {
		
		int[] nums = {-10,-3,0,5,9};
		
		ListNode head  = fromArrayToListNode(nums);
		
		System.out.println("List->");
		System.out.println(nodeToString(head));
		
		TreeNode root = sortedListToBST(head);
		
		System.out.println("final");
		printTree(root);
		
	}
	
	
	public void printTree(TreeNode root) {
		

		System.out.println(root.val);
		if(root.left != null) {
			printTree(root.left);
		}
		if(root.right != null) {
			printTree(root.right);
		}
		
	}
	
	public ListNode fromArrayToListNode(int[] nums) {
		

		ListNode head = new ListNode(nums[0]);
		ListNode tail = head;
		
		for (int i = 1; i < nums.length; i++) {
			ListNode aux = new ListNode(nums[i]);
			tail.next = aux;
			tail = tail.next;
		}
		
		return head;
	}
	
	
    
    public String nodeToString(ListNode head) {
    	
    	StringBuilder sb = new StringBuilder();
    	
    	ListNode aux = head;
    	
    	while(aux != null) {

    		sb.append( aux.val);
    		sb.append(",");
    		
    		aux = aux.next;
    	}
    	
    	sb.deleteCharAt(sb.length()-1);
    	
    	return sb.toString();
    }
	
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
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
