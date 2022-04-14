package formes;

abstract public class Quadrilatere {
	
	private int c1;
	private int c2;
	private int c3;
	private int c4;
	
	Quadrilatere(int c1, int c2, int c3, int c4) {
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.c4 = c4;
	}
	
	int getPerimetre() {
		return c1 + c2 + c3 + c4;
	}
	
	abstract int getAire();
	
}
