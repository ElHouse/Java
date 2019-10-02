import java.util.*;

import LinkedList.MyLinkedList.SinglyListNode;

public class _160_Intersection_of_Two_Linked_Lists {

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		
		if(headA == null || headB == null) return null;
		if(headA == headB ) return headA;

		ListNode aux = headB;
		
		do{

			System.out.println("-------------------------w1->"+headA.val);
			do {
				
				System.out.println("w2->"+headB.val);
				if(headA.equals(headB)) {
					return headA;
				}
				headB = headB.next;
				
			}while(headB!=null);
			
			headA = headA.next;
			headB = aux;
		}while(headA!=null);
				
		return null;
	}
	
	public static void main(String[] args) {
		
		
//		ListNode a1 = new ListNode(4);
//		ListNode a2 = new ListNode(1);
//		
//		ListNode b1 = new ListNode(5);
//		ListNode b2 = new ListNode(0);
//		ListNode b3 = new ListNode(1);
//		
//		ListNode c1 = new ListNode(8);
//		ListNode c2 = new ListNode(4);
//		ListNode c3 = new ListNode(5);
//		
//		
//		a1.next = a2;
//	
//		b1.next = b2;
//		b2.next = b3;
//		
//		c1.next = c2;
//		c2.next = c3;
//		
//		a2.next = c1;
//		b3.next = c1;

		
//		ListNode a1 = new ListNode(1);

		
		
		
		ListNode a1 = new ListNode(3);
		ListNode b1 = new ListNode(2);

		b1.next = a1;

		System.out.println("A::>"); printAll(a1);
		System.out.println("A::>"); printAll(b1);
		
		System.out.println(getIntersectionNode(a1, b1));
	}
	
	
    public static void printAll(ListNode head) {
    	
    	if(head == null) return ;
    	else {
    		ListNode auxFor = head;
		  	
	    	while(auxFor.next!=null) {
	    		System.out.print(auxFor.val+"->");
	    		auxFor = auxFor.next;
	    		
	    		
	    	}
	    	
	    	System.out.println(auxFor.val);
	    	
    	}
    }
	
	
	
	
	

}
