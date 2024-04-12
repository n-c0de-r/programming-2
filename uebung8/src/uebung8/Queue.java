package uebung8;

public class Queue {

	private Node first = null; 
	private Node last = null; 
	
	public void enqueue (int x) {
		Node p = new Node(x); 
		if(first == null){ //Queue leer
			first = p; 
		} else {
			last.next = p; last = p;
		} 
	}
	
	// entnimmt das erste Element aus der Warteschlange und liefert seinen Wert zurück
	public void dequeue() {
		
	}

	// liefert den Wert des ersten Elements der Warteschlange zurück
	public void first() {
		
	}
	
	// liefert true zurück, wenn die Warteschlange leer ist, ansonsten false
	public void isEmpty() {
		
	}
	
	// sucht ein gegebenes Element in der Warteschlage und, wenn enthalten, 
	// liefert true (oder den Index) zurück
	public void search() {
		
	}

}
