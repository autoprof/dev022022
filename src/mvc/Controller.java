package mvc;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import helloWorld.Chien;

public class Controller {
	public static void main(String[] args) {
		// votre travail
		
		View.printSep();
		View.printChien(99, new Chien(true, "rouge", 39));
		View.printSep();
	}
}
