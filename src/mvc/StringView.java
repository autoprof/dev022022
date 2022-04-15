package mvc;

import java.util.List;

import helloWorld.Animal;
import helloWorld.Chat;
import helloWorld.Chien;

public class StringView {

	static String stringifyHeaders() {
		return "| pos |  type   | sexe | poil  |\n";
	}
	
	static String stringifySep() {
		String str = "";
		for(int i = 0; i < 32; i++)
			str += ("-");
		str += ("\n");
		return str;
	}
	
	static String stringifyAnimals(List<Animal> as) {
		String str = "";
		str += stringifySep();
		str += stringifyHeaders();
		str += stringifySep();
		for(int i = 0; i < as.size(); i++) {
			str += stringifyAnimal(i, as.get(i));
			str += stringifySep();
		}
		return str;
	}
	
	static String stringifyAnimal(int pos, Animal a) {
		if ( a instanceof Chien )
			return stringifyChien(pos, (Chien) a);
		else 
			return stringifyChat(pos, (Chat) a);
	}

	static String stringifyChat(int pos, Chat c) {
		String chienStr = "";
		chienStr += "| ";
		chienStr += pos;
		for (int i = 0; i < 3 - (pos <= 1 ? 1 : ((int) Math.floor(Math.log10(pos)) + 1)); i++)
			chienStr += ' ';
		chienStr += (" | ");
		chienStr += (" Chat  ");
		chienStr += (" | ");
		chienStr += (c.getSexe() ? " M  " : " F  ");
		chienStr += (" | ");
		chienStr += (c.getCPoil());
		for (int i = 0; i < 5 - c.getCPoil().length(); i++)
			chienStr += (' ');
		chienStr += (" |\n");
		return chienStr;
	}
	
	static String stringifyChien(int pos, Chien c) {
		String chienStr = "";
		chienStr += "| ";
		chienStr += pos;
		for (int i = 0; i < 3 - (pos <= 1 ? 1 : ((int) Math.floor(Math.log10(pos)) + 1)); i++)
			chienStr += ' ';
		chienStr += (" | ");
		chienStr += (" Chien ");
		chienStr += (" | ");
		chienStr += (c.getSexe() ? " M  " : " F  ");
		chienStr += (" | ");
		chienStr += (c.getCPoil());
		for (int i = 0; i < 5 - c.getCPoil().length(); i++)
			chienStr += (' ');
		chienStr += (" |\n");
		return chienStr;
	}
	
}
