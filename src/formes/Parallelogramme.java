package formes;

public class Parallelogramme extends Quadrilatere {
	
	private int h;
	private int b;
	
	Parallelogramme(int c1, int b, int h) {
		super(c1, b, c1, b);
		this.b = b;
		this.h = h;
	}
	
	int getAire() {
		return b * h;
	}
	
}
