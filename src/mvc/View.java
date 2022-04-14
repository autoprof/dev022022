package mvc;

import helloWorld.Animal;
import helloWorld.Chien;
import helloWorld.Chat;
import java.lang.Math;

public class View {
	
	static void printHeaders() {
		// votre travail
	}
	
	static void printSep() {
		for(int i = 0; i < 28; i++)
			System.out.print("-");
		System.out.print("\n");
	}
	
	static void printAnimals(List<Animal> as) {
		// votre travail
	}
	
	static void printAnimal(int pos, Animal a) {
		// votre travail
	}
	
	static void printChat(int pos, Chat c) {
		// votre travail
	}
	
	static void printChien(int pos, Chien c) {
		System.out.print("| ");
		
		System.out.print(pos);
		for (int i = 0; i < 3 - Math.floor(Math.log(pos)) + 1; i++)
			System.out.print(' ');
		
		System.out.print(" | ");
		
		System.out.print(" Chien ");
		
		System.out.print(" | ");
		
		System.out.print(c.getSexe() ? "M" : "F");
		
		System.out.print(" | ");
		
		System.out.print(c.getCPoil());
		for (int i = 0; i < 5 - c.getCPoil().length(); i++)
			System.out.print(' ');
		
		System.out.print(" |\n");
	}
	
}
