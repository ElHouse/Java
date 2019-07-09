package tree;
import java.util.ArrayList;
import java.util.List;

public class TrianguloPascal {

	
	public static void main(String[] args) {
		
		int n=3;
		
		List<Integer> piramide = init(n);
		System.out.println(piramide);
		
	}
	
	public static List<Integer> init(int n){
		
		List<Integer> pasada = new ArrayList<>();
				
		int step = 1;
		while(step< n+2) {

			List<Integer> aux = new ArrayList<>(step);
			
			for(int i=0; i<step; i++) {
				if(i==0) 	    aux.add(1);
				else if(i==step-1) aux.add(1);
				else {
					aux.add(pasada.get(i-1)+pasada.get(i));
				}
			}
			step++;
			pasada = aux;
		}
		
		return pasada;
	}
	
	public static void printPiramide(List<List<Integer>> pyramid ) {
		
		pyramid.forEach(lp->{
			System.out.println(".");
			lp.forEach(
				System.out::print
			);
		});
	}
	
	
	
}
