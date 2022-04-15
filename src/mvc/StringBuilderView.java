package mvc;

import java.util.List;

import helloWorld.Animal;
import helloWorld.Chat;
import helloWorld.Chien;

public class StringBuilderView {

	static void stringifyHeaders(StringBuilder sb) {
		sb.append("| pos |  type   | sexe | poil  |\n");
	}
	
	static void stringifySep(StringBuilder sb) {
		for(int i = 0; i < 32; i++)
			sb.append("-");
		sb.append("\n");
	}
	
	static void stringifyAnimals(StringBuilder sb, List<Animal> as) {
		stringifySep(sb);
		stringifyHeaders(sb);
		stringifySep(sb);
		for(int i = 0; i < as.size(); i++) {
			stringifyAnimal(sb, i, as.get(i));
			stringifySep(sb);
		}
	}
	
	static void stringifyAnimal(StringBuilder sb, int pos, Animal a) {
		if ( a instanceof Chien )
			stringifyChien(sb, pos, (Chien) a);
		else 
			stringifyChat(sb, pos, (Chat) a);
	}

	static void stringifyChat(StringBuilder sb, int pos, Chat c) {
		sb.append("| ");
		sb.append(pos);
		for (int i = 0; i < 3 - (pos <= 1 ? 1 : ((int) Math.floor(Math.log10(pos)) + 1)); i++)
			sb.append(' ');
		sb.append(" | ");
		sb.append(" Chat  ");
		sb.append(" | ");
		sb.append(c.getSexe() ? " M  " : " F  ");
		sb.append(" | ");
		sb.append(c.getCPoil());
		for (int i = 0; i < 5 - c.getCPoil().length(); i++)
			sb.append(' ');
		sb.append(" |\n");
	}
	
	static void stringifyChien(StringBuilder sb, int pos, Chien c) {
		sb.append("| ");
		sb.append(pos);
		for (int i = 0; i < 3 - (pos <= 1 ? 1 : ((int) Math.floor(Math.log10(pos)) + 1)); i++)
			sb.append(' ');
		sb.append(" | ");
		sb.append(" Chat  ");
		sb.append(" | ");
		sb.append(c.getSexe() ? " M  " : " F  ");
		sb.append(" | ");
		sb.append(c.getCPoil());
		for (int i = 0; i < 5 - c.getCPoil().length(); i++)
			sb.append(' ');
		sb.append(" |\n");
	}
	
}
