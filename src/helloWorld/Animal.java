package helloWorld;

abstract public class Animal extends Vivant {
	
	int airBrasse = 0;
	
	public void respirer() {
		airBrasse++;
	}
	
	abstract String crier();
	
}
