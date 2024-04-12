package uebung6;


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

//	Since the `toString()` method is abstract in the `Figur` class and 
//	needs to be implemented in the child class `Rechteck`, 
//	one should remove the use of `super.toString()` in the `toString()` 
//	method of the `Rechteck` class. 
	
     public String toString() {
	        return "Anker: " + anker.toString() + "\nLaenge: " + laenge + " und Breite: " + breite;
	    }

	@Override
	public String getFarbe() {
		// TODO Auto-generated method stub
		return farbe;
	}


	@Override
	public int berechneXAbstand2(Figur f) {
		// TODO Auto-generated method stub
        return (int) Math.abs(this.anker.getX() - f.anker.getX());	
        }


	@Override
	public int berechneXAbstand3(Figur f) {
		// TODO Auto-generated method stub
        return (int) Math.abs(anker.getX() - f.anker.getX());	}

	}
