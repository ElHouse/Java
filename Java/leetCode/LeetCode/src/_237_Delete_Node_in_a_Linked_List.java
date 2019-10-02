import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class _237_Delete_Node_in_a_Linked_List {

	
//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Delete Node in a Linked List.
//	Memory Usage: 36.4 MB, less than 100.00% of Java online submissions for Delete Node in a Linked List.
	public void deleteNode(ListNode node) {

		node.val = node.next.val;
		node.next = node.next.next;
	}

	
}
