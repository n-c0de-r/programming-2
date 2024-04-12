package uebung3;

public class DreieckGleichseitig extends Figur {

	private int seite;
	
	public DreieckGleichseitig(int s, Punkt p) {
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
}
