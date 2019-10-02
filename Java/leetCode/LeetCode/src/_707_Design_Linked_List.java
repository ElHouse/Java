import LinkedList.MyLinkedList;
import LinkedList.MyLinkedList.SinglyListNode;

//
//Runtime: 54 ms, faster than 64.53% of Java online submissions for Design Linked List.
//Memory Usage: 45.1 MB, less than 91.63% of Java online submissions for Design Linked List.
public class _707_Design_Linked_List {

	SinglyListNode head;
	int size;
	
	/** Initialize your data structure here. */
    public _707_Design_Linked_List() {
        size = 0;
    	head = null;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        
    	if(index<0)  return -1;
    	if(index==0 && head != null) return  head.val;
    	if(index==0 && head == null) return  -1;
    	if(index>=size) return -1;
    	
    	SinglyListNode aux = head;
    	
    	for(int i=0; i<index; i++) {
    		aux = aux.next;
    	}
    	    	
    	return aux.val;
    }
    
    /** Add a node of value val before the first element of the linked list.
     *  After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
    	
    	if(head == null) {
    		head = new SinglyListNode(val);
    	}
    	else {
    	  	SinglyListNode aux = new SinglyListNode(val);
    	  	aux.next = head;
    	  	head = aux;
    	}
    	size++;
        
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {

    	if(head == null) head.val = val;
    	else {
		  	SinglyListNode auxFor = head;
			  	
	    	while(auxFor.next!=null) {
	    		auxFor = auxFor.next;
	    	}
	    	
	    	auxFor.next = new SinglyListNode(val);
	    	
    	} 
    	size++;
    }
        
    /** Add a node of value val before the index-th node in the linked list.
     *  If index equals to the length of linked list, the node will be appended to the end of linked list.
     *  If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        
    	if(index <0) {
    		addAtHead(val);
    		return ;
    	}
    	if(index>size) return ;
    	
    	if(index == 0) addAtHead(val);
    	else if(size==index) addAtTail(val);
    	else {
    		SinglyListNode prev   = head;
    		
    		for(int i=1; i<index; i++) {
    			prev = prev.next;
    		}
    		SinglyListNode aux  =  new SinglyListNode(val);
    		SinglyListNode next =  prev.next;
    		
    		prev.next = aux;    		
    		aux.next = next;
    		
     		size++;
    	}
    	
    	
    	
    	
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        
    	
    	if(index<0) return ;
    	else if(index>=size) return ;
    	else if(index==1 && size == 1) {
    		head = null;
    	}else if(index==0) {
    		SinglyListNode next   = head.next;
    		head = next;
    	}else {
    		SinglyListNode prev   = head;
    		
    		for(int i=1; i<index; i++) {
    			prev = prev.next;
    		}
    		
    		if(prev.next!=null) {
        		SinglyListNode node =  prev.next;
        		if(node.next!=null) {
        			SinglyListNode next =  node.next;
        			prev.next = next;
        		}else {
        			prev.next = null;
        		}
    		}
    		
    	}
    	size--;
    	
    }
    
    public void printAll() {
    	
    	if(head == null) return ;
    	else {
    		SinglyListNode auxFor = head;
		  	
	    	while(auxFor.next!=null) {
	    		System.out.print(auxFor.val+"->");
	    		auxFor = auxFor.next;
	    		
	    		
	    	}	    	
    	}
    }

	    
	    public  class SinglyListNode {
	        int val;
	        SinglyListNode next;
	        SinglyListNode(int x) { val = x; next = null; }
	    }
}