package uebung5;

public class Figur{

	private Punkt anker;
	
	public String farbe = "gelb";

	public Figur() {
		anker = new Punkt(0,0);
		System.out.println("Warnung: Parameterloser Konstruktor von Figur wurde aufgerufen!");
	}

	public Figur(Punkt p) throws NullPointerException{

		if (p==null) throw new NullPointerException("Punkt darf nicht null sein");
		anker = p;
	}

	public String getFarbe(){
		return farbe;
	}

	//Fuer Abstand mit X und Y (abgerundet)
	public int berechneXAbstand(Figur f){
		int abstand = (int)(Math.sqrt(Math.pow((this.anker.getX()  - f.anker.getX()),2) + Math.pow((this.anker.getY() - f.anker.getY()),2)));
		return abstand;

	}

	//berechnet den abstand auf der x-achse von dieser figur und einer uebergebenen figur

	public int berechneXAbstand2(Figur f){
		return Math.abs(this.anker.getX() - f.anker().getX());
		//betrag um keinen negativen Abstand zu haben
	}

	public int berechneXAbstand3(Figur f) {
		return Math.abs(anker.getX() - f.anker.getX());
	} //kein this :( :)

	@Override
	public String toString(){

		//return "Anker = (" + anger.getX() + ", " + anker.getY() + ").";

		return anker.toString();


	}

}
