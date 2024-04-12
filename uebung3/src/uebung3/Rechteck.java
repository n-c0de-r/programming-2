package uebung3;

public class Rechteck extends Figur {
	
	private int breite;
	private int laenge;

	public Rechteck(int st, int l, Punkt p) {
		super(p); //aufruf des konstruktors der superklasse
		breite = st;
		laenge = l;

	}

	public double berechneFlaeche() {
		return laenge * breite;
	}

	public double berechneUmfang() {
		return laenge * 2 + breite * 2;
	}
	
    public String toString() {
        return ("Breite: " + breite);
    }
    
	public int getLaenge() {
		return laenge;
	}
	
	public int getBreite() {
		return breite;
	}

}
