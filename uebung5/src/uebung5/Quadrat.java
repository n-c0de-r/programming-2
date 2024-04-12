package uebung5;

public class Quadrat extends Rechteck{
	
public Quadrat() {
	
	super();
	
	System.out.println("Warnung: Parameterloser Konstruktor von Quadrat wurde aufgerufen!");
}

public Quadrat(int breite, Punkt p){
	super(p, breite, breite);
}

//berechne die diagonale eines quadrats
public double berechneDiagonale(){
	int breite = getBreite();
	return Math.sqrt(breite * breite + breite * breite);
}

}

