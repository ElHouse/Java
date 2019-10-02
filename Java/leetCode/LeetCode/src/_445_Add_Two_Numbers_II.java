
public class _445_Add_Two_Numbers_II {

	
//	Runtime: 2 ms, faster than 99.81% of Java online submissions for Add Two Numbers II.
//	Memory Usage: 44 MB, less than 73.53% of Java online submissions for Add Two Num
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    	int sizeL1 = getListNodeSize(l1);
    	int sizeL2 = getListNodeSize(l2);
    	
    	int maxSize = Math.max(sizeL1, sizeL2)+1;
    	
    	ListNode headL1 =addXNodesToHead(l1, maxSize-sizeL1);   	
    	ListNode headL2 =addXNodesToHead(l2, maxSize-sizeL2);   	

    	
    	algo(headL1, headL2);   	

    	
    	
    	if(headL1.val == 0 ) {
    		headL1 = headL1.next;
    	}
    	
    	return headL1;
    }
    
    public int algo(ListNode l1, ListNode l2) {
    	
    	int extra = 0;
    	if( l1.next != null ) {
    		extra = algo(l1.next, l2.next);
    	}
    	
    	int sum = l1.val + l2.val + extra;
    	
    	if(sum>=10) {
    		l1.val = sum - 10;
    		return 1;
    	}else {
    		l1.val = sum;
    		return 0;
    	}
    }
    
    
    public ListNode addXNodesToHead(ListNode head, int n) {
    	
    	
    	ListNode newHead = new ListNode(0);
    	    
    	ListNode tail = newHead;
    	for (int i = 0; i < n-1; i++) {
    		ListNode aux = new ListNode(0);
    		tail.next = aux;
    		tail = tail.next;
		}
    	
    	tail.next = head;
    	
    	return newHead;
    }
    
    public int getListNodeSize(ListNode head) {
    	
    	int size = 0;
    	
    	ListNode aux = head;
    	while(aux!=null) {
    		size++;
    		aux = aux.next;
    	}
    	
    	return size;
    	
    }
    
    
    @Test
    public void case1() {

    	ListNode head0 = new ListNode(3);
    	ListNode head1 = new ListNode(9);
    	ListNode head2 = new ListNode(9);
    	ListNode head3 = new ListNode(9);
    	ListNode head4 = new ListNode(9);
    	ListNode head5 = new ListNode(9);
    	ListNode head6 = new ListNode(9);
    	ListNode head7 = new ListNode(9);
    	ListNode head8 = new ListNode(9);
    	ListNode head9 = new ListNode(9);

    	head0.next = head1;
    	head1.next = head2;
    	head2.next = head3;
    	head3.next = head4;
    	head4.next = head5;
    	head5.next = head6;
    	head6.next = head7;
    	head7.next = head8;
    	head8.next = head9;
    	
    	ListNode h = new ListNode(7);

    	System.out.println("----");
    	printList(addTwoNumbers(head0, h));

    }
    
    
    @Test
    public void case2() {
    	

    	ListNode head0 = new ListNode(9);
    	ListNode head1 = new ListNode(0);


    	ListNode head2 = new ListNode(1);
    	ListNode head3 = new ListNode(0);

    	
    	head0.next = head1;
    	
    	head2.next = head3;

    	
       printList(addTwoNumbers(head0, head2));
    	
    }
    
    
    @Test
    public void case3() {
    	

    	ListNode head0 = new ListNode(7);
    	ListNode head1 = new ListNode(2);
    	ListNode head2 = new ListNode(4);
    	ListNode head3 = new ListNode(3);

    	ListNode heada = new ListNode(5);
    	ListNode headb = new ListNode(6);
    	ListNode headc = new ListNode(4);

    	head0.next = head1;
    	head1.next = head2;
    	head2.next = head3;
    	
    	heada.next = headb;
    	headb.next = headc;
    	
    	printList(addTwoNumbers(head0, heada));
    	
    }
    
    private void printList(ListNode head) {
    	
    	
    	ListNode aux = head;
    	while(aux != null) {
    		System.out.print(aux.val+",");
    		aux = aux.next;
    	}
    	System.out.println();
    }
    
}