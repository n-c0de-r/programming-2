package uebung3;

public class Kreis extends Figur{

	private int radius;
	private double PI = Math.PI;

	public Kreis(int radius, Punkt anker) {
		super(anker);
		this.radius = radius;

	}

	public double berechneFlaeche() {

		return PI * radius * radius;

	}
	
	public double berechneUmfang() {
		return 2 * radius * PI;
	}
	
	public int getRadius() {
		return radius;
	}
    public String toString() {
        return ("Radius: " + radius);
    }

}
