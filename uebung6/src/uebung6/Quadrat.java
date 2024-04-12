package uebung6;

public class Quadrat extends Rechteck implements Gleichseitig {

	private int seitenlaenge;

	public Quadrat() {
		super();
		System.out.println("Warnung: Parameterloser Konstruktor von Quadrat wurde aufgerufen!");
	}

	public Quadrat(int seitenlaenge, Punkt p) {
	    super(p, seitenlaenge, seitenlaenge);
	}

	public void setSeitenlaenge(int seitenlaenge) {
	    this.seitenlaenge = seitenlaenge;
	}

	// berechne die Diagonale eines Quadrats
	public double berechneDiagonale() {
		int breite = getBreite();
		return Math.sqrt(breite * breite + breite * breite);
	}

	public int getSeitenanzahl() {
		return VIERECKIG;
	}

	public int getSeitenlaenge() {
		return seitenlaenge;
	}
	
	public double berechneUmfang() {
		return seitenlaenge * VIERECKIG;
	}

}
