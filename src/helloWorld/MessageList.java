package helloWorld;

import java.util.ArrayList;

public class MessageList {
	
	ArrayList<String> messages = new ArrayList<String>(); 
	//String[] messages = new String[0];
	//int size = 0;
	
	void create(String msg) {
		messages.add(msg);
	}
	
	void update(int i, String msg) {
		ArrayList<String> tmp = new ArrayList<String>();
		for(int j = 0; j < i; j++)
			tmp.add(messages.get(j));
		tmp.add(msg);
		for(int j = i + 1; j < messages.size(); j++)
			tmp.add(messages.get(j));
		messages = tmp;
	}
	
	String read(int i) {
		return messages.get(i);
	}
	
	void delete(int i) {
		messages.remove(i);
	}
	
	
}
