package uebung6;


public class Dreieck extends Figur {

	private int seite;
	
	public Dreieck(int s, Punkt p) {
		super(p); //aufruf des konstruktors der superklasse
		seite = s;

	}
	
	public double berechneFlaeche() {
		return seite * seite * (Math.sqrt(3) / 4);
	}

	public double berechneUmfang() {
		return seite * 3;
	}
	
	public int getSeite() {
		return seite;
	}
	
	public String toString() {
		return ("Seite: " + seite);
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
