package uebung3;

public class Quadrat extends Figur {
	private int breite;

	public Quadrat(int br, Punkt anker) {
		super(anker); //aufruf des konstruktors der superklasse
	    breite = br;

	}

	public double berechneFlaeche() {
		return breite * breite;
	}

	public double berechneUmfang() {
		return breite * 4;
	}
	
    public String toString() {
        return ("Breite: " + breite);
    }
}
