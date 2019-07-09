import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TwoSmallest {

	
	public static void main(String[] args) {
		//             0  1  2  3  4  5  6  7 8  9 10 11  12 13 
		int[] lista = {7,28,21,35,42,70,63,56,9,64, 5,554, 7, 7};
//					  {12,28,21,35,42,70,63,56,9,64, -,554, 7, 7};
//					  {12,28,21,35,42,70,63,56,9,64, -,554, 14, -};
//					  {12,28,21,35,42,70,63,56,9,64, -,554, 14, -};
		
//		System.out.println(Arrays.toString(listaFuerzaBurta(lista)));
		
		System.out.println(ideaDelSorting(lista));
				
	}

	public static List<Integer>  ideaDelSorting(int[] lista) {

		List<Integer> list = Arrays.stream(lista)		// IntStream
									.boxed()  		// Stream<Integer>
									.collect(Collectors.toList());
		List<Integer> sumatoria = new ArrayList<>();
		
		Collections.sort(list);
		System.out.println(list.size()+"-LIST:>"+list);

		while(list.size()!=1) {
			System.out.println(list.get(0) +"<+>"+ list.get(1));
			int suma = list.get(0) + list.get(1);
			sumatoria.add(suma);
			list.remove(0);
			System.out.println(list.size()+"-1LIST:>"+list);

			list.remove(0);
			System.out.println(list.size()+"-2LIST:>"+list);

			list.add(suma);
			System.out.println(list.size()+"-3LIST:>"+list);
			Collections.sort(list);
			System.out.println(list.size()+"-4LIST:>"+list);

		}
		
		return sumatoria;

	}
	
	public static int[] listaFuerzaBurta(int[] lista) {
		
		if(lista.length<=2) return null;

		int[] returnNUmbers = new int[2];
		int peque1 = lista[0];
		int peque2 = lista[1];
	
		for(int i=2; i<lista.length; i++) {
			
			if(peque1>lista[i] && peque2>lista[i] ) {
				peque1 = lista[i];
				returnNUmbers[0] = i;
			}else if(peque2 > lista[i]) {
				peque2 = lista[i];
				returnNUmbers[1] = i;
			}
		}
	
		return returnNUmbers;
	}
	
}
