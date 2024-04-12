package uebung8;

public class MeineListe {
	
	private Node anfang = null;
	
	//Konstruktoren
	public MeineListe() {
		
	}
	
	
	 private class Node { private int data;
	   }
	private Node next;
	private Node(int d){ 
		data = d;
		next = null; 
	}
	
	public int methode(Node k) { 
		if(k.next != null) return k.data;
	}

}
