
public class _21_Merge_Two_Sorted_Lists {

	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
    	ListNode l3 = new ListNode(0);   	
    	ListNode aux = l3;   	

    	
    	while(l1 != null || l2 != null) {

    		if(l1 != null && l2 != null) {
    			
    			if(l1.val > l2.val) {
    				aux.next = l2; 
        			aux = aux.next;
        			l2 = l2.next;
    			}else if(l1.val < l2.val) {
        			aux.next = l1; 
        			aux = aux.next;
        			l1 = l1.next;
    			}else if( l1.val == l2.val) {
    				aux.next = l1; 
        			aux = aux.next;
        			l1 = l1.next;
    				
    				aux.next = l2; 
        			aux = aux.next;
        			l2 = l2.next;
    			}
    		}else if(l1 != null && l2 == null) {
    			aux.next = l1; 
    			aux = aux.next;
    			l1 = l1.next;
    		}else if(l1 == null && l2 != null) {
				aux.next = l2; 
    			aux = aux.next;
    			l2 = l2.next;
    		}


    	}
    
    	return l3.next;
    }
    
    
    public static void main(String[] args) {

    	ListNode a1 = new ListNode(1);
    	ListNode a2 = new ListNode(3);
    	ListNode a3 = new ListNode(5);
    	ListNode a4 = new ListNode(7);
    	ListNode a5 = new ListNode(8);
        
    	ListNode b1 = new ListNode(2);
    	ListNode b2 = new ListNode(4);
    	ListNode b3 = new ListNode(6);

    	a1.next = a2;
    	a2.next = a3;
    	a3.next = a4;
    	a4.next = a5;
    	
    	b1.next = b2;
    	b2.next = b3;
    	
    	print(a1);
    	print(b1);

    
    	
    	_21_Merge_Two_Sorted_Lists a = new _21_Merge_Two_Sorted_Lists();
    	ListNode result = a.mergeTwoLists(a1, b1);
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
