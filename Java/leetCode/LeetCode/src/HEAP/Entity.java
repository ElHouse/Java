package HEAP;

public class Entity {
	int weight;
	int value;
	
	Entity(){
	}
	
	Entity(int w, int v){
		this.weight  = w;
		this.value   = v;
	}
	
	@Override
	public String toString() {
		return "Entity [weight=" + weight + ", value=" + value + "]";
	}
}
