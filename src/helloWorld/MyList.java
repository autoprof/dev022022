package helloWorld;

import java.util.ArrayList;

public class MyList<T> {

	ArrayList<T> elements = new ArrayList<T>();
	
	void create(T msg) {
		elements.add(msg);
	}
	
	void update(int i, T msg) {
		ArrayList<T> tmp = new ArrayList<T>();
		for(int j = 0; j < i; j++)
			tmp.add(elements.get(j));
		tmp.add(msg);
		for(int j = i + 1; j < elements.size(); j++)
			tmp.add(elements.get(j));
		elements = tmp;
	}
	
	T read(int i) {
		return elements.get(i);
	}
	
	void delete(int i) {
		elements.remove(i);
	}
	
	
}
