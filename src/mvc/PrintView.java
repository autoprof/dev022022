package mvc;

import helloWorld.Animal;
import helloWorld.Chien;
import helloWorld.Chat;
import java.lang.Math;
import java.util.List;

public class PrintView {
	
	static void printHeaders() {
		System.out.print("| pos |  type   | sexe | poil  |\n");
	}
	
	static void printSep() {
		for(int i = 0; i < 32; i++)
			System.out.print("-");
		System.out.print("\n");
	}
	
	static void printAnimals(List<Animal> as) {
		printSep();
		printHeaders();
		printSep();
		for(int i = 0; i < as.size(); i++) {
			printAnimal(i, as.get(i));
			printSep();
		}
	}
	
	static void printAnimal(int pos, Animal a) {
		if ( a instanceof Chien )
			printChien(pos, (Chien) a);
		else 
			printChat(pos, (Chat) a);
	}

	static void printChat(int pos, Chat c) {
		System.out.print("| ");
		
		System.out.print(pos);
		for (int i = 0; i < 3 - (pos <= 1 ? 1 : ((int) Math.floor(Math.log10(pos)) + 1)); i++)
			System.out.print(' ');
		
		System.out.print(" | ");
		
		System.out.print(" Chat  ");
		
		System.out.print(" | ");
		
		System.out.print(c.getSexe() ? " M  " : " F  ");
			
		System.out.print(" | ");
		
		System.out.print(c.getCPoil());
		for (int i = 0; i < 5 - c.getCPoil().length(); i++)
			System.out.print(' ');
		
		System.out.print(" |\n");
	}
	
	static void printChien(int pos, Chien c) {
		System.out.print("| ");
		
		System.out.print(pos);
		for (int i = 0; i < 3 - (pos <= 1 ? 1 : ((int) Math.floor(Math.log10(pos)) + 1)); i++)
			System.out.print(' ');
		
		System.out.print(" | ");
		
		System.out.print(" Chien ");
		
		System.out.print(" | ");
		
		System.out.print(c.getSexe() ? " M  " : " F  ");
		
		System.out.print(" | ");
		
		System.out.print(c.getCPoil());
		for (int i = 0; i < 5 - c.getCPoil().length(); i++)
			System.out.print(' ');
		
		System.out.print(" |\n");
	}
	
}
