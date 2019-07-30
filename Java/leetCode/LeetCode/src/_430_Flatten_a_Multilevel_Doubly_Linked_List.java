
public class _430_Flatten_a_Multilevel_Doubly_Linked_List {

	
	public Node flatten(Node head) throws InterruptedException {

		if (head == null) return null;

		Node headNode = new Node(0,null,null,null) ;	
		Node node = headNode;
		

		while (head != null) {

			node.next = head;
			node = node.next;
	
			if(head.child!=null) {

				Node auxx = node.next;
				Node child = flatten(head.child);
				
				head.child = null;				
				child.prev = node;
				node.next = child;
				while(node.next!=null) {
					node = node.next;
				}
				head = auxx;
				
			}else {			
				head = head.next;
			}
		}
			
		return headNode.next;
    }
	
	public static void main(String[] args) throws InterruptedException {

		Node a1 = new Node(1,null,null,null);
		Node a2 = new Node(2,a1,null,null);
		Node a3 = new Node(3,a2,null,null);
		Node a4 = new Node(4,a3,null,null);

		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		
		Node a5 = new Node(5,null,null,null);
		Node a6 = new Node(6,a5,null,null);
		Node a7 = new Node(7,a6,null,null);

		a5.next = a6;
		a6.next = a7;
		
		
		a2.child = a5;
		
		Node a10 = new Node(10,null,null,null);
		Node a11 = new Node(11,a10,null,null);
		Node a12 = new Node(12,a11,null,null);
		
		a10.next = a11;
		a11.next = a12;
		
		a6.child = a10;
		
		print(a1);
		
		_430_Flatten_a_Multilevel_Doubly_Linked_List a = new _430_Flatten_a_Multilevel_Doubly_Linked_List();
		System.out.println();
		System.out.println("-------------");
		Node result = a.flatten(a1);
		System.out.println();
		System.out.println("++++++++++++++++++");
		printLine(result);
		
	}
	
	public static void printLine(Node head) {
		
		if (head == null)
			System.out.println("vacio");

		while (head != null) {

			System.out.print(head.val + "->");

			head = head.next;
		}
	}

	public static void print(Node head) {

		if (head == null)
			System.out.println("vacio");

		while (head != null) {

			System.out.print(head.val + "->");
			
			
			if(head.child!=null) {
				print(head.child);
			}
			head = head.next;
		}


	}
	
	
}
