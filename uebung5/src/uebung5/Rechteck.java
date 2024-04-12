package uebung5;

public class Rechteck extends Figur{

		private int laenge;
		private int breite;

		public Rechteck(){
			super();
	}


	Rechteck(Punkt anker, int breite, int laenge){
		super(anker);
		this.laenge = laenge;
		this.breite = breite;
	}
		

	public int getLaenge(){
	return laenge;
	}

	public int getBreite(){
	return breite;
	}

	public double berechneFlaeche(){
	return laenge * breite;
	}

	public double berechneUmfang(){
	return 2 * (breite + laenge);
	}

	public String toString(){
	return super.toString() + "\nLaenge: " + laenge + " und Breite: " + breite;
	}

	}
