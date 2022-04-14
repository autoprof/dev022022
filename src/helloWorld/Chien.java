package helloWorld;

import java.util.concurrent.ThreadLocalRandom;

public class Chien extends Animal {
	
	private String cPoil;
	private int lPoil;
	private boolean sexe;
	
	public Chien(boolean sexe, String cPoil, int lPoil) {
		this.sexe = sexe;
		this.cPoil = cPoil;
		this.lPoil = lPoil;
	}
	
	public boolean getSexe() {
		return sexe;
	}
	
	public String getCPoil() {
		return cPoil;
	}
	
	public String crier() {
		return sexe ? "Wouf" : "Waf";
	}
	
	static Chien reproduire(Chien parent1, Chien parent2) throws Exception {
		if ( parent1.sexe == parent2.sexe )
			throw new Exception("La reproduction doit être séxuée !");
		boolean sexe = ThreadLocalRandom.current().nextInt(0, 2) == 1 ? true : false;
		String cPoil = ThreadLocalRandom.current().nextInt(0, 2) == 1 ? parent1.cPoil : parent2.cPoil;
		return new Chien(sexe, cPoil, (parent1.lPoil + parent2.lPoil) / 2);
	}
	
	static boolean equals(Chien c1, Chien c2) {
		return c1.sexe == c2.sexe && c1.cPoil == c2.cPoil && c1.lPoil == c2.lPoil;
	}
	
}
