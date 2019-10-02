import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.Test;

public class _817_Linked_List_Components {

	
//	la descripcion dle problema no me queda claro
	public int numComponents(ListNode head, int[] G) {

		int count = 0;
		
		while(head != null) {
			
			if(head.next != null) {
				
				if(finder(G, head.val, head.next.val)) {
					count++;
				}
			}
			
			head = head.next;
		}
	
		return count;
	}
		
	public boolean finder(int[] G, int a, int b) {

		System.out.println("Finder >"+a+"---"+b);
		
		int posA = Integer.MIN_VALUE;
		int posB = Integer.MIN_VALUE;
		
		for (int i = 0; i < G.length; i++) {
			
			if(G[i] == a) {
				posA = i;
			}else if(G[i] == b) {
				posB = i;
			}
		}
		
		if (posA == Integer.MIN_VALUE || posB == Integer.MIN_VALUE) {
			return false;
		}
		
		return posB>posA;
	}
	
	
	@Test
	public void case1() {

		System.out.println("-------------case1");

		ListNode head0 = new ListNode(0);
		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(2);
		ListNode head3 = new ListNode(3);
		
		head0.next = head1;
		head1.next = head2;
		head2.next = head3;
		
		int[] G = {0, 1, 3};
	 
		assertEquals( 2 , numComponents(head0, G));		
	}
	
	
	@Test
	public void case2() {
		
		System.out.println("-------------case2");

		ListNode head0 = new ListNode(0);
		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(2);
		ListNode head3 = new ListNode(3);
		ListNode head4 = new ListNode(4);
		
		head0.next = head1;
		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		
		int[] G = {0, 3, 1, 4};
	 
		assertEquals( 2 , numComponents(head0, G));		
	}
	
	
}
