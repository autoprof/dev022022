package helloWorld;

public class Chat extends Animal {
	
	private String cPoils;
	private String cYeux;
	private boolean sexe;
	
	public Chat(boolean sexe, String cPoils, String cYeux) {
		this.sexe = sexe;
		this.cPoils = cPoils;
		this.cYeux = cYeux;
	}
	
	public String crier() {
		return "Miaou";
	}
	
}
