import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _705_Design_HashSet {


	
    public  _705_Design_HashSet() {
        
    	entities = new Entity[n];
    	for(int i = 0 ; i<n; i++) {
    		entities[i] = new Entity();
    		entities[i].list =  new ArrayList<>();
    	}
    }
    
    int n = 10;
    Entity[]  entities;
    
    
    class Entity{
        	
    	List<Integer> list ;
    	
    }
    
    
    public int myHash(int ele) {
    	
    	return ele%n;
    }
    
    public void add(int key) {
        
    	int i = myHash(key);
    
    	Integer aux = this.entities[i].list.stream().filter(a->a==key).findFirst().orElse(null);
    	
    	if(aux == null ) {
    		entities[i].list.add(key);
    	}
    	
    }
    
    public void remove(int key) {
        
    	int i = myHash(key);
    	
    	System.out.println("Remove>");

    	this.entities[i].list.forEach(System.out::println);
    	
    	Integer aux = this.entities[i].list.stream().filter(a->a==key).findFirst().orElse(null);
    	
    	if( aux != null ) {

    		entities[i].list.remove(aux);
    	}
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        
    	int i = myHash(key);
    	
    	Integer aux = this.entities[i].list.stream().filter(a->a==key).findFirst().orElse(null);
    	
    	return aux != null;
    }

    public static void main(String[] args) {
    	
    	_705_Design_HashSet  hashSet = new _705_Design_HashSet();
    	
   	
    	hashSet.add(1);         
    	hashSet.add(2);         
    	System.out.println("has 1"+hashSet.contains(1));    // returns true
    	System.out.println("has 3"+hashSet.contains(3));    // returns false (not found)
    	hashSet.add(2);          
    	System.out.println("T has 2"+hashSet.contains(2));    // returns true
    	hashSet.remove(2);          
    	System.out.println("F has 2"+hashSet.contains(2));    // returns false (already removed)
    	hashSet.add(2);         
    	System.out.println("T has 2"+hashSet.contains(2));
    	hashSet.remove(22);
       	System.out.println("T has 2"+hashSet.contains(2));
       	hashSet.remove(2);  	
       	System.out.println("F has 2"+hashSet.contains(2));
       	
    }



}
