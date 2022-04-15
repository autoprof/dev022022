package mvc;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import helloWorld.Chien;

public class Controller {
	public static void main(String[] args) {
		Model.populate(115);
		
		//PrintView.printAnimals(Model.getData());
		//System.out.print(StringView.stringifyAnimals(Model.getData()));

		StringBuilder sb = new StringBuilder();
		StringBuilderView.stringifyAnimals(sb, Model.getData());
		System.out.print(sb);
		
	}
}
