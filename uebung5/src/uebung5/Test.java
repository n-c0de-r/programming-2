package uebung5;

public class Test {
	public static void main(String[] args) {

		Quadrat q = new Quadrat(5, new Punkt(0, 0));
		Rechteck r = q;

		System.out.println(r);
		//Anker: x-Koordinate: 0 und y-Koor: 0
		// Laenge: 5 und Breite: 5

		System.out.println(r.berechneFlaeche()); // 25
		//System.out.println(r.berechneDiagonale()); // Fehler, da methode in Rechteck nicht implementiert wurde
		// (keine Dummy-Methode)

		Quadrat q1 = (Quadrat) r;
		//casting noetig

		System.out.println(q1);
		//methode aus Rechteck wird aufgerufen (output siehe oben)

		System.out.println(q1.berechneFlaeche());
		//methode aus Rechteck wird aufgerufen: 25

		System.out.println(q1.berechneDiagonale());
		//methode aus Quadrat wird aufgerufen

	}
	
	//Kreis k = new Kreis(3, new Punkt(8,8));
	//System.out.println(q1.berechneXAbstand(k)); //4
}
