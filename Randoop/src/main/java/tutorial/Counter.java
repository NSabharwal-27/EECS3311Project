package tutorial;

public class Counter {
	int value;

	public Counter() {
		super();
	}
	
	public int increment(){
		value ++;
		return value;
	}
	
	public int decrement(){
		value --;
		return value;
	}
}
