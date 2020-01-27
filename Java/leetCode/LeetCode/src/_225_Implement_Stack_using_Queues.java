import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class _225_Implement_Stack_using_Queues {

//	Runtime: 43 ms, faster than 37.40% of Java online submissions for Implement Stack using Queues.
//	Memory Usage: 33.8 MB, less than 91.67% of Java online submissions for Implement Stack using Queues.
	
	Queue<Integer> cola = new LinkedList<>();
	
    /** Initialize your data structure here. */
    public _225_Implement_Stack_using_Queues() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        cola.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
		
    	int element = 0;
   		int i = 0;
   		int size = cola.size()-1;
   		
    	while(i<size) {
    		i++;
    		element = cola.poll();   		
    		cola.add(element);
    	}
    	
    	element = cola.poll();

    	return element;
    }
    
    /** Get the top element. */
    public int top() {
    	
    	int element = 0;
    	
    	for(Integer i: cola) {
    		element = i;
    	}
    	
    	return element;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
		return cola.isEmpty();
        
    }
    
    
    
    @Test
    public void case1() {
    	 _225_Implement_Stack_using_Queues case1 = new  _225_Implement_Stack_using_Queues();
    	 case1.push(1);
    	 case1.push(2);
    	 case1.push(3);
    	 case1.push(4);
    	 case1.push(5);
    	 case1.push(6);
    	 
    
    	 System.out.println(case1.pop());
    	 System.out.println(case1.pop());

    	 case1.push(10);
    	 case1.push(11);
    	 
     	 System.out.println(case1.pop());
    	 System.out.println(case1.pop());
     	 System.out.println(case1.pop());
    	 System.out.println(case1.pop());
    	    
    }
    
    
}
