
public class _328_Odd_Even_Linked_List {

	
//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Odd Even Linked List.
//	Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Odd Even Linked List.
//	Next challenges: 

	public static ListNode oddEvenList(ListNode head) {

		
		if(head      == null) return null;
		if(head.next == null) return head;
		
		
		ListNode odd  = head;
		ListNode pair = head.next;
		
		if(pair.next == null) return head;
		
		ListNode aux     = pair.next;
		ListNode oddAux  = odd;
		ListNode pairAux = pair;
		boolean isOdd = true;
		
		while(aux!=null) {
			
			if(isOdd) {
				oddAux.next = aux;
				oddAux = oddAux.next;
			}else {
				pairAux.next = aux;
				pairAux = pairAux.next;
			}
			aux = aux.next;
			isOdd = !isOdd;
		}
		
		pairAux.next = null;
		oddAux.next = pair;
		
			
		return odd;
	}
	
	
	public static void main(String[] args) {

		ListNode h = new ListNode(1);
		ListNode h2 = new ListNode(2);
		ListNode h3 = new ListNode(3);
		ListNode h4 = new ListNode(4);
		ListNode h5 = new ListNode(5);
		ListNode h6 = new ListNode(6);
		

//		h.next  = h2;
//		h2.next = h3;
//		h3.next = h4;
//		h4.next = h5;
//		h5.next = h6;
		
		print(h);
		
		System.out.println("--------------------------------");
		
		ListNode result = oddEvenList(h);
		
		print(result);
		
	}
	
	
	public static void print(ListNode head) {
		
		if(head==null) System.out.println("vacio");
		
		while(head!=null) {
			
			System.out.print(head.val+"->");
			head = head.next;
		}
		System.out.println();
		
	}
}






