package HEAP;

import java.util.Arrays;


public class CustomHeap {
	
	Entity[] entities = null;
	
	
	public CustomHeap(Entity[] entities ) {
		this.entities = entities;
		sort();
	}
	
	public void add(Entity entity) {
		
		Entity[] entitiesAux = new Entity[this.entities.length+1];
		
		for (int i = 0; i < entities.length; i++) {
			entitiesAux[i] = entities[i];
		}
		
		entitiesAux[entities.length] = entity;
		
		this.entities = entitiesAux;
		sort();
	}
	
	public void print() {
		
		System.out.println("---------------------------------"+this.entities.length);
		for(Entity en: entities) {
			System.out.println(en);
		}
	}
	
	
	public void sort() {
		
		for (int i = this.entities.length-1; i >= 0; i--) {
			
			int parent = i%2==0?((i-1)/2):i/2;
		
			Entity dad   = this.entities[parent];
			Entity child = this.entities[i];
			
			//el hijo es mas grande que el padre o son iguales pero uno tiene mas peso que el otro
			if(dad.value<child.value  || (dad.value==child.value && dad.weight<child.weight) ) {
				
				Entity aux = child;
				this.entities[i]      = dad;
				this.entities[parent] = aux;			
				
			}
			
		}


		
	}
	
	
	public Entity getMax() {
		
		Entity max = this.entities[0];
		
		
		Entity[] entitiesAux = new Entity[this.entities.length-1];
		
		for (int i = 1; i < entities.length; i++) {
			entitiesAux[i-1] = entities[i];
		}
				
		this.entities = entitiesAux;
		sort();
		
		return max;
	}

	public static void main(String[] args) {
		
	

		Entity e1 = new Entity(1,70);
		Entity e2 = new Entity(2,20);
		Entity e3 = new Entity(3,60);
		Entity e4 = new Entity(4,20);
		Entity e5 = new Entity(5,90);
		

		Entity[] a = new Entity[5];
		a[0] = e1;
		a[1] = e2;
		a[2] = e3;
		a[3] = e4;
		a[4] = e5;

		
		 CustomHeap ch = new  CustomHeap(a);
//		 
		
		 ch.add(new Entity(0,10));
		 ch.add(new Entity(0,11));
		 ch.add(new Entity(0,12));
		 ch.add(new Entity(0,13));
		 ch.print();
		 ch.sort();
		 ch.sort();
		 
		 ch.sort();ch.sort();
		 ch.sort();
		 ch.sort();
		 
		 System.out.println("m>"+ch.getMax());
		 System.out.println("m>"+ch.getMax());
		 System.out.println("m>"+ch.getMax());
		 System.out.println("m>"+ch.getMax());
		 System.out.println("m>"+ch.getMax());
		 System.out.println("m>"+ch.getMax());
		 System.out.println("m>"+ch.getMax());
		 
		 System.out.println("m>"+ch.getMax());
//		 System.out.println("m>"+ch.getMax());
//
//		 System.out.println("m>"+ch.getMax());
//
//		 System.out.println("m>"+ch.getMax());
//
//		 System.out.println("m>"+ch.getMax());
//		 
//		 System.out.println("ADDING");
//		 
//		 ch.add(new Entity(1,70) );
//		 ch.add(new Entity(42,60) );
//		 ch.add(new Entity(332,90) );
//		 ch.add(new Entity(2,70) );
//		 ch.add(new Entity(5,70) );
//		 
//		 ch.print();
//		 
//		 System.out.println("----------");
//		 
//		 System.out.println("m>"+ch.getMax());
//		 System.out.println("m>"+ch.getMax());
//		 System.out.println("m>"+ch.getMax());
//		 System.out.println("m>"+ch.getMax());
//		 System.out.println("m>"+ch.getMax());
//		 System.out.println("m>"+ch.getMax());
//		 ch.print();
	}
	
}
