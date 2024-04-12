package uebung8;

public class Liste {
	
	private Node first = null; 
	private Node last = null;
	
	public void add(int wert, int index){
	}
	
	public boolean remove(int wert){
		return false; 
	}
	
	public int size() { 
		Node p = first;
		int length = 0; 
		
		while( p != null ) {
			length++;
			p = p.next; 
		}
		
	return length; 
	
	}
	
}
	
//	In der Klasse Liste (vgl. Vorlesung) soll eine (allgemeine) einfach verkettete Liste implementiert werden. Implementieren Sie in der Klasse Liste Methoden, die Folgendes erlauben:
//		 die Länge der Liste erfragen
//		 einen Wert suchen (liefert true zurück, wenn der gesuchte Wert in der Liste gefunden wurde)
//		 einen Wert am Index i in die Liste hinzufügen
//		 ein Element mit einem gegebenen Wert aus der Liste entfernen
//	Testen Sie die Methoden in einer separaten Testklasse mithilfe von Unit Tests mit JUnit.
//	Dokumentieren Sie die Methoden in Javadoc-Format.

