package formes;

public class Carre extends Rectangle {
	
	private int c;
	
	Carre(int c) {
		super(c, c);
		this.c = c;
	}
	
	int getAire() {
		return c * c; 
	}
	
	int getPerimetre() {
		return 4 * c;
	}
	
}
