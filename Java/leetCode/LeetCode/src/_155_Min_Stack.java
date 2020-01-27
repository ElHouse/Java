
public class _155_Min_Stack {

	int val = Integer.MAX_VALUE;
	Integer[] stack = null;
	
//	Runtime: 70 ms, faster than 8.14% of Java online submissions for Min Stack.
//	Memory Usage: 46.1 MB, less than 5.08% of Java online submissions for Min Stack.
    public _155_Min_Stack() {
	   
    }
    
	public void push(int x) {

		if(stack == null) {
	    	stack = new Integer[1];
	    	stack[0] = x;
	    	val = x;
		}else {
			
			val = Math.min(val, x);
			
			Integer[] aux = new Integer[stack.length+1];
			
			for(int i=0; i<stack.length; i++) {
				aux[i] = stack[i];
			}
			aux[stack.length]= x;
			stack = aux;
		}
		
	}

	public void pop() {


		if(stack != null) {
	    	
			int newSize = stack.length-1;
			
			if(newSize <= 0 ) {
				stack = null;
				val = Integer.MAX_VALUE;
			}else {
				Integer[] aux = new Integer[newSize];
				val = Integer.MAX_VALUE;
				for(int i=0; i<stack.length-1; i++) {
					aux[i] = stack[i];
					val = Math.min(val, stack[i]); 
				}
				stack = aux;
			}
		}
	}

	public int top() {
		
		if(stack != null && stack.length > 0) {
	    	
			return stack[stack.length-1];
		}

		return -1;
	}

	public int getMin() {
		return val;
	}

	
	public static void main(String[] args) {
		 _155_Min_Stack minStack = new  _155_Min_Stack();
		 minStack.push(-2);
		 minStack.push(0);
		 minStack.push(-3);
		System.out.println(minStack.getMin());//   --> Returns -3.
		 minStack.pop();
		 System.out.println(minStack.top());      //--> Returns 0.
		 System.out.println(minStack.getMin());   //--> Returns -2.
	}
	
}
