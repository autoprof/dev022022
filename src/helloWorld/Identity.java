package helloWorld;

public class Identity<T> {
	
	T i;
	
	public Identity(T i) {
		this.i = i;
	}
	
	public T get() {
		return i;
	}
	
}
