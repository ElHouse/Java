import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class _599_Minimum_Index_Sum_of_Two_Lists {

	
	int max = 0;
	
//	Runtime: 15 ms, faster than 21.90% of Java online submissions for Minimum Index Sum of Two Lists.
//	Memory Usage: 39.6 MB, less than 93.55% of Java online submissions for Minimum Index Sum of Two Lists.
    public String[] findRestaurant(String[] list1, String[] list2) {
     
    	int minPosition   = Integer.MAX_VALUE;
    	String[] answer = null;
    	Map<String, Entity> map = new HashMap<>();
        	
    	algo(list1, map);
    	algo(list2, map);    
    	
    	List<String> posibleAnswer = new ArrayList<>();
    	
    	for(String str: map.keySet()) {
    		
    		   Entity aux = map.get(str);
    		   if(aux.count == max ) {
    			   
    			   if(minPosition == Integer.MAX_VALUE) {
    				   minPosition = aux.position;
        			   posibleAnswer.add(str);
    			   }else {
    				   
    				   if(aux.position < minPosition) {
    					   posibleAnswer.clear();
    					   posibleAnswer.add(str);
    					   minPosition = aux.position;
    				   }else if(aux.position == minPosition)  {
    					   posibleAnswer.add(str);
    				   }
    				   
    			   }
    			   
    		   }
    		   
    	}
    	answer = posibleAnswer.toArray(new String[posibleAnswer.size()]);

    	return answer;
    }
    
    
    public void algo(String[] list1, Map<String,Entity> map) {
    
    	for (int i = 0; i < list1.length; i++) {
			
    		if(map.containsKey(list1[i])) {
    			
    			Entity aux = map.get(list1[i]);
    			
    			aux.count    += 1;
    			aux.position += i;
    			
    			max = Math.max(max, aux.count);
    			map.put(list1[i], aux);
    			
    		}else {
    			Entity aux = new Entity();
    			aux.count = 1;
    			aux.position = i;
    			
    			map.put(list1[i],aux);
    		}
    		
    			
		}
    }
    
    class Entity{
    	
    	int count;
    	int position;
    }
    
    @Test
    public void case1() {

    	System.out.println("#################### case1 ");
    	String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
    	String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
    
    	findRestaurant(list1, list2);
    
    	assertEquals("[Shogun]", Arrays.toString(findRestaurant(list1, list2)) );
        
    }
    
    @Test
    public void case2() {
    	System.out.println("#################### case2 ");
    	String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
    	String[] list2 = {"KFC", "Shogun", "Burger King"};
    
    	assertEquals("[Shogun]", Arrays.toString(findRestaurant(list1, list2)) );
    
    }
    
    
    @Test
    public void case3() {
    	System.out.println("#################### case3 ");
    	String[] list1 = {"Shogun", "KFC", "Burger King"};
    	String[] list2 = {"KFC", "Shogun", "Burger King"};
    
    	assertEquals("[Shogun, KFC]", Arrays.toString(findRestaurant(list1, list2)) );
    
    }
    
    
    @Test
    public void case4() {
    	System.out.println("#################### case4 ");
    	String[] list1 = {"Shogun", "KFC", "Burger King", "KFC","A"};
    	String[] list2 = {"KFC", "Shogun", "Burger King","A","A"};
    
    	assertEquals("[KFC]", Arrays.toString(findRestaurant(list1, list2)) );
    
    }
    
    @Test
    public void case5() {
    	System.out.println("#################### case5 ");
    	String[] list1 = {"Tapioca Express","Shogun", "KFC", "Burger King", "KFC"};
    	String[] list2 = {"Tapioca Express", "KFC", "Shogun", "Burger King"};
    
    	assertEquals("[KFC]", Arrays.toString(findRestaurant(list1, list2)) );
    
    }
    
    
    @Test
    public void case6() {
    	System.out.println("#################### case6 ");
    	String[] list1 = {"Tapioca Express","Shogun", "KFC", "Burger King"};
    	String[] list2 = {"Tapioca Express", "KFC", "Shogun", "Burger King"};
    
    	assertEquals("[Tapioca Express]", Arrays.toString(findRestaurant(list1, list2)) );
    
    }
    
    @Test
    public void case7() {
    	System.out.println("#################### case7 ");
    	String[] list1 = {"Tapioca Express1","Shogun2", "KFC3", "Burger King4"};
    	String[] list2 = {"Tapioca Express", "KFC", "Shogun", "Burger King"};
    
    	assertEquals("[]", Arrays.toString(findRestaurant(list1, list2)) );
    
    }
}
