
public class _122_Best_Time_to_Buy_and_Sell_Stock_II {

//	Runtime: 1 ms, faster than 95.23% of Java online submissions for Best Time to Buy and Sell Stock II.
//	Memory Usage: 36.1 MB, less than 100.00% of Java online submissions for Best Time to Buy and Sell Stock II.
	
	public static int maxProfit(int[] prices) {
		
		if(prices==null ) return 0;
		
		int suma   = 0;
		int compra = -1;
		
		for(int i=0; i<prices.length-1; i++) {
			
			int next  = prices[i+1];
			int focus = prices[i];
			
			if(next>focus && compra==-1) {
				compra = focus;
			}else if(next<focus && compra!=-1) {
				System.out.println(prices[i]+"--- vende ");
				suma += (focus - compra);
				compra = -1;
				System.out.println("suma:>"+suma);
			}
			
		}
		
		if(compra!=-1) {
			
			int finalNumber = prices[prices.length-1];
			
			if(compra < finalNumber) {
				suma += finalNumber - compra;
			}
		}
				
		return suma;
	}
	
	public static void main(String[] args) {
		
		int[] list1 = {7,1,5,3,6,4};
		int[] list2 = {1,2,3,4,5};
		int[] list3 = {7,6,5,4,3,2,1};
		int[] list4 = {1,2,3,4,3,2,1};
		int[] list5 = {1,2,3,4,1,2,1,4};//7
		int[] list6 = {1,2,3,4,1,2,3,4};//6	
		int[] list7 = new int[3];
		int[] list8 = null;
		int[] list9 = {1,1,1,1,1,1};
		int[] list10 = {1,2,1,2,1,2};
		int[] list11 = {2,1,2,1,2,1};
		int[] list12 = {2,1,3,99};
		int[] list13 = {2,2,5};
		
		int suma = maxProfit(list13);
		System.out.println(suma);
		
		
	}

}
