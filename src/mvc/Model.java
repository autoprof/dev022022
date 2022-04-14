package mvc;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import helloWorld.Animal;
import helloWorld.Chat;
import helloWorld.Chien;

public class Model {
	
	static String[] colors = {"rouge", "gris", "noir", "blanc"};
	static ArrayList<Animal> data = new ArrayList<Animal>();
	
	static String getRandomColor() {
		return colors[ThreadLocalRandom.current().nextInt(0, 4)];
	}
	
	static ArrayList<Animal> getData() {
		return data;
	}
	
	static void populate(int quantity) {
		for(int i = 0; i < quantity; i++)
			data.add(
				ThreadLocalRandom.current().nextInt(0, 2) == 1 ?
					new Chat(
						ThreadLocalRandom.current().nextInt(0, 2) == 1,
						getRandomColor(),
						getRandomColor()
					) :
					new Chien(
						ThreadLocalRandom.current().nextInt(0, 2) == 1,
						getRandomColor(),
						ThreadLocalRandom.current().nextInt(0, 41)
					)
			);
	}
	
}
