package uebung8;

public class Stack {
	
//	8.2 Stack als Liste
//	In der Klasse Stack aus der Vorlesung wurde ein Stack als eine (einfach verkettete) Liste implementiert. Vervollständigen Sie die Klasse Stack um drei weitere Methoden:
//	 top(): liefert den Wert des obersten Elements des Stacks zurück
//	 isEmpty(): liefert true zurück, wenn der Stack leer ist, ansonsten false
//	 content(): gibt den Inhalt des Stacks auf dem Bildschirm aus
//	Testen Sie die Methoden aus der Klasse Stack in einer separaten Testklasse mithilfe von Unit Tests mit JUnit. Dokumentieren Sie die Methoden und generieren Sie anschließend die Klassendoku- mentation mithilfe von Javadoc.
		
	private Node top = null;
		
	public void push(int x) { 
			
		Node p = new Node(x); 
		p.next = top;
		top = p; 
		
	}
	
	public int pop() { 
		if(top == null) throw new IllegalArgumentException("Stack ist leer!");
			return 0; 
		} else {
		Node p = top; 
		top = top.next; 
		return p.data;
		}
		
	}
	
}
