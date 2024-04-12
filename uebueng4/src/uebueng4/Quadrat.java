package uebueng4;

public class Quadrat extends Figur {
	
	private int breite;
	public String farbe = "blau";
	
	public Quadrat() {
		super ();
		breite = 0;
		
		System.out.println("Warnung: Parameterloser Konstruktor von Quadrat wurde aufgerufen!");

	}
		
	public Quadrat(int breite) throws NullPointerException, IllegalArgumentException {
			
		super();
			
		setBreite(breite);
		
		System.out.println("Warnung: Kein Anker fuer Figur angegeben!");
		
		}
	
	public Quadrat(int breite, Punkt p) throws NullPointerException, IllegalArgumentException {
		
		super(p);
			
		setBreite(breite);
		
		System.out.println("Warnung: Kein Anker fuer Figur angegeben!");

		
		
		}
	
	public void setBreite(int breite) throws IllegalArgumentException {
		if (breite <= 0) { 
			throw new IllegalArgumentException("Breite muss positiv sein");
	} 
	
	this.breite = breite;
	
}
	
public int berechneFlaeche() {
	return this.breite * this.breite;
}

public String toString() {
	return "Breite = " +  breite + " " + super.toString();
}

public String getFarbe() {
	return farbe;
}


}
