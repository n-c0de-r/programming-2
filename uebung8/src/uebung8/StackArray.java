package uebung8;

public class StackArray {
	
	private int[] stack;
	private int count; //Anzahl der Elem. auf dem Stack
	
	public StackArray(int groesse) {
		stack = new int[groesse];
		count = 0;
	}
	
	// legt ein Element oben auf den Stack
	public void push(int elem) {	
	}
	
	// nimmt das oberste Element vom Stack herunter
	public int pop() {
		return count;
		
	}
	
	// liefert den Wert des obersten Elements des Stacks zurück
	public int top() {
		return count;
		
	}
	
	//gibt den Inhalt des Stacks auf dem Bildschirm aus
	public int content() {
		return count;
		
	}
	
}
