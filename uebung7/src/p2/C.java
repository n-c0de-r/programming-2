package p2;

import p1.A;

public class C extends A {
	//will meth2 verwenden und den (geänderten) Wert von datum ausgeben 
	//will meth4 verwendet und die Berechnung durchführen

	C() {
		super();
	}

	void test() {
		int value = meth2(3); // Zugriff auf protected Methode meth2
		System.out.println(value); // gibt den geänderten Wert von datum aus
	}

	void test2() {
		int result = meth4(10, 2); // Zugriff auf static Methode meth4
		System.out.println(result); // gibt das Ergebnis der Berechnung aus
	}
}