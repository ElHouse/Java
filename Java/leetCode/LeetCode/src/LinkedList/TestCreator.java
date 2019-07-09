package LinkedList;

public class TestCreator {

	public static void main(String[] args) {
		
//		String[] instrutions = {"MyLinkedList","addAtHead","get","addAtIndex","deleteAtIndex","get",
//		                        "addAtIndex","addAtHead","get","deleteAtIndex","get",
//		                        "addAtHead","get","addAtHead","addAtTail","addAtHead","get",
//		                        "addAtHead","addAtHead","get","addAtTail","get","addAtTail",
//		                        "addAtTail","deleteAtIndex","addAtHead","addAtIndex","addAtTail",
//		                        "deleteAtIndex","addAtHead","addAtHead","addAtTail",
//		                        "get","get","addAtHead","addAtTail","addAtTail","deleteAtIndex",
//		                        "addAtHead","addAtHead","addAtTail","addAtTail",
//		                        "addAtTail","addAtHead","addAtTail","addAtIndex",
//		                        "addAtTail","addAtHead","addAtTail","addAtHead",
//		                        "get","deleteAtIndex","deleteAtIndex","addAtIndex",
//		                        "addAtTail","addAtTail","deleteAtIndex","get","addAtHead",
//		                        "addAtIndex","addAtHead","addAtTail","addAtIndex","addAtTail",
//		                        "get","addAtHead","addAtHead","addAtTail","addAtTail","addAtHead",
//		                        "addAtHead","addAtIndex","addAtHead","addAtHead","addAtTail","addAtHead","get",
//		                        "addAtIndex","addAtTail","addAtHead","addAtIndex","addAtTail","addAtIndex",
//		                        "get","addAtTail","get","addAtHead","get","addAtHead","get","get","addAtHead","get","addAtTail","deleteAtIndex","deleteAtIndex","addAtHead",
//		                        "deleteAtIndex","addAtHead","deleteAtIndex","addAtTail","addAtHead"};
//
//		String[]  values = {"","56","1","1,50","1","1","1,43","82","2","3","1","41","1","44","36","57","1","64","24","4","89","5","7","33","11","24","2,66","91","7","48","67","32","14","12","97","91","29","6","47","69","13","88","82","4","8","8,85","75","56","16","51","4","13","27","11,62","66","10","4","28","87","22,99","17","30","28,82","17","16","76","61","36","45","31","19","2,73","56","58","48","87","2","4,49","99","81","9,2","39","35,35","19","98","50","73","22","29","6","45","13","54","42","3","8","27","16","43","39","0","23"}; 
//		
		String[] instrutions = {"MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get"};
		String[] values      = {"0","1","3","1,2","1","0","0"};
		
		String[] result = new String[instrutions.length];

		
		for(int i=0; i<instrutions.length; i++) {
			switch(instrutions[i]) {
				case "MyLinkedList":  result[i] = "MyLinkedList list = new MyLinkedList();";  break;
				case "addAtHead":  	  result[i] = "list.addAtHead("+values[i] +");"; break;
				case "get":           result[i] = "System.out.println(list.get("+values[i]+"));"; break;
				case "deleteAtIndex": result[i] = "list.deleteAtIndex("+ values[i]+");"; break;
				case "addAtIndex":    result[i] = "list.addAtIndex("+ values[i]+");"; break;
				case "addAtTail":     result[i] = "list.addAtTail("+ values[i]+");"; break;
				
			}
			
		}
	
		
		for(String a: result) {
			System.out.println(a);
		}
		
	}
	
}
