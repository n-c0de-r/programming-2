package uebung8;

public class Node {
	
	//rekursive Klassendeklaration
	
	int data;
	Node next;
	
	//„doppelter“ Knoten = Zeiger auf den direkten Nachfolger und den direkten Vorgänger:
	Node prev;
	
	public Node(int d) {
		data = d;
		next = null;
	}

}
