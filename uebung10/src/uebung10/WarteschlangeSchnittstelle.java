package uebung10;

public interface WarteschlangeSchnittstelle <T> {
	
	public abstract void enqueue(T elem);
	
	public abstract T dequeue();
	
	public abstract T first();
	
	public abstract boolean isEmpty();
	
}
