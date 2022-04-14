package helloWorld;

import java.util.concurrent.ThreadLocalRandom;

abstract public class Animal implements Vivant, Vocal {
	
	int airBrasse = 0;
	
	public void respirer() {
		airBrasse++;
	}
	
	public int getAirBrasse() {
		return airBrasse;
	}
	
	static Animal combattre(Animal a1, Animal a2) {
		return ThreadLocalRandom.current().nextInt(0, 2) == 1 ? a1 : a2;
	}

	static boolean equals(Animal a1, Animal a2) {
		
		if (a1 instanceof Chat && a2 instanceof Chat) {
			
			return Chat.equals((Chat) a1, (Chat) a2);
			
		} else if (a1 instanceof Chien && a2 instanceof Chien) {
			
			return ((Chien) a1).equals((Chien) a2);
			
		}
		
		return false;
	}
	
}
