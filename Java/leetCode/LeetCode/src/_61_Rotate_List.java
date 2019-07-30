
public class _61_Rotate_List {

	public static ListNode rotateRight(ListNode head, int k) {

		
		if(head==null) return null;
		if(k == 0) return head;
		
		int size = 0 ;
		ListNode phead = head;
		
		while(phead!=null) {
			size++;
			phead = phead.next;
		}
		
		if(size == 1) return head;
		
		while(k>size) {
			k-=size;
		}		
		
		k=size-k%size;
		
		if(k==size) return head;
		
		ListNode newTail = head;
		ListNode newTailAux = head;
		
		for(int i=0; i<size-k-1; i++) {
			newTailAux = newTailAux.next;
		}
		
		ListNode newHead = newTailAux.next;
		ListNode newHeadAux = newTailAux.next;

		newTailAux.next = null;
		
		while(newHeadAux.next != null) {
			newHeadAux = newHeadAux.next;
		}
		
		newHeadAux.next = newTail;
		
		return newHead;
	}
	
	
	public static void main(String[] args) {
		
			
		for(int i = 1; i<20; i++) {
			ListNode head1 = getCase3();
			
			ListNode result = rotateRight(head1, i);
			print(result);
		}
		
	}
	
	public static ListNode getCase1() {
		
		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(2);
		ListNode head3 = new ListNode(3);
		ListNode head4 = new ListNode(4);
		ListNode head5 = new ListNode(5);

		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = head5;

		return head1;
		
	}
	
	public static ListNode getCase2() {
		
		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(2);
		ListNode head3 = new ListNode(3);
		ListNode head4 = new ListNode(4);
		ListNode head5 = new ListNode(5);

//		head1.next = head2;
//		head2.next = head3;
//		head3.next = head4;
//		head4.next = head5;

		return head1;
		
	}
	
	public static ListNode getCase3() {
		
		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(2);
		ListNode head3 = new ListNode(3);
		ListNode head4 = new ListNode(4);
		ListNode head5 = new ListNode(5);

		head1.next = head2;
//		head2.next = head3;
//		head3.next = head4;
//		head4.next = head5;

		return head1;
		
	}
	

	public static void print(ListNode head) {

		if (head == null)
			System.out.println("vacio");

		while (head != null) {

			System.out.print(head.val + "->");
			
			head = head.next;
		}

		System.out.println();

	}
	
	
}
