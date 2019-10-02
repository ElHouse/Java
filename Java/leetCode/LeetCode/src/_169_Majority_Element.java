import java.util.*;
import java.util.stream.Collectors;

public class _169_Majority_Element {

	public static void main(String[] args) {

		int reutnr  = 0;
		
		int[] nums = new int[3];
		nums[0] = 3;
		nums[1] = 2;
		nums[2] = 3;

		List<Integer> lista =  Arrays.stream(nums).boxed().collect(Collectors.toList());
		lista.add(Integer.MAX_VALUE);
		
		Collections.sort(lista);
		
		int x = 0;
		int numero = lista.get(0);
		
		for(int i=0; i<lista.size(); i++) {
			
			if(numero!=lista.get(i)) {
				System.out.println();
				System.out.println("x-->"+x);
				System.out.println("i-->"+i);
				System.out.println("resta->"+(i-x));
				int resta = i-x;
				
				x = i;
				
				System.out.println(((lista.size()/2)-1));
				if(resta>((lista.size()/2)-1)) {reutnr = numero+ 0;
					System.out.println(reutnr);
				}
				
				numero = lista.get(i);

			}
		}
		System.out.println("return>"+reutnr);
		
		
		//opcion 1
//	     Map<Integer, Integer> mapa = new HashMap<>();
//	        int mitad = nums.length /2;
//	        
//			for (int i = 0; i < nums.length; i++) {
//
//				if (!mapa.containsKey(nums[i])) {
//					mapa.put(nums[i], 1);
//				} else {
//					int aux = mapa.get(nums[i])+1;
//	                mapa.put(nums[i], aux );
//	                if(aux>mitad){
//	                    return nums[i];
//	                }
//				}
//			}
//	        return 0;
//		return element;
		
		
//		opcion 2
//		List<Integer> lista =  Arrays.stream(nums).boxed().collect(Collectors.toList());
//		
//		Collections.sort(lista);
//		
//		int numero = 0;
//		int cantidad = 0;
//		
//		for(Integer num: lista) {
//			
//			if(num!=numero) {
//				cantidad = 1;
//				numero = num;
//			}else {
//				cantidad++;
//				if(cantidad>(nums.length/2)) {
//					return numero;
//				}
//			}
//		}
//        
//        return 0;
	
		
		
	
	}
}
