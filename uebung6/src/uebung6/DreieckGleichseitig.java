//similar a quadrat!!! con rechteck
package uebung6;



public class DreieckGleichseitig extends Dreieck implements Gleichseitig {

	private int seite;
	private int seitenlaenge;
	
	public DreieckGleichseitig(int seitenlaenge, Punkt p) {
	    super(seitenlaenge, p);
	    this.seitenlaenge = seitenlaenge;
	}
	
	public void setSeitenlaenge(int seitenlaenge) {
	    this.seitenlaenge = seitenlaenge;
	}
	
	public double berechneFlaeche() {
		return seite * seite * (Math.sqrt(3) / 4);
	}

	public double berechneUmfang() {
		return seitenlaenge * DREIECKIG;
	}
	
	public int getSeite() {
		return seite;
	}
	
	public String toString() {
		return ("Seite: " + seite);
	}

	@Override
	public int getSeitenanzahl() {
		return DREIECKIG;
	}

	@Override
	public int getSeitenlaenge() {
		return seitenlaenge;
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
