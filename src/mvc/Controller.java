package mvc;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import helloWorld.Chien;

public class Controller {
	public static void main(String[] args) {
		Model.populate(115);
		
		//View.printAnimals(Model.getData());
		
		System.out.print(StringView.printAnimals(Model.getData()));
	}
}
