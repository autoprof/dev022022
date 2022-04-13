package helloWorld;

abstract public class Animal {
	int airBrasse = 0;
	
	public void respirer() {
		airBrasse++;
	}
	
	abstract String crier();
	
}
