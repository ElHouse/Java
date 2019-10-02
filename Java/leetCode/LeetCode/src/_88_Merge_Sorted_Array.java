import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class _88_Merge_Sorted_Array {

	public void merge(int[] nums1, int m, int[] nums2, int n) {

		if(nums1 == null || nums2 == null) return ;
		if(n==0          )                 return ;

		
		int r = m+n;
		r--;
		if(m!=0) m--;
		n--;
		while(r>-1   ) {
			
			System.out.println("-------------------");
			
			if( nums1[m] > nums2[n]) {
				System.out.println("case 1 >  "+ nums1[m] );
				nums1[r--] = nums1[m];
				
				nums1[m] = Integer.MIN_VALUE;
				m--;
				
				System.out.println(Arrays.toString(nums1));
				System.out.println(Arrays.toString(nums2));				
			}else if(nums1[m] <= nums2[n]) {

				System.out.println("case 2 >  "+ nums2[n]);
				nums1[r--] = nums2[n];
			    nums2[n] = Integer.MAX_VALUE;
			    n--;
				System.out.println(Arrays.toString(nums1));
				System.out.println(Arrays.toString(nums2));
			
			}
				
			System.out.println("R>"+r);
			System.out.println("M>"+m);
			System.out.println("N>"+n);
			
			if(n==-1) n=0;
			if(m==-1) m=0;
			
			
		}
	}
	
	
	/*
	 * Base test
	 */
	@Test
	public void case1() {
			
		int[] nums1 = { 2, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 1, 5, 6 };
		int n = 3;
	
		int[] result = {1, 2, 2, 3, 5, 6 };
		
		merge(nums1, m, nums2, n);	
		
		System.out.println(Arrays.toString(nums1));
		
		assertEquals(Arrays.toString(result), Arrays.toString(nums1));
	}
	
//	/**
//	 * nums2 null and empty
//	 */
//	@Test
//	public void case2() {
//			
//		//nums1.
//		
//		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
//		int m = 3;
//		int[] nums2 = {  };
//		int n = 0;
//	
//		int[] result = { 1, 2, 3, 0, 0, 0 };
//		
//		merge(nums1, m, nums2, n);	
//		
//		assertEquals(Arrays.toString(nums1), Arrays.toString(result));
//	}
//
//	/**
//	 * uno y uno
//	 */
//	@Test
//	public void case3() {
//			
//		//nums1.
//		
//		int[] nums1 = { 1, 3, 5, 0, 0, 0 };
//		int m = 3;
//		int[] nums2 = { 2, 4, 6 };
//		int n = 3;
//	
//		int[] result = { 1, 2, 3, 4, 5, 6 };
//		
//		merge(nums1, m, nums2, n);	
//		
//		assertEquals(Arrays.toString(nums1), Arrays.toString(result));
//	}
//	
//	/**
//	 * nums 1 con msa espacios
//	 */
//	@Test
//	public void case4() {
//			
//		//nums1.
//		
//		int[] nums1 = { 1, 3, 5, 0, 0, 0, 0 , 0 ,0  };
//		int m = 3;
//		int[] nums2 = { 2, 4, 6 };
//		int n = 3;
//	
//		int[] result = { 1, 2, 3, 4, 5, 6, 0 , 0 ,0 };
//		
//		merge(nums1, m, nums2, n);	
//		
//		assertEquals(Arrays.toString(nums1), Arrays.toString(result));
//	}
//	
//	/**
//	 * todos son iguales
//	 */
//	@Test
//	public void case5() {
//			
//		//nums1.
//		
//		int[] nums1 = { 5, 5, 5, 0, 0, 0, 0 , 0 ,0  };
//		int m = 3;
//		int[] nums2 = { 5, 5, 5 };
//		int n = 3;
//	
//		int[] result = {5,5,5,5,5,5,0,0,0};
//		
//		merge(nums1, m, nums2, n);	
//		
//		assertEquals(Arrays.toString(nums1), Arrays.toString(result));
//	}
//	
//	
//
//	/**
//	 * nulos
//	 */
//	@Test
//	public void case6() {
//			
//		//nums1.
//		
//		int[] nums1 = null;
//		int m = 0;
//		int[] nums2 = null;
//		int n = 0;
//	
//		int[] result = null;
//		
//		merge(nums1, m, nums2, n);	
//		
//		assertEquals(Arrays.toString(nums1), Arrays.toString(result));
//	}
//	
//	/**
//	 * nums2 con valores y nums solo con espacios
//	 */
//	@Test
//	public void case7() {
//			
//		//nums1.
//		
//		int[] nums1 = {0,0,0};
//		int m = 0;
//		int[] nums2 = {1,2,3};
//		int n = 3;
//	
//		int[] result = {1,2,3};
//		
//		merge(nums1, m, nums2, n);	
//		
//		assertEquals(Arrays.toString(nums1), Arrays.toString(result));
//	}
}
