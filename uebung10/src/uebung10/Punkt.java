package uebung10;

public class Punkt<T extends Number> {
	
	private T x;
	private T y;
	
	public Punkt(T x, T y) {
		this.x = x;
		this.y = y;
	}
	
	public Punkt() {
		x = null;
		y = null;
	}
	
	public T getX() {
		return x;
	}
	
	public void setX(T x) {
		this.x = x;
	}
	
	public T getY() {
		return y;
	}
	
	public void setY(T y) {
		this.y = y;
	}
	
	
	
	// instanzmethode
	
	public boolean xEquales(Punkt<T> p) {
		return this.x == p.x;
	}

}
