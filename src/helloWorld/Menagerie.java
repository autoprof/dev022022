package helloWorld;

public class Menagerie {
	
	public static void main(String[] args) {
		
		Chat tom = new Chat(true, "gris", "noir");
		Chat tommette = new Chat(false, "blanc", "jaune");
		
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
		
		System.out.println(enfant.crier());
		
	}
	
}
