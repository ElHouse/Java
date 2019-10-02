import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class _559_Maximum_Depth_of_Nary_Tree {


//	Runtime: 1 ms, faster than 97.69% of Java online submissions for Maximum Depth of N-ary Tree.
//	Memory Usage: 46.5 MB, less than 50.00% of Java online submissions for Maximum Depth of N-ary
	public int max = 0;
    public int maxDepth(Node root) {
     
    	if(root != null) {
    		findMaxDepth(root,  0);    		
    	}
    	
    	return max;
    }

    public void findMaxDepth(Node root,int aux) {
    	aux++;
    	max = Math.max(max, aux);
    	
    	if( root.children != null ) {
    		for(Node child: root.children) {
    			findMaxDepth(child, aux);
    		}
    	}
    	
    }
    
    
    @Test
    public void case1() {
    	
    	Node root1 = new Node(1,null);
    	
    	Node root2 = new Node(3,null);
    	Node root3 = new Node(2,null);
    	Node root4 = new Node(4,null);
    	
    	Node root5 = new Node(5,null);
    	Node root6 = new Node(6,null);
    	
    	
    	List<Node> children = new ArrayList<>();
    	children.add(root2);
    	children.add(root3);
    	children.add(root4);
    	
    	List<Node> children2 = new ArrayList<>();
    	children2.add(root5);
    	children2.add(root6);
    	
    	root2.children = children2;
    	root1.children = children;
    	
    	
    	
    	assertEquals(3,maxDepth(root1));
    	
    }
    
    
    @Test
    public void case2() {
    	
    	Node root1 = new Node(1,null);
    	

    	
    	
    	
    	assertEquals(1,maxDepth(root1));
    	
    }
    
    @Test
    public void case3() {
    	
    	Node root1 = new Node(1,null);
    	
    	Node root2 = new Node(3,null);
    	Node root3 = new Node(2,null);
    	Node root4 = new Node(4,null);
    	
    	Node root5 = new Node(5,null);
    	Node root6 = new Node(6,null);
    	
    	Node root7 = new Node(7,null);
    	Node root8 = new Node(8,null);
    	
    	
    	List<Node> children = new ArrayList<>();
    	children.add(root2);
    	children.add(root3);
    	children.add(root4);
    	
    	List<Node> children2 = new ArrayList<>();
    	children2.add(root5);
    	children2.add(root6);
    	
    	List<Node> children3 = new ArrayList<>();
    	children3.add(root7);
    	children3.add(root8);
    	
    	
    	root2.children = children2;
    	root1.children = children;
    	root6.children = children3;
    	
    	
    	assertEquals(4,maxDepth(root1));
    	
    }
    
    
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    
}


