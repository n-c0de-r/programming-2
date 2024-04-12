package uebueng4;

public class Figur {
	
	private Punkt anker;
	public String farbe = "gelb";

	
	public Figur() {
		anker = new Punkt (0,0);
	
	System.out.println("Warnung: Parameterloser Konstruktor von Figur wurde aufgerufen!");
	
}
	
	public Figur(Punkt p) throws NullPointerException {
		if(p == null) throw new NullPointerException("Punkt darf nicht null sein!");
		anker = p;
	
	}
	
	public String toString() {
		 //return "Anker = (" = anker.getX() + ", " + anker.getY() + ").";
		return anker.toString();
		
	}

	//getter farbe figur
	public String getFarbe() {
		return farbe;
	}
	
	

}
