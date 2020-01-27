import java.util.ArrayList;
import java.util.List;

public class _706_Design_HashMap {

//	Runtime: 548 ms, faster than 5.01% of Java online submissions for Design HashMap.
//	Memory Usage: 61.6 MB, less than 13.51% of Java online submissions for Design HashMap.
	public _706_Design_HashMap() {

		
	   	entities = new ArrayList<>();	
	}	
	
	class Entity{
		
		int key;
		int value;
		
		Entity(int key, int value){
			this.key = key;
			this.value = value;			
		}
		
		
	}
	
	List<Entity> entities = null;

	
	/** value will always be non-negative. */
	public void put(int key, int value) {

		Entity aux = this.entities.stream().filter(k->k.key == key).findFirst().orElse(null);
		
		if(aux == null) {
			entities.add(new Entity(key, value));
		}else {
			
			this.entities.remove(aux);
			aux.value = value;
			
			this.entities.add(aux);
		}
		
	}

	/**
	 * Returns the value to which the specified key is mapped, or -1 if this map
	 * contains no mapping for the key
	 */
	public int get(int key) {

		return entities.stream()
				.filter(k-> k.key == key )
				.findFirst()
				.map(k->k.value)
				.orElse(-1);
	}

	/**
	 * Removes the mapping of the specified value key if this map contains a mapping
	 * for the key
	 */
	public void remove(int key) {

			Entity aux = this.entities.stream().filter(k->k.key == key).findFirst().orElse(null);
			if(aux != null)	this.entities.remove(aux);
	}

	
	public static void main(String[] args) {
		
		_706_Design_HashMap hashMap = new _706_Design_HashMap();
		hashMap.put(1, 1);          
		hashMap.put(2, 2);         
		System.out.println("1->"+hashMap.get(1));            // returns 1
		System.out.println("-1->"+hashMap.get(3));            // returns -1 (not found)
		hashMap.put(2, 1);          // update the existing value
		
		System.out.println("1->"+hashMap.get(2));            // returns 1 
		hashMap.remove(2);          // remove the mapping for 2
		System.out.println(hashMap.get(2));            // returns -1 (not found) 
	}
	
}
