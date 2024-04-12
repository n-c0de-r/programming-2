package uebung10;

public class WarteschlangeGenerisch <T> implements WarteschlangeSchnittstelle <T> {
	
	Element <T> first = null;
	Element <T> last = null;
	
	
	public void enqueue(T elem) {
	// elem in Element verpacken	
		
		Element <T> neu = new Element <T> (elem);
		
		if (first == null) {
			
			first = neu;
			
		} else  {
				last.next =  neu;
			}
		
		last = neu;
		
		}
	
	public T dequeue() throws IllegalStateException {
		
		if(first == null) {
			throw new IllegalStateException("die Warteschlange beinhaltet keiene Elemente.");
		}
		
		T takenData = first.data;
		first = first.next;
		return takenData;
	}
	
	public void content() {
		
		if(first == null) {
			System.out.println("Warteschlange leer");
	
		}
			
		Element<T> currentNode = first;
		
		while(currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}

	@Override
	public T first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
		
	}
