package helloWorld;

import java.util.concurrent.ThreadLocalRandom;

public class Chat extends Animal {
	
	private String cPoil;
	private String cYeux;
	private boolean sexe;
	
	public Chat(boolean sexe, String cPoil, String cYeux) {
		this.sexe = sexe;
		this.cPoil = cPoil;
		this.cYeux = cYeux;
	}
	
	public String crier() {
		return "Miaou";
	}
	
	static Chat reproduire(Chat parent1, Chat parent2) throws Exception {
		if ( parent1.sexe == parent2.sexe )
			throw new Exception("La reproduction doit être séxuée !");
		boolean sexe = ThreadLocalRandom.current().nextInt(0, 2) == 1 ? true : false;
		String cPoil = ThreadLocalRandom.current().nextInt(0, 2) == 1 ? parent1.cPoil : parent2.cPoil;
		String cYeux = ThreadLocalRandom.current().nextInt(0, 2) == 1 ? parent1.cYeux : parent2.cYeux;
		return new Chat(sexe, cPoil, cYeux);
	}
	
	static boolean equals(Chat c1, Chat c2) {
		return c1.sexe == c2.sexe && c1.cPoil == c2.cPoil && c1.cYeux == c2.cYeux;
	}

	public boolean getSexe() {
		return sexe;
	}

	public String getCPoil() {
		return cPoil;
	}
	
}
