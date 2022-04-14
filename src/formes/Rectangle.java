package formes;

public class Rectangle extends Parallelogramme {
	
	private int lo;
	private int la;
	
	Rectangle(int lo, int la) {
		super(lo, la, lo);
		this.lo = lo;
		this.la = la;
	}
	
	int getAire() {
		return lo * la;
	}
	
	int getPerimetre() {
		return 2 * (lo + la);
	}
	
	int getAire(String str) {
		return 2 * 4;
	}
	
}
