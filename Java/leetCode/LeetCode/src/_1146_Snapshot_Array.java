import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1146_Snapshot_Array {

	Map<Integer, List<Integer>> snaps = new HashMap<>();
	int   count = 0;
	
	public _1146_Snapshot_Array(int length) {
		
		for(int i = 0; i < length; i++) {
			List<Integer> aux = new ArrayList<>();
			snaps.put(i,aux);
		}
	}

	public void set(int index, int val) {
		
		List<Integer> aux = snaps.get(index);
		
		if(aux.size() == count) {
			snaps.get(index).add(val);
		}else if(aux.size() > count) {
			snaps.get(index).set(count, val);
		}else if(count > aux.size()) {
			snaps.get(index).add(val);
		}
		
	}

	public int snap() {
		return count++;
	}

	public int get(int index, int snap_id) {
		
		List<Integer> aux = snaps.get(index);
		if( aux.size() == 0 ) return 0;
		else if( snap_id < aux.size()) return snaps.get(index).get(snap_id);
		else if(snap_id>= aux.size())  return snaps.get(index).get(aux.size()-1);
		System.out.println("else 2");
		return snaps.get(index).get(snap_id);
	}
	
	
	public static void main(String[] args) {
		
		_1146_Snapshot_Array a = new _1146_Snapshot_Array(1);

		a.set(0, 15);
		a.snap();
		a.snap();
		a.snap();
		System.out.println("G>"+a.get(0,2)); 
		a.snap();
		a.snap();
		System.out.println("G>"+a.get(0,0)); 
		
		
//		a.set(0,1);
//		a.set(0,2);
//		a.snap();
//		a.snap();
//		System.out.println("G>"+a.get(0,0));  
//		System.out.println("G>"+a.get(0,0));  
//		a.snap();
		

		
	}

}
