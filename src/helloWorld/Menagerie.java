package helloWorld;

public class Menagerie {
	
	public static void main(String[] args) {
		
		Chat tom = new Chat(true, "gris", "noir");
		Chat tommette = new Chat(false, "blanc", "jaune");
		Chat tommette2 = new Chat(false, "blanc", "jaune");
		
		Chien snoopy = new Chien(true, "blanc", 20);
		Chien droopy = new Chien(true, "noir", 30);
		Chien snoopette = new Chien(false, "noir", 5);

		
		Chien enfant;
		try {
			enfant = Chien.reproduire(snoopy, droopy);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			enfant = new Chien(true, "rouge", 42);
		}
		
		//System.out.println(enfant.crier());
		
		Animal winner = Animal.combattre(tommette, snoopy);
		System.out.println(winner == tommette ? "tommette" : "snoopy");
		
		faitRespirer(winner);
		faitCri(winner);
		
	}
	
	static void faitRespirer(Vivant v) {
		v.respirer();
		System.out.println(v.getAirBrasse());
	}
	
	static void faitCri(Vocal v) {
		System.out.println(v.crier());
	}
	
	
}
