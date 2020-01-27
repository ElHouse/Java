package HEAP;

import java.util.Arrays;

public class HEAP {

	public int[] heap;
	
	public HEAP(int[] heap) {
		this.heap = heap;
		sort();
	}
	
	
	public void add(int element) {
		
		int[] aux = new int[heap.length+1];
		for (int i = 0; i < heap.length; i++) {
			aux[i] = heap[i];
		}
		aux[heap.length] = element;
		heap = aux;
		sort();
	}
		
	public int getMax() {
		
		if(heap.length == 0) return 0;
		
		int[] aux = new int[heap.length-1];
		
		int max = heap[0];
		
		for (int i = 1; i < heap.length; i++) {
			aux[i-1] = heap[i];
		}
		
		heap = aux;
		
		sort();
		
		return max;
	}
	
	public void sort() {
		
		for (int i = heap.length-1; i >= 0; i--) {
			
			int parent = i%2==0?((i-1)/2):i/2;
			
			if(heap[parent]<heap[i]) {
				int aux = heap[i];
				heap[i]      = heap[parent];
				heap[parent] = aux;
			}
			
		}
		
	}
	
	public void print() {
		
		System.out.println(Arrays.toString(heap));
	}
	
	
	public static void main(String[] args) {
		
		int[] ints = {5,8,6,1,4,7,3,9,2,0};
		HEAP heap = new HEAP(ints);
		System.out.println(heap.getMax());
		heap.print();
		
		System.out.println(heap.getMax());
		heap.print();
		
		
		System.out.println(heap.getMax());
		heap.print();
		
		
		System.out.println(heap.getMax());
		heap.print();
		
		System.out.println(heap.getMax());
		heap.print();
		
		System.out.println(heap.getMax());
		heap.print();
		
		System.out.println(heap.getMax());
		heap.print();
		
		System.out.println(heap.getMax());
		heap.print();
		
		System.out.println(heap.getMax());
		heap.print();
		
		System.out.println(heap.getMax());
		heap.print();
		
		
		System.out.println(heap.getMax());
		heap.print();
		
System.out.println("adding");
		heap.add(1);
		heap.print();
		heap.add(2);
		heap.print();
		heap.add(3);
		heap.print();
		heap.add(4);
		heap.print();
		heap.add(5);
		heap.print();
		heap.add(6);
		heap.print();
		heap.add(7);
		heap.print();
		
	System.out.println("getting");	
		
		System.out.println(heap.getMax());
		heap.print();
		
		System.out.println(heap.getMax());
		heap.print();
		
		
		System.out.println(heap.getMax());
		heap.print();
		
		
		
		System.out.println("------------");
		
		
		heap.add(71);
		heap.print();
		
		System.out.println(heap.getMax());
		System.out.println(heap.getMax());
		System.out.println(heap.getMax());
		System.out.println(heap.getMax());
		
		heap.print();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
