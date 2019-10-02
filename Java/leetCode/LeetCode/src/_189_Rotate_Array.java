import java.util.Arrays;

public class _189_Rotate_Array {

//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Array.
//	Memory Usage: 37.6 MB, less than 99.90% of Java online submissions for Rotate Array.
	
	public static void rotate2(int[] nums, int k) {

		if(nums==null) return ;
		
		int size   = nums.length;
		int rotate = size-(k%size);
		int[] nums2 = new int[size];

//		System.out.println("size:>"+size);
		System.out.println("rotate:>"+rotate);
	
		int posA = 0;
		int posB = rotate;
	
//		System.out.println("posA:>"+posA);
//		System.out.println("posB:>"+posB);

		for(;posB<size; posB++) {
			 nums2[posA++] = nums[posB];
		}
//		System.out.println(Arrays.toString(nums));
//		System.out.println(Arrays.toString(nums2));

//		System.out.println("..posA:>"+posA);
//		System.out.println("..posB:>"+posB);
		for(int i=0; i<rotate; i++) {
			 nums2[posA++] = nums[i];
		}
		
		for(int i=0;i<size; i++) {
			nums[i] = nums2[i];
		}
		
//		nums = nums2;
		
//		System.out.println(Arrays.toString(nums));

	}
	
	public static void rotate(int[] nums, int k) {

		if(nums==null) return ;
		
		int size   = nums.length;
		int rotate = size-(k%size);
		

		System.out.println("size:>"+size);
		System.out.println("rotate:>"+rotate);
	
		int posA = 0;
		int posB = rotate;
	
		System.out.println("posA:>"+posA);
		System.out.println("posB:>"+posB);
	
		for(;posB<size; posB++) {
			int aux = nums[posB];
			nums[posB] = nums[posA];
			nums[posA]    = aux;
			posA++;
		}
	
		System.out.println("--posA:>"+posA);
		System.out.println("--posB:>"+posB);

		if(size/2>posA) {
			System.out.println("caso 1");
			System.out.println("index>"+rotate);
		}else if(size/2==posA) {
			System.out.println("caso 2");
			System.out.println("index>"+posA);
		}else  {
			System.out.println("caso 3");
			System.out.println("index>"+(rotate-1));
		}
		
		System.out.println(Arrays.toString(nums));
	
	}
	
	public static void main(String[] args) {
		

		for(int i=1; i<10; i++) {
			int[] lista1 = getCase1();
			rotate2(lista1, i);
			System.out.println(Arrays.toString(lista1));
			System.out.println("----------------");

		}
	}

	public static int[] getCase1() {
		
		return  new int[] {1,2,3,4,5,6,7,8,9,10};
	}
}
