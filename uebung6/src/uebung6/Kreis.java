package uebung6;


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

	@Override
	public String getFarbe() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int berechneXAbstand2(Figur f) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int berechneXAbstand3(Figur f) {
		// TODO Auto-generated method stub
		return 0;
	}

}
