
public class _21_MergeTwoSortedLists {

	
	static class ListNode {
	    int val;
	    ListNode next;
	     ListNode(int x) { val = x; }
	}
	
	public static void impri(ListNode l1) {
		

		ListNode a = l1;
		while(a.next!=null) {
			System.out.print(a.val+"->");
			a = a.next;
		}
		System.out.println(a.val);
	}
	
	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		
		
		impri(l1);
		impri(l2);
		ListNode a =mergeTwoLists(l1, l2);
		impri(a);
	}
	
	
	
	
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode newList = null;
       
        
        if(l1 == null && l2 == null) return null;
        if(l1 == null && l2 != null) return l2;
        if(l1 != null && l2 == null) return l1;
        
        if(l1.val <= l2.val){
             newList = new ListNode(l1.val);
             ListNode aux = l1.next;
             System.out.println(aux.val);
             l1 = aux;
             aux = null;
        }else{
            newList = new ListNode(l2.val);
             ListNode aux = l2.next;
             l2 = aux;
             aux = null;
        }
        
        System.out.println("**");
        impri(newList);
        
        while(l1!=null && l2 != null){
            
            if(l1.val >= l2.val){
                
                ListNode aux = newList;
                while(aux.next!=null){
                    aux = aux.next;
                }
                
                aux.next = new ListNode(l2.val);
                
                l2= l2.next;
            }else{
                ListNode aux = newList;
                while(aux.next!=null){
                    aux = aux.next;
                }
                
                aux.next =new ListNode(l1.val);
                
                l1= l1.next;
            }
        }
        
        System.out.println("**");
        impri(newList);
        
        if(l1 == null) {
            while(l2 != null){
               ListNode aux = newList;
                while(aux.next!=null){
                    aux = aux.next;
                }
                
                aux.next = new ListNode(l2.val);
                
                l1= l2.next;
            }
        }else{
             ListNode aux = newList;
                while(aux.next!=null){
                    aux = aux.next;
                }
                
                aux.next = new ListNode(l1.val);
                
                l2= l1.next;
        }
        
        return newList;
    }
    
    
}

