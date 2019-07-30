import java.math.BigInteger;

public class _2_Add_Two_Numbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode result = new ListNode(0);
		ListNode aux = result;

		BigInteger num = getIntValue(l1).add(getIntValue(l2));

		if(num.equals(BigInteger.ZERO)) return result;
		
        while(!num.equals(BigInteger.ZERO)) {
        	BigInteger digit = num.mod(BigInteger.TEN);

        	num = num.divide(BigInteger.TEN);
    		
            aux.next = new ListNode(digit.intValue());
            aux = aux.next;
        }
        
        
		return result.next;

	}

	
	public BigInteger getIntValue(ListNode head) {
		
		BigInteger r = new BigInteger("0");
		
		if(head.next!=null) {
			r = getIntValue(head.next);
		}

		r = r.multiply(BigInteger.TEN).add(new BigInteger(head.val+""));
		
	
		return r;
	}
	
	public static void main(String[] args) {

		ListNode a1 = new ListNode(5);
		ListNode a2 = new ListNode(6);
		ListNode a3 = new ListNode(4);
		ListNode a4 = new ListNode(0);
		ListNode a5 = new ListNode(0);

		ListNode b0 = new ListNode(0);
		ListNode aux = b0;
		
		ListNode b2 = new ListNode(9);
		ListNode b3 = new ListNode(9);
		ListNode b4 = new ListNode(9);
		
		ListNode b5 = new ListNode(9);
		ListNode b6 = new ListNode(9);
		ListNode b7 = new ListNode(9);
		
		ListNode b8 = new ListNode(9);
		ListNode b9 = new ListNode(9);
		ListNode b10 = new ListNode(9);

		int aa[] = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
		
		
		for(int i=0; i < aa.length ; i++) {
		
			aux.next = new ListNode(aa[i]);
			aux = aux.next;
		}
		a1.next = a2;
		a2.next = a3;
//		a4.next = a5;

		
		print(a1);
		print(b0.next);

		_2_Add_Two_Numbers a = new _2_Add_Two_Numbers();
		ListNode result = a.addTwoNumbers(a1, b0.next);
		print(result);
		
		
	}
	
//	9223372036854775807L
//	1.7976931348623157E308


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
