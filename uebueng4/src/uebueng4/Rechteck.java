package uebueng4;

public class Rechteck extends Quadrat{
	
	private int laenge;
	public String farbe = "rot";
	
	public Rechteck() throws NullPointerException, IllegalArgumentException{
		
		super();
		this.laenge = 0;
		
		System.out.println("Warnung: Parameterloser Konstruktor von Rechteck wurde aufgerufen!");

	}
	
	public Rechteck(int laenge, int breite, Punkt p) throws NullPointerException, IllegalArgumentException{
	
		super(breite, p);
		
		if (laenge <= 0) throw new IllegalArgumentException("Bitte positiven Wert fuer die Laenge angeben!");
		
		this.laenge = laenge;
	}
	
	public String toString() {
		return "Laenge = " +  laenge + " " + super.toString();
	}
	
	public String getFarbe() {
		return farbe;
	}
	
	// (f)
	
	public void printFarbe() {

		System.out.println("Farbe Rechteck: " + farbe);
		System.out.println("Farbe Quadrat: " + super.getFarbe());
		System.out.println("Farbe Figur: " + ((Figur)this).getFarbe());
	}
	
}
