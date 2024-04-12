package uebung6;


public abstract class Figur{

	protected Punkt anker;
	
	public String farbe = "gelb";

	public Figur() {
		anker = new Punkt(0,0);
		System.out.println("Warnung: Parameterloser Konstruktor von Figur wurde aufgerufen!");
	}

	public Figur(Punkt p) throws NullPointerException{

		if (p == null) throw new NullPointerException("Punkt darf nicht null sein");
		anker = p;
	}

	public abstract String getFarbe();

	//Fuer Abstand mit X und Y (abgerundet)
	public int berechneXAbstand(Figur f){
		int abstand = (int)(Math.sqrt(Math.pow((this.anker.getX()  - f.anker.getX()),2) + Math.pow((this.anker.getY() - f.anker.getY()),2)));
		return abstand;

	}

	//berechnet den abstand auf der x-achse von dieser figur und einer uebergebenen figur

	public abstract int berechneXAbstand2(Figur f);

	public abstract int berechneXAbstand3(Figur f);

	@Override
	public abstract String toString();

}
