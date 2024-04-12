package p2;

import p1.A;

public class D extends A{
	//will meth3 verwenden und den (geänderten) Wert von datum ausgeben

	D() {
		super();
	}

	
	void test() {

		int value = meth3(4); // Zugriff auf paket-private Methode meth3 über eine Instanz von A
		System.out.println(value); // gibt den geänderten Wert von datum aus
	}
}
