package tree;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Stack;

public class PruebaBusquedaMapa {

	
	static Map<String,Date> mapa  = new HashMap<>();
	static Stack            pila  = new Stack();
	
	
	public static void main(String[] args) {
		
		 int i = 1000000;
		 llenaMapa(i);
		 listaBuscar(i);
		 
		 
		 long startTime = System.nanoTime();
		 System.out.println("buscar>"+buscar());
		 long endTime = System.nanoTime();	
		 long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.listaBuscar
		 
		 System.out.println("duration:>"+(duration/1000000));
	}
	
	public static int buscar() {
		
		int count = 0;
		
		while(!pila.isEmpty()) {
			
			if(mapa.containsKey(String.valueOf(pila.pop()))) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void listaBuscar(int i) {
		
	

	
		int count = 0;
		while(count<(i/2)) {
			Random rand = new Random();
			int n = rand.nextInt(i);
			pila.push(n);
			count++;
		}
		
		System.out.println("pila capacity>"+pila.capacity());
		System.out.println("pila size>"+pila.size());
	
	}
	
	public static void llenaMapa(int i) {
		
		int count = 0;
		while(count<i) {
			mapa.put(String.valueOf(count++), new Date());
		}
		
		System.out.println("mapa size"+mapa.size());
		
	}
	
	
	
	
}
