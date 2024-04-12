package uebung10;

public class Element <T> {
	T data;
	
	Element<T> next;
	
	public Element(T input) {
		data = input;
		next = null;
	}

}
