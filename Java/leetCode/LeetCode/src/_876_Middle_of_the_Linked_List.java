import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.Test;

public class _876_Middle_of_the_Linked_List {

	
//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
//	Memory Usage: 34.1 MB, less than 100.00% of Java online submissions for Middle of the Linked List.
    public ListNode middleNode(ListNode head) {
    	
    	if(head == null) return null;
        int size = 1;
        
        ListNode aux = head;
        while(aux.next != null) {
        	aux = aux.next;
        	size++;
        }
        
        if(size==0) return head;
        
        
        int target = ((int) Math.round(size/2)+1);
        
        aux = head;
        for (int i = 1; i < target; i++) {
        	aux = aux.next;
		}
  
        
		return aux;
        
    }

    @Test
    public void case1() {
    	
    	ListNode head1 = new ListNode(1);
    	ListNode head2 = new ListNode(2);
    	ListNode head3 = new ListNode(3);
    	ListNode head4 = new ListNode(4);
    	ListNode head5 = new ListNode(5);

    	head1.next = head2;
    	head2.next = head3;
    	head3.next = head4;
    	head4.next = head5;
    	head5.next = null;

    	
    	assertEquals(3,middleNode(head1).val);
    }
    
    
    
    @Test
    public void case2() {
    	
    	
      	ListNode head1 = new ListNode(1);
    	ListNode head2 = new ListNode(2);
    	ListNode head3 = new ListNode(3);
    	ListNode head4 = new ListNode(4);
    	ListNode head5 = new ListNode(5);
    	ListNode head6 = new ListNode(6);
    	
    	head1.next = head2;
    	head2.next = head3;
    	head3.next = head4;
    	head4.next = head5;
    	head5.next = head6;
        head6.next = null;
    	
    	assertEquals(4,middleNode(head1).val);
    	
    	
    }

    

}